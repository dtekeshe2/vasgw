package com.ebridge.billinginterface.processors.zte;

import com.comverse_in.prepaid.ccws.BalanceCreditAccount;
import com.comverse_in.prepaid.ccws.BalanceEntity;
import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.comverse_in.prepaid.ccws.SubscriberEntity;
import com.ebridgevas.commons.dto.Authorisation;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static com.ebridge.billinginterface.util.BillingUtils.*;

public class ZTEPrepaidDataBundlePurchase
{

    private static Logger logger = Logger.getLogger( ZTEPrepaidDataBundlePurchase.class );

    public static final String TEL_COS_DATA_BALANCE = "Gprs_bundle";
    public static final String CORE_BALANCE = "Core";

    public static void process( ServiceSoap serviceSoap, SubscriberEntity subscriber, Authorisation authorisation)
    {

        logger.debug("process : " + authorisation);

        Map<String, BalanceEntity> balances = map(subscriber.getBalances());

        if (balances == null)
            return;

        // TODO test null values
        Double coreBalance = balances.get(CORE_BALANCE).getAvailableBalance();

        if (coreBalance < authorisation.getDebitAmount().doubleValue())
        {
            // TODO parameterize
            // TODO persist
            authorisation.setResultCode("051");
            authorisation
                    .setNarrative1(
                            "Insufficient credit for selected bundle,\n" +
                                    "please top up airtime or subscribe to a smaller bundle");
            return;
        }

        // Debit account
        BalanceCreditAccount[] balanceCreditAccounts = new BalanceCreditAccount[authorisation.isIntraAccount() ? 2 : 1];
        balanceCreditAccounts[0] = new BalanceCreditAccount();
        balanceCreditAccounts[0].setBalanceName(CORE_BALANCE);
        balanceCreditAccounts[0].setCreditValue(0 - authorisation.getDebitAmount().doubleValue());
        balanceCreditAccounts[0].setExpirationDate(balances.get(CORE_BALANCE).getAccountExpiration());
        authorisation.setBalance1(
                new BigDecimal(
                        balances.get(CORE_BALANCE).getAvailableBalance()
                                - authorisation.getDebitAmount().doubleValue()));

        if (authorisation.isIntraAccount())
        {
            // Credit account
            balanceCreditAccounts[1] = new BalanceCreditAccount();
            balanceCreditAccounts[1].setBalanceName(TEL_COS_DATA_BALANCE);
            balanceCreditAccounts[1].setCreditValue(authorisation.getCreditAmount().doubleValue());
            DateTime currentExpiry = new DateTime(balances.get(TEL_COS_DATA_BALANCE).getAccountExpiration().getTime());
            DateTime newExpiry = authorisation.getExpiryDate();
            authorisation.setDateTime2(
                    currentExpiry.isBefore(newExpiry) ? newExpiry : currentExpiry);
            balanceCreditAccounts[1].setExpirationDate(calendar(authorisation.getDateTime2()));

        }

        if ( ! creditAccount( serviceSoap,
                              authorisation,
                              authorisation.getFromAccountNumber().substring(3),
                              balanceCreditAccounts) )
            return;

        if ( ! authorisation.isIntraAccount() )
        {
            // Credit account
            balanceCreditAccounts[0] = new BalanceCreditAccount();
            balanceCreditAccounts[0].setBalanceName(TEL_COS_DATA_BALANCE);
            balanceCreditAccounts[0].setCreditValue(authorisation.getCreditAmount().doubleValue());
            balanceCreditAccounts[0].setExpirationDate(balances.get(TEL_COS_DATA_BALANCE).getAccountExpiration());

            if ( ! creditAccount( serviceSoap,
                                  authorisation,
                                  authorisation.getToAccountNumber().substring(3),
                                  balanceCreditAccounts))
            {
                // reverse
                balanceCreditAccounts[0] = new BalanceCreditAccount();
                balanceCreditAccounts[0].setBalanceName(CORE_BALANCE);
                balanceCreditAccounts[0].setCreditValue(authorisation.getDebitAmount().doubleValue());
                balanceCreditAccounts[0].setExpirationDate(balances.get(CORE_BALANCE).getAccountExpiration());

                if ( ! creditAccount( serviceSoap,
                                      authorisation,
                                      authorisation.getFromAccountNumber().substring(3),
                                      balanceCreditAccounts))
                {
                    // TODO FATAL reversal failed. Notify manual reversal process
                    // TODO Not critical for current USSD service because only intra account is supported for now
                }
            }
        }

        // Beneficiary balance
        authorisation.setBalance2(
                new BigDecimal(
                        (balances.get(TEL_COS_DATA_BALANCE).getAvailableBalance() / 0.12)
                            + ( authorisation.getCreditAmount().doubleValue() / 0.12  ) )
                        .setScale(2, RoundingMode.HALF_UP));
        setResponse( authorisation );
    }
}

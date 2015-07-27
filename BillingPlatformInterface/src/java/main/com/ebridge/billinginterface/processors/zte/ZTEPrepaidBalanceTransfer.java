package com.ebridge.billinginterface.processors.zte;

import com.comverse_in.prepaid.ccws.BalanceCreditAccount;
import com.comverse_in.prepaid.ccws.BalanceEntity;
import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.comverse_in.prepaid.ccws.SubscriberEntity;
import com.ebridgevas.commons.dto.Authorisation;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.Map;

import static com.ebridge.billinginterface.util.BillingUtils.*;

public class ZTEPrepaidBalanceTransfer
{
    private static Logger logger = Logger.getLogger( ZTEPrepaidBalanceTransfer.class );

    public static final String CORE_BALANCE = "Core";

    public void process(ServiceSoap serviceSoap, Authorisation authorisation)
    {
        logger.debug("process : " + authorisation);

        if (authorisation.isIntraAccount())
        {
            authorisation.setResultCode("096");
            authorisation.setNarrative1("You can not transfer balance to your own account");
            return;
        }

        SubscriberEntity sourceSubscriber
                = subscriberRetrieve(serviceSoap, authorisation, authorisation.getFromAccountNumber());

        Map<String, BalanceEntity> source = map(sourceSubscriber.getBalances());

        SubscriberEntity beneficiarySubscriber
                = subscriberRetrieve(serviceSoap, authorisation, authorisation.getToAccountNumber());

        Map<String, BalanceEntity> beneficiary = map(sourceSubscriber.getBalances());

        if (source == null || beneficiary == null)
            return;

        // TODO test null values
        Double sourceBalance = source.get(CORE_BALANCE).getAvailableBalance();

        if (sourceBalance < ( authorisation.getDebitAmount().doubleValue() +
                                authorisation.getTransactionFee().doubleValue()))
        {
            // TODO parameterize
            // TODO persist
            authorisation.setResultCode("051");
            authorisation
                    .setNarrative1(
                            "Insufficient credit, please top up airtime and try again.");
            return;
        }

        // Debit account
        BalanceCreditAccount[] balanceCreditAccounts = new BalanceCreditAccount[1];
        balanceCreditAccounts[0] = new BalanceCreditAccount();
        balanceCreditAccounts[0].setBalanceName(CORE_BALANCE);
        balanceCreditAccounts[0]
                .setCreditValue(
                        0 - (authorisation.getDebitAmount().add(authorisation.getTransactionFee())).doubleValue());
        balanceCreditAccounts[0].setExpirationDate(source.get(CORE_BALANCE).getAccountExpiration());

        authorisation.setBalance1(
                new BigDecimal(
                        source.get(CORE_BALANCE).getAvailableBalance()
                                - (authorisation.getDebitAmount().add(authorisation.getTransactionFee()))
                                        .doubleValue()));

        if ( ! creditAccount(   serviceSoap,
                                authorisation,
                                authorisation.getFromAccountNumber().substring(3),
                                balanceCreditAccounts) )
            return;

        // Credit account
        balanceCreditAccounts[0] = new BalanceCreditAccount();
        balanceCreditAccounts[0].setBalanceName(CORE_BALANCE);
        balanceCreditAccounts[0].setCreditValue(authorisation.getCreditAmount().doubleValue());
        balanceCreditAccounts[0].setExpirationDate(beneficiary.get(CORE_BALANCE).getAccountExpiration());

        authorisation.setBalance2(
                new BigDecimal(
                        beneficiary.get(CORE_BALANCE).getAvailableBalance()
                                            + authorisation.getDebitAmount().doubleValue()));

        if ( ! creditAccount(   serviceSoap,
                                authorisation,
                                authorisation.getToAccountNumber().substring(3),
                                balanceCreditAccounts))
        {
            // reverse
            balanceCreditAccounts[0] = new BalanceCreditAccount();
            balanceCreditAccounts[0].setBalanceName(CORE_BALANCE);
            balanceCreditAccounts[0]
                    .setCreditValue(
                            (authorisation.getDebitAmount().add(authorisation.getTransactionFee())).doubleValue());
            balanceCreditAccounts[0].setExpirationDate(source.get(CORE_BALANCE).getAccountExpiration());

            if ( ! creditAccount( serviceSoap,
                    authorisation,
                    authorisation.getFromAccountNumber().substring(3),
                    balanceCreditAccounts))
            {
                // TODO FATAL reversal failed. Notify manual reversal process
            }
        }

        setResponse(authorisation);
    }
}

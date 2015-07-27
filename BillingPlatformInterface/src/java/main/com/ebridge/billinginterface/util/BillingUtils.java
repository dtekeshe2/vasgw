package com.ebridge.billinginterface.util;

import com.comverse_in.prepaid.ccws.*;
import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.dto.SubscriberPackage;
import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import org.joda.time.DateTime;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.ebridgevas.commons.dto.SubscriberPackage.POSTPAID;
import static com.ebridgevas.commons.dto.SubscriberPackage.PREPAID;

public class BillingUtils
{

    public static final String TEL_COS_DATA_BALANCE = "Gprs_bundle";
    public static final String CORE_BALANCE = "Core";
    public static final String DATA_BUNDLE_PURCHARE = "DataBundlePurchase";
    public static final String ACCOUNT_BALANCE_TRANSFER = "AccountBalanceTransfer";
    public static final String VOUCHER_RECHARGE = "VoucherRecharge";
    private static final Double DATA_BUNDLE_TARIFF = 0.12;
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("###,###0.00");

    public static  final int SMPP_MAX_PAYLOAD_LENGTH = 161;

    private static final Splitter ERROR_MESSAGE_SPLITTER;
    static {
        ERROR_MESSAGE_SPLITTER = Splitter.on(CharMatcher.anyOf("[]")).trimResults().omitEmptyStrings();
    }

    public static Map<String, BalanceEntity> map(BalanceEntity[] balances)
    {
        Map<String, BalanceEntity> map = new HashMap<>();

        for (BalanceEntity balance : balances)
        {
            map.put(balance.getBalanceName(), balance);
        }
        return map;
    }

    public static Calendar calendar(DateTime dateTime)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateTime.toDate());
        return calendar;
    }

    public static SubscriberEntity subscriberRetrieve(
                                        ServiceSoap serviceSoap,
                                        Authorisation authorisation,
                                        String accountNumber)
    {
        try
        {
            SubscriberRetrieve subscriber
                    = serviceSoap.retrieveSubscriberWithIdentityNoHistory(accountNumber.substring(3), null, 1);
            return subscriber != null ? subscriber.getSubscriberData() : null;
        }
        catch (RemoteException e)
        {
            // TODO parameterize
            authorisation.setResultCode("096");
            authorisation.setNarrative1("Failed to retrieve your phone from the prepaid platform");
            authorisation.setNarrative1(
                    "Failed to retrieve subscriber: " +
                            accountNumber + ": " + e.getMessage());
            return null;
        }
    }

    public static SubscriberPackage subscriberPackage(SubscriberEntity subscriber, Authorisation authorisation)
    {
        if (subscriber == null)
        {
            return POSTPAID;
        }

        String cos = subscriber.getCOSName();

        return  "Staff Spouse".equalsIgnoreCase(cos)
                || "Staff".equalsIgnoreCase(cos)
                || "POST_COS".equalsIgnoreCase(cos)
                || "VIP".equalsIgnoreCase(cos)
            ? POSTPAID : PREPAID;

    }

    public static Boolean creditAccount( ServiceSoap serviceSoap,
                                         Authorisation authorisation,
                                         String accountNumber,
                                         BalanceCreditAccount[] balanceCreditAccounts )
    {
        try
        {
            serviceSoap.creditAccount(
                    accountNumber,
                    null,
                    balanceCreditAccounts,
                    "",
                    authorisation.getProductDescription() + " Ref: " + authorisation.getUuid());
            return Boolean.TRUE;
        }
        catch (RemoteException e)
        {
            // TODO parameterize
            authorisation.setResultCode("096");

            String m = e.getMessage();
            if ( (m != null) && (m.trim().toLowerCase().startsWith("errorcode")) )
            {
                m = m.split("=")[2].trim().substring(1);
                m = m.substring(0, m.length() - 1);
            }
            else
            {
                m = "Failed to update your phone account";
            }
            authorisation.setNarrative1( m );
            return Boolean.FALSE;
        }
    }

    public static VoucherEntity retrieveVoucher(    ServiceSoap serviceSoap,
                                                    Authorisation authorisation,
                                                    String rechargeVoucher )
    {
        try
        {
            return serviceSoap.retrieveVoucherBySecretCode( rechargeVoucher );
        }
        catch (RemoteException e)
        {
            // TODO parameterize
            authorisation.setResultCode("096");

            String m = e.getMessage();
            if ( (m != null) && (m.trim().toLowerCase().startsWith("errorcode")) )
            {
                m = m.split("=")[2].trim().substring(1);
                m = m.substring(0, m.length() - 1);
            }
            else
            {
                m = "Failed to update your phone account";
            }
            authorisation.setNarrative1( m );
            return null;
        }
    }

    public static Boolean rechargeAccount(  ServiceSoap serviceSoap,
                                            Authorisation authorisation,
                                            String accountNumber,
                                            String rechargeVoucher )
    {
        try
        {
            serviceSoap.rechargeAccountBySubscriber(
                                            accountNumber,
                                            null,
                                            rechargeVoucher,
                                            authorisation.getProductDescription() + " Ref: " + authorisation.getUuid());
            return Boolean.TRUE;
        }
        catch (RemoteException e)
        {
            // TODO parameterize
            authorisation.setResultCode("096");

            String m = e.getMessage();
            if ( (m != null) && (m.trim().toLowerCase().startsWith("errorcode")) )
            {
                m = m.split("=")[2].trim().substring(1);
                m = m.substring(0, m.length() - 1);
            }
            else
            {
                m = "Failed to update your phone account";
            }
            authorisation.setNarrative1( m );
            return Boolean.FALSE;
        }
    }

    public static void setResponse(Authorisation authorisation)
    {
        if (DATA_BUNDLE_PURCHARE.equalsIgnoreCase(authorisation.getProcessingCode()) )
        {
            authorisation.setNarrative1(
                    "You have bought the " + authorisation.getQuantity() +"mb bundle.\n" +
                    "Your bal = " + DECIMAL_FORMAT.format(authorisation.getBalance1()) + "usd,\n" +
                    "Data bundle = " + DECIMAL_FORMAT.format(authorisation.getBalance2()) + "mb exp on " +
                    String.format("%1$td/%1$tm/%1$tY", authorisation.getDateTime2().toDate()));
            authorisation.setResultCode("000");
        }
        else if (ACCOUNT_BALANCE_TRANSFER.equalsIgnoreCase(authorisation.getProcessingCode()) )
        {
            authorisation.setNarrative1(
                    "$" + authorisation.getDebitAmount().doubleValue() + " transfer to 0" +
                            authorisation.getToAccountNumber().substring(3) + " accepted. " +
                            "Your balance is now: $" + authorisation.getBalance1().doubleValue());

            authorisation.setNarrative2(
                    "$" + authorisation.getCreditAmount().doubleValue() + " transfer from 0" +
                            authorisation.getToAccountNumber().substring(3) + " accepted. " +
                            "Your balance is now: $" + authorisation.getBalance2().doubleValue());
        }
        else if (VOUCHER_RECHARGE.equalsIgnoreCase(authorisation.getProcessingCode()) )
        {
            if (authorisation.isIntraAccount())
            {
                authorisation.setNarrative1(
                        "$" + new DecimalFormat("###,##.00").format(authorisation.getCreditAmount().doubleValue()) +
                        " recharge voucher accepted. " +
                        "Your balance is now " +
                        new DecimalFormat("###,##.00").format(authorisation.getBalance1().doubleValue()));
            }
            else
            {
                authorisation.setNarrative1(
                        "$" + new DecimalFormat("###,##.00").format(authorisation.getCreditAmount().doubleValue())  +
                        " recharge voucher for 0" + authorisation.getToAccountNumber().substring(3) + " accepted.");

                authorisation.setNarrative2(
                        "$" + new DecimalFormat("###,##.00").format(authorisation.getCreditAmount().doubleValue())
                         + " recharge voucher from 0" + authorisation.getFromAccountNumber().substring(3) + " accepted."
                         + "Your balance is now " +
                            new DecimalFormat("###,##.00").format(authorisation.getBalance2().doubleValue()));
            }
        }
        else
        {
            authorisation.setNarrative1("Unsupported service.");
        }
    }

    public static void setBalanceEnquiryResponse( Authorisation authorisation,
                                                  Map<String, BalanceEntity> balances)
    {

        Double core = balances.get(CORE_BALANCE).getAvailableBalance();
        Double data = balances.get(TEL_COS_DATA_BALANCE).getAvailableBalance() / DATA_BUNDLE_TARIFF;
        Date expiry = balances.get(TEL_COS_DATA_BALANCE).getAccountExpiration().getTime();

        authorisation.setNarrative1(
                            "Airtime bal = " + DECIMAL_FORMAT.format(core) + "usd.\n"
                                + (data != null ?
                                    ( "Data Bundle= " + DECIMAL_FORMAT.format(data) +
                                       "mb exp on " + String.format("%1$td/%1$tm/%1$tY", expiry) )
                                  : "Data Bundle=0.00") + "\n");
        authorisation.setResultCode("000");
    }

    public static String[] parseError(String message)
    {
        return Iterables.toArray(ERROR_MESSAGE_SPLITTER.split(message), String.class);
    }
}

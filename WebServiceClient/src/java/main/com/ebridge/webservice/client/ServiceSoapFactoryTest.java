package com.ebridge.webservice.client;

import com.comverse_in.prepaid.ccws.BalanceEntity;
import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.comverse_in.prepaid.ccws.SubscriberEntity;

import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.util.Date;

public class ServiceSoapFactoryTest
{
    private static final String TEL_COS_DATA_BALANCE = "Gprs_bundle";
    private static final String CORE_BALANCE = "Core";
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("###,###0.00");

    public static void main(String[] args)
    {
        Integer count = Integer.parseInt(args[0]);

        String securityProviderFilename = "/prod/ebridge/wsdd/client_deploy.wsdd";
        String endPointUrl = "http://172.17.1.19:8080/ocswebservices/services/zimbabweocsWebServices?wsdl";
        String userId = "zsmart2";
        String passwordCallBackClassName = "com.ebridge.webservice.client.ws.PasswordCallback";

        String testEndPointUrl = "http://172.17.1.28:8080/ocswebservices/services/zimbabweocsWebServices?wsdl";

        ServiceSoap serviceSoap = ServiceSoapFactory.getService( endPointUrl,
                                                                 userId,
                                                                 passwordCallBackClassName,

                                                                 securityProviderFilename);
        System.out.print("running : " + count);
        long start = System.currentTimeMillis();

        for (int idx = 0; idx < count; ++idx)
        {
            System.out.print(".");
            balance(serviceSoap);
        }

        System.out.println("\nCompleted in: " + (System.currentTimeMillis() - start)/1000 + " seconds");
    }

    private static void balance(ServiceSoap serviceSoap)
    {
        try
        {
            String accountNumber = "263733661588";
            // System.out.print("retrieving " + accountNumber + " : ");
            SubscriberEntity subscriberData
                    = serviceSoap.retrieveSubscriberWithIdentityNoHistory(
                    accountNumber.substring(3), null, 1).getSubscriberData();
            subscriberData.getCOSName();
            Double core = null;
            Double data = null;
            Date expiry = null;
            for ( BalanceEntity balance : subscriberData.getBalances())
            {
                if (CORE_BALANCE.equalsIgnoreCase(balance.getBalanceName()) ||
                        TEL_COS_DATA_BALANCE.equalsIgnoreCase(balance.getBalanceName()))
                {
                    core = balance.getAvailableBalance();
                }
                if (TEL_COS_DATA_BALANCE.equalsIgnoreCase(balance.getBalanceName()))
                {
                    data = balance.getAvailableBalance();
                    expiry = balance.getAccountExpiration().getTime();
                }
            }
            String result = "Airtime bal = " + DECIMAL_FORMAT.format(core) + "usd. "
                    + (data != null ?
                    ( "Data Bundle= " + DECIMAL_FORMAT.format(data) +
                            "mb exp on " + String.format("%1$td/%1$tm/%1$tY", expiry) )
                    : "Data Bundle=0.00") + "\n";
            System.out.println(result);
        }
        catch (RemoteException e)
        {
            System.out.println("message : " + e.getMessage());
            e.printStackTrace();
        }
    }
}

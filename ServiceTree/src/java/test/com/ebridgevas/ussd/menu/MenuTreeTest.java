package com.ebridgevas.ussd.menu;

import static com.ebridge.billinginterface.util.BillingUtils.subscriberPackage;
import static com.ebridge.billinginterface.util.BillingUtils.subscriberRetrieve;
import static com.ebridge.webservice.client.pool.WebServiceConnectionPool.*;
import static com.ebridge.billinginterface.util.BillingUtils.SMPP_MAX_PAYLOAD_LENGTH;
import static com.ebridgevas.ussd.menu.model.util.USSDMenuUtils.dateFromNow;

import static com.ebridgevas.ussd.menu.USSDServer.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.comverse_in.prepaid.ccws.SubscriberEntity;
import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.dto.SubscriberPackage;
import com.ebridgevas.ussd.menu.stub.PostpaidServiceSoapStub;
import com.ebridgevas.ussd.menu.stub.PrepaidServiceSoapStub;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Random;

public class MenuTreeTest
{
    @Before
    public void setup()
    {
        setPrepaidServiceSoap(new PrepaidServiceSoapStub());
        setPostpaidServiceSoap(new PostpaidServiceSoapStub());
    }

    @Test
    public void testRootMenu()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733661588";
        Authorisation authorization = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(authorization.getResultCode(), expected);

        expected =  "Welcome to Telecel DATA bundles\n" +
                    "Please select either 1 or 2\n" +
                    "1. Balance enquiry\n" +
                    "2. Buy my DATA  bundle\n";
        assertEquals(expected, authorization.getNarrative1());
    }

    @Test
    public void testRootMenuInvalidSelection()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733661588";
        Authorisation authorisation = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(authorisation.getResultCode(), expected);

        authorisation = process(null, uuid, "*901*3#");
        expected = "096";
        assertEquals(expected, authorisation.getResultCode());
        expected = "Invalid selection.\n" +
                    "Please select either 1 or 2";
        assertEquals(expected, authorisation.getNarrative1());

        assertEquals(mobileNumber, authorisation.getFromAccountNumber());
    }

    @Test
    public void testPrepaidBalanceEnquiry()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733661588";
        Authorisation authorisation = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(authorisation.getResultCode(), expected);

        authorisation = process(null, uuid, "1");
        expected = "000";
        assertEquals(expected, authorisation.getResultCode());
        expected = "Airtime bal = 10.00usd.\n" +
                    "Data Bundle= 0.94mb exp on 15/08/2015\n";
        assertEquals(expected, authorisation.getNarrative1());
    }

    @Test
    public void testSubscriberPackageDetection()
    {
        // Test for prepaid number
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733661588";
        Authorisation authorisation = new Authorisation( uuid );
        authorisation.setFromAccountNumber(mobileNumber);

        ServiceSoap serviceSoap = getPrepaidServiceSoap();

        SubscriberEntity subscriber
                = subscriberRetrieve(serviceSoap, authorisation, authorisation.getFromAccountNumber());

        SubscriberPackage subscriberPackage = subscriberPackage(subscriber, authorisation);

        assertEquals(SubscriberPackage.PREPAID, subscriberPackage);

        // Test for postpaid numbers not in Prepaid Platform
        mobileNumber = "263733803481";
        authorisation.setFromAccountNumber(mobileNumber);

        subscriber = subscriberRetrieve(serviceSoap, authorisation, authorisation.getFromAccountNumber());
        subscriberPackage = subscriberPackage(subscriber, authorisation);

        assertEquals(SubscriberPackage.POSTPAID, subscriberPackage);

        // Test for postpaid numbers not in STAFF COS class of service
        mobileNumber = "263733803480";
        authorisation.setFromAccountNumber(mobileNumber);

        subscriber = subscriberRetrieve(serviceSoap, authorisation, authorisation.getFromAccountNumber());
        subscriberPackage = subscriberPackage(subscriber, authorisation);

        assertEquals(SubscriberPackage.POSTPAID, subscriberPackage);
    }

    @Test
    public void testPostpaidBalanceEnquiry()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733803480";
        Authorisation authorisation = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(expected, authorisation.getResultCode());

        authorisation = process(null, uuid, "1");
        expected = "000";
        assertEquals(expected, authorisation.getResultCode());
        expected = "Your GPRS bal = 10.00mb exp on 20/08/2016";
        assertEquals(expected, authorisation.getNarrative1());
    }

    @Test
    public void testPrepaidDataBundlePurchase()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733661588";
        Authorisation authorisation = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(authorisation.getResultCode(), expected);

        authorisation = process(null, uuid, "2");
        expected = "000";
        assertEquals(expected, authorisation.getResultCode());

        expected = "Select bundle 1 to 8\n" +
                    "1. 50c for 4.8MB\n" +
                    "2. $1  for 9.5MB\n" +
                    "3. $3  for 76MB\n" +
                    "4. $5  for 142.5MB\n" +
                    "5. $10 for 304MB\n" +
                    "6. $20 for 800MB\n" +
                    "7. $45 for 2000MB\n" +
                    "8. $75 for 4000MB\n";
        assertEquals(expected, authorisation.getNarrative1());
        int len = authorisation.getNarrative1().length();
        assertTrue("Payload maximum length is : " + SMPP_MAX_PAYLOAD_LENGTH + ", this length is : " + len, len <=
                SMPP_MAX_PAYLOAD_LENGTH);

        authorisation = process(null, uuid, "1");

        expected = "000";
        assertEquals(expected, authorisation.getResultCode());

        expected =  "You have bought the 4.80mb bundle.\n" +
                    "Your bal = 9.50usd,\n" +
                    "Data bundle = 5.74mb exp on " +
                        new SimpleDateFormat("dd/MM/yyyy").format(dateFromNow(new BigDecimal("30.00"), "day").toDate());
        assertEquals(expected, authorisation.getNarrative1());
    }

    @Test
    public void testPostpaidDataBundlePurchase()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733803480";
        Authorisation authorisation = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(authorisation.getResultCode(), expected);

        authorisation = process(null, uuid, "2");
        expected = "000";
        assertEquals(expected, authorisation.getResultCode());

        expected = "Select bundle 1 to 8\n" +
                "1. 50c for 4.8MB\n" +
                "2. $1  for 9.5MB\n" +
                "3. $3  for 76MB\n" +
                "4. $5  for 142.5MB\n" +
                "5. $10 for 304MB\n" +
                "6. $20 for 800MB\n" +
                "7. $45 for 2000MB\n" +
                "8. $75 for 4000MB\n";
        assertEquals(expected, authorisation.getNarrative1());
        int len = authorisation.getNarrative1().length();
        assertTrue("Payload maximum length is : " + SMPP_MAX_PAYLOAD_LENGTH + ", this length is : " + len, len <= SMPP_MAX_PAYLOAD_LENGTH );

        authorisation = process(null, uuid, "1");

        expected = "000";
        assertEquals(expected, authorisation.getResultCode());

        expected =  "You have bought the 4.80mb bundle.\n" +
                    "Your data bal = 10.00mb exp on 20/08/2016";
        assertEquals(expected, authorisation.getNarrative1());
    }

    @Test
    public void testDataBundlePurchaseInsufficientFunds()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733661588";
        Authorisation authorisation = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(authorisation.getResultCode(), expected);

        authorisation = process(null, uuid, "2");
        expected = "000";
        assertEquals(expected, authorisation.getResultCode());

        expected = "Select bundle 1 to 8\n" +
                "1. 50c for 4.8MB\n" +
                "2. $1  for 9.5MB\n" +
                "3. $3  for 76MB\n" +
                "4. $5  for 142.5MB\n" +
                "5. $10 for 304MB\n" +
                "6. $20 for 800MB\n" +
                "7. $45 for 2000MB\n" +
                "8. $75 for 4000MB\n";
        assertEquals(expected, authorisation.getNarrative1());
        int len = authorisation.getNarrative1().length();
        assertTrue("Payload maximum length is : " + SMPP_MAX_PAYLOAD_LENGTH + ", this length is : " + len, len <= SMPP_MAX_PAYLOAD_LENGTH );

        authorisation = process(null, uuid, "6");

        expected = "051";
        assertEquals(expected, authorisation.getResultCode());

        expected =  "Insufficient credit for selected bundle,\n" +
                    "please top up airtime or subscribe to a smaller bundle";
        assertEquals(expected, authorisation.getNarrative1());

    }

    @Test
    public void testDataBundlePurchaseInvalidSelection()
    {
        Long uuid = new Random().nextLong();
        String mobileNumber = "263733661588";
        Authorisation authorisation = process(mobileNumber, uuid, "*901#");
        String expected = "000";
        assertEquals(authorisation.getResultCode(), expected);

        authorisation = process(null, uuid, "2");
        expected = "000";
        assertEquals(expected, authorisation.getResultCode());

        expected = "Select bundle 1 to 8\n" +
                "1. 50c for 4.8MB\n" +
                "2. $1  for 9.5MB\n" +
                "3. $3  for 76MB\n" +
                "4. $5  for 142.5MB\n" +
                "5. $10 for 304MB\n" +
                "6. $20 for 800MB\n" +
                "7. $45 for 2000MB\n" +
                "8. $75 for 4000MB\n";
        assertEquals(expected, authorisation.getNarrative1());
        int len = authorisation.getNarrative1().length();
        assertTrue("Payload maximum length is : " + SMPP_MAX_PAYLOAD_LENGTH + ", this length is : " + len, len <= SMPP_MAX_PAYLOAD_LENGTH );

        authorisation = process(null, uuid, "9");

        expected = "096";
        assertEquals(expected, authorisation.getResultCode());

        expected =  "Invalid selection.\n" +
                    "Select bundle 1 to 8";
        assertEquals(expected, authorisation.getNarrative1());
    }
}

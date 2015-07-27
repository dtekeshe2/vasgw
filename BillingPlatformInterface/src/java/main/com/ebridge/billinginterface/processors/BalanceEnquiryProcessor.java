package com.ebridge.billinginterface.processors;

import static com.ebridge.webservice.client.pool.WebServiceConnectionPool.*;
import static com.ebridge.billinginterface.util.BillingUtils.*;

import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.comverse_in.prepaid.ccws.SubscriberEntity;
import com.ebridge.billinginterface.processors.zte.ZTEPostpaidBalanceEnquiry;
import com.ebridge.billinginterface.processors.zte.ZTEPostpaidDataBundlePurchase;
import com.ebridge.billinginterface.processors.zte.ZTEPrepaidBalanceEnquiry;
import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.dto.SubscriberPackage;
import com.ebridgevas.commons.processors.Processor;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices;

public class BalanceEnquiryProcessor
        implements Processor
{

    @Override
    public void process(Authorisation authorisation)
    {
        ServiceSoap serviceSoap = getPrepaidServiceSoap();

        SubscriberEntity subscriber
                = subscriberRetrieve(serviceSoap, authorisation, authorisation.getFromAccountNumber());

        SubscriberPackage subscriberPackage = subscriberPackage(subscriber, authorisation);

        if ( subscriberPackage == SubscriberPackage.PREPAID )
        {
            ZTEPrepaidBalanceEnquiry.balance(subscriber, authorisation);
        }
        else
        {
            WebServices webService = getPostpaidServiceSoap();
            ZTEPostpaidBalanceEnquiry.balance(webService, authorisation);
        }
    }
}

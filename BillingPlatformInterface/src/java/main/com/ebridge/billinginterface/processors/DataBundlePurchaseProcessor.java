package com.ebridge.billinginterface.processors;

import static com.ebridge.billinginterface.util.BillingUtils.DATA_BUNDLE_PURCHARE;

import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.comverse_in.prepaid.ccws.SubscriberEntity;
import com.ebridge.billinginterface.processors.zte.ZTEPostpaidDataBundlePurchase;
import com.ebridge.billinginterface.processors.zte.ZTEPrepaidDataBundlePurchase;
import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.dto.SubscriberPackage;
import com.ebridgevas.commons.processors.Processor;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices;

import static com.ebridge.billinginterface.util.BillingUtils.subscriberPackage;
import static com.ebridge.billinginterface.util.BillingUtils.subscriberRetrieve;
import static com.ebridge.webservice.client.pool.WebServiceConnectionPool.getPostpaidServiceSoap;
import static com.ebridge.webservice.client.pool.WebServiceConnectionPool.getPrepaidServiceSoap;

public class DataBundlePurchaseProcessor
        implements Processor
{

    @Override
    public void process(Authorisation authorisation)
    {
        authorisation.setProcessingCode( DATA_BUNDLE_PURCHARE );

        ServiceSoap serviceSoap = getPrepaidServiceSoap();

        SubscriberEntity subscriber
                = subscriberRetrieve(serviceSoap, authorisation, authorisation.getFromAccountNumber());

        SubscriberPackage subscriberPackage = subscriberPackage(subscriber, authorisation);

        if ( subscriberPackage == SubscriberPackage.PREPAID )
        {
            ZTEPrepaidDataBundlePurchase.process(serviceSoap, subscriber, authorisation);
        }
        else
        {
            WebServices webService = getPostpaidServiceSoap();
            ZTEPostpaidDataBundlePurchase.process(webService, authorisation);
        }
    }
}

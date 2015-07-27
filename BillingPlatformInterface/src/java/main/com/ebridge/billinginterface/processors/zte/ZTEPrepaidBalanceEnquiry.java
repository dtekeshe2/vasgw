package com.ebridge.billinginterface.processors.zte;

import com.comverse_in.prepaid.ccws.BalanceEntity;
import com.comverse_in.prepaid.ccws.SubscriberEntity;
import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.dto.BalanceDTO;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Map;

import static com.ebridge.billinginterface.util.BillingUtils.setBalanceEnquiryResponse;
import static com.ebridge.billinginterface.util.BillingUtils.map;

public class ZTEPrepaidBalanceEnquiry
{

    private static Logger logger = Logger.getLogger( ZTEPrepaidBalanceEnquiry.class );

    public static void balance(SubscriberEntity subscriber, Authorisation authorisation)
    {

        logger.debug("balance : " + authorisation);

        Map<String, BalanceEntity> balances = map(subscriber.getBalances());

        if (balances == null)
            return;

        setBalanceEnquiryResponse(authorisation, balances);
    }

    public void balances(SubscriberEntity subscriber, Authorisation authorisation)
    {
        logger.debug("balances : " + authorisation);

        if (subscriber == null)
            return;

        Map<String, BalanceEntity> balances = map(subscriber.getBalances());

        // Iterate through a set of required balances
        for ( BalanceDTO input : authorisation.getBalances() )
        {
            BalanceEntity balance = balances.get( input.getBalanceName() );
            input.setBalance( new BigDecimal( balance.getAvailableBalance() ) );
            input.setExpiryDate( new DateTime( balance.getAccountExpiration().getTime()));
        }
    }
}

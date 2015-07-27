package com.ebridge.billinginterface.processors.zte;

import com.comverse_in.prepaid.ccws.BalanceEntity;
import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.comverse_in.prepaid.ccws.SubscriberEntity;
import com.comverse_in.prepaid.ccws.VoucherEntity;
import com.ebridgevas.commons.dto.Authorisation;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.Map;

import static com.ebridge.billinginterface.util.BillingUtils.*;

public class ZTEPrepaidVoucherRecharge
{
    private static Logger logger = Logger.getLogger( ZTEPrepaidVoucherRecharge.class );

    public static final String CORE_BALANCE = "Core";

    public void process(ServiceSoap serviceSoap, Authorisation authorisation)
    {
        logger.debug("process : " + authorisation);

        VoucherEntity voucherEntity = retrieveVoucher(serviceSoap, authorisation, authorisation.getProductCode());
        if (voucherEntity == null)
            return;

        if ( ! rechargeAccount( serviceSoap,
                                authorisation,
                                authorisation.getToAccountNumber(),
                                authorisation.getProductCode()) )
            return;

        SubscriberEntity subscriberEntity
                = subscriberRetrieve(serviceSoap, authorisation, authorisation.getToAccountNumber());

        if ( subscriberEntity == null)
            return;

        Map<String, BalanceEntity> balances = map( subscriberEntity.getBalances() );

        if (authorisation.isIntraAccount())
        {

            authorisation.setBalance1(
                    new BigDecimal(
                            balances.get(CORE_BALANCE).getAvailableBalance()
                                    + voucherEntity.getFaceValue().doubleValue()));
        }
        else
        {
            authorisation.setBalance2(
                    new BigDecimal(
                            balances.get(CORE_BALANCE).getAvailableBalance()
                                    + voucherEntity.getFaceValue().doubleValue()));
        }

        authorisation.setCreditAmount( voucherEntity.getFaceValue() );

        setResponse(authorisation);
    }
}

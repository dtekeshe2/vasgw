package com.ebridge.commons.dto;

import com.ebridgevas.commons.dto.PayloadDTO;

import java.math.BigDecimal;
import java.util.ArrayList;

/*
ean_code:60296110027, parent_id:60296110012, route_id:27721418290, ean_description:Airtime Transfer,        ean_short_description: Airtime Transfer,
  params : [{index: 1, name : source_mobile_number, label: Your Mobile Number, type: mobile_number}, {index: 2, name : beneficiary_mobile_number, label: Your Friend\'s Number, type: mobile_number}, {index: 3, name : balance_transfer_amount, label: Amount to Transfer, type: money, balance_transfer_minimum_amount: 1.00, balance_transfer_maximum_amount: 100.00}}'),

 */
public class DTOSerializingTest
{
    public static void dataBundlePurchasePayload()
    {
            /*
            ean_code:60296110014, parent_ean_code:60296110011, service_end_point:27721418290, ean_description:10MB Data Bundle,
            ean_short_description: 4.8 MB Data Bundle,      item_price: 0.50, quantity: 4.80, rate: 0.108, debit_amount: 0.50,
            credit_amount: 0.576, valid_until:30 days
            */
        PayloadDTO payload = new PayloadDTO();
        payload.setEanCode("60296110014");
        payload.setParentEanCode("60296110011");
        payload.setServiceEndPoint("27721418290");
        payload.setEanDescription("10MB Data Bundle");
        payload.setEanShortDescription("4.8 MB Data Bundle");
        payload.setItemPrice(new BigDecimal("0.50"));
        payload.setQuantity(new BigDecimal("4.80"));
        payload.setRate(new BigDecimal("0.108"));
        payload.setDebitAmount(new BigDecimal("0.50"));
        payload.setCreditAmount(new BigDecimal("0.576"));
        payload.setValidUntil(new BigDecimal("30.00"));
        payload.setValidUntilUnit("day");

        System.out.println( payload );

    }


    public static void main(String[] args)
    {
        BalanceTransferRequestForm form = new BalanceTransferRequestForm();
        form.setEanCode("60296110027");
        form.setParentEanCode("60296110012");
        form.setSourceEndPoint("27729745087");
        form.setServiceEndPoint("27721418290");
        form.setEanDescription("Airtime Transfer");
        form.setEanShortDescription("Airtime Transfer");

        form.setParameters(new ArrayList<BalanceTransferRequestFormParameter>());

        BalanceTransferRequestFormParameter param = new BalanceTransferRequestFormParameter();
        param.setIndex(1);
        param.setName("sourceMobileNumber");
        param.setLabel("Your mobile number");
        param.setType("mobileNumber");
        form.getParameters().add(param);

        param = new BalanceTransferRequestFormParameter();
        param.setIndex(2);
        param.setName("beneficiaryMobileNumber");
        param.setLabel("Your friend's number");
        param.setType("mobileNumber");
        form.getParameters().add(param);

        param = new BalanceTransferRequestFormParameter();
        param.setIndex(3);
        param.setName("balanceTransferAmount");
        param.setLabel("Amount to transfer");
        param.setType("money");
        param.setMin(new BigDecimal("1.00"));
        param.setMax(new BigDecimal("100.00"));
        form.getParameters().add(param);

        param = new BalanceTransferRequestFormParameter();
        param.setIndex(4);
        param.setName("transactionFee");
        param.setLabel("Transaction Fee");
        param.setType("money");
        param.setMin(new BigDecimal("0.02"));
        param.setMax(new BigDecimal("0.02"));
        form.getParameters().add(param);

//        System.out.println( form );

        // Postpaid price plan "166" = authorisation.processingCode

         dataBundlePurchasePayload();
    }
}





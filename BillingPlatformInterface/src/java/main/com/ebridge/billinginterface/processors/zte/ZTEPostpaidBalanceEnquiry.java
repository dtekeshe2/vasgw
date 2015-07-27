package com.ebridge.billinginterface.processors.zte;

import com.ebridgevas.commons.dto.Authorisation;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.*;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.ebridge.billinginterface.util.BillingUtils.parseError;

public class ZTEPostpaidBalanceEnquiry
{

    private static Logger logger = Logger.getLogger(ZTEPostpaidBalanceEnquiry.class);

    private static final Double OCTET_TO_DECIMAL_CONVERTOR = 1048576.0;
    private static final String ACCUMULATION_DOES_NOT_EXIST_ERROR_CODE = "S-WS-02017";
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    public static void balance(WebServices webService, Authorisation authorisation)
    {
        logger.debug("process : " + authorisation);

        QueryAcmBalRetDto balResponse = retrieveSubscriberBalance(webService, authorisation);
        if (balResponse == null)
            return;

        Double balanceMb = (Double.parseDouble(balResponse.getBalance()) / OCTET_TO_DECIMAL_CONVERTOR);
        BigDecimal balance = new BigDecimal(balanceMb);
        balance = balance.setScale(2, BigDecimal.ROUND_HALF_UP);

        authorisation.setNarrative1("Your GPRS bal = " + balance + "mb exp on " + balResponse.getExpDate());
        authorisation.setResultCode("000");
    }

    private static QueryAcmBalRetDto retrieveSubscriberBalance(WebServices webService, Authorisation authorisation)
    {
        QueryAcmBalReqDto bal = new QueryAcmBalReqDto();
        bal.setMSISDN(authorisation.getFromAccountNumber());
        bal.setPricePlanID("166");
        try
        {
            return webService.queryAcmBal(bal);
        }
        catch (Exception e)
        {
            String code = null;
            String m = e.getMessage();
            if ((m != null) && (m.trim().toLowerCase().startsWith("errorcode")))
            {
                code = parseError(m.split("=")[1])[0];
                m = m.split("=")[2].trim().substring(1);
                m = m.substring(0, m.length() - 1);
            }

            if(ACCUMULATION_DOES_NOT_EXIST_ERROR_CODE.equalsIgnoreCase( code))
            {
                String today = DATE_FORMAT.format(new Date());
                QueryAcmBalRetDto result = new QueryAcmBalRetDto("0.00", today, today);
                authorisation.setResultCode("000");
                authorisation.setNarrative1(m);
                return result;
            }
            authorisation.setResultCode("096");
            authorisation.setNarrative1(m);
            return null;
        }
    }

    public static void main(String[] args)
    {
        String code = null;
        String m = "errorCode = [S-WS-02017] errorDesc = [The accumulation is not exist.]";
        if ((m != null) && (m.trim().toLowerCase().startsWith("errorcode")))
        {
            code = parseError(m.split("=")[1])[0];

            m = m.split("=")[2].trim().substring(1);
            m = m.substring(0, m.length() - 1);


        }
        System.out.println( code );
//        Long uuid = new Random().nextLong();
//        String mobileNumber = args[0];
//        System.out.println("Dialing");
//        Authorisation authorization = process(mobileNumber, uuid, "*901#");
//        System.out.println("First response : " + authorization );
//        authorization = process(null, uuid, "1");
//        System.out.println("Second response : " + authorization );
    }
}

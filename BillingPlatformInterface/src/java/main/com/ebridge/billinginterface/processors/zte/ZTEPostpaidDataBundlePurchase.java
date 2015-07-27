package com.ebridge.billinginterface.processors.zte;

import com.ebridgevas.commons.dto.Authorisation;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.*;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ZTEPostpaidDataBundlePurchase
{

    private static Logger logger = Logger.getLogger(ZTEPostpaidDataBundlePurchase.class);

    private static final Map<String, String> USER_STATE;

    static
    {
        USER_STATE = new HashMap<>();
        USER_STATE.put("A", "active");
        USER_STATE.put("G", "inactive");
        USER_STATE.put("D", "one-way block");
        USER_STATE.put("E", "two-way block");
        USER_STATE.put("B", "termination");
    }

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final Double OCTET_TO_DECIMAL_CONVERTOR = 1048576.0;

    public static void process(WebServices webService, Authorisation authorisation)
    {

        logger.debug("process : " + authorisation);

        try
        {

            AddUserAcctByIndiPricePlanSubsReqDto request = new AddUserAcctByIndiPricePlanSubsReqDto();
            request.setBundleType(authorisation.getProductCode());
            request.setEffDate(new Date());
            request.setMSISDN(authorisation.getFromAccountNumber());
            request.setPricePlanID("166");

            try
            {
                if ( ! isSubscriberActive(webService, authorisation) )
                    return;

                request.setExpDate(expiryDate(webService, authorisation));

                webService.addUserAcctByIndiPricePlanSubs(request);

                QueryAcmBalRetDto balResponse = retrieveSubscriberBalance(webService, authorisation);
                if (balResponse == null)
                    return;

                Double balanceMb = (Double.parseDouble(balResponse.getBalance()) / OCTET_TO_DECIMAL_CONVERTOR);
                String expiryDate = balResponse.getExpDate();

                BigDecimal balance = new BigDecimal(balanceMb);
                balance = balance.setScale(2, BigDecimal.ROUND_HALF_UP);

                authorisation.setNarrative1("You have bought the " + authorisation.getQuantity() + "mb bundle.\n" +
                        "Your data bal = " + balance + "mb exp on " + expiryDate);
                authorisation.setResultCode("000");

            }
            catch (RemoteException e)
            {

                String m = e.getMessage();
                if ((m != null) && (m.trim().toLowerCase().startsWith("errorcode")))
                {
                    m = m.split("=")[2].trim().substring(1);
                    m = m.substring(0, m.length() - 1);
                }

                authorisation.setResultCode("096");
                authorisation.setNarrative1(m);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            authorisation.setResultCode("096");
            authorisation.setNarrative1(e.getMessage());
        }
    }

    private static boolean isSubscriberActive(WebServices webService, Authorisation authorisation)
    {
        try
        {
            QueryUserProfileReqDto profileRequest = new QueryUserProfileReqDto();
            profileRequest.setMSISDN(authorisation.getFromAccountNumber());
            QueryUserProfileRetDto userProfile = webService.queryUserProfile(profileRequest);
            String userState = userProfile.getUserProfileDto().getState();

            if (userState != null)
            {
                userState = userState.toUpperCase();
            }
            else
            {
                authorisation.setResultCode("096");
                authorisation.setNarrative1(" account state unknown.");
                return false;
            }

            String userStateDescription = USER_STATE.get(userState);
            if (userStateDescription == null)
            {
                authorisation.setResultCode("096");
                authorisation.setNarrative1(" account state unknown.");
                return false;
            }

            if (!"A".equalsIgnoreCase(userState))
            {
                authorisation.setResultCode("096");
                authorisation.setNarrative1(" account " + userStateDescription);
                return false;
            }

            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    private static Date expiryDate(WebServices webService, Authorisation authorisation)
    {

        QueryAcmBalRetDto balResponse = retrieveSubscriberBalance(webService, authorisation);
        Date expiryDate = parse(balResponse.getExpDate());
        if (new DateTime(authorisation.getExpiryDate().toDate())
                .isBefore(new DateTime(expiryDate)))
        {
            return expiryDate;
        }
        else
        {
            return authorisation.getExpiryDate().toDate();
        }
    }

    private static Date parse(String expiryDate)
    {
        try
        {
            return DATE_FORMAT.parse(expiryDate);
        }
        catch (ParseException e)
        {
            return null;
        }
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
            // TODO Notify administrator for offline correction.
            return null;
        }
    }
}

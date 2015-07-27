package com.ebridge.webservice.client.pool;

import com.comverse_in.prepaid.ccws.ServiceSoap;
import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.WebServices;

public class WebServiceConnectionPool
{
    private static WebServices postpaidServiceSoap;
    private static ServiceSoap prepaidServiceSoap;

    public static WebServices getPostpaidServiceSoap()
    {
        return postpaidServiceSoap;
    }

    public static void setPostpaidServiceSoap(WebServices aPostpaidServiceSoap)
    {
        postpaidServiceSoap = aPostpaidServiceSoap;
    }

    public static ServiceSoap getPrepaidServiceSoap()
    {
        return prepaidServiceSoap;
    }

    public static void setPrepaidServiceSoap(ServiceSoap aPrepaidServiceSoap)
    {
        prepaidServiceSoap = aPrepaidServiceSoap;
    }
}

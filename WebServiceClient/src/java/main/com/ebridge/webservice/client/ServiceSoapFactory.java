package com.ebridge.webservice.client;

import com.comverse_in.prepaid.ccws.ServiceLocator;
import com.comverse_in.prepaid.ccws.ServiceSoap;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.components.net.DefaultCommonsHTTPClientProperties;
import org.apache.axis.configuration.FileProvider;
import org.apache.ws.security.WSConstants;
import org.apache.ws.security.handler.WSHandlerConstants;
import org.apache.ws.security.message.token.UsernameToken;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;
import java.net.MalformedURLException;
import java.net.URL;

public class ServiceSoapFactory
{

    public static ServiceSoap getService(   String endPointUrl,
                                            String userId,
                                            String passwordCallBackClassName,
                                            String securityProviderFileName)
    {
        return  getService(endPointUrl, userId, passwordCallBackClassName, securityProviderFileName, 0, 0, 0, 0);
    }

    public static ServiceSoap getService(   String endPointUrl,
                                            String userId,
                                            String passwordCallBackClassName,
                                            String securityProviderFileName,
                                            Integer maxTotalConnections,
                                            Integer connectionPoolTimeout,
                                            Integer connectionTimeout,
                                            Integer readTimeout)
    {
        try
        {
            ServiceLocator locator = new ServiceLocator(new FileProvider(securityProviderFileName));
            ServiceSoap serviceSoap = locator.getServiceSoap(new URL(endPointUrl));
            Stub axisPort = (Stub) serviceSoap;
            axisPort._setProperty(WSHandlerConstants.ACTION, WSHandlerConstants.ENCRYPT);
            axisPort._setProperty(UsernameToken.PASSWORD_TYPE, WSConstants.PASSWORD_TEXT);
            axisPort._setProperty(WSHandlerConstants.USER, userId);
            axisPort._setProperty(WSHandlerConstants.PW_CALLBACK_CLASS, passwordCallBackClassName);

            /*

            AxisProperties.setProperty(
                    DefaultCommonsHTTPClientProperties.MAXIMUM_TOTAL_CONNECTIONS_PROPERTY_KEY,
                    maxTotalConnections);


            AxisProperties.setProperty(
                    DefaultCommonsHTTPClientProperties.MAXIMUM_CONNECTIONS_PER_HOST_PROPERTY_KEY,
                    maxConnectionsPerHost);


            AxisProperties.setProperty(
                    DefaultCommonsHTTPClientProperties.CONNECTION_POOL_TIMEOUT_KEY, connectionPoolTimeout);


            AxisProperties.setProperty(
                    DefaultCommonsHTTPClientProperties.CONNECTION_DEFAULT_CONNECTION_TIMEOUT_KEY, connectionTimeout);


            AxisProperties.setProperty(
                    DefaultCommonsHTTPClientProperties.CONNECTION_DEFAULT_SO_TIMEOUT_KEY, soTimeout);

// Instantiate the ServiceLocator only ONCE !!!
            HelloWorldServiceLocator helloWorldServiceLocator = new HelloWorldServiceLocator();

            ...

// reuse the same ServiceLocator to instantiate all your bindings !!
            HelloWorldBindingStub bindingUserTic = (HelloWorldBindingStub) helloWorldServiceLocator
                    .gethelloWorldBinding();
            */
            /*
            // "Total Connections" Pool size
             axisPort._setProperty(
                     DefaultCommonsHTTPClientProperties.MAXIMUM_TOTAL_CONNECTIONS_PROPERTY_KEY, maxTotalConnections);

            // "Connections per host" pool size
            axisPort._setProperty(
                    DefaultCommonsHTTPClientProperties.MAXIMUM_CONNECTIONS_PER_HOST_PROPERTY_KEY, maxTotalConnections);

            // max duration to wait for a connection from the pool
            axisPort._setProperty(
                    DefaultCommonsHTTPClientProperties.CONNECTION_POOL_TIMEOUT_KEY, connectionPoolTimeout);

            // Timeout to establish connection in millis
            axisPort._setProperty(
                    DefaultCommonsHTTPClientProperties.CONNECTION_DEFAULT_CONNECTION_TIMEOUT_KEY, connectionTimeout);

            // Timeout "waiting for data" (read timeout)
            axisPort._setProperty(
                    DefaultCommonsHTTPClientProperties.CONNECTION_DEFAULT_SO_TIMEOUT_KEY, readTimeout);

            */

            return serviceSoap;
        }
        catch (ServiceException e)
        {
            e.printStackTrace();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

//    public static ServiceSoap getService(String wsDDFilename, String ppdSystemId)
//    {
//        try
//        {
//
//            EngineConfiguration config = new FileProvider("/prod/ebridge/wsdd/transfer/" + wsDDFilename);
//            //prod/ebridge/conf/client.wsdd");
//            ServiceLocator locator = new ServiceLocator(config);
//
//            ServiceSoap prepaidService = locator.getServiceSoap(
//                    new URL("http://172.17.1.19:8080/ocswebservices/services/zimbabweocsWebServices?wsdl"));
//            // Test
////            prepaidService = locator.getServiceSoap(
////                    new URL("http://172.17.1.28:8080/ocswebservices/services/zimbabweocsWebServices?wsdl"));
//
//            System.out.println("########  : " + ppdSystemId);
//            Stub axisPort = (Stub) prepaidService;
//            axisPort._setProperty(WSHandlerConstants.ACTION, WSHandlerConstants.ENCRYPT);
//            axisPort._setProperty(UsernameToken.PASSWORD_TYPE, WSConstants.PASSWORD_TEXT);
//            axisPort._setProperty(WSHandlerConstants.USER, ppdSystemId);
//            axisPort._setProperty(WSHandlerConstants.PW_CALLBACK_CLASS, "com.ebridgevas.in.util.PasswordCallback");
////            axisPort.setUsername( ppdSystemId );
////            axisPort.setPassword("airtime11");
//            return prepaidService;
//        }
//        catch (ServiceException e)
//        {
//            e.printStackTrace();
//        }
//        catch (MalformedURLException e)
//        {
//            e.printStackTrace();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return null;
//    }

//    protected static ServiceSoap getBalanceTransferSoapService()
//    {
//        try
//        {
//            System.out.println("########## Balance Transfer System Id : airtimetrnsf");
//            EngineConfiguration config = new FileProvider("/prod/ebridge/wsdd/transfer/client_deploy.wsdd");
//            //prod/ebridge/conf/client.wsdd");
//            ServiceLocator locator = new ServiceLocator(config);
//
//            ServiceSoap prepaidService = locator.getServiceSoap(
//                    new URL("http://172.17.1.19:8080/ocswebservices/services/zimbabweocsWebServices?wsdl"));
//            // Test
////            prepaidService = locator.getServiceSoap(
////                    new URL("http://172.17.1.28:8080/ocswebservices/services/zimbabweocsWebServices?wsdl"));
//            Stub axisPort = (Stub) prepaidService;
//            axisPort._setProperty(WSHandlerConstants.ACTION, WSHandlerConstants.ENCRYPT);
//            axisPort._setProperty(UsernameToken.PASSWORD_TYPE, WSConstants.PASSWORD_TEXT);
//            axisPort._setProperty(WSHandlerConstants.USER, "airtimetrnsf");
//            axisPort._setProperty(WSHandlerConstants.PW_CALLBACK_CLASS, "com.ebridgevas.in.util.PasswordCallback");
//
//            return prepaidService;
//        }
//        catch (ServiceException e)
//        {
//            e.printStackTrace();
//        }
//        catch (MalformedURLException e)
//        {
//            e.printStackTrace();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//        return null;
//    }
}

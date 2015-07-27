//package com.ebridge.webservice.client;
//
//import com.comverse_in.prepaid.ccws.ServiceSoapStub;
//import org.apache.axis.AxisFault;
//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
//import org.apache.log4j.Logger;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class WebServiceClientTest
//{
//    private static Logger logger = Logger.getLogger(WebServiceClientTest.class);
//
//    /**
//     * number of concurrent searches
//     */
//    private static final int NO_OF_THREADS = 20;
//
//    /**
//     * size of the http connection pool
//     */
//    private static final int POOL_SIZE = 20;
//
//    /**
//     * enabling or disabling the connection pool
//     */
//    private static boolean ENABLE_CONNECTION_POOLING = true;
//
//    /**
//     * close idle connection time in milliseconds
//     * connections will be release if they are idle for this time
//     */
//    private static int CLOSE_IDLE_CONNECTION_TIME = 1000;
//
//    public void test()
//    {
//        init();
//
//        long start = System.currentTimeMillis();
//
//        List<Thread> threads = new ArrayList<Thread>();
//        for (int i = 0; i < NO_OF_THREADS; i++)
//        {
//            SimpleThread thread = new SimpleThread();
//            thread.start();
//
//            threads.add(thread);
//        }
//
//        for (Thread t : threads)
//        {
//            try
//            {
//                t.join();
//            }
//            catch (InterruptedException e)
//            {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//
//        logger.info("************* Test Finish In *******************" + (System.currentTimeMillis() - start) + " ms");
//    }
//
//    public void init()
//    {
//        try
//        {
//            long t1 = System.currentTimeMillis();
//            String endUrl = "";
//            ServiceSoapStub stub = new ServiceSoapStub();
//
//            if ( ENABLE_CONNECTION_POOLING )
//            {
//                stub._getService().get
//                stub._getServiceClient().getOptions().setProperty( HTTPConstants.REUSE_HTTP_CLIENT, Constants.VALUE_TRUE );
//                MultiThreadedHttpConnectionManager connectionManager = new MultiThreadedHttpConnectionManager();
//                connectionManager.getParams().setDefaultMaxConnectionsPerHost( POOL_SIZE );
//                connectionManager.closeIdleConnections( CLOSE_IDLE_CONNECTION_TIME );
//                HttpClient httpClient = new HttpClient( connectionManager );
//                stub._getServiceClient().getOptions().setProperty( HTTPConstants.CACHED_HTTP_CLIENT, httpClient );
//            }
//
//            logger.info( "Connection Established in " + ( System.currentTimeMillis() - t1 ) + "ms" );
//        }
//        catch ( AxisFault e1 )
//        {
//            e1.printStackTrace();
//            fail( "Error on creating the stub" );
//        }
//
//        logger.info( "Connection Initialized successfully" );
//    }
//
//    public class SimpleThread extends Thread
//    {
//        public void run()
//        {
//            search();
//        }
//    }
//
//    private static void search()
//    {
//        logger.info( "$$$$$$$$$$$$$ Start the Search $$$$$$$$$$$$$$" );
//        GetAirportConnections request = new GetAirportConnections();
//        request.setAirportCode( "MTY" );
//
//        GetAirportConnectionsResponse response = null;
//        try
//        {
//            long t1 = System.currentTimeMillis();
//            response = stub.getAirportConnections( request, getUserCredentials() );
//            logger.info( "Results Retrived in " + ( System.currentTimeMillis() - t1 ) + "ms" );
//        }
//        catch ( Exception e )
//        {
//            logger.error( "------------------------- Connection Timeout --------------------------" );
//            e.printStackTrace();
//            fail( e.getMessage() );
//        }
//
//        Airport[] airports = response.getGetAirportConnectionsResult().getAirport();
//        logger.info("Number of airports : " + airports.length );
//    }
//}
//
//
//

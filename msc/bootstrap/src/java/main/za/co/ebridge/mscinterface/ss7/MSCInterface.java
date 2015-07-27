package za.co.ebridge.mscinterface.ss7;

import za.co.ebridge.m3ua.impl.M3UAManagementImpl;
import za.co.ebridge.sccp.impl.SccpStackImpl;
import za.co.ebridge.sctp.api.Management;

import com.ebridgevas.ss7interface.Utils;
import za.co.ebridge.mscinterface.factory.M3UAFactory;
import za.co.ebridge.mscinterface.factory.MAPStackManager;
import za.co.ebridge.mscinterface.factory.SCTPManagementFactory;
import za.co.ebridge.mscinterface.factory.SccpStackFactory;
import za.co.ebridge.mscinterface.model.SS7Config;
import org.apache.log4j.Logger;


/**
 * @author david@tekeshe.com
 */
public class MSCInterface
{

    private static Logger log = Logger.getLogger(MSCInterface.class);

    public static void start(SS7Config localDpcConfig, SS7Config remoteDpcConfig)
    {

        log.info("Initializing SS7 Interface ... ");

        Management sctpManagement = null;

        /*
         * MTP-2 Layer based Stream Control Transmission Protocol that comes with Java 7.0+
         * Establishes a connection to MSC
         */
        log.info("Starting SCTP layer ...");
        while ((sctpManagement == null) || !sctpManagement.isStarted())
        {
            try
            {
                sctpManagement = new SCTPManagementFactory(localDpcConfig, remoteDpcConfig).instance();
                log.info("Is SCTP Layer started : " + sctpManagement.isStarted());
            }
            catch (Exception e)
            {
                e.printStackTrace();
                Utils.sleep(5000L);
            }
        }

        /*
         * MTP-3 Layer. An Adapter for M3UA Users. Specifically TCAP messages as SCCP payloads
         */
        M3UAManagementImpl m3UAManagement = null;
        while ((m3UAManagement == null) || !m3UAManagement.isStarted())
        {
            try
            {
                m3UAManagement = new M3UAFactory(localDpcConfig, remoteDpcConfig, sctpManagement).instance();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                Utils.sleep(5000L);
            }
        }

        /*
         * Signalling Connection Control Protocol. Message router.
         */
        SccpStackImpl sccpStack = null;
        while (sccpStack == null)
        {
            try
            {
                sccpStack = new SccpStackFactory(localDpcConfig, remoteDpcConfig, m3UAManagement).instance();
            }
            catch (Exception e)
            {
                e.printStackTrace();
                Utils.sleep(5000L);
            }
        }

        /*
         * Mobile Application Part - business logic. e.g. USSD dialog or SMS send and receive.
         */
        while (true)
        {
            try
            {
                new MAPStackManager(sccpStack, localDpcConfig).start();
                break;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                Utils.sleep(5000L);
            }
        }

        /*
         * Boot the link
         */
        while (true)
        {
            try
            {
                m3UAManagement.startAsp("RASP1");
                break;
            }
            catch (Exception e)
            {
                e.printStackTrace();
                Utils.sleep(5000L);

                /* Restart the init process. */
                start(localDpcConfig, remoteDpcConfig);
            }
        }

        log.info("SS7 Interface initialized.");
    }
}

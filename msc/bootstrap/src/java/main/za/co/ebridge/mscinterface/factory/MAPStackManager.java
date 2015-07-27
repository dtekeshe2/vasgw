package za.co.ebridge.mscinterface.factory;

import za.co.ebridge.map.api.MAPDialogListener;
import za.co.ebridge.map.api.MAPProvider;
import za.co.ebridge.map.api.service.supplementary.MAPServiceSupplementaryListener;
import za.co.ebridge.map.impl.MAPStackImpl;
import za.co.ebridge.mscinterface.model.SS7Config;
import org.apache.log4j.Logger;
import za.co.ebridge.mscinterface.processors.MAPDialogProcessor;
import za.co.ebridge.mscinterface.processors.MAPServiceSupplementaryProcessor;
import za.co.ebridge.sccp.impl.SccpStackImpl;

/**
 * MAP - Mobile Application Part Initializer.
 * <p/>
 * SS7 Level 7. TCAP MAP - Transaction Capabilities Part - Mobile Application Part.
 */
public class MAPStackManager
{

    private SccpStackImpl sccpStack;
    private SS7Config localDpcConfig;

    private static Logger log = Logger.getLogger("MAPStackManager.class");

    public MAPStackManager(
            SccpStackImpl sccpStack,
            SS7Config localDpcConfig)
    {

        this.sccpStack = sccpStack;
        this.localDpcConfig = localDpcConfig;
    }

    public void start()
            throws
            Exception
    {

        // SCF
        log.info("Initializing MAP Stack .... ssn=147, ssn=5");
        final Integer mapSSN = 5;

        MAPStackImpl mapStack
                = new MAPStackImpl("eBridge SCP Stack",
                this.sccpStack.getSccpProvider(),
                localDpcConfig.getSubSystemNumber(), mapSSN);
        log.debug("mapStack init");
        MAPProvider mapProvider = mapStack.getMAPProvider();

        MAPDialogListener mapDialogProcessor = new MAPDialogProcessor();

        mapProvider.addMAPDialogListener(mapDialogProcessor);
        log.debug("processor set");
        MAPServiceSupplementaryListener mapServiceSupplementaryProcessor
                = new MAPServiceSupplementaryProcessor(mapProvider);

        mapProvider.getMAPServiceSupplementary().addMAPServiceListener(mapServiceSupplementaryProcessor);

        log.debug("activating supplementary service");
        mapProvider.getMAPServiceSupplementary().acivate();

        log.debug("starting stack");
        mapStack.start();
        log.info("MAP Stack Initialized.");
    }
}

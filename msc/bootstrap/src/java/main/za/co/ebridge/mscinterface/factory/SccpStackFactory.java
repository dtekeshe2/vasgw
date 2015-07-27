package za.co.ebridge.mscinterface.factory;

import za.co.ebridge.m3ua.impl.M3UAManagementImpl;
import za.co.ebridge.mscinterface.model.SS7Config;
import org.apache.log4j.Logger;
import za.co.ebridge.sccp.api.Mtp3Destination;
import za.co.ebridge.sccp.api.Mtp3ServiceAccessPoint;
import za.co.ebridge.sccp.api.RemoteSignalingPointCode;
import za.co.ebridge.sccp.api.RemoteSubSystem;
import za.co.ebridge.sccp.impl.RemoteSignalingPointCodeImpl;
import za.co.ebridge.sccp.impl.RemoteSubSystemImpl;
import za.co.ebridge.sccp.impl.SccpStackImpl;
import za.co.ebridge.sccp.impl.router.Mtp3DestinationImpl;
import za.co.ebridge.sccp.impl.router.Mtp3ServiceAccessPointImpl;

/**
 * SCCP - Stream Connection Control Protocol Initializer.
 */
public class SccpStackFactory
{

    private M3UAManagementImpl m3UAManagement;

    private SS7Config localDpcConfig;
    private SS7Config remoteDpcConfig;

    private static Logger log = Logger.getLogger("SCCPFactory.class");

    public SccpStackFactory(
            SS7Config localDpcConfig,
            SS7Config remoteDpcConfig,
            M3UAManagementImpl m3UAManagement)
    {

        this.localDpcConfig = localDpcConfig;
        this.remoteDpcConfig = remoteDpcConfig;
        this.m3UAManagement = m3UAManagement;
    }

    public SccpStackImpl instance()
            throws
            Exception
    {

        log.debug("Initializing SCCP Stack ....");

        SccpStackImpl sccpStack = new SccpStackImpl("MapLoadServerSccpStack");
        final Integer m3UserIdForSCCP = 1;
        final Integer scfId = 1;
        final Integer mapId = 2;
        final Integer scfSSN = 147;
        final Integer mapSSN = 5;

        // Inject M3UA Layer into SCCP Layer.
        sccpStack.setMtp3UserPart(m3UserIdForSCCP, m3UAManagement);

//        // _SSN_5
//        sccpStack.setMtp3UserPart(mapId, m3UAManagement);

        sccpStack.start();
        sccpStack.removeAllResourses();

        RemoteSignalingPointCode rspc
                = new RemoteSignalingPointCodeImpl(remoteDpcConfig.getDestinationPointCode(), 0, 0);

        // _SSN_147 - Service Control Function (SCF)
        RemoteSubSystem rssForServiceControlFunction
                = new RemoteSubSystemImpl(
                        remoteDpcConfig.getDestinationPointCode(),
                        scfSSN,
                        0,
                        false);

        // _SSN_5 - Mobile Application Part (MAP)
        RemoteSubSystem rssForMobileApplicationPart
                = new RemoteSubSystemImpl(
                remoteDpcConfig.getDestinationPointCode(),
                mapSSN,
                0,
                false);


//        sccpStack.getSccpResource().addRemoteSpc(0, rspc.getRemoteSpc(), rspc.getRemoteSpcFlag(), rspc.getMask());
        sccpStack.getSccpResource().addRemoteSpc(scfId, rspc.getRemoteSpc(), rspc.getRemoteSpcFlag(), rspc.getMask());
        sccpStack.getSccpResource().addRemoteSpc(mapId, rspc.getRemoteSpc(), rspc.getRemoteSpcFlag(), rspc.getMask());

//        sccpStack.getSccpResource().addRemoteSsn(
//                0,
//                rss.getRemoteSpc(),
//                rss.getRemoteSsn(),
//                rss.getRemoteSsnFlag(),
//                rss.getMarkProhibitedWhenSpcResuming());

        sccpStack.getSccpResource().addRemoteSsn(
                scfId,
                rssForServiceControlFunction.getRemoteSpc(),
                rssForServiceControlFunction.getRemoteSsn(),
                rssForServiceControlFunction.getRemoteSsnFlag(),
                rssForServiceControlFunction.getMarkProhibitedWhenSpcResuming());

        sccpStack.getSccpResource().addRemoteSsn(
                mapId,
                rssForMobileApplicationPart.getRemoteSpc(),
                rssForMobileApplicationPart.getRemoteSsn(),
                rssForMobileApplicationPart.getRemoteSsnFlag(),
                rssForMobileApplicationPart.getMarkProhibitedWhenSpcResuming());
//
//        Mtp3ServiceAccessPoint sap
//                = new Mtp3ServiceAccessPointImpl(
//                1,
//                localDpcConfig.getDestinationPointCode(),
//                localDpcConfig.getNetworkIndicator());

        Mtp3ServiceAccessPoint sapSCF
                = new Mtp3ServiceAccessPointImpl(
                scfId,
                localDpcConfig.getDestinationPointCode(),
                localDpcConfig.getNetworkIndicator());


//        Mtp3ServiceAccessPoint sapMAP
//                = new Mtp3ServiceAccessPointImpl(
//                mapId,
//                localDpcConfig.getDestinationPointCode(),
//                localDpcConfig.getNetworkIndicator());

        Mtp3Destination destination
                = new Mtp3DestinationImpl(
                remoteDpcConfig.getDestinationPointCode(),
                remoteDpcConfig.getDestinationPointCode(),
                0, 255, 255);
//
//        sccpStack
//                .getRouter()
//                .addMtp3ServiceAccessPoint(1, sap.getMtp3Id(), sap.getOpc(), sap.getNi());


        sccpStack
                .getRouter()
                .addMtp3ServiceAccessPoint(scfId, sapSCF.getMtp3Id(), sapSCF.getOpc(), sapSCF.getNi());


//        sccpStack
//                .getRouter()
//                .addMtp3ServiceAccessPoint(mapId, sapMAP.getMtp3Id(), sapMAP.getOpc(), sapMAP.getNi());

//        sccpStack
//                .getRouter()
//                .addMtp3Destination(
//                        1,
//                        1,
//                        destination.getFirstDpc(),
//                        destination.getLastDpc(),
//                        destination.getFirstSls(),
//                        destination.getLastSls(),
//                        destination.getSlsMask());

        sccpStack
                .getRouter()
                .addMtp3Destination(
                        scfId,
                        1,
                        destination.getFirstDpc(),
                        destination.getLastDpc(),
                        destination.getFirstSls(),
                        destination.getLastSls(),
                        destination.getSlsMask());

//        sccpStack
//                .getRouter()
//                .addMtp3Destination(
//                        mapId,
//                        1,
//                        destination.getFirstDpc(),
//                        destination.getLastDpc(),
//                        destination.getFirstSls(),
//                        destination.getLastSls(),
//                        destination.getSlsMask());

        log.info("SCCP Stack Initialized.");

        return sccpStack;
    }
}

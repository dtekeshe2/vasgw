package za.co.ebridge.mscinterface.factory;

import za.co.ebridge.mscinterface.model.SS7Config;
import za.co.ebridge.sctp.api.IpChannelType;
import za.co.ebridge.sctp.api.Management;
import za.co.ebridge.sctp.impl.ManagementImpl;

import java.util.logging.Logger;

/**
 * SCTP Initializer
 * - MTP Level 2: SCTP  - Stream Control Transmission Protocol.
 * - equivalent to Data Link Layer of Open Systems Inter-Connect (OSI) Layers
 */
public class SCTPManagementFactory
{

    private SS7Config localDpcConfig;
    private SS7Config remoteDpcConfig;

    private static Logger log = Logger.getLogger("SCTPManagementFactory.class");

    public SCTPManagementFactory(
            SS7Config localDpcConfig,
            SS7Config remoteDpcConfig)
    {
        this.localDpcConfig = localDpcConfig;
        this.remoteDpcConfig = remoteDpcConfig;
    }

    public Management instance()
            throws
            Exception
    {

        log.info("Initializing SCTP Stack ....");

        Management sctpManagement = new ManagementImpl("Server");
        sctpManagement.setSingleThread(true);
        sctpManagement.setConnectDelay(10000);
        sctpManagement.start();

        // TODO FATAL REMOVE THIS. FOR TEST PURPOSE ONLY
        sctpManagement.removeAllResources();

        IpChannelType ipChannelType = IpChannelType.getInstance(localDpcConfig.getIpChannelType());

        /* 1. Create SCTP Server */
        sctpManagement.addServer(
                localDpcConfig.getServerName(),
                localDpcConfig.getIpAddress(),
                localDpcConfig.getPort(),
                ipChannelType,
                null);

        /* 2. Create SCTP Server Association */
        sctpManagement.addServerAssociation(
                remoteDpcConfig.getIpAddress(),
                remoteDpcConfig.getPort(),
                localDpcConfig.getServerName(),
                localDpcConfig.getAssociationName(),
                ipChannelType);

        /* 3. Start Server */
        sctpManagement.startServer(localDpcConfig.getServerName());

        log.info("SCTP Stack Initialized.");

        return sctpManagement;
    }
}

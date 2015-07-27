package za.co.ebridge.m3ua.api.parameter;

import za.co.ebridge.m3ua.api.parameter.CongestedIndication.CongestionLevel;

public interface ParameterFactory
{
    /**
     * Constructs Protocol Data parameter.
     *
     * @param opc the origination point code
     * @param dpc the destination point code
     * @param si the service indicator
     * @param ni the network indicator
     * @param mp the message priority indicator
     * @param sls the signaling link selection
     * @param data message payload
     * @return Protocol data parameter
     */
    ProtocolData createProtocolData(int opc, int dpc, int si, int ni, int mp, int sls, byte[] data);

    ProtocolData createProtocolData(byte[] payloadData);

    NetworkAppearance createNetworkAppearance(long netApp);

    RoutingContext createRoutingContext(long[] routCntx);

    CorrelationId createCorrelationId(long corrId);

    AffectedPointCode createAffectedPointCode(int[] pc, short[] mask);

    DestinationPointCode createDestinationPointCode(int pc, short mask);

    InfoString createInfoString(String string);

    ConcernedDPC createConcernedDPC(int pointCode);

    CongestedIndication createCongestedIndication(CongestionLevel level);

    UserCause createUserCause(int user, int cause);

    ASPIdentifier createASPIdentifier(long aspId);

    LocalRKIdentifier createLocalRKIdentifier(long id);

    OPCList createOPCList(int[] pc, short[] mask);

    ServiceIndicators createServiceIndicators(short[] inds);

    TrafficModeType createTrafficModeType(int mode);

    RegistrationStatus createRegistrationStatus(int status);

    DiagnosticInfo createDiagnosticInfo(String info);

    RoutingKey createRoutingKey(LocalRKIdentifier localRkId, RoutingContext rc, TrafficModeType trafMdTy,
            NetworkAppearance netApp, DestinationPointCode[] dpc, ServiceIndicators[] servInds, OPCList[] opcList);

    RegistrationResult createRegistrationResult(LocalRKIdentifier localRkId, RegistrationStatus status, RoutingContext rc);

    DeregistrationStatus createDeregistrationStatus(int status);

    DeregistrationResult createDeregistrationResult(RoutingContext rc, DeregistrationStatus status);

    ErrorCode createErrorCode(int code);

    Status createStatus(int type, int info);

    HeartbeatData createHeartbeatData(byte[] data);

}

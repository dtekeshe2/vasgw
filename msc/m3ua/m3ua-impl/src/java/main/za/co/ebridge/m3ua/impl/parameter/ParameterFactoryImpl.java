package za.co.ebridge.m3ua.impl.parameter;

import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.ConcernedDPC;
import za.co.ebridge.m3ua.api.parameter.CongestedIndication;
import za.co.ebridge.m3ua.api.parameter.CongestedIndication.CongestionLevel;
import za.co.ebridge.m3ua.api.parameter.CorrelationId;
import za.co.ebridge.m3ua.api.parameter.DeregistrationResult;
import za.co.ebridge.m3ua.api.parameter.DeregistrationStatus;
import za.co.ebridge.m3ua.api.parameter.DestinationPointCode;
import za.co.ebridge.m3ua.api.parameter.DiagnosticInfo;
import za.co.ebridge.m3ua.api.parameter.ErrorCode;
import za.co.ebridge.m3ua.api.parameter.HeartbeatData;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.LocalRKIdentifier;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.OPCList;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.ParameterFactory;
import za.co.ebridge.m3ua.api.parameter.ProtocolData;
import za.co.ebridge.m3ua.api.parameter.RegistrationResult;
import za.co.ebridge.m3ua.api.parameter.RegistrationStatus;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.RoutingKey;
import za.co.ebridge.m3ua.api.parameter.ServiceIndicators;
import za.co.ebridge.m3ua.api.parameter.Status;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;
import za.co.ebridge.m3ua.api.parameter.UserCause;

public class ParameterFactoryImpl
        implements ParameterFactory
{
    public ProtocolData createProtocolData(int opc, int dpc, int si, int ni, int mp, int sls, byte[] data)
    {
        return new ProtocolDataImpl(opc, dpc, si, ni, mp, sls, data);
    }

    public ProtocolData createProtocolData(byte[] payloadData)
    {
        ProtocolDataImpl p = new ProtocolDataImpl(payloadData);
        return p;
    }

    public NetworkAppearance createNetworkAppearance(long netApp)
    {
        return new NetworkAppearanceImpl(netApp);
    }

    public RoutingContext createRoutingContext(long[] routCntx) {
        return new RoutingContextImpl(routCntx);
    }

    public CorrelationId createCorrelationId(long corrId)
    {
        return new CorrelationIdImpl(corrId);
    }

    public AffectedPointCode createAffectedPointCode(int[] pc, short[] mask)
    {
        return new AffectedPointCodeImpl(pc, mask);
    }

    public DestinationPointCode createDestinationPointCode(int pc, short mask)
    {
        return new DestinationPointCodeImpl(pc, mask);
    }

    public InfoString createInfoString(String string)
    {
        return new InfoStringImpl(string);
    }

    public ConcernedDPC createConcernedDPC(int pointCode) {
        return new ConcernedDPCImpl(pointCode);
    }

    public CongestedIndication createCongestedIndication(CongestionLevel level) {
        return new CongestedIndicationImpl(level);
    }

    public UserCause createUserCause(int user, int cause)
    {
        return new UserCauseImpl(user, cause);
    }

    public ASPIdentifier createASPIdentifier(long aspId)
    {
        return new ASPIdentifierImpl(aspId);
    }

    public LocalRKIdentifier createLocalRKIdentifier(long id)
    {
        return new LocalRKIdentifierImpl(id);
    }

    public OPCList createOPCList(int[] pc, short[] mask)
    {
        return new OPCListImpl(pc, mask);
    }

    public ServiceIndicators createServiceIndicators(short[] indicators)
    {
        return new ServiceIndicatorsImpl(indicators);
    }

    public TrafficModeType createTrafficModeType(int mode) {
        return new TrafficModeTypeImpl(mode);
    }

    public RegistrationStatus createRegistrationStatus(int status)
    {
        return new RegistrationStatusImpl(status);
    }

    public DiagnosticInfo createDiagnosticInfo(String info) {
        return new DiagnosticInfoImpl(info);
    }

    public RoutingKey createRoutingKey( LocalRKIdentifier localRkId,
                                        RoutingContext rc,
                                        TrafficModeType trafMdTy,
                                        NetworkAppearance netApp,
                                        DestinationPointCode[] dpc,
                                        ServiceIndicators[] servInds,
                                        OPCList[] opcList)
    {
        return new RoutingKeyImpl(localRkId, rc, trafMdTy, netApp, dpc, servInds, opcList);
    }

    public RegistrationResult createRegistrationResult( LocalRKIdentifier localRkId,
                                                        RegistrationStatus status,
                                                        RoutingContext rc)
    {
        return new RegistrationResultImpl(localRkId, status, rc);
    }

    public DeregistrationStatus createDeregistrationStatus(int status) {
        return new DeregistrationStatusImpl(status);
    }

    public DeregistrationResult createDeregistrationResult(RoutingContext rc, DeregistrationStatus status) {
        return new DeregistrationResultImpl(rc, status);
    }

    public ErrorCode createErrorCode(int code)
    {
        return new ErrorCodeImpl(code);
    }

    public Status createStatus(int type, int info)
    {
        return new StatusImpl(type, info);
    }

    public HeartbeatData createHeartbeatData(byte[] data)
    {
        return new HeartbeatDataImpl(data);
    }

    public Parameter createParameter(int tag, byte[] value)
    {
        ParameterImpl p = null;
        switch (tag)
        {
            case ParameterImpl.Protocol_Data:
                p = new ProtocolDataImpl(value);
                break;
            case ParameterImpl.Traffic_Mode_Type:
                p = new TrafficModeTypeImpl(value);
                break;
            case ParameterImpl.Network_Appearance:
                p = new NetworkAppearanceImpl(value);
                break;
            case ParameterImpl.Routing_Context:
                p = new RoutingContextImpl(value);
                break;
            case ParameterImpl.Correlation_ID:
                p = new CorrelationIdImpl(value);
                break;
            case ParameterImpl.Affected_Point_Code:
                p = new AffectedPointCodeImpl(value);
                break;
            case ParameterImpl.Originating_Point_Code_List:
                p = new OPCListImpl(value);
                break;
            case ParameterImpl.Destination_Point_Code:
                p = new DestinationPointCodeImpl(value);
                break;
            case ParameterImpl.INFO_String:
                p = new InfoStringImpl(value);
                break;
            case ParameterImpl.Concerned_Destination:
                p = new ConcernedDPCImpl(value);
                break;
            case ParameterImpl.Congestion_Indications:
                p = new CongestedIndicationImpl(value);
                break;
            case ParameterImpl.User_Cause:
                p = new UserCauseImpl(value);
                break;
            case ParameterImpl.ASP_Identifier:
                p = new ASPIdentifierImpl(value);
                break;
            case ParameterImpl.Local_Routing_Key_Identifier:
                p = new LocalRKIdentifierImpl(value);
                break;
            case ParameterImpl.Service_Indicators:
                p = new ServiceIndicatorsImpl(value);
                break;
            case ParameterImpl.Routing_Key:
                p = new RoutingKeyImpl(value);
                break;
            case ParameterImpl.Registration_Status:
                p = new RegistrationStatusImpl(value);
                break;
            case ParameterImpl.Registration_Result:
                p = new RegistrationResultImpl(value);
                break;
            case ParameterImpl.Deregistration_Status:
                p = new DeregistrationStatusImpl(value);
                break;
            case ParameterImpl.Deregistration_Result:
                p = new DeregistrationResultImpl(value);
                break;
            case ParameterImpl.Diagnostic_Information:
                p = new DiagnosticInfoImpl(value);
                break;
            case ParameterImpl.Error_Code:
                p = new ErrorCodeImpl(value);
                break;
            case ParameterImpl.Status:
                p = new StatusImpl(value);
                break;
            case ParameterImpl.Heartbeat_Data:
                p = new HeartbeatDataImpl(value);
                break;
            default:
                p = new UnknownParameterImpl(tag, value.length, value);
                break;
        }
        return p;
    }
}

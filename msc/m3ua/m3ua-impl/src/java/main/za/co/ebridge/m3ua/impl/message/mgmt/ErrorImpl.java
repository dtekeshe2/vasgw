package za.co.ebridge.m3ua.impl.message.mgmt;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.mgmt.Error;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.DiagnosticInfo;
import za.co.ebridge.m3ua.api.parameter.ErrorCode;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class ErrorImpl
        extends M3UAMessageImpl
        implements Error
{

    public ErrorImpl()
    {
        super(  MessageClass.MANAGEMENT,
                MessageType.ERROR,
                MessageType.S_ERROR );
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        ((ParameterImpl) parameters.get(Parameter.Error_Code)).write(buffer);

        if (parameters.containsKey(Parameter.Routing_Context))
        {
            ((ParameterImpl) parameters.get(Parameter.Routing_Context)).write(buffer);
        }

        if (parameters.containsKey(Parameter.Affected_Point_Code))
        {
            ((ParameterImpl) parameters.get(Parameter.Affected_Point_Code)).write(buffer);
        }

        if (parameters.containsKey(Parameter.Network_Appearance))
        {
            ((ParameterImpl) parameters.get(Parameter.Network_Appearance)).write(buffer);
        }

        if (parameters.containsKey(Parameter.Diagnostic_Information))
        {
            ((ParameterImpl) parameters.get(Parameter.Diagnostic_Information)).write(buffer);
        }
    }

    public AffectedPointCode getAffectedPointCode()
    {
        return ((AffectedPointCode) parameters.get(Parameter.Affected_Point_Code));
    }

    public DiagnosticInfo getDiagnosticInfo()
    {
        return ((DiagnosticInfo) parameters.get(Parameter.Diagnostic_Information));
    }

    public ErrorCode getErrorCode()
    {
        return ((ErrorCode) parameters.get(Parameter.Error_Code));
    }

    public NetworkAppearance getNetworkAppearance()
    {
        return ((NetworkAppearance) parameters.get(Parameter.Network_Appearance));
    }

    public RoutingContext getRoutingContext()
    {
        return ((RoutingContext) parameters.get(Parameter.Routing_Context));
    }

    public void setAffectedPointCode(AffectedPointCode affPc)
    {
        parameters.put(Parameter.Affected_Point_Code, affPc);
    }

    public void setDiagnosticInfo(DiagnosticInfo diagInfo)
    {
        parameters.put(Parameter.Diagnostic_Information, diagInfo);
    }

    public void setErrorCode(ErrorCode code)
    {
        parameters.put(Parameter.Error_Code, code);
    }

    public void setNetworkAppearance(NetworkAppearance netApp)
    {
        parameters.put(Parameter.Network_Appearance, netApp);
    }

    public void setRoutingContext(RoutingContext rc)
    {
        if (rc != null)
        {
            parameters.put(Parameter.Routing_Context, rc);
        }
    }
}

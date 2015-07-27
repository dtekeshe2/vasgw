package za.co.ebridge.m3ua.impl.message.ssnm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.ssnm.DestinationUPUnavailable;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.UserCause;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class DestinationUPUnavailableImpl
        extends M3UAMessageImpl
        implements DestinationUPUnavailable
{

    public DestinationUPUnavailableImpl()
    {
        super(  MessageClass.SIGNALING_NETWORK_MANAGEMENT,
                MessageType.DESTINATION_USER_PART_UNAVAILABLE,
                MessageType.S_DESTINATION_USER_PART_UNAVAILABLE );
    }

    public AffectedPointCode getAffectedPointCode()
    {
        return (AffectedPointCode) parameters.get(Parameter.Affected_Point_Code);
    }

    public InfoString getInfoString()
    {
        return (InfoString) parameters.get(Parameter.INFO_String);
    }

    public NetworkAppearance getNetworkAppearance()
    {
        return (NetworkAppearance) parameters.get(Parameter.Network_Appearance);
    }

    public RoutingContext getRoutingContext()
    {
        return (RoutingContext) parameters.get(Parameter.Routing_Context);
    }

    public UserCause getUserCause()
    {
        return (UserCause) parameters.get(Parameter.User_Cause);
    }

    public void setAffectedPointCode(AffectedPointCode afpc)
    {
        parameters.put(Parameter.Affected_Point_Code, afpc);
    }

    public void setInfoString(InfoString str)
    {
        if (str != null) {
            parameters.put(Parameter.INFO_String, str);
        }
    }

    public void setNetworkAppearance(NetworkAppearance p)
    {
        if (p != null)
        {
            parameters.put(Parameter.Network_Appearance, p);
        }
    }

    public void setRoutingContext(RoutingContext routingCntx)
    {
        if (routingCntx != null)
        {
            parameters.put(Parameter.Routing_Context, routingCntx);
        }
    }

    public void setUserCause(UserCause usrCau)
    {
        parameters.put(Parameter.User_Cause, usrCau);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        if (parameters.containsKey(Parameter.Network_Appearance))
        {
            ((ParameterImpl) parameters.get(Parameter.Network_Appearance)).write(buffer);
        }

        if (parameters.containsKey(Parameter.Routing_Context))
        {
            ((ParameterImpl) parameters.get(Parameter.Routing_Context)).write(buffer);
        }
        if (parameters.containsKey(Parameter.Affected_Point_Code))
        {
            ((ParameterImpl) parameters.get(Parameter.Affected_Point_Code)).write(buffer);
        }
        if (parameters.containsKey(Parameter.User_Cause))
        {
            ((ParameterImpl) parameters.get(Parameter.User_Cause)).write(buffer);
        }
        if (parameters.containsKey(Parameter.INFO_String))
        {
            ((ParameterImpl) parameters.get(Parameter.INFO_String)).write(buffer);
        }
    }
}

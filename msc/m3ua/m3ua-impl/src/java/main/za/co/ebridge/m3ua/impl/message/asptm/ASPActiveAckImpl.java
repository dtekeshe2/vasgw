package za.co.ebridge.m3ua.impl.message.asptm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.asptm.ASPActiveAck;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class ASPActiveAckImpl
        extends M3UAMessageImpl
        implements ASPActiveAck
{
    public ASPActiveAckImpl()
    {
        super(MessageClass.ASP_TRAFFIC_MAINTENANCE, MessageType.ASP_ACTIVE_ACK, MessageType.S_ASP_ACTIVE_ACK);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        if (parameters.containsKey(Parameter.Traffic_Mode_Type))
        {
            ((ParameterImpl) parameters.get(Parameter.Traffic_Mode_Type)).write(buffer);
        }
        if (parameters.containsKey(Parameter.Routing_Context))
        {
            ((ParameterImpl) parameters.get(Parameter.Routing_Context)).write(buffer);
        }
        if (parameters.containsKey(Parameter.INFO_String))
        {
            ((ParameterImpl) parameters.get(Parameter.INFO_String)).write(buffer);
        }
    }

    public InfoString getInfoString()
    {
        return (InfoString) parameters.get(Parameter.INFO_String);
    }

    public RoutingContext getRoutingContext()
    {
        return (RoutingContext) parameters.get(Parameter.Routing_Context);
    }

    public TrafficModeType getTrafficModeType()
    {
        return (TrafficModeType) parameters.get(Parameter.Traffic_Mode_Type);
    }

    public void setInfoString(InfoString str)
    {
        if (str != null)
        {
            parameters.put(Parameter.INFO_String, str);
        }
    }

    public void setRoutingContext(RoutingContext rc)
    {
        if (rc != null)
        {
            parameters.put(Parameter.Routing_Context, rc);
        }
    }

    public void setTrafficModeType(TrafficModeType mode)
    {
        if (mode != null)
        {
            parameters.put(Parameter.Traffic_Mode_Type, mode);
        }
    }
}

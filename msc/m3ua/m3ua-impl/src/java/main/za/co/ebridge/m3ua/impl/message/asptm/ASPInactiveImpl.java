package za.co.ebridge.m3ua.impl.message.asptm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.asptm.ASPInactive;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class ASPInactiveImpl
        extends M3UAMessageImpl
        implements ASPInactive
{

    public ASPInactiveImpl()
    {
        super(MessageClass.ASP_TRAFFIC_MAINTENANCE, MessageType.ASP_INACTIVE, MessageType.S_ASP_INACTIVE);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {

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
}

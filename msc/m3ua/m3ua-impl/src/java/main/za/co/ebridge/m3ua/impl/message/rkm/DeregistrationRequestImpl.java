package za.co.ebridge.m3ua.impl.message.rkm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.rkm.DeregistrationRequest;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class DeregistrationRequestImpl
        extends M3UAMessageImpl
        implements DeregistrationRequest
{
    public DeregistrationRequestImpl()
    {
        super(MessageClass.ROUTING_KEY_MANAGEMENT, MessageType.DEREG_REQUEST, MessageType.S_DEREG_REQUEST);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        ((ParameterImpl) parameters.get(Parameter.Routing_Context)).write(buffer);
    }

    public RoutingContext getRoutingContext()
    {
        return (RoutingContext) parameters.get(Parameter.Routing_Context);
    }

    public void setRoutingContext(RoutingContext rc)
    {
        if (rc != null) {
            parameters.put(Parameter.Routing_Context, rc);
        }
    }
}

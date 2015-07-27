package za.co.ebridge.m3ua.impl.message.rkm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.rkm.RegistrationRequest;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingKey;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class RegistrationRequestImpl
        extends M3UAMessageImpl
        implements RegistrationRequest
{

    public RegistrationRequestImpl()
    {
        super(MessageClass.ROUTING_KEY_MANAGEMENT, MessageType.REG_REQUEST, MessageType.S_REG_REQUEST);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        if (parameters.containsKey(Parameter.Routing_Key))
        {
            ((ParameterImpl) parameters.get(Parameter.Routing_Key)).write(buffer);
        }
    }

    public RoutingKey getRoutingKey()
    {
        return (RoutingKey) parameters.get(Parameter.Routing_Key);
    }

    public void setRoutingKey(RoutingKey key)
    {
        parameters.put(Parameter.Routing_Key, key);
    }
}

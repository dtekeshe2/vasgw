package za.co.ebridge.m3ua.impl.message.rkm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.rkm.RegistrationResponse;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RegistrationResult;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class RegistrationResponseImpl
        extends M3UAMessageImpl
        implements RegistrationResponse
{

    public RegistrationResponseImpl()
    {
        super(MessageClass.ROUTING_KEY_MANAGEMENT, MessageType.REG_RESPONSE, MessageType.S_REG_RESPONSE);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        ((ParameterImpl) parameters.get(Parameter.Registration_Result)).write(buffer);
    }

    public RegistrationResult getRegistrationResult()
    {
        return (RegistrationResult) parameters.get(ParameterImpl.Registration_Result);
    }

    public void setRegistrationResult(RegistrationResult rslt)
    {
        parameters.put(ParameterImpl.Registration_Result, rslt);
    }
}

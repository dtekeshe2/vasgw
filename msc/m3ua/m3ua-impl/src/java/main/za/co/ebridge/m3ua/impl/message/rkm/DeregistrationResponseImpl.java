package za.co.ebridge.m3ua.impl.message.rkm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.rkm.DeregistrationResponse;
import za.co.ebridge.m3ua.api.parameter.DeregistrationResult;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class DeregistrationResponseImpl
        extends M3UAMessageImpl
        implements DeregistrationResponse
{

    public DeregistrationResponseImpl()
    {
        super(  MessageClass.ROUTING_KEY_MANAGEMENT,
                MessageType.DEREG_RESPONSE,
                MessageType.S_DEREG_RESPONSE);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        ((ParameterImpl) parameters.get(Parameter.Deregistration_Result)).write(buffer);
    }

    public DeregistrationResult getDeregistrationResult()
    {
        return (DeregistrationResult) parameters.get(Parameter.Deregistration_Result);
    }

    public void setDeregistrationResult(DeregistrationResult result)
    {
        parameters.put(Parameter.Deregistration_Result, result);

    }

}

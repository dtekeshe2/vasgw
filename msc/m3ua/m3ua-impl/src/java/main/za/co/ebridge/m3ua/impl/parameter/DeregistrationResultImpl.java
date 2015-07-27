package za.co.ebridge.m3ua.impl.parameter;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.parameter.DeregistrationResult;
import za.co.ebridge.m3ua.api.parameter.DeregistrationStatus;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

public class DeregistrationResultImpl
        extends ParameterImpl
        implements DeregistrationResult
{

    private RoutingContext rc;
    private DeregistrationStatus status;
    private byte[] value;

    private ByteBuffer buffer = ByteBuffer.allocate(16);

    public DeregistrationResultImpl(RoutingContext rc, DeregistrationStatus status)
    {
        this.tag = Parameter.Deregistration_Result;
        this.rc = rc;
        this.status = status;

        this.encode();
    }

    public DeregistrationResultImpl(byte[] data)
    {
        this.tag = Parameter.Deregistration_Result;
        int pos = 0;

        while (pos < data.length)
        {
            short tag = (short) ((data[pos] & 0xff) << 8 | (data[pos + 1] & 0xff));
            short len = (short) ((data[pos + 2] & 0xff) << 8 | (data[pos + 3] & 0xff));

            byte[] value = new byte[len - 4];

            System.arraycopy(data, pos + 4, value, 0, value.length);
            pos += len;
            // parameters.put(tag, factory.createParameter(tag, value));
            switch (tag) {
                case ParameterImpl.Routing_Context:
                    this.rc = new RoutingContextImpl(value);
                    break;

                case ParameterImpl.Deregistration_Status:
                    this.status = new DeregistrationStatusImpl(value);
                    break;

            }

            // The Parameter Length does not include any padding octets. We have
            // to consider padding here
            pos += (pos % 4);
        }
    }

    private void encode()
    {
        ((RoutingContextImpl) this.rc).write(buffer);
        ((DeregistrationStatusImpl) this.status).write(buffer);
        value = buffer.array();
    }

    @Override
    protected byte[] getValue()
    {
        return this.value;
    }

    public DeregistrationStatus getDeregistrationStatus()
    {
        return this.status;
    }

    public RoutingContext getRoutingContext()
    {
        return this.rc;
    }
}

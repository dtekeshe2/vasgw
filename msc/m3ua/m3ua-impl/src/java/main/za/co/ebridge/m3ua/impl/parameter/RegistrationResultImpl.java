package za.co.ebridge.m3ua.impl.parameter;

import java.nio.ByteBuffer;

import javolution.text.TextBuilder;

import za.co.ebridge.m3ua.api.parameter.LocalRKIdentifier;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RegistrationResult;
import za.co.ebridge.m3ua.api.parameter.RegistrationStatus;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;

public class RegistrationResultImpl
        extends ParameterImpl
        implements RegistrationResult
{
    private LocalRKIdentifier localRKId;
    private RegistrationStatus status;
    private RoutingContext rc;

    private ByteBuffer buffer = ByteBuffer.allocate(24);
    private byte[] value;

    public RegistrationResultImpl(byte[] data)
    {
        this.tag = Parameter.Registration_Result;
        int pos = 0;

        while (pos < data.length)
        {
            short tag = (short) ((data[pos] & 0xff) << 8 | (data[pos + 1] & 0xff));
            short len = (short) ((data[pos + 2] & 0xff) << 8 | (data[pos + 3] & 0xff));

            byte[] value = new byte[len - 4];

            System.arraycopy(data, pos + 4, value, 0, value.length);
            pos += len;
            // parameters.put(tag, factory.createParameter(tag, value));
            switch (tag)
            {
                case ParameterImpl.Local_Routing_Key_Identifier:
                    this.localRKId = new LocalRKIdentifierImpl(value);
                    break;

                case ParameterImpl.Routing_Context:
                    this.rc = new RoutingContextImpl(value);
                    break;

                case ParameterImpl.Registration_Status:
                    this.status = new RegistrationStatusImpl(value);
                    break;

            }

            // The Parameter Length does not include any padding octets. We have
            // to consider padding here
            pos += (pos % 4);
        }// end of while
    }

    public RegistrationResultImpl(LocalRKIdentifier localRKId, RegistrationStatus status, RoutingContext rc)
    {
        this.tag = Parameter.Registration_Result;
        this.localRKId = localRKId;
        this.status = status;
        this.rc = rc;

        this.encode();
    }

    private void encode()
    {
        ((LocalRKIdentifierImpl) this.localRKId).write(buffer);

        ((RoutingContextImpl) rc).write(buffer);

        ((RegistrationStatusImpl) this.status).write(buffer);

        value = buffer.array();
    }

    @Override
    protected byte[] getValue()
    {
        return this.value;
    }

    public LocalRKIdentifier getLocalRKIdentifier()
    {
        return this.localRKId;
    }

    public RegistrationStatus getRegistrationStatus()
    {
        return this.status;
    }

    public RoutingContext getRoutingContext()
    {
        return this.rc;
    }

    @Override
    public String toString()
    {
        TextBuilder tb = new TextBuilder();
        tb.append("RegistrationResult(");
        if (localRKId != null)
        {
            tb.append(localRKId.toString());
        }

        if (status != null)
        {
            tb.append(status.toString());
        }

        if (rc != null)
        {
            tb.append(rc.toString());
        }
        tb.append(")");

        return tb.toString();
    }
}

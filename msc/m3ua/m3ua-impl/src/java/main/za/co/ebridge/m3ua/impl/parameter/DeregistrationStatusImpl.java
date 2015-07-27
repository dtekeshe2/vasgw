package za.co.ebridge.m3ua.impl.parameter;

import za.co.ebridge.m3ua.api.parameter.DeregistrationStatus;
import za.co.ebridge.m3ua.api.parameter.Parameter;

public class DeregistrationStatusImpl
        extends ParameterImpl
        implements DeregistrationStatus
{
    private int status;

    public DeregistrationStatusImpl(int status)
    {
        this.tag = Parameter.Deregistration_Status;
        this.status = status;
    }

    public DeregistrationStatusImpl(byte[] data)
    {
        this.tag = Parameter.Deregistration_Status;
        this.status = 0;
        this.status |= data[0] & 0xFF;
        this.status <<= 8;
        this.status |= data[1] & 0xFF;
        this.status <<= 8;
        this.status |= data[2] & 0xFF;
        this.status <<= 8;
        this.status |= data[3] & 0xFF;
    }

    @Override
    protected byte[] getValue()
    {
        byte[] data = new byte[4];
        data[0] = (byte) (status >>> 24);
        data[1] = (byte) (status >>> 16);
        data[2] = (byte) (status >>> 8);
        data[3] = (byte) (status);

        return data;
    }

    public int getStatus()
    {
        return this.status;
    }

    @Override
    public String toString()
    {
        return String.format("DeregistrationStatus = %d", status);
    }
}

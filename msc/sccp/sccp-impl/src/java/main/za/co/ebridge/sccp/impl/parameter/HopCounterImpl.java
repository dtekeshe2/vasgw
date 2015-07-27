package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.parameter.HopCounter;

public class HopCounterImpl
        extends AbstractParameter
        implements HopCounter
{

    private int value;

    public HopCounterImpl(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    public void decode(InputStream in)
            throws
            IOException
    {
        if (in.read() != 1)
        {
            throw new IOException();
        }
        this.value = in.read() & 0x0F; // ?

    }

    public void encode(OutputStream os)
            throws
            IOException
    {
        os.write(1);
        os.write(this.value & 0x0F);

    }

    public void decode(byte[] b)
            throws
            IOException
    {
        this.value = b[0] & 0x0F; // ?

    }

    public byte[] encode()
            throws
            IOException
    {
        return new byte[]{(byte) (this.value & 0x0F)};
    }
}

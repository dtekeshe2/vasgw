package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.parameter.ProtocolClass;

public class ProtocolClassImpl
        extends AbstractParameter
        implements ProtocolClass
{

    private int pClass;
    private int msgHandling;

    /**
     * Creates a new instance of UnitDataMandatotyFixedPart
     */
    public ProtocolClassImpl()
    {
    }

    public ProtocolClassImpl(int pClass, boolean returnMessageOnError)
    {
        this.pClass = pClass;
        if (pClass == 0 || pClass == 1)
            this.msgHandling = (returnMessageOnError ? HANDLING_RET_ERR : 0);
        else
            this.msgHandling = 0;
    }

    public int getProtocolClass()
    {
        return this.pClass;
    }

    public boolean getReturnMessageOnError()
    {
        return (this.msgHandling & HANDLING_RET_ERR) != 0 ? true : false;
    }

    public void clearReturnMessageOnError()
    {
        int mask = HANDLING_RET_ERR ^ (-1);
        this.msgHandling = this.msgHandling & mask;
    }

    public void decode(InputStream in)
            throws
            IOException
    {
        if (in.read() != 1)
        {
            throw new IOException();
        }

        int b = in.read() & 0xff;

        pClass = b & 0x0f;
        msgHandling = (b & 0xf0) >> 4;
    }

    public void encode(OutputStream out)
            throws
            IOException
    {
        byte b = (byte) (pClass | (msgHandling << 4));
        out.write(1);
        out.write(b);
    }

    public void decode(byte[] bb)
            throws
            IOException
    {
        int b = bb[0] & 0xff;

        pClass = b & 0x0f;
        msgHandling = (b & 0xf0) >> 4;
    }

    public byte[] encode()
            throws
            IOException
    {
        return new byte[]{(byte) (pClass | (msgHandling << 4))};
    }

    public int hashCode()
    {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + msgHandling;
        result = prime * result + pClass;
        return result;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;

        if (getClass() != obj.getClass())
            return false;
        ProtocolClassImpl other = (ProtocolClassImpl) obj;
        if (msgHandling != other.msgHandling)
            return false;
        if (pClass != other.pClass)
            return false;
        return true;
    }

    public String toString()
    {
        return "ProtocolClass [msgHandling=" + msgHandling + ", pClass=" + pClass + "]";
    }
}

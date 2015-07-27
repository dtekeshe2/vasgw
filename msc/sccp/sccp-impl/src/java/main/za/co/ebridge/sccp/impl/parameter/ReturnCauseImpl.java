package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.parameter.ReturnCause;
import za.co.ebridge.sccp.api.parameter.ReturnCauseValue;

public class ReturnCauseImpl
        extends AbstractParameter
        implements ReturnCause
{

    private ReturnCauseValue value;

    public ReturnCauseImpl()
    {
        value = ReturnCauseValue.UNQALIFIED;
    }

    public ReturnCauseImpl(ReturnCauseValue value)
    {
        this.value = value;
    }

    public ReturnCauseValue getValue()
    {
        return value;
    }

    public void decode(InputStream in)
            throws
            IOException
    {
        if (in.read() != 1)
        {
            throw new IOException();
        }

        int b = in.read() & 0xFf;

        this.value = ReturnCauseValue.getInstance(b);
    }

    public void encode(OutputStream out)
            throws
            IOException
    {
        byte b = (byte) (this.value.getCode());
        out.write(1);
        out.write(b);
    }

    public void decode(byte[] bb)
            throws
            IOException
    {
        int b = bb[0] & 0xff;

        this.value = ReturnCauseValue.getInstance(b);
    }

    public byte[] encode()
            throws
            IOException
    {
        return new byte[]{(byte) this.value.getCode()};
    }

    public String toString()
    {
        if (this.value != null)
            return this.value.toString();
        else
            return "???";

        // switch (this.value) {
        // case NO_TRANSLATION_FOR_NATURE:
        // return "NO_TRANSLATION_FOR_NATURE";
        // case NO_TRANSLATION_FOR_ADDRESS:
        // return "NO_TRANSLATION_FOR_ADDRESS";
        // case SUBSYSTEM_CONGESTION:
        // return "SUBSYSTEM_CONGESTION";
        // case SUBSYSTEM_FAILURE:
        // return "SUBSYSTEM_FAILURE";
        // case UNEQUIPED_USER:
        // return "UNEQUIPED_USER";
        // case MTP_FAILURE:
        // return "MTP_FAILURE";
        // case NETWORK_CONGESTION:
        // return "NETWORK_CONGESTION";
        // case UNQALIFIED:
        // return "UNQALIFIED";
        // case ERR_IN_MSG_TRANSPORT:
        // return "ERR_IN_MSG_TRANSPORT";
        // case ERR_IN_LOCAL_PROCESSING:
        // return "ERR_IN_LOCAL_PROCESSING";
        // case CANNOT_REASEMBLE:
        // return "CANNOT_REASEMBLE";
        // case SCCP_FAILURE:
        // return "SCCP_FAILURE";
        // case HOP_COUNTER_VIOLATION:
        // return "HOP_COUNTER_VIOLATION";
        // case SEG_NOT_SUPPORTED:
        // return "SEG_NOT_SUPPORTED";
        // case SEG_FAILURE:
        // return "SEG_FAILURE";
        // default:
        // return ("Unidentified ReturnCause" + this.value);
        //
        // }
    }
}

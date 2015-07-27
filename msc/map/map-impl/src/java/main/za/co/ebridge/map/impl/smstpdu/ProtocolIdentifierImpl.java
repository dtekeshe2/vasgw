package za.co.ebridge.map.impl.smstpdu;

import za.co.ebridge.map.api.smstpdu.ProtocolIdentifier;

public class ProtocolIdentifierImpl
        implements ProtocolIdentifier
{

    private int code;

    public ProtocolIdentifierImpl(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return this.code;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("TP-Protocol-Identifier [");

        sb.append("Code=");
        sb.append(this.code);
        sb.append("]");

        return sb.toString();
    }
}

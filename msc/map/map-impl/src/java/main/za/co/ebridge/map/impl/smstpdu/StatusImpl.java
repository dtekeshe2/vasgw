package za.co.ebridge.map.impl.smstpdu;

import za.co.ebridge.map.api.smstpdu.Status;

public class StatusImpl
        implements Status
{

    private int code;

    public StatusImpl(int code)
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

        sb.append("TP-Status [");
        sb.append(this.code);
        sb.append("]");

        return sb.toString();
    }
}

package za.co.ebridge.map.impl.smstpdu;

import za.co.ebridge.map.api.smstpdu.FailureCause;

public class FailureCauseImpl
        implements FailureCause
{

    private int code;

    public FailureCauseImpl(int code)
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

        sb.append("TP-Failure-Cause [");
        sb.append(this.code);
        sb.append("]");

        return sb.toString();
    }
}

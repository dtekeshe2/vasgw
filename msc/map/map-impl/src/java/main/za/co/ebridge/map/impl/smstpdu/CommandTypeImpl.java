package za.co.ebridge.map.impl.smstpdu;

import za.co.ebridge.map.api.smstpdu.CommandType;
import za.co.ebridge.map.api.smstpdu.CommandTypeValue;

public class CommandTypeImpl
        implements CommandType
{

    private int code;

    public CommandTypeImpl(int code)
    {
        this.code = code;
    }

    public CommandTypeImpl(CommandTypeValue value)
    {
        this.code = value.getCode();
    }

    public int getCode()
    {
        return this.code;
    }

    public CommandTypeValue getCommandTypeValue()
    {
        return CommandTypeValue.getInstance(this.code);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("TP-Command-Type [");
        sb.append(this.code);
        sb.append("]");

        return sb.toString();
    }
}

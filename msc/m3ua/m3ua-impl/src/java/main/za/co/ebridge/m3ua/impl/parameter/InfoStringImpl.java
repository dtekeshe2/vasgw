package za.co.ebridge.m3ua.impl.parameter;

import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.Parameter;

public class InfoStringImpl
        extends ParameterImpl
        implements InfoString
{

    private String string;

    protected InfoStringImpl(byte[] value)
    {
        this.tag = Parameter.INFO_String;
        this.string = new String(value);
    }

    protected InfoStringImpl(String string)
    {
        this.tag = Parameter.INFO_String;
        this.string = string;
    }

    public String getString()
    {
        return this.string;
    }

    @Override
    protected byte[] getValue()
    {
        return this.string.getBytes();
    }

    @Override
    public String toString()
    {
        return String.format("InfoString : string = %s ", this.string);
    }
}

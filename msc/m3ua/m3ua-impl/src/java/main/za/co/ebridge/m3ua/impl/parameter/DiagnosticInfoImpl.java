package za.co.ebridge.m3ua.impl.parameter;

import za.co.ebridge.m3ua.api.parameter.DiagnosticInfo;
import za.co.ebridge.m3ua.api.parameter.Parameter;

public class DiagnosticInfoImpl
        extends ParameterImpl
        implements DiagnosticInfo
{

    private String info;

    public DiagnosticInfoImpl(String info)
    {
        this.info = info;
        this.tag = Parameter.Diagnostic_Information;
    }

    public DiagnosticInfoImpl(byte[] value)
    {
        this.tag = Parameter.Diagnostic_Information;
        this.info = new String(value);
    }

    @Override
    protected byte[] getValue()
    {
        return this.info.getBytes();
    }

    public String getInfo()
    {
        return this.info;
    }
}

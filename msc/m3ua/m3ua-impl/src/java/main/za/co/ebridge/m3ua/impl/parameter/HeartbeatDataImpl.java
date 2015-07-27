package za.co.ebridge.m3ua.impl.parameter;

import za.co.ebridge.commons.HexTools;
import za.co.ebridge.m3ua.api.parameter.HeartbeatData;
import za.co.ebridge.m3ua.api.parameter.Parameter;

public class HeartbeatDataImpl
        extends ParameterImpl
        implements HeartbeatData
{
    private byte[] value = null;

    protected HeartbeatDataImpl(byte[] value)
    {
        this.tag = Parameter.Heartbeat_Data;
        this.value = value;
    }

    public byte[] getData()
    {
        return this.value;
    }

    @Override
    protected byte[] getValue()
    {
        return this.value;
    }

    @Override
    public String toString()
    {
        return String.format("HeartbeatData : data = %s ", HexTools.dump(this.value, 0));
    }
}

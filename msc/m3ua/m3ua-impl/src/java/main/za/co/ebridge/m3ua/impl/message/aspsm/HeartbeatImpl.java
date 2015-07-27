package za.co.ebridge.m3ua.impl.message.aspsm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.aspsm.Heartbeat;
import za.co.ebridge.m3ua.api.parameter.HeartbeatData;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class HeartbeatImpl
        extends M3UAMessageImpl
        implements Heartbeat
{

    public HeartbeatImpl()
    {
        super(MessageClass.ASP_STATE_MAINTENANCE, MessageType.HEARTBEAT, MessageType.S_HEARTBEAT);
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        if (parameters.containsKey(Parameter.Heartbeat_Data))
        {
            ((ParameterImpl) parameters.get(Parameter.Heartbeat_Data)).write(buffer);
        }
    }

    public HeartbeatData getHeartbeatData()
    {
        return (HeartbeatData) parameters.get(Parameter.Heartbeat_Data);
    }

    public void setHeartbeatData(HeartbeatData hrBtData)
    {
        if (hrBtData != null)
        {
            parameters.put(Parameter.Heartbeat_Data, hrBtData);
        }
    }
}

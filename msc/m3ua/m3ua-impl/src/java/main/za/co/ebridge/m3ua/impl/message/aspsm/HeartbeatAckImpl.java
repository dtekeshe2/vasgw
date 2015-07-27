package za.co.ebridge.m3ua.impl.message.aspsm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.aspsm.HeartbeatAck;
import za.co.ebridge.m3ua.api.parameter.HeartbeatData;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class HeartbeatAckImpl
        extends M3UAMessageImpl
        implements HeartbeatAck
{
    public HeartbeatAckImpl()
    {
        super(MessageClass.ASP_STATE_MAINTENANCE, MessageType.HEARTBEAT_ACK, MessageType.S_HEARTBEAT_ACK);
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

package za.co.ebridge.m3ua.impl.message.transfer;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.transfer.PayloadData;
import za.co.ebridge.m3ua.api.parameter.CorrelationId;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.ProtocolData;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.CorrelationIdImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;
import za.co.ebridge.m3ua.impl.parameter.ProtocolDataImpl;

public class PayloadDataImpl
        extends M3UAMessageImpl
        implements PayloadData
{

    public PayloadDataImpl()
    {
        super(MessageClass.TRANSFER_MESSAGES, MessageType.PAYLOAD, MessageType.S_PAYLOAD);
    }

    public NetworkAppearance getNetworkAppearance()
    {
        return (NetworkAppearance) parameters.get(Parameter.Network_Appearance);
    }

    public void setNetworkAppearance(NetworkAppearance p)
    {
        if (p != null)
        {
            parameters.put(Parameter.Network_Appearance, p);
        }
    }

    public RoutingContext getRoutingContext()
    {
        return (RoutingContext) parameters.get(Parameter.Routing_Context);
    }

    public void setRoutingContext(RoutingContext p)
    {
        if (p != null)
        {
            parameters.put(Parameter.Routing_Context, p);
        }
    }

    public ProtocolData getData()
    {
        return (ProtocolDataImpl) parameters.get(Parameter.Protocol_Data);
    }

    public void setData(ProtocolData p)
    {
        parameters.put(Parameter.Protocol_Data, p);
    }

    public CorrelationId getCorrelationId()
    {
        return (CorrelationIdImpl) parameters.get(Parameter.Correlation_ID);
    }

    public void setCorrelationId(CorrelationId corrId)
    {
        if (corrId != null)
        {
            parameters.put(Parameter.Correlation_ID, corrId);
        }
    }

    @Override
    public String toString()
    {
        return "TransferMessage: " + parameters;
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        if (parameters.containsKey(Parameter.Network_Appearance))
        {
            ((ParameterImpl) parameters.get(Parameter.Network_Appearance)).write(buffer);
        }
        if (parameters.containsKey(Parameter.Routing_Context))
        {
            ((ParameterImpl) parameters.get(Parameter.Routing_Context)).write(buffer);
        }
        if (parameters.containsKey(Parameter.Protocol_Data))
        {
            ((ParameterImpl) parameters.get(Parameter.Protocol_Data)).write(buffer);
        }
        if (parameters.containsKey(Parameter.Correlation_ID))
        {
            ((ParameterImpl) parameters.get(Parameter.Correlation_ID)).write(buffer);
        }
    }
}

package za.co.ebridge.m3ua.impl.message.mgmt;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.mgmt.Notify;
import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.Status;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class NotifyImpl
        extends M3UAMessageImpl
        implements Notify
{

    public NotifyImpl() {
        super(  MessageClass.MANAGEMENT,
                MessageType.NOTIFY,
                MessageType.S_NOTIFY );
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        ((ParameterImpl) parameters.get(Parameter.Status)).write(buffer);

        if (parameters.containsKey(Parameter.ASP_Identifier))
        {
            ((ParameterImpl) parameters.get(Parameter.ASP_Identifier)).write(buffer);
        }

        if (parameters.containsKey(Parameter.Routing_Context))
        {
            ((ParameterImpl) parameters.get(Parameter.Routing_Context)).write(buffer);
        }

        if (parameters.containsKey(Parameter.INFO_String))
        {
            ((ParameterImpl) parameters.get(Parameter.INFO_String)).write(buffer);
        }
    }

    public ASPIdentifier getASPIdentifier()
    {
        return ((ASPIdentifier) parameters.get(Parameter.ASP_Identifier));
    }

    public InfoString getInfoString()
    {
        return ((InfoString) parameters.get(Parameter.INFO_String));
    }

    public RoutingContext getRoutingContext()
    {
        return ((RoutingContext) parameters.get(Parameter.Routing_Context));
    }

    public Status getStatus()
    {
        return ((Status) parameters.get(Parameter.Status));
    }

    public void setASPIdentifier(ASPIdentifier id)
    {
        if (id != null) {
            parameters.put(Parameter.ASP_Identifier, id);
        }
    }

    public void setInfoString(InfoString str)
    {
        if (str != null)
        {
            parameters.put(Parameter.INFO_String, str);
        }
    }

    public void setRoutingContext(RoutingContext rc)
    {
        if (rc != null)
        {
            parameters.put(Parameter.Routing_Context, rc);
        }
    }

    public void setStatus(Status status)
    {
        parameters.put(Parameter.Status, status);
    }
}

package za.co.ebridge.m3ua.impl.message.aspsm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.aspsm.ASPDown;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class ASPDownImpl
        extends M3UAMessageImpl
        implements ASPDown
{

    public ASPDownImpl()
    {
        super(MessageClass.ASP_STATE_MAINTENANCE, MessageType.ASP_DOWN, MessageType.S_ASP_DOWN);
    }

    public InfoString getInfoString()
    {
        return (InfoString) parameters.get(Parameter.INFO_String);
    }

    public void setInfoString(InfoString str)
    {
        if (str != null) {
            parameters.put(Parameter.INFO_String, str);
        }
    }

    @Override
    protected void encodeParams(ByteBuffer buffer)
    {
        if (parameters.containsKey(Parameter.INFO_String))
        {
            ((ParameterImpl) parameters.get(Parameter.INFO_String)).write(buffer);
        }
    }
}

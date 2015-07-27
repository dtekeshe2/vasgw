package za.co.ebridge.m3ua.impl.message.ssnm;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.api.message.ssnm.SignallingCongestion;
import za.co.ebridge.m3ua.api.parameter.AffectedPointCode;
import za.co.ebridge.m3ua.api.parameter.ConcernedDPC;
import za.co.ebridge.m3ua.api.parameter.CongestedIndication;
import za.co.ebridge.m3ua.api.parameter.InfoString;
import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.impl.message.M3UAMessageImpl;
import za.co.ebridge.m3ua.impl.parameter.ParameterImpl;

public class SignallingCongestionImpl
        extends M3UAMessageImpl
        implements SignallingCongestion
{

    public SignallingCongestionImpl()
    {
        super(  MessageClass.SIGNALING_NETWORK_MANAGEMENT,
                MessageType.SIGNALING_CONGESTION,
                MessageType.S_SIGNALING_CONGESTION) ;
    }

    public AffectedPointCode getAffectedPointCodes()
    {
        return (AffectedPointCode) parameters.get(Parameter.Affected_Point_Code);
    }

    public InfoString getInfoString()
    {
        return (InfoString) parameters.get(Parameter.INFO_String);
    }

    public NetworkAppearance getNetworkAppearance()
    {
        return (NetworkAppearance) parameters.get(Parameter.Network_Appearance);
    }

    public RoutingContext getRoutingContexts()
    {
        return (RoutingContext) parameters.get(Parameter.Routing_Context);
    }

    public void setAffectedPointCodes(AffectedPointCode afpc)
    {
        parameters.put(Parameter.Affected_Point_Code, afpc);
    }

    public void setInfoString(InfoString str)
    {
        if (str != null)
        {
            parameters.put(Parameter.INFO_String, str);
        }
    }

    public void setNetworkAppearance(NetworkAppearance p)
    {
        if (p != null)
        {
            parameters.put(Parameter.Network_Appearance, p);
        }
    }

    public void setRoutingContexts(RoutingContext routingCntx)
    {
        if (routingCntx != null)
        {
            parameters.put(Parameter.Routing_Context, routingCntx);
        }
    }

    public ConcernedDPC getConcernedDPC()
    {
        return (ConcernedDPC) parameters.get(Parameter.Concerned_Destination);
    }

    public CongestedIndication getCongestedIndication()
    {
        return (CongestedIndication) parameters.get(Parameter.Congestion_Indications);
    }

    public void setConcernedDPC(ConcernedDPC dpc)
    {
        if (dpc != null) {
            parameters.put(Parameter.Concerned_Destination, dpc);
        }
    }

    public void setCongestedIndication(CongestedIndication congInd)
    {
        if (congInd != null)
        {
            parameters.put(Parameter.Congestion_Indications, congInd);
        }
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
        if (parameters.containsKey(Parameter.Affected_Point_Code))
        {
            ((ParameterImpl) parameters.get(Parameter.Affected_Point_Code)).write(buffer);
        }

        if (parameters.containsKey(Parameter.Concerned_Destination))
        {
            ((ParameterImpl) parameters.get(Parameter.Concerned_Destination)).write(buffer);
        }

        if (parameters.containsKey(Parameter.Congestion_Indications))
        {
            ((ParameterImpl) parameters.get(Parameter.Congestion_Indications)).write(buffer);
        }

        if (parameters.containsKey(Parameter.INFO_String))
        {
            ((ParameterImpl) parameters.get(Parameter.INFO_String)).write(buffer);
        }
    }
}

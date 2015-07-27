package za.co.ebridge.sccp.impl.parameter;

import za.co.ebridge.sccp.api.indicator.RoutingIndicator;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;
import za.co.ebridge.sccp.api.parameter.HopCounter;
import za.co.ebridge.sccp.api.parameter.Importance;
import za.co.ebridge.sccp.api.parameter.ParameterFactory;
import za.co.ebridge.sccp.api.parameter.ProtocolClass;
import za.co.ebridge.sccp.api.parameter.ReturnCause;
import za.co.ebridge.sccp.api.parameter.ReturnCauseValue;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.sccp.api.parameter.Segmentation;

public class ParameterFactoryImpl
        implements ParameterFactory
{

    public SccpAddress createSccpAddress(RoutingIndicator ri, int dpc, GlobalTitle gt, int ssn)
    {
        return new SccpAddress(ri, dpc, gt, ssn);
    }

    public Importance createImportance(int value)
    {
        return new ImportanceImpl((byte) value);
    }

    public HopCounter createHopCounter(int hopCount)
    {
        return new HopCounterImpl(hopCount);
    }

    public ProtocolClass createProtocolClass(int pClass, boolean returnMessageOnError)
    {
        return new ProtocolClassImpl(pClass, returnMessageOnError);
    }

    public Segmentation createSegmentation()
    {
        return new SegmentationImpl();
    }

    public ReturnCause createReturnCause(ReturnCauseValue cause)
    {
        return new ReturnCauseImpl(cause);
    }

}

package za.co.ebridge.tcap.api.asn.tc.component;

import za.co.ebridge.tcap.api.asn.TCAPProviderImpl;
import za.co.ebridge.tcap.api.api.ComponentPrimitiveFactory;
import za.co.ebridge.tcap.api.api.tc.component.InvokeClass;
import za.co.ebridge.tcap.api.asn.InvokeImpl;
import za.co.ebridge.tcap.api.asn.TcapFactory;
import za.co.ebridge.tcap.api.asn.comp.ErrorCode;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.Problem;
import za.co.ebridge.tcap.api.asn.comp.ProblemType;
import za.co.ebridge.tcap.api.asn.comp.Reject;
import za.co.ebridge.tcap.api.asn.comp.ReturnError;
import za.co.ebridge.tcap.api.asn.comp.ReturnResult;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;
import org.apache.log4j.Logger;

public class ComponentPrimitiveFactoryImpl
        implements ComponentPrimitiveFactory
{

    private TCAPProviderImpl provider;

    private static final Logger logger = Logger.getLogger(ComponentPrimitiveFactoryImpl.class);

    public ComponentPrimitiveFactoryImpl(TCAPProviderImpl tcaProviderImpl)
    {
        logger.debug("ComponentPrimitiveFactoryImpl ( " + tcaProviderImpl + " )");
        this.provider = tcaProviderImpl;
    }

    public Invoke createTCInvokeRequest()
    {
        InvokeImpl t = (InvokeImpl) TcapFactory.createComponentInvoke();
        logger.debug("createTCInvokeRequest( provider : " + provider + " )");
        t.setProvider(provider);
        return t;
    }

    public Invoke createTCInvokeRequest(InvokeClass invokeClass)
    {

        InvokeImpl t = (InvokeImpl) TcapFactory.createComponentInvoke(invokeClass);
        logger.debug("createTCInvokeRequest( ### provider : " + provider + " )");
        t.setProvider(provider);
        return t;
    }

    public Reject createTCRejectRequest()
    {

        return TcapFactory.createComponentReject();
    }

    public ReturnError createTCReturnErrorRequest()
    {

        return TcapFactory.createComponentReturnError();
    }

    public ReturnResultLast createTCResultLastRequest()
    {

        return TcapFactory.createComponentReturnResultLast();

    }

    public ReturnResult createTCResultRequest()
    {

        return TcapFactory.createComponentReturnResult();
    }

    public OperationCode createOperationCode()
    {
        return TcapFactory.createOperationCode();
    }

    public ErrorCode createErrorCode()
    {
        return TcapFactory.createErrorCode();
    }

    public Parameter createParameter()
    {
        return TcapFactory.createParameter();
    }

    public Parameter createParameter(int tag, int tagClass, boolean isPrimitive)
    {
        Parameter p = TcapFactory.createParameter();
        p.setTag(tag);
        p.setTagClass(tagClass);
        p.setPrimitive(isPrimitive);
        return p;
    }

    public Problem createProblem(ProblemType pt)
    {
        return TcapFactory.createProblem(pt);
    }
}

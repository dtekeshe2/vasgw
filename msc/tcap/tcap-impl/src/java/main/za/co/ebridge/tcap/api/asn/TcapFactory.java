package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import org.apache.log4j.Logger;
import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.api.tc.component.InvokeClass;
import za.co.ebridge.tcap.api.asn.comp.Component;
import za.co.ebridge.tcap.api.asn.comp.ErrorCode;
import za.co.ebridge.tcap.api.asn.comp.ErrorCodeType;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.OperationCodeType;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.Problem;
import za.co.ebridge.tcap.api.asn.comp.ProblemType;
import za.co.ebridge.tcap.api.asn.comp.Reject;
import za.co.ebridge.tcap.api.asn.comp.ReturnError;
import za.co.ebridge.tcap.api.asn.comp.ReturnResult;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;
import za.co.ebridge.tcap.api.asn.comp.TCAbortMessage;
import za.co.ebridge.tcap.api.asn.comp.TCBeginMessage;
import za.co.ebridge.tcap.api.asn.comp.TCContinueMessage;
import za.co.ebridge.tcap.api.asn.comp.TCEndMessage;
import za.co.ebridge.tcap.api.asn.comp.TCUniMessage;

public final class TcapFactory
{

    private static Logger logger = Logger.getLogger("MAPStackImpl.class");

    public static DialogPortion createDialogPortion(AsnInputStream ais)
            throws
            ParseException
    {
        DialogPortionImpl dpi = new DialogPortionImpl();
        dpi.decode(ais);
        return dpi;
    }

    public static DialogPortion createDialogPortion()
    {
        return new DialogPortionImpl();
    }

    public static DialogAPDU createDialogAPDU(AsnInputStream ais, int tag, boolean unidirectional)
            throws
            ParseException
    {

        if (ais.getTagClass() != Tag.CLASS_APPLICATION)
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "Error decoding dialog APDU: wrong tag class for APDU, found: " + ais.getTagClass());

        if (unidirectional)
        {
            // only one
            if (tag != DialogAPDU._TAG_UNIDIRECTIONAL)
            {
                throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                        "Error decoding dialog APDU: wrong tag for APDU, found: " + tag);
            } else
            {
                // create UNIPDU

                DialogUniAPDUImpl d = new DialogUniAPDUImpl();
                d.decode(ais);
                return d;
            }

        } else
        {

            if (tag == DialogAPDU._TAG_REQUEST)
            {
                DialogRequestAPDUImpl d = new DialogRequestAPDUImpl();
                d.decode(ais);
                return d;
            }
            if (tag == DialogAPDU._TAG_RESPONSE)
            {
                DialogResponseAPDUImpl d = new DialogResponseAPDUImpl();
                d.decode(ais);
                return d;

            }
            if (tag == DialogAPDU._TAG_ABORT)
            {
                DialogAbortAPDUImpl da = new DialogAbortAPDUImpl();
                da.decode(ais);
                return da;
            }

            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null, "Wrong tag for APDU, found: " +
                    tag);
        }
    }

    public static DialogRequestAPDU createDialogAPDURequest()
    {
        return new DialogRequestAPDUImpl();
    }

    public static DialogResponseAPDU createDialogAPDUResponse()
    {
        return new DialogResponseAPDUImpl();
    }

    public static DialogUniAPDU createDialogAPDUUni()
    {
        return new DialogUniAPDUImpl();
    }

    public static DialogAbortAPDU createDialogAPDUAbort()
    {
        return new DialogAbortAPDUImpl();
    }

    public static ProtocolVersion createProtocolVersion()
    {
        return new ProtocolVersionImpl();
    }

    public static ProtocolVersion createProtocolVersion(AsnInputStream ais)
            throws
            ParseException
    {
        ProtocolVersionImpl pv = new ProtocolVersionImpl();
        pv.decode(ais);
        return pv;
    }

    public static ApplicationContextName createApplicationContextName(long[] oid)
    {
        ApplicationContextNameImpl acn = new ApplicationContextNameImpl();
        acn.setOid(oid);
        return acn;
    }

    public static ApplicationContextName createApplicationContextName(AsnInputStream ais)
            throws
            ParseException
    {
        ApplicationContextNameImpl acn = new ApplicationContextNameImpl();
        acn.decode(ais);
        return acn;
    }

    public static UserInformation createUserInformation()
    {
        return new UserInformationImpl();
    }

    public static UserInformation createUserInformation(AsnInputStream localAis)
            throws
            ParseException
    {
        UserInformationImpl ui = new UserInformationImpl();
        ui.decode(localAis);
        return ui;
    }

    public static Result createResult()
    {
        return new ResultImpl();
    }

    public static Result createResult(AsnInputStream localAis)
            throws
            ParseException
    {
        ResultImpl ui = new ResultImpl();
        ui.decode(localAis);
        return ui;
    }

    public static ResultSourceDiagnostic createResultSourceDiagnostic()
    {
        return new ResultSourceDiagnosticImpl();
    }

    public static ResultSourceDiagnostic createResultSourceDiagnostic(AsnInputStream localAis)
            throws
            ParseException
    {
        ResultSourceDiagnosticImpl ui = new ResultSourceDiagnosticImpl();
        ui.decode(localAis);
        return ui;
    }

    public static AbortSource createAbortSource()
    {
        AbortSourceImpl as = new AbortSourceImpl();
        return as;
    }

    public static AbortSource createAbortSource(AsnInputStream localAis)
            throws
            ParseException
    {
        AbortSourceImpl as = new AbortSourceImpl();
        as.decode(localAis);
        return as;
    }

    public static TCUniMessage createTCUniMessage(AsnInputStream localAis)
            throws
            ParseException
    {
        TCUniMessageImpl tc = new TCUniMessageImpl();
        tc.decode(localAis);
        return tc;
    }

    public static TCUniMessage createTCUniMessage()
    {
        TCUniMessageImpl tc = new TCUniMessageImpl();
        return tc;
    }

    public static TCContinueMessage createTCContinueMessage(AsnInputStream localAis)
            throws
            ParseException
    {
        TCContinueMessageImpl tc = new TCContinueMessageImpl();
        tc.decode(localAis);
        return tc;
    }

    public static TCContinueMessage createTCContinueMessage()
    {
        TCContinueMessageImpl tc = new TCContinueMessageImpl();
        return tc;
    }

    public static TCEndMessage createTCEndMessage(AsnInputStream localAis)
            throws
            ParseException
    {
        TCEndMessageImpl tc = new TCEndMessageImpl();
        tc.decode(localAis);
        return tc;
    }

    public static TCEndMessage createTCEndMessage()
    {
        TCEndMessageImpl tc = new TCEndMessageImpl();
        return tc;
    }

    public static TCAbortMessage createTCAbortMessage(AsnInputStream localAis)
            throws
            ParseException
    {
        TCAbortMessageImpl tc = new TCAbortMessageImpl();
        tc.decode(localAis);
        return tc;
    }

    public static TCAbortMessage createTCAbortMessage()
    {
        TCAbortMessageImpl tc = new TCAbortMessageImpl();
        return tc;
    }

    public static TCBeginMessage createTCBeginMessage(AsnInputStream localAis)
            throws
            ParseException
    {
        TCBeginMessageImpl tc = new TCBeginMessageImpl();
        tc.decode(localAis);
        return tc;
    }

    public static TCBeginMessage createTCBeginMessage()
    {
        TCBeginMessageImpl tc = new TCBeginMessageImpl();
        return tc;
    }

    public static OperationCode createOperationCode()
    {
        OperationCodeImpl oc = new OperationCodeImpl();
        return oc;
    }

    public static OperationCode createOperationCode(int tag, AsnInputStream localAis)
            throws
            ParseException
    {
        OperationCodeImpl oc = new OperationCodeImpl();
        oc.setOperationType(OperationCode._TAG_GLOBAL == tag ? OperationCodeType.Global : OperationCodeType.Local);
        oc.decode(localAis);
        return oc;
    }

    public static Parameter createParameter()
    {
        ParameterImpl p = new ParameterImpl();
        return p;
    }

    public static Parameter createParameter(int tag, AsnInputStream localAis, boolean singleParameterInAsn)
            throws
            ParseException
    {
        ParameterImpl p = new ParameterImpl();
        p.setTag(tag);
        // p.setPrimitive(localAis.isTagPrimitive());
        // p.setTagClass(localAis.getTagClass());
        if (singleParameterInAsn)
            p.setSingleParameterInAsn();
        p.decode(localAis);
        return p;
    }

    public static Component createComponent(AsnInputStream localAis)
            throws
            ParseException
    {

        logger.debug("createComponent(AsnInputStream localAis)");

        try
        {
            try
            {
                int tag = localAis.readTag();

                logger.debug("tag : " + tag);

                Component c = null;
                if (localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                {
                    throw new ParseException(null, GeneralProblemType.UnrecognizedComponent,
                            "Error decoding a component: bad tag class: " + localAis.getTagClass());
                }

                switch (tag)
                {
                    case Invoke._TAG:
                        logger.debug("case Invoke._TAG:");
                        c = createComponentInvoke();
                        c.decode(localAis);
                        break;
                    case ReturnResult._TAG:
                        c = createComponentReturnResult();
                        c.decode(localAis);
                        break;
                    case ReturnResultLast._TAG:
                        c = createComponentReturnResultLast();
                        c.decode(localAis);
                        break;
                    case ReturnError._TAG:
                        c = createComponentReturnError();
                        c.decode(localAis);
                        break;
                    case Reject._TAG:
                        c = createComponentReject();
                        c.decode(localAis);
                        break;
                    default:
                        localAis.advanceElement();
                        throw new ParseException(null, GeneralProblemType.UnrecognizedComponent,
                                "Error decoding a component: bad tag: " + tag);
                }

                return c;
            }
            catch (IOException e)
            {
                throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                        "IOException while decoding a component: " + e.getMessage(), e);
            }
            catch (AsnException e)
            {
                throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                        "AsnException while decoding a component: " + e.getMessage(), e);
            }
        }
        catch (ParseException e)
        {
            if (e.getProblem() != null)
            {
                Reject rej = TcapFactory.createComponentReject();
                rej.setLocalOriginated(true);
                rej.setInvokeId(e.getInvokeId());
                Problem problem = new ProblemImpl();
                problem.setGeneralProblemType(e.getProblem());
                rej.setProblem(problem);

                return rej;
            } else
            {
                throw e;
            }
        }
    }

    public static Reject createComponentReject()
    {

        return new RejectImpl();
    }

    public static ReturnResultLast createComponentReturnResultLast()
    {

        return new ReturnResultLastImpl();
    }

    public static ReturnResult createComponentReturnResult()
    {

        return new ReturnResultImpl();
    }

    public static Invoke createComponentInvoke()
    {
        return new InvokeImpl();
    }

    public static Invoke createComponentInvoke(InvokeClass invokeClass)
    {
        return new InvokeImpl(invokeClass);
    }

    public static ReturnError createComponentReturnError()
    {
        return new ReturnErrorImpl();
    }

    public static Problem createProblem(ProblemType pt, AsnInputStream ais)
            throws
            ParseException
    {
        Problem p = createProblem(pt);
        p.decode(ais);
        return p;
    }

    public static Problem createProblem(ProblemType pt)
    {
        Problem p = new ProblemImpl();
        p.setType(pt);
        return p;
    }

    public static ErrorCode createErrorCode(int tag, AsnInputStream ais)
            throws
            ParseException
    {
        ErrorCode p = createErrorCode();
        ((ErrorCodeImpl) p).setErrorCodeType(ErrorCode._TAG_GLOBAL == tag ? ErrorCodeType.Global : ErrorCodeType.Local);
        p.decode(ais);
        return p;
    }

    public static ErrorCode createErrorCode()
    {
        ErrorCode p = new ErrorCodeImpl();
        return p;
    }
}

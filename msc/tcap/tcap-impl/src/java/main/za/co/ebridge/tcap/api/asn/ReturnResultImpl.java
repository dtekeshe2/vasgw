package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.ReturnResult;

public class ReturnResultImpl
        implements ReturnResult
{

    // mandatory
    private Long invokeId;

    // This is sequence, both must be present
    // optional: this is sequence
    private OperationCode operationCode;
    // optional
    private Parameter parameter;

    public Long getInvokeId()
    {

        return this.invokeId;
    }

    public OperationCode getOperationCode()
    {

        return this.operationCode;
    }

    public Parameter getParameter()
    {
        return this.parameter;
    }

    public void setInvokeId(Long i)
    {
        if ((i == null) || (i < -128 || i > 127))
        {
            throw new IllegalArgumentException("Invoke ID our of range: <-128,127>: " + i);
        }
        this.invokeId = i;

    }

    public void setOperationCode(OperationCode oc)
    {
        this.operationCode = oc;

    }

    public void setParameter(Parameter p)
    {
        this.parameter = p;
    }

    public ComponentType getType()
    {

        return ComponentType.ReturnResult;
    }

    public String toString()
    {
        return "ReturnResult[invokeId=" + invokeId + ", operationCode=" + operationCode + ", parameter=" + parameter
                + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (tag != _TAG_IID || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding ReturnLast: bad tag or tag class for InvokeID: tag=" + tag + ", " +
                                "tagClass = "
                                + localAis.getTagClass());
            }

            this.invokeId = localAis.readInteger();

            if (localAis.available() <= 0)
                return;

            tag = localAis.readTag();
            if (tag != Tag.SEQUENCE || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding ReturnLast: bad tag or tag class for sequence: tag=" + tag + ", " +
                                "tagClass = "
                                + localAis.getTagClass());
            }

            // sequence of OperationCode
            AsnInputStream sequenceStream = localAis.readSequenceStream();

            tag = sequenceStream.readTag();
            if (tag != OperationCode._TAG_GLOBAL && tag != OperationCode._TAG_LOCAL
                    || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding ReturnLast: bad tag or tag class for operationCode: tag=" + tag + ", " +
                                "tagClass = "
                                + localAis.getTagClass());
            }
            this.operationCode = TcapFactory.createOperationCode(tag, sequenceStream);

            tag = sequenceStream.readTag();
            this.parameter = TcapFactory.createParameter(tag, sequenceStream, true);

        }
        catch (IOException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "IOException while decoding ReturnResult: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "AsnException while decoding ReturnResult: " + e.getMessage(), e);
        }
        catch (ParseException e)
        {
            e.setInvokeId(this.invokeId);
            throw e;
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (invokeId == null)
            throw new EncodeException("No Invoke ID set.");

        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            aos.writeInteger(this.invokeId);

            if (this.operationCode != null && this.parameter != null)
            {
                aos.writeTag(Tag.CLASS_UNIVERSAL, false, Tag.SEQUENCE);
                int pos2 = aos.StartContentDefiniteLength();
                this.operationCode.encode(aos);
                this.parameter.encode(aos);
                aos.FinalizeContent(pos2);
            }

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding ReturnResult: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding ReturnResult: " + e.getMessage(), e);
        }
    }

}

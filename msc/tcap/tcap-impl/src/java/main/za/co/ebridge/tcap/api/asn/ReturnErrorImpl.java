package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.ErrorCode;
import za.co.ebridge.tcap.api.asn.comp.ErrorCodeType;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.ReturnError;

public class ReturnErrorImpl
        implements ReturnError
{

    // mandatory
    private Long invokeId;

    // mandatory
    private ErrorCode errorCode;

    // optional
    private Parameter parameter;

    public ErrorCode getErrorCode()
    {

        return this.errorCode;
    }

    public Long getInvokeId()
    {

        return this.invokeId;
    }

    public Parameter getParameter()
    {
        return this.parameter;
    }

    public void setErrorCode(ErrorCode ec)
    {
        this.errorCode = ec;

    }

    public void setInvokeId(Long i)
    {
        this.invokeId = i;

    }

    public void setParameter(Parameter p)
    {
        this.parameter = p;

    }

    public ComponentType getType()
    {

        return ComponentType.ReturnError;
    }

    public String toString()
    {
        return "ReturnError[invokeId=" + invokeId + ", errorCode=" + errorCode + ", parameters=" + parameter + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            // invokeId
            int tag = localAis.readTag();
            if (tag != _TAG_IID || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding ReturnError: bad tag or tag class for InvokeID: tag=" + tag + ", " +
                                "tagClass = "
                                + localAis.getTagClass());
            }
            this.invokeId = localAis.readInteger();

            if (localAis.available() == 0)
            {
                // next parameter (errorCode) is mandatory but it sometimes absent in live trace
                return;
            }

            tag = localAis.readTag();
            if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding ReturnError: bad tag class for ErrorCode: tagClass = " + localAis
                                .getTagClass());
            }
            this.errorCode = TcapFactory.createErrorCode();
            switch (tag)
            {
                case ErrorCode._TAG_GLOBAL:
                    ((ErrorCodeImpl) this.errorCode).setErrorCodeType(ErrorCodeType.Global);
                    break;
                case ErrorCode._TAG_LOCAL:
                    ((ErrorCodeImpl) this.errorCode).setErrorCodeType(ErrorCodeType.Local);
                    break;
                default:
                    throw new ParseException(null, GeneralProblemType.MistypedComponent,
                            "Error while decoding ReturnError: bad tag for ErrorCode: tag= " + tag);
            }
            this.errorCode.decode(localAis);

            if (localAis.available() == 0)
                return;// rest is optional
            tag = localAis.readTag();
            this.parameter = TcapFactory.createParameter(tag, localAis, true);

        }
        catch (IOException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "IOException while decoding ReturnError: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "AsnException while decoding ReturnError: " + e.getMessage(), e);
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

        if (this.invokeId == null)
            throw new EncodeException("Invoke ID not set!");
        if (this.errorCode == null)
            throw new EncodeException("Error Code not set!");

        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            aos.writeInteger(this.invokeId);
            this.errorCode.encode(aos);

            if (this.parameter != null)
                this.parameter.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding ReturnError: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding ReturnError: " + e.getMessage(), e);
        }

    }

}

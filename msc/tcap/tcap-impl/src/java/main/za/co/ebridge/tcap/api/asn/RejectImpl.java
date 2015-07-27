package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.Problem;
import za.co.ebridge.tcap.api.asn.comp.ProblemType;
import za.co.ebridge.tcap.api.asn.comp.Reject;

public class RejectImpl
        implements Reject
{

    // all are mandatory

    // this can actaully be null in this case.
    private Long invokeId;
    private boolean localOriginated = false;

    private Problem problem;

    public RejectImpl()
    {
    }

    public Long getInvokeId()
    {

        return this.invokeId;
    }

    public Problem getProblem()
    {

        return this.problem;
    }

    public void setInvokeId(Long i)
    {
        if (i != null && (i < -128 || i > 127))
        {
            throw new IllegalArgumentException("Invoke ID our of range: <-128,127>: " + i);
        }
        this.invokeId = i;

    }

    public void setProblem(Problem p)
    {

        this.problem = p;

    }

    public ComponentType getType()
    {

        return ComponentType.Reject;
    }

    @Override
    public boolean isLocalOriginated()
    {
        return localOriginated;
    }

    @Override
    public void setLocalOriginated(boolean p)
    {
        localOriginated = p;
    }

    public String toString()
    {
        return "Reject[invokeId=" + invokeId + (this.isLocalOriginated() ? ", localOriginated" : ", remoteOriginated")
                + ", problem=" + problem + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            this.setLocalOriginated(false);

            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding Reject: bad tag class for InvokeID or NULL: tagClass = " + localAis
                                .getTagClass());
            }
            switch (tag)
            {
                case _TAG_IID:
                    this.invokeId = localAis.readInteger();
                    break;
                case Tag.NULL:
                    localAis.readNull();
                    break;
            }

            tag = localAis.readTag();
            if (localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding Reject: bad tag class for a problem: tagClass = " + localAis
                                .getTagClass());
            }
            ProblemType pt = ProblemType.getFromInt(tag);
            if (pt == null)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding Reject: ProblemType not found");
            }
            this.problem = TcapFactory.createProblem(pt, localAis);

        }
        catch (IOException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent, "IOException while decoding " +
                    "Reject: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent, "AsnException while decoding " +
                    "Reject: "
                    + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (this.problem == null)
        {
            throw new EncodeException("Problem not set!");
        }
        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            if (this.invokeId == null)
                aos.writeNull();
            else
                aos.writeInteger(this.invokeId);
            this.problem.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding Reject: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding Reject: " + e.getMessage(), e);
        }

    }

}

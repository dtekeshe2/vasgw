package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class DialogResponseAPDUImpl
        implements DialogResponseAPDU
{

    // mandatory
    private ApplicationContextName acn;
    private Result result;
    private ResultSourceDiagnostic diagnostic;
    private ProtocolVersion protocolVersion = new ProtocolVersionImpl();
    private boolean doNotSendProtocolVersion = false;

    public DialogResponseAPDUImpl()
    {
    }

    public void setDoNotSendProtocolVersion(boolean val)
    {
        doNotSendProtocolVersion = val;
    }

    // optional
    private UserInformation ui;

    public ApplicationContextName getApplicationContextName()
    {
        return acn;
    }

    public ProtocolVersion getProtocolVersion()
    {

        return protocolVersion;
    }

    public UserInformation getUserInformation()
    {
        return this.ui;
    }

    public void setApplicationContextName(ApplicationContextName acn)
    {
        this.acn = acn;

    }

    public void setUserInformation(UserInformation ui)
    {
        this.ui = ui;

    }

    public Result getResult()
    {

        return this.result;
    }

    public ResultSourceDiagnostic getResultSourceDiagnostic()
    {
        return this.diagnostic;
    }

    public void setResult(Result acn)
    {
        this.result = acn;

    }

    public void setResultSourceDiagnostic(ResultSourceDiagnostic acn)
    {
        this.diagnostic = acn;

    }

    public DialogAPDUType getType()
    {

        return DialogAPDUType.Response;
    }

    public boolean isUniDirectional()
    {

        return false;
    }

    public String toString()
    {
        return "DialogResponseAPDU[acn=" + acn + ", result=" + result + ", diagnostic=" + diagnostic + ", ui=" + ui +
                "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            // optional protocol version
            if (tag == ProtocolVersion._TAG_PROTOCOL_VERSION && localAis.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
            {
                // we have protocol version on a
                // decode it
                this.protocolVersion = TcapFactory.createProtocolVersion(localAis);
                tag = localAis.readTag();
            }

            // mandatory
            if (tag != ApplicationContextName._TAG || localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding DialogResponseAPDU.application-context-name: bad tag or tagClass, found tag="
                                + tag
                                + ", tagClass=" + localAis.getTagClass());
            this.acn = TcapFactory.createApplicationContextName(localAis);

            tag = localAis.readTag();
            if (tag != Result._TAG)
            {
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null, "Expected Result tag, found: " +
                        tag);
            }
            this.result = TcapFactory.createResult(localAis);
            tag = localAis.readTag();
            if (tag != ResultSourceDiagnostic._TAG)
            {
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Expected Result Source Diagnotstic tag, found: " + tag);
            }

            this.diagnostic = TcapFactory.createResultSourceDiagnostic(localAis);

            // optional sequence.
            if (localAis.available() > 0)
            {
                tag = localAis.readTag();
                if (tag != UserInformation._TAG || localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                    throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                            "Error decoding DialogResponseAPDU.user-information: bad tag or tagClass, found tag=" + tag
                                    + ", tagClass=" + localAis.getTagClass());
                this.ui = TcapFactory.createUserInformation(localAis);
            }

        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "IOException while decoding DialogResponseAPDU: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "AsnException while decoding DialogResponseAPDU: " + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (acn == null)
            throw new EncodeException("Error encoding DialogResponseAPDU: Application Context Name must not be null");
        if (result == null)
            throw new EncodeException("Error encoding DialogResponseAPDU: Result must not be null");
        if (diagnostic == null)
            throw new EncodeException("Error encoding DialogResponseAPDU: Result-source-diagnostic must not be null");

        try
        {

            aos.writeTag(Tag.CLASS_APPLICATION, false, _TAG_RESPONSE);
            int pos = aos.StartContentDefiniteLength();

            if (!doNotSendProtocolVersion)
                this.protocolVersion.encode(aos);
            this.acn.encode(aos);
            this.result.encode(aos);
            this.diagnostic.encode(aos);

            if (ui != null)
                ui.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding DialogResponseAPDU: " + e.getMessage(), e);
        }

    }
}
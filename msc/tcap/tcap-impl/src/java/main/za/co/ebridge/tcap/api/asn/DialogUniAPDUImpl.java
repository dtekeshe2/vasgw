package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class DialogUniAPDUImpl
        implements DialogUniAPDU
{

    private ApplicationContextName acn;
    private UserInformation ui;
    private boolean doNotSendProtocolVersion = false;

    public DialogUniAPDUImpl()
    {
    }

    public void setDoNotSendProtocolVersion(boolean val)
    {
        doNotSendProtocolVersion = val;
    }

    public ApplicationContextName getApplicationContextName()
    {
        return acn;
    }

    public int getProtocolVersion()
    {

        return 1;
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

    public DialogAPDUType getType()
    {
        return DialogAPDUType.UniDirectional;
    }

    public boolean isUniDirectional()
    {

        return false;
    }

    public String toString()
    {
        return "DialogUniAPDU[acn=" + acn + ", ui=" + ui + "]";
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
                TcapFactory.createProtocolVersion(localAis);
                tag = localAis.readTag();
            }

            // now there is mandatory part
            if (tag != ApplicationContextName._TAG || localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding DialogUniAPDU.application-context-name: bad tag or tagClass, found tag=" + tag
                                + ", tagClass=" + localAis.getTagClass());
            this.acn = TcapFactory.createApplicationContextName(localAis);

            // optional sequence.
            if (localAis.available() > 0)
            {
                tag = localAis.readTag();
                if (tag != UserInformation._TAG || localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                    throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                            "Error decoding DialogUniAPDU.user-information: bad tag or tagClass, found tag=" + tag
                                    + ", tagClass=" + localAis.getTagClass());
                this.ui = TcapFactory.createUserInformation(localAis);
            }

        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "IOException while decoding DialogUniAPDU: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "AsnException while decoding DialogUniAPDU: " + e.getMessage(), e);
        }
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (acn == null)
            throw new EncodeException("Error encoding DialogUniAPDU: Application Context Name must not be null");

        try
        {

            aos.writeTag(Tag.CLASS_APPLICATION, false, _TAG_UNIDIRECTIONAL);
            int pos = aos.StartContentDefiniteLength();

            // lets not omit protocol version, we check byte[] in tests, it
            // screws them :)
            if (!doNotSendProtocolVersion)
            {
                ProtocolVersion pv = TcapFactory.createProtocolVersion();
                pv.encode(aos);
            }
            this.acn.encode(aos);

            if (ui != null)
                ui.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding DialogUniAPDU: " + e.getMessage(), e);
        }
    }
}

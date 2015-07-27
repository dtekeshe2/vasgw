package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class DialogAbortAPDUImpl
        implements DialogAbortAPDU
{

    private AbortSource abortSource;
    private UserInformation userInformation;

    /**
     * @return the abortSource
     */
    public AbortSource getAbortSource()
    {
        return abortSource;
    }

    /**
     * @param abortSource the abortSource to set
     */
    public void setAbortSource(AbortSource abortSource)
    {
        this.abortSource = abortSource;
    }

    /**
     * @return the userInformation
     */
    public UserInformation getUserInformation()
    {
        return userInformation;
    }

    /**
     * @param userInformation the userInformation to set
     */
    public void setUserInformation(UserInformation userInformation)
    {
        this.userInformation = userInformation;
    }

    public DialogAPDUType getType()
    {
        return DialogAPDUType.Abort;
    }

    public boolean isUniDirectional()
    {

        return false;
    }

    public String toString()
    {
        return "DialogAbortAPDU[abortSource=" + abortSource + ", userInformation=" + userInformation + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (tag != AbortSource._TAG || localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding DialogAbortAPDU.abort-source: bad tag or tagClass, found tag=" + tag + ", " +
                                "tagClass="
                                + localAis.getTagClass());
            this.abortSource = TcapFactory.createAbortSource(localAis);

            // optional sequence.
            if (localAis.available() == 0)
                return;

            tag = localAis.readTag();
            if (tag != UserInformation._TAG || localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error decoding DialogAbortAPDU.user-information: bad tag or tagClass, found tag=" + tag
                                + ", tagClass=" + localAis.getTagClass());
            this.userInformation = TcapFactory.createUserInformation(localAis);

        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "IOException while decoding DialogAbortAPDU: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "AsnException while decoding DialogAbortAPDU: " + e.getMessage(), e);
        }

    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (abortSource == null)
            throw new EncodeException("Error encoding DialogAbortAPDU: Abort Source Name must not be null");

        try
        {

            aos.writeTag(Tag.CLASS_APPLICATION, false, _TAG_ABORT);
            int pos = aos.StartContentDefiniteLength();

            this.abortSource.encode(aos);

            if (this.userInformation != null)
                this.userInformation.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding DialogAbortAPDU: " + e.getMessage(), e);
        }
    }

}

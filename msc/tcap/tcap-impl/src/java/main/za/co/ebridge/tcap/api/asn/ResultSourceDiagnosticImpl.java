package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

public class ResultSourceDiagnosticImpl
        implements ResultSourceDiagnostic
{

    private DialogServiceProviderType providerType;
    private DialogServiceUserType userType;

    public DialogServiceProviderType getDialogServiceProviderType()
    {

        return providerType;
    }

    public DialogServiceUserType getDialogServiceUserType()
    {

        return userType;
    }

    public void setDialogServiceProviderType(DialogServiceProviderType t)
    {
        this.providerType = t;
        this.userType = null;

    }

    public void setDialogServiceUserType(DialogServiceUserType t)
    {
        this.userType = t;
        this.providerType = null;

    }

    public String toString()
    {
        return "ResultSourceDiagnostic[providerType=" + providerType + ", userType=" + userType + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            // int make read whole thing?
            int tag = localAis.readTag();
            if (localAis.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC)
                throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                        "Error while decoding AARE-apdu.result-dource-diagnostic sequence part: bad tag class: " +
                                "tagClass="
                                + localAis.getTagClass());

            switch (tag)
            {
                case _TAG_U:
                    AsnInputStream localAis2 = localAis.readSequenceStream();
                    tag = localAis2.readTag();
                    if (tag != Tag.INTEGER || localAis2.getTagClass() != Tag.CLASS_UNIVERSAL)
                        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                                "Error while decoding AARE-apdu.result-dource-diagnostic integer part: bad tag or tag" +
                                        " class class: tagClass="
                                        + localAis.getTagClass() + ", tag=" + tag);
                    long t = localAis2.readInteger();
                    this.userType = DialogServiceUserType.getFromInt(t);
                    break;

                case _TAG_P:
                    localAis2 = localAis.readSequenceStream();
                    tag = localAis2.readTag();
                    if (tag != Tag.INTEGER || localAis2.getTagClass() != Tag.CLASS_UNIVERSAL)
                        throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                                "Error while decoding AARE-apdu.result-dource-diagnostic integer part: bad tag or tag" +
                                        " class class: tagClass="
                                        + localAis.getTagClass() + ", tag=" + tag);
                    t = localAis2.readInteger();
                    this.providerType = DialogServiceProviderType.getFromInt(t);
                    break;

                default:
                    throw new ParseException(PAbortCauseType.IncorrectTxPortion, null,
                            "Error while decoding AARE-apdu.result-dource-diagnostic sequence part: bad tag: tag=" +
                                    tag);
            }
        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "IOException while decoding ResultSourceDiagnostic: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "AsnException while decoding ResultSourceDiagnostic: " + e.getMessage(), e);
        }

        // tag can have on of two values =
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {
        if (this.userType == null && this.providerType == null)
            throw new EncodeException("Error encoding ResultSourceDiagnostic: Value not set");

        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            if (this.userType != null)
            {
                aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG_U);
                int pos2 = aos.StartContentDefiniteLength();
                aos.writeInteger(this.userType.getType());
                aos.FinalizeContent(pos2);
            } else
            {
                aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG_P);
                int pos2 = aos.StartContentDefiniteLength();
                aos.writeInteger(this.providerType.getType());
                aos.FinalizeContent(pos2);
            }

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding ResultSourceDiagnostic: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding ResultSourceDiagnostic: " + e.getMessage(), e);
        }

    }

}

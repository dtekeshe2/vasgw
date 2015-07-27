package za.co.ebridge.tcap.api.asn;

import java.io.IOException;

import za.co.ebridge.asn.impl.*;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

/**
 * <p>
 * According to ITU-T Rec Q.773 the UserInformation is defined as
 * </p>
 * <br/>
 * <p>
 * user-information [30] IMPLICIT SEQUENCE OF EXTERNAL
 * </p>
 * <br/>
 * <p>
 * For definition of EXTERNAL look {@link External} from Mobicents ASN module
 * </p>
 */
public class UserInformationImpl
        implements UserInformation
{

    private External ext = new External();

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            int tag = localAis.readTag();
            if (tag != Tag.EXTERNAL || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
                throw new AsnException("Error decoding UserInformation.sequence: wrong tag or tag class: tag=" + tag
                        + ", tagClass=" + localAis.getTagClass());

            ext.decode(localAis);
        }
        catch (IOException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "IOException when decoding UserInformation: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(PAbortCauseType.BadlyFormattedTxPortion, null,
                    "AsnException when decoding UserInformation: " + e.getMessage(), e);
        }
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            ext.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException when encoding UserInformation: " + e.getMessage(), e);
        }
    }

    @Override
    public byte[] getEncodeType()
            throws
            AsnException
    {
        return ext.getEncodeType();
    }

    @Override
    public void setEncodeType(byte[] data)
    {
        ext.setEncodeType(data);
    }

    @Override
    public BitSetStrictLength getEncodeBitStringType()
            throws
            AsnException
    {
        return ext.getEncodeBitStringType();
    }

    @Override
    public void setEncodeBitStringType(BitSetStrictLength data)
    {
        ext.setEncodeBitStringType(data);
    }

    @Override
    public boolean isOid()
    {
        return ext.isOid();
    }

    @Override
    public void setOid(boolean oid)
    {
        ext.setOid(oid);
    }

    @Override
    public boolean isInteger()
    {
        return ext.isInteger();
    }

    @Override
    public void setInteger(boolean integer)
    {
        ext.setInteger(integer);
    }

    @Override
    public boolean isObjDescriptor()
    {
        return ext.isObjDescriptor();
    }

    @Override
    public void setObjDescriptor(boolean objDescriptor)
    {
        ext.setObjDescriptor(objDescriptor);
    }

    @Override
    public long[] getOidValue()
    {
        return ext.getOidValue();
    }

    @Override
    public void setOidValue(long[] oidValue)
    {
        ext.setOidValue(oidValue);
    }

    @Override
    public long getIndirectReference()
    {
        return ext.getIndirectReference();
    }

    @Override
    public void setIndirectReference(long indirectReference)
    {
        ext.setIndirectReference(indirectReference);
    }

    @Override
    public String getObjDescriptorValue()
    {
        return ext.getObjDescriptorValue();
    }

    @Override
    public void setObjDescriptorValue(String objDescriptorValue)
    {
        ext.setObjDescriptorValue(objDescriptorValue);
    }

    @Override
    public boolean isAsn()
    {
        return ext.isAsn();
    }

    @Override
    public void setAsn(boolean asn)
    {
        ext.setAsn(asn);
    }

    @Override
    public boolean isOctet()
    {
        return ext.isOctet();
    }

    @Override
    public void setOctet(boolean octet)
    {
        ext.setOctet(octet);
    }

    @Override
    public boolean isArbitrary()
    {
        return ext.isArbitrary();
    }

    @Override
    public void setArbitrary(boolean arbitrary)
    {
        ext.setArbitrary(arbitrary);
    }
}

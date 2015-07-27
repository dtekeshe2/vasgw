/* eBridge SS7 */

package za.co.ebridge.map.impl.service.supplementary;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.supplementary.CliRestrictionOption;
import za.co.ebridge.map.api.service.supplementary.OverrideCategory;
import za.co.ebridge.map.api.service.supplementary.SSSubscriptionOption;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 * @author daniel bichara
 *
 */
public class SSSubscriptionOptionImpl implements SSSubscriptionOption, MAPAsnPrimitive {

    public static final String _PrimitiveName = "SSSubscriptionOption";

    public static final int _TAG_cliRestrictionOption = 2;
    public static final int _TAG_overrideCategory = 1;

    private CliRestrictionOption cliRestrictionOption = null;
    private OverrideCategory overrideCategory = null;

    public SSSubscriptionOptionImpl() {

    }

    public SSSubscriptionOptionImpl(CliRestrictionOption cliRestrictionOption) {

        this.cliRestrictionOption = cliRestrictionOption;
    }

    public SSSubscriptionOptionImpl(OverrideCategory overrideCategory) {

        this.overrideCategory = overrideCategory;
    }

    public CliRestrictionOption getCliRestrictionOption() {
        return this.cliRestrictionOption;
    }

    public OverrideCategory getOverrideCategory() {
        return this.overrideCategory;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#getTag()
     */
    public int getTag() throws MAPException {
        if (cliRestrictionOption != null) {
            return _TAG_cliRestrictionOption;
        } else if (overrideCategory != null) {
            return _TAG_overrideCategory;
        } else {
            throw new MAPException("No of choices are supplied");
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#getTagClass()
     */
    public int getTagClass() {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#getIsPrimitive ()
     */
    public boolean getIsPrimitive() {
        return true;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#decodeAll( com.ebridge.protocols.asn.AsnInputStream)
     */
    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
        try {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#decodeData (com.ebridge.protocols.asn.AsnInputStream,
     * int)
     */
    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ais, int length) throws MAPParsingComponentException, IOException, AsnException {
        this.cliRestrictionOption = null;
        this.overrideCategory = null;

        if (ais.getTagClass() != Tag.CLASS_CONTEXT_SPECIFIC || !ais.isTagPrimitive())
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": bad tag class or is not primitive: TagClass=" + ais.getTagClass(),
                    MAPParsingComponentExceptionReason.MistypedParameter);

        switch (ais.getTag()) {
            case _TAG_cliRestrictionOption:
                this.cliRestrictionOption = CliRestrictionOption.getInstance((int) ais.readIntegerData(length));
                break;
            case _TAG_overrideCategory:
                this.overrideCategory = OverrideCategory.getInstance((int) ais.readIntegerData(length));
                break;

            default:
                throw new MAPParsingComponentException("Error while " + _PrimitiveName + ": bad tag: " + ais.getTag(),
                        MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeAll( com.ebridge.protocols.asn.AsnOutputStream)
     */
    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeAll( com.ebridge.protocols.asn.AsnOutputStream,
     * int, int)
     */
    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
        try {
            asnOs.writeTag(tagClass, true, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeData (com.ebridge.protocols.asn.AsnOutputStream)
     */
    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.cliRestrictionOption == null && this.overrideCategory == null)
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + ": missing cliRestrictionOption and overrideCategory.");

        if (this.cliRestrictionOption != null && this.overrideCategory != null)
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + ": both cliRestrictionOption and overrideCategory are defined.");

        try {

            if (this.cliRestrictionOption != null) {
                asnOs.writeIntegerData(this.cliRestrictionOption.getCode());
            } else {
                asnOs.writeIntegerData(this.overrideCategory.getCode());
            }
        } catch (IOException e) {
            throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.cliRestrictionOption != null) {
            sb.append("cliRestrictionOption=");
            sb.append(this.cliRestrictionOption.toString());
            sb.append(", ");
        }

        if (this.overrideCategory != null) {
            sb.append("overrideCategory=");
            sb.append(this.overrideCategory.toString());
        }

        sb.append("]");

        return sb.toString();
    }

}

/* eBridge SS7 */

package za.co.ebridge.map.impl.errors;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.errors.AdditionalRoamingNotAllowedCause;
import za.co.ebridge.map.api.errors.MAPErrorCode;
import za.co.ebridge.map.api.errors.MAPErrorMessageRoamingNotAllowed;
import za.co.ebridge.map.api.errors.RoamingNotAllowedCause;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class MAPErrorMessageRoamingNotAllowedImpl extends MAPErrorMessageImpl implements MAPErrorMessageRoamingNotAllowed {

    public static final int _tag_additionalRoamingNotAllowedCause = 0;

    private RoamingNotAllowedCause roamingNotAllowedCause;
    private MAPExtensionContainer extensionContainer;
    private AdditionalRoamingNotAllowedCause additionalRoamingNotAllowedCause;

    protected String _PrimitiveName = "MAPErrorMessageRoamingNotAllowed";

    public MAPErrorMessageRoamingNotAllowedImpl(RoamingNotAllowedCause roamingNotAllowedCause,
            MAPExtensionContainer extensionContainer, AdditionalRoamingNotAllowedCause additionalRoamingNotAllowedCause) {
        super((long) MAPErrorCode.roamingNotAllowed);

        this.roamingNotAllowedCause = roamingNotAllowedCause;
        this.extensionContainer = extensionContainer;
        this.additionalRoamingNotAllowedCause = additionalRoamingNotAllowedCause;
    }

    public MAPErrorMessageRoamingNotAllowedImpl() {
        super((long) MAPErrorCode.roamingNotAllowed);
    }

    public boolean isEmRoamingNotAllowed() {
        return true;
    }

    public MAPErrorMessageRoamingNotAllowed getEmRoamingNotAllowed() {
        return this;
    }

    @Override
    public RoamingNotAllowedCause getRoamingNotAllowedCause() {
        return roamingNotAllowedCause;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer() {
        return extensionContainer;
    }

    @Override
    public AdditionalRoamingNotAllowedCause getAdditionalRoamingNotAllowedCause() {
        return additionalRoamingNotAllowedCause;
    }

    @Override
    public void setRoamingNotAllowedCause(RoamingNotAllowedCause val) {
        roamingNotAllowedCause = val;
    }

    @Override
    public void setExtensionContainer(MAPExtensionContainer val) {
        extensionContainer = val;
    }

    @Override
    public void setAdditionalRoamingNotAllowedCause(AdditionalRoamingNotAllowedCause val) {
        additionalRoamingNotAllowedCause = val;
    }

    public int getTag() throws MAPException {
        return Tag.SEQUENCE;
    }

    public int getTagClass() {
        return Tag.CLASS_UNIVERSAL;
    }

    public boolean getIsPrimitive() {
        return false;
    }

    @Override
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

    @Override
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

    private void _decode(AsnInputStream localAis, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.roamingNotAllowedCause = null;
        this.extensionContainer = null;
        this.additionalRoamingNotAllowedCause = null;

        if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL || localAis.getTag() != Tag.SEQUENCE || localAis.isTagPrimitive())
            throw new MAPParsingComponentException("Error decoding " + _PrimitiveName
                    + ": bad tag class or tag or parameter is primitive", MAPParsingComponentExceptionReason.MistypedParameter);

        AsnInputStream ais = localAis.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (ais.getTagClass()) {
                case Tag.CLASS_UNIVERSAL:
                    switch (tag) {
                        case Tag.ENUMERATED:
                            int i1 = (int) ais.readInteger();
                            this.roamingNotAllowedCause = RoamingNotAllowedCause.getInstance(i1);
                            break;
                        case Tag.SEQUENCE:
                            this.extensionContainer = new MAPExtensionContainerImpl();
                            ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                            break;

                        default:
                            ais.advanceElement();
                            break;
                    }
                    break;

                case Tag.CLASS_CONTEXT_SPECIFIC:
                    switch (tag) {
                        case _tag_additionalRoamingNotAllowedCause:
                            int i1 = (int) ais.readInteger();
                            this.additionalRoamingNotAllowedCause = AdditionalRoamingNotAllowedCause.getInstance(i1);
                            break;

                        default:
                            ais.advanceElement();
                            break;
                    }
                    break;

                default:
                    ais.advanceElement();
                    break;
            }
        }

        if (this.roamingNotAllowedCause == null) {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parameter roamingNotAllowedCause is mandatory but has not found.",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    @Override
    public void encodeAll(AsnOutputStream asnOs) throws MAPException {

        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

    @Override
    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {

        try {
            asnOs.writeTag(tagClass, this.getIsPrimitive(), tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.roamingNotAllowedCause == null) {
            throw new MAPException("Parameter roamingNotAllowedCause must not be null");
        }

        try {
            asnOs.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, this.roamingNotAllowedCause.getCode());
            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs);
            if (this.additionalRoamingNotAllowedCause != null)
                asnOs.writeInteger(Tag.CLASS_CONTEXT_SPECIFIC, _tag_additionalRoamingNotAllowedCause,
                        this.additionalRoamingNotAllowedCause.getCode());

        } catch (IOException e) {
            throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.roamingNotAllowedCause != null) {
            sb.append("roamingNotAllowedCause = ");
            sb.append(roamingNotAllowedCause);
        }
        if (this.extensionContainer != null)
            sb.append(", extensionContainer=" + this.extensionContainer.toString());
        if (this.additionalRoamingNotAllowedCause != null) {
            sb.append(", additionalRoamingNotAllowedCause = ");
            sb.append(additionalRoamingNotAllowedCause);
        }
        sb.append("]");

        return sb.toString();
    }

}

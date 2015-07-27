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
import za.co.ebridge.map.api.errors.MAPErrorCode;
import za.co.ebridge.map.api.errors.MAPErrorMessageFacilityNotSup;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class MAPErrorMessageFacilityNotSupImpl extends MAPErrorMessageImpl implements MAPErrorMessageFacilityNotSup {

    public static final int shapeOfLocationEstimateNotSupported_TAG = 0;
    public static final int neededLcsCapabilityNotSupportedInServingNode_TAG = 1;

    private MAPExtensionContainer extensionContainer;
    private Boolean shapeOfLocationEstimateNotSupported;
    private Boolean neededLcsCapabilityNotSupportedInServingNode;

    public MAPErrorMessageFacilityNotSupImpl(MAPExtensionContainer extensionContainer,
            Boolean shapeOfLocationEstimateNotSupported, Boolean neededLcsCapabilityNotSupportedInServingNode) {
        super((long) MAPErrorCode.facilityNotSupported);

        this.extensionContainer = extensionContainer;
        this.shapeOfLocationEstimateNotSupported = shapeOfLocationEstimateNotSupported;
        this.neededLcsCapabilityNotSupportedInServingNode = neededLcsCapabilityNotSupportedInServingNode;
    }

    protected MAPErrorMessageFacilityNotSupImpl() {
        super((long) MAPErrorCode.facilityNotSupported);
    }

    public boolean isEmFacilityNotSup() {
        return true;
    }

    public MAPErrorMessageFacilityNotSup getEmFacilityNotSup() {
        return this;
    }

    public MAPExtensionContainer getExtensionContainer() {
        return this.extensionContainer;
    }

    public Boolean getShapeOfLocationEstimateNotSupported() {
        return this.shapeOfLocationEstimateNotSupported;
    }

    public Boolean getNeededLcsCapabilityNotSupportedInServingNode() {
        return this.neededLcsCapabilityNotSupportedInServingNode;
    }

    public void setExtensionContainer(MAPExtensionContainer extensionContainer) {
        this.extensionContainer = extensionContainer;
    }

    public void setShapeOfLocationEstimateNotSupported(Boolean shapeOfLocationEstimateNotSupported) {
        this.shapeOfLocationEstimateNotSupported = shapeOfLocationEstimateNotSupported;
    }

    public void getNeededLcsCapabilityNotSupportedInServingNode(Boolean neededLcsCapabilityNotSupportedInServingNode) {
        this.neededLcsCapabilityNotSupportedInServingNode = neededLcsCapabilityNotSupportedInServingNode;
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

    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {

        try {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException(
                    "IOException when decoding MAPErrorMessageFacilityNotSup: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPErrorMessageFacilityNotSup: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException(
                    "IOException when decoding MAPErrorMessageFacilityNotSup: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPErrorMessageFacilityNotSup: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream localAis, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.extensionContainer = null;
        this.shapeOfLocationEstimateNotSupported = null;
        this.neededLcsCapabilityNotSupportedInServingNode = null;

        if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL || localAis.getTag() != Tag.SEQUENCE || localAis.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error decoding MAPErrorMessageFacilityNotSup: bad tag class or tag or parameter is primitive or no parameter data",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        AsnInputStream ais = localAis.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (ais.getTagClass()) {
                case Tag.CLASS_UNIVERSAL:
                    switch (tag) {
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
                        case shapeOfLocationEstimateNotSupported_TAG:
                            ais.readNull();
                            this.shapeOfLocationEstimateNotSupported = true;
                            break;

                        case neededLcsCapabilityNotSupportedInServingNode_TAG:
                            ais.readNull();
                            this.neededLcsCapabilityNotSupportedInServingNode = true;
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

        if (this.shapeOfLocationEstimateNotSupported == null)
            this.shapeOfLocationEstimateNotSupported = false;
        if (this.neededLcsCapabilityNotSupportedInServingNode == null)
            this.neededLcsCapabilityNotSupportedInServingNode = false;
    }

    public void encodeAll(AsnOutputStream asnOs) throws MAPException {

        this.encodeAll(asnOs, Tag.CLASS_UNIVERSAL, Tag.SEQUENCE);
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {

        try {
            asnOs.writeTag(tagClass, false, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAPErrorMessageFacilityNotSup: " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream aos) throws MAPException {

        if (this.extensionContainer == null
                && (this.shapeOfLocationEstimateNotSupported == null || this.shapeOfLocationEstimateNotSupported == false)
                && (this.neededLcsCapabilityNotSupportedInServingNode == null || this.neededLcsCapabilityNotSupportedInServingNode == false))
            return;

        try {
            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(aos);

            if (this.shapeOfLocationEstimateNotSupported != null && this.shapeOfLocationEstimateNotSupported == true)
                aos.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, shapeOfLocationEstimateNotSupported_TAG);
            if (this.neededLcsCapabilityNotSupportedInServingNode != null
                    && this.neededLcsCapabilityNotSupportedInServingNode == true)
                aos.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, neededLcsCapabilityNotSupportedInServingNode_TAG);

        } catch (IOException e) {
            throw new MAPException("IOException when encoding MAPErrorMessageFacilityNotSup: " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAPErrorMessageFacilityNotSup: " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MAPErrorMessageFacilityNotSup [");
        if (this.extensionContainer != null)
            sb.append("extensionContainer=" + this.extensionContainer.toString());
        if (this.shapeOfLocationEstimateNotSupported != null && this.shapeOfLocationEstimateNotSupported == true)
            sb.append(", shapeOfLocationEstimateNotSupported=true");
        if (this.neededLcsCapabilityNotSupportedInServingNode != null
                && this.neededLcsCapabilityNotSupportedInServingNode == true)
            sb.append(", neededLcsCapabilityNotSupportedInServingNode=true");
        sb.append("]");

        return sb.toString();
    }
}

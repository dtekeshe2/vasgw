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
import za.co.ebridge.map.api.errors.MAPErrorMessageSMDeliveryFailure;
import za.co.ebridge.map.api.errors.SMEnumeratedDeliveryFailureCause;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class MAPErrorMessageSMDeliveryFailureImpl extends MAPErrorMessageImpl implements MAPErrorMessageSMDeliveryFailure {

    private SMEnumeratedDeliveryFailureCause sMEnumeratedDeliveryFailureCause;
    private byte[] signalInfo;
    private MAPExtensionContainer extensionContainer;

    public MAPErrorMessageSMDeliveryFailureImpl(SMEnumeratedDeliveryFailureCause smEnumeratedDeliveryFailureCause,
            byte[] signalInfo, MAPExtensionContainer extensionContainer) {
        super((long) MAPErrorCode.smDeliveryFailure);

        this.sMEnumeratedDeliveryFailureCause = smEnumeratedDeliveryFailureCause;
        this.signalInfo = signalInfo;
        this.extensionContainer = extensionContainer;
    }

    protected MAPErrorMessageSMDeliveryFailureImpl() {
        super((long) MAPErrorCode.smDeliveryFailure);
    }

    public SMEnumeratedDeliveryFailureCause getSMEnumeratedDeliveryFailureCause() {
        return this.sMEnumeratedDeliveryFailureCause;
    }

    public byte[] getSignalInfo() {
        return this.signalInfo;
    }

    public MAPExtensionContainer getExtensionContainer() {
        return this.extensionContainer;
    }

    public void setSMEnumeratedDeliveryFailureCause(SMEnumeratedDeliveryFailureCause sMEnumeratedDeliveryFailureCause) {
        this.sMEnumeratedDeliveryFailureCause = sMEnumeratedDeliveryFailureCause;
    }

    public void setSignalInfo(byte[] signalInfo) {
        this.signalInfo = signalInfo;
    }

    public void setExtensionContainer(MAPExtensionContainer extensionContainer) {
        this.extensionContainer = extensionContainer;
    }

    public boolean isEmSMDeliveryFailure() {
        return true;
    }

    public MAPErrorMessageSMDeliveryFailure getEmSMDeliveryFailure() {
        return this;
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
            throw new MAPParsingComponentException("IOException when decoding MAPErrorMessageSMDeliveryFailure: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPErrorMessageSMDeliveryFailure: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding MAPErrorMessageSMDeliveryFailure: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPErrorMessageSMDeliveryFailure: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream localAis, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.sMEnumeratedDeliveryFailureCause = null;
        this.signalInfo = null;
        this.extensionContainer = null;

        if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL || localAis.getTag() != Tag.SEQUENCE || localAis.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error decoding MAPErrorMessageSMDeliveryFailure: bad tag class or tag or parameter is primitive or no parameter data",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        AsnInputStream ais = localAis.readSequenceStreamData(length);

        int tag = ais.readTag();
        if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || tag != Tag.ENUMERATED)
            throw new MAPParsingComponentException(
                    "Error decoding MAPErrorMessageSMDeliveryFailure.sMEnumeratedDeliveryFailureCause: bad tag class or tag",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        int code = (int) ais.readInteger();
        this.sMEnumeratedDeliveryFailureCause = SMEnumeratedDeliveryFailureCause.getInstance(code);
        if (this.sMEnumeratedDeliveryFailureCause == null)
            throw new MAPParsingComponentException(
                    "Error decoding MAPErrorMessageSMDeliveryFailure.sMEnumeratedDeliveryFailureCause: bad value",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        while (true) {
            if (ais.available() == 0)
                break;

            tag = ais.readTag();

            switch (ais.getTagClass()) {
                case Tag.CLASS_UNIVERSAL:
                    switch (tag) {
                        case Tag.STRING_OCTET:
                            this.signalInfo = ais.readOctetString();
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

                default:
                    ais.advanceElement();
                    break;
            }
        }
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
            throw new MAPException("AsnException when encoding MAPErrorMessageSMDeliveryFailure: " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream aos) throws MAPException {

        if (this.sMEnumeratedDeliveryFailureCause == null)
            throw new MAPException(
                    "Error encoding MAPErrorMessageSMDeliveryFailure: parameter sMEnumeratedDeliveryFailureCause must not be null");

        try {
            aos.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, this.sMEnumeratedDeliveryFailureCause.getCode());

            if (this.signalInfo != null)
                aos.writeOctetString(Tag.CLASS_UNIVERSAL, Tag.STRING_OCTET, this.signalInfo);
            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(aos);

        } catch (IOException e) {
            throw new MAPException("IOException when encoding MAPErrorMessageSMDeliveryFailure: " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAPErrorMessageSMDeliveryFailure: " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MAPErrorMessageSMDeliveryFailure [");
        if (this.sMEnumeratedDeliveryFailureCause != null)
            sb.append("sMEnumeratedDeliveryFailureCause=" + this.sMEnumeratedDeliveryFailureCause.toString());
        if (this.signalInfo != null)
            sb.append(", signalInfo=" + this.printDataArr(this.signalInfo));
        if (this.extensionContainer != null)
            sb.append(", extensionContainer=" + this.extensionContainer.toString());
        sb.append("]");

        return sb.toString();
    }

    private String printDataArr(byte[] data) {
        StringBuilder sb = new StringBuilder();
        if (data != null) {
            for (int b : data) {
                sb.append(b);
                sb.append(", ");
            }
        }

        return sb.toString();
    }
}

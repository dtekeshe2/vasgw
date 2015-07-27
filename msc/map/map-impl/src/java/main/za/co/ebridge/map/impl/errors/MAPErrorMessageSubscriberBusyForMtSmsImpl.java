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
import za.co.ebridge.map.api.errors.MAPErrorMessageSubscriberBusyForMtSms;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class MAPErrorMessageSubscriberBusyForMtSmsImpl extends MAPErrorMessageImpl implements
        MAPErrorMessageSubscriberBusyForMtSms {

    private MAPExtensionContainer extensionContainer;
    private Boolean gprsConnectionSuspended;

    public MAPErrorMessageSubscriberBusyForMtSmsImpl(MAPExtensionContainer extensionContainer, Boolean gprsConnectionSuspended) {
        super((long) MAPErrorCode.subscriberBusyForMTSMS);

        this.extensionContainer = extensionContainer;
        this.gprsConnectionSuspended = gprsConnectionSuspended;
    }

    protected MAPErrorMessageSubscriberBusyForMtSmsImpl() {
        super((long) MAPErrorCode.subscriberBusyForMTSMS);
    }

    public boolean isEmSubscriberBusyForMtSms() {
        return true;
    }

    public MAPErrorMessageSubscriberBusyForMtSms getEmSubscriberBusyForMtSms() {
        return this;
    }

    public MAPExtensionContainer getExtensionContainer() {
        return this.extensionContainer;
    }

    public Boolean getGprsConnectionSuspended() {
        return this.gprsConnectionSuspended;
    }

    public void setExtensionContainer(MAPExtensionContainer extensionContainer) {
        this.extensionContainer = extensionContainer;
    }

    public void setGprsConnectionSuspended(Boolean gprsConnectionSuspended) {
        this.gprsConnectionSuspended = gprsConnectionSuspended;
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
            throw new MAPParsingComponentException("IOException when decoding MAPErrorMessageSubscriberBusyForMtSms: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPErrorMessageSubscriberBusyForMtSms: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding MAPErrorMessageSubscriberBusyForMtSms: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPErrorMessageSubscriberBusyForMtSms: "
                    + e.getMessage(), e, MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream localAis, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.extensionContainer = null;
        this.gprsConnectionSuspended = null;

        if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL || localAis.getTag() != Tag.SEQUENCE || localAis.isTagPrimitive())
            throw new MAPParsingComponentException(
                    "Error decoding MAPErrorMessageSubscriberBusyForMtSms: bad tag class or tag or parameter is primitive",
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

                        case Tag.NULL:
                            ais.readNull();
                            this.gprsConnectionSuspended = true;
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

        if (this.gprsConnectionSuspended == null)
            this.gprsConnectionSuspended = false;
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
            throw new MAPException("AsnException when encoding MAPErrorMessageSubscriberBusyForMtSms: " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream aos) throws MAPException {

        if (this.gprsConnectionSuspended == null && this.extensionContainer == null)
            return;

        try {
            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(aos);
            if (this.gprsConnectionSuspended != null && this.gprsConnectionSuspended == true)
                aos.writeNull();

        } catch (IOException e) {
            throw new MAPException("IOException when encoding MAPErrorMessageSubscriberBusyForMtSms: " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAPErrorMessageSubscriberBusyForMtSms: " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("MAPErrorMessageSubscriberBusyForMtSms [");
        if (this.extensionContainer != null)
            sb.append("extensionContainer=" + this.extensionContainer.toString());
        if (this.gprsConnectionSuspended != null && this.gprsConnectionSuspended == true)
            sb.append(", gprsConnectionSuspended=true");
        sb.append("]");

        return sb.toString();
    }
}

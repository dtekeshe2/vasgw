/* eBridge SS7 */

package za.co.ebridge.map.impl.service.sms;

import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPMessageType;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.sms.ForwardShortMessageResponse;

public class ForwardShortMessageResponseImpl extends SmsMessageImpl implements ForwardShortMessageResponse {

    public MAPMessageType getMessageType() {
        return MAPMessageType.forwardSM_Response;
    }

    public int getOperationCode() {
        return MAPOperationCode.mo_forwardSM;
    }

    public int getTag() throws MAPException {

        throw new MAPException("ForwardShortMessageResponseIndication has no MAP message primitive");
    }

    public int getTagClass() {

        return Tag.CLASS_UNIVERSAL;
    }

    public boolean getIsPrimitive() {

        return false;
    }

    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
        throw new MAPParsingComponentException("ForwardShortMessageResponseIndication has no MAP message primitive",
                MAPParsingComponentExceptionReason.MistypedParameter);
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
        throw new MAPParsingComponentException("ForwardShortMessageResponseIndication has no MAP message primitive",
                MAPParsingComponentExceptionReason.MistypedParameter);
    }

    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
        throw new MAPException("ForwardShortMessageResponseIndication has no MAP message primitive");
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
        throw new MAPException("ForwardShortMessageResponseIndication has no MAP message primitive");
    }

    public void encodeData(AsnOutputStream asnOs) throws MAPException {
        throw new MAPException("ForwardShortMessageResponseIndication has no MAP message primitive");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ForwardShortMessageResponse [");
        if (this.getMAPDialog() != null) {
            sb.append("DialogId=").append(this.getMAPDialog().getLocalDialogId());
        }
        sb.append("]");

        return sb.toString();
    }
}

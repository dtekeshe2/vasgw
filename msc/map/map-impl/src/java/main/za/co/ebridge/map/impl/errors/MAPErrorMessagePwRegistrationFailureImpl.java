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
import za.co.ebridge.map.api.errors.MAPErrorMessagePwRegistrationFailure;
import za.co.ebridge.map.api.errors.PWRegistrationFailureCause;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class MAPErrorMessagePwRegistrationFailureImpl extends MAPErrorMessageImpl implements
        MAPErrorMessagePwRegistrationFailure {

    private PWRegistrationFailureCause pwRegistrationFailureCause;

    protected String _PrimitiveName = "MAPErrorMessagePwRegistrationFailure";

    public MAPErrorMessagePwRegistrationFailureImpl(PWRegistrationFailureCause pwRegistrationFailureCause) {
        super((long) MAPErrorCode.pwRegistrationFailure);

        this.pwRegistrationFailureCause = pwRegistrationFailureCause;
    }

    public MAPErrorMessagePwRegistrationFailureImpl() {
        super((long) MAPErrorCode.pwRegistrationFailure);
    }

    public boolean isEmPwRegistrationFailure() {
        return true;
    }

    public MAPErrorMessagePwRegistrationFailure getEmPwRegistrationFailure() {
        return this;
    }

    @Override
    public PWRegistrationFailureCause getPWRegistrationFailureCause() {
        return pwRegistrationFailureCause;
    }

    @Override
    public void setPWRegistrationFailureCause(PWRegistrationFailureCause val) {
        pwRegistrationFailureCause = val;
    }

    @Override
    public int getTag() throws MAPException {
        return Tag.ENUMERATED;
    }

    @Override
    public int getTagClass() {
        return Tag.CLASS_UNIVERSAL;
    }

    @Override
    public boolean getIsPrimitive() {
        return true;
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

        if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL || localAis.getTag() != Tag.ENUMERATED || !localAis.isTagPrimitive())
            throw new MAPParsingComponentException("Error decoding " + _PrimitiveName
                    + ": bad tag class or tag or parameter is primitive", MAPParsingComponentExceptionReason.MistypedParameter);

        int i1 = (int) localAis.readIntegerData(length);
        this.pwRegistrationFailureCause = PWRegistrationFailureCause.getInstance(i1);
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

        if (this.pwRegistrationFailureCause == null)
            throw new MAPException("Parameter pwRegistrationFailureCause must not be null");

        try {
            asnOs.writeIntegerData(this.pwRegistrationFailureCause.getCode());
        } catch (IOException e) {
            throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.pwRegistrationFailureCause != null)
            sb.append("pwRegistrationFailureCause=" + this.pwRegistrationFailureCause.toString());
        sb.append("]");

        return sb.toString();
    }

}

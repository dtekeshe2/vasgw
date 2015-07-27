/* eBridge SS7 */

package za.co.ebridge.map.impl.errors;

import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.errors.MAPErrorMessageParameterless;

/**
 * The MAP ReturnError message without any parameters
 *
 * @author david@tekeshe.com
 *
 */
public class MAPErrorMessageParameterlessImpl extends MAPErrorMessageImpl implements MAPErrorMessageParameterless {

    public MAPErrorMessageParameterlessImpl(Long errorCode) {
        super(errorCode);
    }

    public boolean isEmParameterless() {
        return true;
    }

    public MAPErrorMessageParameterless getEmParameterless() {
        return this;
    }

    public int getTag() throws MAPException {
        throw new MAPException("MAPErrorMessageParameterless does not support encoding");
    }

    public int getTagClass() {
        return 0;
    }

    public boolean getIsPrimitive() {
        return false;
    }

    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
    }

    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
    }

    public void encodeData(AsnOutputStream asnOs) throws MAPException {
    }

    @Override
    public String toString() {
        return "MAPErrorMessageParameterless [errorCode=" + this.errorCode + "]";
    }
}

/* eBridge SS7 */

package za.co.ebridge.isup.impl.message.parameter;

import java.io.IOException;
import java.util.Arrays;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.ErrorCode;
import za.co.ebridge.isup.api.message.parameter.ErrorCodeType;


/**
 * @author baranowb
 * @author sergey netyutnev
 *
 */
public class ErrorCodeImpl extends AbstractAsnEncodable implements ErrorCode {
    private ErrorCodeType type;
    private Long localErrorCode;
    private long[] globalErrorCode;

    public void setErrorCodeType(ErrorCodeType type) {
        this.type = type;
    }

    public void setLocalErrorCode(Long localErrorCode) {
        this.localErrorCode = localErrorCode;
        this.globalErrorCode = null;
        this.type = ErrorCodeType.Local;
    }

    public void setGlobalErrorCode(long[] globalErrorCode) {
        this.localErrorCode = null;
        this.globalErrorCode = globalErrorCode;
        this.type = ErrorCodeType.Global;
    }

    public Long getLocalErrorCode() {
        return this.localErrorCode;
    }

    public long[] getGlobalErrorCode() {
        return this.globalErrorCode;
    }

    public ErrorCodeType getErrorType() {
        return type;
    }

    public String toString() {
        if (this.localErrorCode != null)
            return "ErrorCode[errorType=Local, data=" + this.localErrorCode.toString() + "]";
        else if (this.globalErrorCode != null)
            return "ErrorCode[errorType=Global, data=" + Arrays.toString(this.globalErrorCode) + "]";
        else
            return "ErrorCode[empty]";
    }

    public void decode(AsnInputStream ais) throws ParameterException {

        try {
            if (this.type == ErrorCodeType.Global) {
                this.globalErrorCode = ais.readObjectIdentifier();
            } else if (this.type == ErrorCodeType.Local) {
                this.localErrorCode = ais.readInteger();
            } else {
                throw new ParameterException();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ParameterException("IOException while parsing ErrorCode: "
                    + e.getMessage(), e);
        } catch (AsnException e) {
            e.printStackTrace();
            throw new ParameterException(
                    "AsnException while parsing ErrorCode: " + e.getMessage(), e);
        }
    }

    public void encode(AsnOutputStream aos) throws ParameterException {

        if (this.localErrorCode == null && this.globalErrorCode == null)
            throw new ParameterException("Error code: No error code set!");

        try {
            if (this.type == ErrorCodeType.Local) {
                aos.writeInteger(this.localErrorCode);
            } else if (this.type == ErrorCodeType.Global) {
                aos.writeObjectIdentifier(this.globalErrorCode);
            } else {
                throw new ParameterException();
            }
        } catch (IOException e) {
            throw new ParameterException(e);
        } catch (AsnException e) {
            throw new ParameterException(e);
        }
    }

}

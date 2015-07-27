/* eBridge SS7 */

package za.co.ebridge.isup.impl.message.parameter;

import java.io.IOException;
import java.util.Arrays;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.OperationCode;
import za.co.ebridge.isup.api.message.parameter.OperationCodeType;

/**
 * @author baranowb
 *
 */
public class OperationCodeImpl extends AbstractAsnEncodable implements OperationCode {

    private Long localOperationCode;
    private long[] globalOperationCode;
    private OperationCodeType type;

    public OperationCodeType getOperationType() {

        return type;
    }

    public void setOperationType(OperationCodeType t) {
        this.type = t;

    }

    public void setLocalOperationCode(Long localOperationCode) {
        this.localOperationCode = localOperationCode;
        this.globalOperationCode = null;
        this.type = OperationCodeType.Local;
    }

    public void setGlobalOperationCode(long[] globalOperationCode) {
        this.localOperationCode = null;
        this.globalOperationCode = globalOperationCode;
        this.type = OperationCodeType.Global;
    }

    public Long getLocalOperationCode() {
        return this.localOperationCode;
    }

    public long[] getGlobalOperationCode() {
        return this.globalOperationCode;
    }

    public String toString() {
        if (this.localOperationCode != null)
            return "OperationCode[OperationType=Local, data=" + this.localOperationCode.toString() + "]";
        else if (this.globalOperationCode != null)
            return "OperationCode[OperationType=Global, data=" + Arrays.toString(this.globalOperationCode) + "]";
        else
            return "OperationCode[empty]";
    }

    public void decode(AsnInputStream ais) throws ParameterException {

        try {
            if (this.type == OperationCodeType.Global) {
                this.globalOperationCode = ais.readObjectIdentifier();
            } else if (this.type == OperationCodeType.Local) {
                this.localOperationCode = ais.readInteger();
            } else {
                throw new ParameterException();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new ParameterException("IOException while parsing OperationCode: " + e.getMessage(), e);
        } catch (AsnException e) {
            e.printStackTrace();
            throw new ParameterException("AsnException while parsing OperationCode: " + e.getMessage(), e);
        }
    }

    public void encode(AsnOutputStream aos) throws ParameterException {

        if (this.localOperationCode == null && this.globalOperationCode == null)
            throw new ParameterException("Operation code: No Operation code set!");

        try {
            if (this.type == OperationCodeType.Local) {
                aos.writeInteger(this.localOperationCode);
            } else if (this.type == OperationCodeType.Global) {
                aos.writeObjectIdentifier(this.globalOperationCode);
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

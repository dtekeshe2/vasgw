/* eBridge SS7 */

/**
 * Start time:00:00:57 2009-09-07<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
package za.co.ebridge.isup.impl.message;

import java.util.Map;
import java.util.Set;

import za.co.ebridge.isup.api.ISUPParameterFactory;
import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.impl.message.parameter.AbstractISUPParameter;
import za.co.ebridge.isup.impl.message.parameter.MessageTypeImpl;
import za.co.ebridge.isup.api.message.SubsequentAddressMessage;
import za.co.ebridge.isup.api.message.parameter.MessageType;
import za.co.ebridge.isup.api.message.parameter.SubsequentNumber;

/**
 * Start time:00:00:57 2009-09-07<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
public class SubsequentAddressMessageImpl extends ISUPMessageImpl implements SubsequentAddressMessage {

    public static final MessageType _MESSAGE_TYPE = new MessageTypeImpl(MESSAGE_CODE);
    private static final int _MANDATORY_VAR_COUNT = 1;

    static final int _INDEX_F_MessageType = 0;

    static final int _INDEX_V_SubsequentNumber = 0;

    static final int _INDEX_O_EndOfOptionalParameters = 0;

    SubsequentAddressMessageImpl(Set<Integer> mandatoryCodes, Set<Integer> mandatoryVariableCodes, Set<Integer> optionalCodes,
            Map<Integer, Integer> mandatoryCode2Index, Map<Integer, Integer> mandatoryVariableCode2Index,
            Map<Integer, Integer> optionalCode2Index) {
        super(mandatoryCodes, mandatoryVariableCodes, optionalCodes, mandatoryCode2Index, mandatoryVariableCode2Index,
                optionalCode2Index);

        super.f_Parameters.put(_INDEX_F_MessageType, this.getMessageType());
        super.o_Parameters.put(_INDEX_O_EndOfOptionalParameters, _END_OF_OPTIONAL_PARAMETERS);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeMandatoryVariableBody (byte[], int)
     */

    protected void decodeMandatoryVariableBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, int parameterIndex)
            throws ParameterException {
        switch (parameterIndex) {
            case _INDEX_V_SubsequentNumber:
                SubsequentNumber subsequentNumber = parameterFactory.createSubsequentNumber();
                ((AbstractISUPParameter) subsequentNumber).decode(parameterBody);
                this.setSubsequentNumber(subsequentNumber);
                break;
            default:
                throw new ParameterException("Unrecognized parameter index for mandatory variable part: " + parameterIndex);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeOptionalBody(byte [], byte)
     */

    protected void decodeOptionalBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, byte parameterCode)
            throws ParameterException {
        throw new UnsupportedOperationException("This message does not support optional parameters.");
    }

    protected int getNumberOfMandatoryVariableLengthParameters() {
        return _MANDATORY_VAR_COUNT;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#hasAllMandatoryParameters ()
     */

    public boolean hasAllMandatoryParameters() {
        if (super.f_Parameters.get(_INDEX_V_SubsequentNumber) != null) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.impl.ISUPMessageImpl#optionalPartIsPossible ()
     */

    protected boolean optionalPartIsPossible() {
        return false;
    }

    public void setSubsequentNumber(SubsequentNumber value) {
        super.v_Parameters.put(_INDEX_V_SubsequentNumber, value);

    }

    public SubsequentNumber getSubsequentNumber() {
        return (SubsequentNumber) super.v_Parameters.get(_INDEX_V_SubsequentNumber);
    }

    public MessageType getMessageType() {
        return this._MESSAGE_TYPE;
    }

}

/* eBridge SS7 */

/**
 * Start time:00:07:25 2009-09-07<br>
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
import za.co.ebridge.isup.api.message.CircuitGroupBlockingMessage;
import za.co.ebridge.isup.api.message.parameter.CircuitGroupSuperVisionMessageType;
import za.co.ebridge.isup.api.message.parameter.MessageType;
import za.co.ebridge.isup.api.message.parameter.RangeAndStatus;

/**
 * Start time:00:07:25 2009-09-07<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
public class CircuitGroupBlockingMessageImpl extends ISUPMessageImpl implements CircuitGroupBlockingMessage {

    public static final MessageType _MESSAGE_TYPE = new MessageTypeImpl(MESSAGE_CODE);
    private static final int _MANDATORY_VAR_COUNT = 1;

    static final int _INDEX_F_MessageType = 0;
    static final int _INDEX_F_CircuitGroupSuperVisionMessageType = 1;

    static final int _INDEX_V_RangeAndStatus = 0;

    CircuitGroupBlockingMessageImpl(Set<Integer> mandatoryCodes, Set<Integer> mandatoryVariableCodes,
            Set<Integer> optionalCodes, Map<Integer, Integer> mandatoryCode2Index,
            Map<Integer, Integer> mandatoryVariableCode2Index, Map<Integer, Integer> optionalCode2Index) {
        super(mandatoryCodes, mandatoryVariableCodes, optionalCodes, mandatoryCode2Index, mandatoryVariableCode2Index,
                optionalCode2Index);

        super.f_Parameters.put(_INDEX_F_MessageType, this.getMessageType());

    }

    public void setSupervisionType(CircuitGroupSuperVisionMessageType ras) {
        super.f_Parameters.put(_INDEX_F_CircuitGroupSuperVisionMessageType, ras);
    }

    public CircuitGroupSuperVisionMessageType getSupervisionType() {
        return (CircuitGroupSuperVisionMessageType) super.f_Parameters.get(_INDEX_F_CircuitGroupSuperVisionMessageType);
    }

    public void setRangeAndStatus(RangeAndStatus ras) {
        super.v_Parameters.put(_INDEX_V_RangeAndStatus, ras);
    }

    public RangeAndStatus getRangeAndStatus() {
        return (RangeAndStatus) super.v_Parameters.get(_INDEX_V_RangeAndStatus);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeMandatoryParameters(byte[], int)
     */

    protected int decodeMandatoryParameters(ISUPParameterFactory parameterFactory, byte[] b, int index)
            throws
            ParameterException
    {
        int localIndex = index;
        index += super.decodeMandatoryParameters(parameterFactory, b, index);
        if (b.length - index > 1) {
            CircuitGroupSuperVisionMessageType cgsvmt = parameterFactory.createCircuitGroupSuperVisionMessageType();
            ((AbstractISUPParameter) cgsvmt).decode(new byte[] { b[index] });
            this.setSupervisionType(cgsvmt);
            index++;
            return index - localIndex;
        } else {
            throw new IllegalArgumentException("byte[] must have atleast four octets");
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeMandatoryVariableBody(byte [], int)
     */

    protected void decodeMandatoryVariableBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, int parameterIndex)
            throws ParameterException {
        switch (parameterIndex) {
            case _INDEX_V_RangeAndStatus:
                RangeAndStatus ras = parameterFactory.createRangeAndStatus();
                ((AbstractISUPParameter) ras).decode(parameterBody);
                this.setRangeAndStatus(ras);
                break;
            default:
                throw new ParameterException("Unrecognized parameter index for mandatory variable part, index: "
                        + parameterIndex);

        }

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeOptionalBody(byte[], byte)
     */

    protected void decodeOptionalBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, byte parameterCode)
            throws ParameterException {
        throw new ParameterException("This message does not support optional parameters");

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#getMessageType()
     */

    public MessageType getMessageType() {
        return this._MESSAGE_TYPE;
    }

    /*
     * (non-Javadoc)
     *
     * @seeorg.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl# getNumberOfMandatoryVariableLengthParameters()
     */

    protected int getNumberOfMandatoryVariableLengthParameters() {

        return _MANDATORY_VAR_COUNT;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#hasAllMandatoryParameters()
     */

    public boolean hasAllMandatoryParameters() {
        return super.f_Parameters.get(_INDEX_F_CircuitGroupSuperVisionMessageType) != null
                && super.v_Parameters.get(_INDEX_V_RangeAndStatus) != null;
    }

    protected boolean optionalPartIsPossible() {

        return false;
    }

}

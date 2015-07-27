/* eBridge SS7 */

/**
 * Start time:23:59:08 2009-09-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
package za.co.ebridge.isup.impl.message;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import za.co.ebridge.isup.api.ISUPParameterFactory;
import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.impl.message.parameter.AbstractISUPParameter;
import za.co.ebridge.isup.impl.message.parameter.MessageTypeImpl;
import za.co.ebridge.isup.api.message.ContinuityMessage;
import za.co.ebridge.isup.api.message.parameter.ContinuityIndicators;
import za.co.ebridge.isup.api.message.parameter.MessageType;

/**
 * Start time:23:59:08 2009-09-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
public class ContinuityMessageImpl extends ISUPMessageImpl implements ContinuityMessage {
    public static final MessageType _MESSAGE_TYPE = new MessageTypeImpl(MESSAGE_CODE);
    private static final int _MANDATORY_VAR_COUNT = 0;

    static final int _INDEX_F_MessageType = 0;
    static final int _INDEX_F_ContinuityIndicators = 1;

    protected static final List<Integer> mandatoryParam;
    static {
        List<Integer> tmp = new ArrayList<Integer>();
        tmp.add(_INDEX_F_MessageType);
        tmp.add(_INDEX_F_ContinuityIndicators);

        mandatoryParam = Collections.unmodifiableList(tmp);
    }

    /**
     *
     * @param source
     * @throws ParameterException
     */
    public ContinuityMessageImpl(Set<Integer> mandatoryCodes, Set<Integer> mandatoryVariableCodes, Set<Integer> optionalCodes,
            Map<Integer, Integer> mandatoryCode2Index, Map<Integer, Integer> mandatoryVariableCode2Index,
            Map<Integer, Integer> optionalCode2Index) {
        super(mandatoryCodes, mandatoryVariableCodes, optionalCodes, mandatoryCode2Index, mandatoryVariableCode2Index,
                optionalCode2Index);

        super.f_Parameters.put(_INDEX_F_MessageType, this.getMessageType());
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeMandatoryParameters(byte[], int)
     */

    protected int decodeMandatoryParameters(ISUPParameterFactory parameterFactory, byte[] b, int index)
            throws ParameterException {
        int localIndex = index;
        index += super.decodeMandatoryParameters(parameterFactory, b, index);
        if (b.length - index == 1) {
            byte[] continuityIndicators = new byte[1];
            continuityIndicators[0] = b[index++];

            ContinuityIndicators _ci = parameterFactory.createContinuityIndicators();
            ((AbstractISUPParameter) _ci).decode(continuityIndicators);
            this.setContinuityIndicators(_ci);
        } else {
            throw new ParameterException("byte[] must have exact one octets");
        }

        return index - localIndex;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeMandatoryVariableBody(byte[], int)
     */

    protected void decodeMandatoryVariableBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, int parameterIndex)
            throws ParameterException {
        throw new UnsupportedOperationException("This message does not support mandatory variable parameters.");

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeOptionalBody(byte[], byte)
     */

    protected void decodeOptionalBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, byte parameterCode)
            throws ParameterException {
        throw new UnsupportedOperationException("This message does not support optional parameters.");
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.ContinuityMessage# getContinuitiyIndicators()
     */
    public ContinuityIndicators getContinuityIndicators() {
        return (ContinuityIndicators) super.f_Parameters.get(this._INDEX_F_ContinuityIndicators);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.ContinuityMessage# setContinuitiyIndicators
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .ContinuitiyIndicators)
     */
    public void setContinuityIndicators(ContinuityIndicators value) {
        super.f_Parameters.put(this._INDEX_F_ContinuityIndicators, value);

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
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#getNumberOfMandatoryVariableLengthParameters()
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
        if (super.f_Parameters.get(_INDEX_F_ContinuityIndicators) != null) {
            return true;
        } else {
            return false;
        }
    }

    protected boolean optionalPartIsPossible() {
        return false;
    }

}

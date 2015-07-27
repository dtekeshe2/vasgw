/* eBridge SS7 */

/**
 * Start time:00:01:17 2009-09-07<br>
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
import za.co.ebridge.isup.api.message.SubsequentDirectoryNumberMessage;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.MessageType;
import za.co.ebridge.isup.api.message.parameter.SubsequentNumber;

/**
 * Start time:00:01:17 2009-09-07<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
public class SubsequentDirectoryNumberMessageImpl extends ISUPMessageImpl implements SubsequentDirectoryNumberMessage {

    public static final MessageTypeImpl _MESSAGE_TYPE = new MessageTypeImpl(MESSAGE_CODE);
    private static final int _MANDATORY_VAR_COUNT = 0;
    private static final boolean _HAS_MANDATORY = true;
    private static final boolean _OPTIONAL_POSSIBLE = true;

    static final int _INDEX_F_MessageType = 0;

    static final int _INDEX_O_SubsequentNumber = 0;
    static final int _INDEX_O_MessageCompatibilityInformation = 1;
    static final int _INDEX_O_EndOfOptionalParameters = 2;

    /**
     *
     * @param source
     * @throws ParameterException
     */
    public SubsequentDirectoryNumberMessageImpl(Set<Integer> mandatoryCodes, Set<Integer> mandatoryVariableCodes,
            Set<Integer> optionalCodes, Map<Integer, Integer> mandatoryCode2Index,
            Map<Integer, Integer> mandatoryVariableCode2Index, Map<Integer, Integer> optionalCode2Index) {
        super(mandatoryCodes, mandatoryVariableCodes, optionalCodes, mandatoryCode2Index, mandatoryVariableCode2Index,
                optionalCode2Index);
        super.f_Parameters.put(_INDEX_F_MessageType, this.getMessageType());
        super.o_Parameters.put(_INDEX_O_EndOfOptionalParameters, _END_OF_OPTIONAL_PARAMETERS);
    }

    protected void decodeMandatoryVariableBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, int parameterIndex)
            throws ParameterException {

    }

    protected void decodeOptionalBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, byte parameterCode)
            throws ParameterException {
        switch (parameterCode & 0xFF) {
            case MessageCompatibilityInformation._PARAMETER_CODE:
                MessageCompatibilityInformation mci = parameterFactory.createMessageCompatibilityInformation();
                ((AbstractISUPParameter) mci).decode(parameterBody);
                this.setMessageCompatibilityInformation(mci);
                break;
            case SubsequentNumber._PARAMETER_CODE:
                SubsequentNumber pci = parameterFactory.createSubsequentNumber();
                ((AbstractISUPParameter) pci).decode(parameterBody);
                this.setSubsequentNumber(pci);
                break;
            default:
                throw new ParameterException("Unrecognized parameter code for optional part: " + parameterCode);
        }

    }

    public MessageType getMessageType() {
        return _MESSAGE_TYPE;
    }

    protected int getNumberOfMandatoryVariableLengthParameters() {
        return _MANDATORY_VAR_COUNT;
    }

    public boolean hasAllMandatoryParameters() {
        return _HAS_MANDATORY;
    }

    protected boolean optionalPartIsPossible() {
        return _OPTIONAL_POSSIBLE;
    }

    @Override
    public MessageCompatibilityInformation getMessageCompatibilityInformation() {
        return (MessageCompatibilityInformation) super.o_Parameters.get(_INDEX_O_MessageCompatibilityInformation);
    }

    @Override
    public void setMessageCompatibilityInformation(MessageCompatibilityInformation mci) {
        super.o_Parameters.put(_INDEX_O_MessageCompatibilityInformation, mci);
    }

    @Override
    public SubsequentNumber getSubsequentNumber() {
        return (SubsequentNumber) super.o_Parameters.get(_INDEX_O_SubsequentNumber);
    }

    @Override
    public void setSubsequentNumber(SubsequentNumber pci) {
        super.o_Parameters.put(_INDEX_O_SubsequentNumber, pci);
    }
}

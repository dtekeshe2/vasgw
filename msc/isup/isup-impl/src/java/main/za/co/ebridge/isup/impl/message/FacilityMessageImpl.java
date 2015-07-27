/* eBridge SS7 */

/**
 * Start time:00:10:51 2009-09-07<br>
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
import za.co.ebridge.isup.api.message.FacilityMessage;
import za.co.ebridge.isup.api.message.parameter.CallTransferNumber;
import za.co.ebridge.isup.api.message.parameter.GenericNotificationIndicator;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.MessageType;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.PivotCounter;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingBackwardInformation;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingIndicators;
import za.co.ebridge.isup.api.message.parameter.PivotStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumber;
import za.co.ebridge.isup.api.message.parameter.RemoteOperations;
import za.co.ebridge.isup.api.message.parameter.ServiceActivation;
import za.co.ebridge.isup.api.message.parameter.accessTransport.AccessTransport;

/**
 * Start time:00:10:51 2009-09-07<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
public class FacilityMessageImpl extends ISUPMessageImpl implements FacilityMessage {

    public static final MessageTypeImpl _MESSAGE_TYPE = new MessageTypeImpl(MESSAGE_CODE);
    private static final int _MANDATORY_VAR_COUNT = 0;
    private static final boolean _HAS_MANDATORY = true;
    private static final boolean _OPTIONAL_POSSIBLE = true;

    static final int _INDEX_F_MessageType = 0;

    static final int _INDEX_O_MessageCompatibilityInformation = 0;
    static final int _INDEX_O_ParameterCompatibilityInformation = 1;
    static final int _INDEX_O_RemoteOperations = 2;
    static final int _INDEX_O_ServiceActivation = 3;
    static final int _INDEX_O_CallTransferNumber = 4;
    static final int _INDEX_O_AccessTransport = 5;
    static final int _INDEX_O_GenericNotificationIndicator = 6;
    static final int _INDEX_O_RedirectionNumber = 7;
    static final int _INDEX_O_PivotRoutingIndicators = 8;
    static final int _INDEX_O_PivotStatus = 9;
    static final int _INDEX_O_PivotCounter = 10;
    static final int _INDEX_O_PivotRoutingBackwardInformation = 11;
    static final int _INDEX_O_RedirectStatus = 12;
    static final int _INDEX_O_EndOfOptionalParameters = 13;

    FacilityMessageImpl(Set<Integer> mandatoryCodes, Set<Integer> mandatoryVariableCodes, Set<Integer> optionalCodes,
            Map<Integer, Integer> mandatoryCode2Index, Map<Integer, Integer> mandatoryVariableCode2Index,
            Map<Integer, Integer> optionalCode2Index) {
        super(mandatoryCodes, mandatoryVariableCodes, optionalCodes, mandatoryCode2Index, mandatoryVariableCode2Index,
                optionalCode2Index);
        super.f_Parameters.put(_INDEX_F_MessageType, this.getMessageType());
        super.o_Parameters.put(_INDEX_O_EndOfOptionalParameters, _END_OF_OPTIONAL_PARAMETERS);
    }

    @Override
    protected void decodeMandatoryVariableBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, int parameterIndex)
            throws ParameterException {

    }

    @Override
    protected void decodeOptionalBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, byte parameterCode)
            throws ParameterException {
        switch (parameterCode & 0xFF) {
            case MessageCompatibilityInformation._PARAMETER_CODE:
                MessageCompatibilityInformation mci = parameterFactory.createMessageCompatibilityInformation();
                ((AbstractISUPParameter) mci).decode(parameterBody);
                this.setMessageCompatibilityInformation(mci);
                break;
            case ParameterCompatibilityInformation._PARAMETER_CODE:
                ParameterCompatibilityInformation pci = parameterFactory.createParameterCompatibilityInformation();
                ((AbstractISUPParameter) pci).decode(parameterBody);
                this.setParameterCompatibilityInformation(pci);
                break;
            case RemoteOperations._PARAMETER_CODE:
                RemoteOperations ro = parameterFactory.createRemoteOperations();
                ((AbstractISUPParameter) ro).decode(parameterBody);
                this.setRemoteOperations(ro);
                break;
            case ServiceActivation._PARAMETER_CODE:
                ServiceActivation sa = parameterFactory.createServiceActivation();
                ((AbstractISUPParameter) sa).decode(parameterBody);
                this.setServiceActivation(sa);
                break;
            case CallTransferNumber._PARAMETER_CODE:
                CallTransferNumber ctn = parameterFactory.createCallTransferNumber();
                ((AbstractISUPParameter) ctn).decode(parameterBody);
                this.setCallTransferNumber(ctn);
                break;
            case AccessTransport._PARAMETER_CODE:
                AccessTransport at = parameterFactory.createAccessTransport();
                ((AbstractISUPParameter) at).decode(parameterBody);
                this.setAccessTransport(at);
                break;
            case GenericNotificationIndicator._PARAMETER_CODE:
                GenericNotificationIndicator gni = parameterFactory.createGenericNotificationIndicator();
                ((AbstractISUPParameter) gni).decode(parameterBody);
                this.setGenericNotificationIndicator(gni);
                break;
            case RedirectionNumber._PARAMETER_CODE:
                RedirectionNumber rn = parameterFactory.createRedirectionNumber();
                ((AbstractISUPParameter) rn).decode(parameterBody);
                this.setRedirectionNumber(rn);
                break;
            case PivotRoutingIndicators._PARAMETER_CODE:
                PivotRoutingIndicators pri = parameterFactory.createPivotRoutingIndicators();
                ((AbstractISUPParameter) pri).decode(parameterBody);
                this.setPivotRoutingIndicators(pri);
                break;
            case PivotStatus._PARAMETER_CODE:
                PivotStatus ps = parameterFactory.createPivotStatus();
                ((AbstractISUPParameter) ps).decode(parameterBody);
                this.setPivotStatus(ps);
                break;
            case PivotCounter._PARAMETER_CODE:
                PivotCounter pc = parameterFactory.createPivotCounter();
                ((AbstractISUPParameter) pc).decode(parameterBody);
                this.setPivotCounter(pc);
                break;
            case PivotRoutingBackwardInformation._PARAMETER_CODE:
                PivotRoutingBackwardInformation prbi = parameterFactory.createPivotRoutingBackwardInformation();
                ((AbstractISUPParameter) prbi).decode(parameterBody);
                this.setPivotRoutingBackwardInformation(prbi);
                break;
            case RedirectStatus._PARAMETER_CODE:
                RedirectStatus u2ui = parameterFactory.createRedirectStatus();
                ((AbstractISUPParameter) u2ui).decode(parameterBody);
                this.setRedirectStatus(u2ui);
                break;
            default:
                throw new ParameterException("Unrecognized parameter code for optional part: " + parameterCode);
        }
    }

    @Override
    public MessageType getMessageType() {
        return _MESSAGE_TYPE;
    }

    @Override
    protected int getNumberOfMandatoryVariableLengthParameters() {
        return _MANDATORY_VAR_COUNT;
    }

    @Override
    public boolean hasAllMandatoryParameters() {
        return _HAS_MANDATORY;
    }

    @Override
    protected boolean optionalPartIsPossible() {
        return _OPTIONAL_POSSIBLE;
    }

    @Override
    public void setMessageCompatibilityInformation(MessageCompatibilityInformation mci) {
        super.o_Parameters.put(_INDEX_O_MessageCompatibilityInformation, mci);

    }

    @Override
    public MessageCompatibilityInformation getMessageCompatibilityInformation() {
        return (MessageCompatibilityInformation) super.o_Parameters.get(_INDEX_O_MessageCompatibilityInformation);
    }

    @Override
    public void setParameterCompatibilityInformation(ParameterCompatibilityInformation pci) {
        super.o_Parameters.put(_INDEX_O_ParameterCompatibilityInformation, pci);
    }

    @Override
    public ParameterCompatibilityInformation getParameterCompatibilityInformation() {
        return (ParameterCompatibilityInformation) super.o_Parameters.get(_INDEX_O_ParameterCompatibilityInformation);
    }

    @Override
    public void setRemoteOperations(RemoteOperations ro) {
        super.o_Parameters.put(_INDEX_O_RemoteOperations, ro);
    }

    @Override
    public RemoteOperations getRemoteOperations() {
        return (RemoteOperations) super.o_Parameters.get(_INDEX_O_RemoteOperations);
    }

    @Override
    public void setServiceActivation(ServiceActivation sa) {
        super.o_Parameters.put(_INDEX_O_ServiceActivation, sa);
    }

    @Override
    public ServiceActivation getServiceActivation() {
        return (ServiceActivation) super.o_Parameters.get(_INDEX_O_ServiceActivation);
    }

    @Override
    public void setCallTransferNumber(CallTransferNumber ctn) {
        super.o_Parameters.put(_INDEX_O_CallTransferNumber, ctn);
    }

    @Override
    public CallTransferNumber getCallTransferNumber() {
        return (CallTransferNumber) super.o_Parameters.get(_INDEX_O_CallTransferNumber);
    }

    @Override
    public void setAccessTransport(AccessTransport at) {
        super.o_Parameters.put(_INDEX_O_AccessTransport, at);
    }

    @Override
    public AccessTransport getAccessTransport() {
        return (AccessTransport) super.o_Parameters.get(_INDEX_O_AccessTransport);
    }

    @Override
    public void setGenericNotificationIndicator(GenericNotificationIndicator gni) {
        super.o_Parameters.put(_INDEX_O_GenericNotificationIndicator, gni);
    }

    @Override
    public GenericNotificationIndicator getGenericNotificationIndicator() {
        return (GenericNotificationIndicator) super.o_Parameters.get(_INDEX_O_GenericNotificationIndicator);
    }

    @Override
    public void setRedirectionNumber(RedirectionNumber rn) {
        super.o_Parameters.put(_INDEX_O_RedirectionNumber, rn);
    }

    @Override
    public RedirectionNumber getRedirectionNumber() {
        return (RedirectionNumber) super.o_Parameters.get(_INDEX_O_RedirectionNumber);
    }

    @Override
    public void setPivotRoutingIndicators(PivotRoutingIndicators pri) {
        super.o_Parameters.put(_INDEX_O_PivotRoutingIndicators, pri);
    }

    @Override
    public PivotRoutingIndicators getPivotRoutingIndicators() {
        return (PivotRoutingIndicators) super.o_Parameters.get(_INDEX_O_PivotRoutingIndicators);
    }

    @Override
    public void setPivotStatus(PivotStatus ps) {
        super.o_Parameters.put(_INDEX_O_PivotStatus, ps);
    }

    @Override
    public PivotStatus getPivotStatus() {
        return (PivotStatus) super.o_Parameters.get(_INDEX_O_PivotStatus);
    }

    @Override
    public void setPivotCounter(PivotCounter pc) {
        super.o_Parameters.put(_INDEX_O_PivotCounter, pc);
    }

    @Override
    public PivotCounter getPivotCounter() {
        return (PivotCounter) super.o_Parameters.get(_INDEX_O_PivotCounter);
    }

    @Override
    public void setPivotRoutingBackwardInformation(PivotRoutingBackwardInformation prbi) {
        super.o_Parameters.put(_INDEX_O_PivotRoutingBackwardInformation, prbi);
    }

    @Override
    public PivotRoutingBackwardInformation getPivotRoutingBackwardInformation() {
        return (PivotRoutingBackwardInformation) super.o_Parameters.get(_INDEX_O_PivotRoutingBackwardInformation);
    }

    @Override
    public void setRedirectStatus(RedirectStatus rs) {
        super.o_Parameters.put(_INDEX_O_RedirectStatus, rs);
    }

    @Override
    public RedirectStatus getRedirectStatus() {
        return (RedirectStatus) super.o_Parameters.get(_INDEX_O_RedirectStatus);
    }

}

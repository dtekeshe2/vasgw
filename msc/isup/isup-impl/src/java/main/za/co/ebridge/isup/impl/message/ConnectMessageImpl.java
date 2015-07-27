/* eBridge SS7 */

/**
 * Start time:23:58:48 2009-09-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
package za.co.ebridge.isup.impl.message;

import za.co.ebridge.isup.api.ISUPParameterFactory;
import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.impl.message.parameter.AbstractISUPParameter;
import za.co.ebridge.isup.impl.message.parameter.BackwardGVNSImpl;

import za.co.ebridge.isup.impl.message.parameter.MessageTypeImpl;
import za.co.ebridge.isup.api.message.ConnectMessage;
import za.co.ebridge.isup.api.message.parameter.AccessDeliveryInformation;
import za.co.ebridge.isup.api.message.parameter.ApplicationTransport;
import za.co.ebridge.isup.api.message.parameter.BackwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.BackwardGVNS;
import za.co.ebridge.isup.api.message.parameter.CallHistoryInformation;
import za.co.ebridge.isup.api.message.parameter.CallReference;
import za.co.ebridge.isup.api.message.parameter.ConferenceTreatmentIndicators;
import za.co.ebridge.isup.api.message.parameter.ConnectedNumber;
import za.co.ebridge.isup.api.message.parameter.EchoControlInformation;
import za.co.ebridge.isup.api.message.parameter.GenericNotificationIndicator;
import za.co.ebridge.isup.api.message.parameter.GenericNumber;
import za.co.ebridge.isup.api.message.parameter.HTRInformation;
import za.co.ebridge.isup.api.message.parameter.MessageType;
import za.co.ebridge.isup.api.message.parameter.NetworkSpecificFacility;
import za.co.ebridge.isup.api.message.parameter.OptionalBackwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingBackwardInformation;
import za.co.ebridge.isup.api.message.parameter.RedirectStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumberRestriction;
import za.co.ebridge.isup.api.message.parameter.RemoteOperations;
import za.co.ebridge.isup.api.message.parameter.ServiceActivation;
import za.co.ebridge.isup.api.message.parameter.TransmissionMediumUsed;
import za.co.ebridge.isup.api.message.parameter.UserToUserIndicators;
import za.co.ebridge.isup.api.message.parameter.UserToUserInformation;
import za.co.ebridge.isup.api.message.parameter.accessTransport.AccessTransport;

import java.util.Map;
import java.util.Set;

/**
 * Start time:23:58:48 2009-09-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
public class ConnectMessageImpl extends ISUPMessageImpl implements ConnectMessage {

    public static final MessageType _MESSAGE_TYPE = new MessageTypeImpl(MESSAGE_CODE);
    private static final int _MANDATORY_VAR_COUNT = 0;

    static final int _INDEX_F_MessageType = 0;
    static final int _INDEX_F_BackwardCallIndicators = 1;

    static final int _INDEX_O_OptionalBackwardCallIndicators = 0;
    static final int _INDEX_O_BackwardGVNS = 1;
    static final int _INDEX_O_ConnectedNumber = 2;
    static final int _INDEX_O_CallReference = 3;
    static final int _INDEX_O_UserToUserIndicators = 4;
    static final int _INDEX_O_UserToUserInformation = 5;
    static final int _INDEX_O_AccessTransport = 6;
    static final int _INDEX_O_NetworkSpecificFacility = 7;
    static final int _INDEX_O_GenericNotificationIndicator = 8;
    static final int _INDEX_O_RemoteOperations = 9;
    static final int _INDEX_O_TransmissionMediumUsed = 10;
    static final int _INDEX_O_EchoControlInformation = 11;
    static final int _INDEX_O_AccessDeliveryInformation = 12;
    static final int _INDEX_O_CallHistoryInformation = 13;
    static final int _INDEX_O_ParameterCompatibilityInformation = 14;
    static final int _INDEX_O_ServiceActivation = 15;
    static final int _INDEX_O_GenericNumber = 16;
    static final int _INDEX_O_RedirectionNumberRestriction = 17;
    static final int _INDEX_O_ConferenceTreatmentIndicators = 18;
    static final int _INDEX_O_ApplicationTransportParameter = 19;
    static final int _INDEX_O_HTRInformation = 20;
    static final int _INDEX_O_PivotRoutingBackwardInformation = 21;
    static final int _INDEX_O_RedirectStatus = 22;
    static final int _INDEX_O_EndOfOptionalParameters = 23;

    ConnectMessageImpl(Set<Integer> mandatoryCodes, Set<Integer> mandatoryVariableCodes, Set<Integer> optionalCodes,
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
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getAccessDeliveryInformation()
     */
    public AccessDeliveryInformation getAccessDeliveryInformation() {
        return (AccessDeliveryInformation) super.o_Parameters.get(this._INDEX_O_AccessDeliveryInformation);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getAccessTransport ()
     */
    public AccessTransport getAccessTransport() {
        return (AccessTransport) super.o_Parameters.get(this._INDEX_O_AccessTransport);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getApplicationTransportParameter()
     */
    public ApplicationTransport getApplicationTransportParameter() {
        return (ApplicationTransport) super.o_Parameters.get(this._INDEX_O_ApplicationTransportParameter);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getBackwardCallIndicators()
     */
    public BackwardCallIndicators getBackwardCallIndicators() {
        return (BackwardCallIndicators) super.f_Parameters.get(this._INDEX_F_BackwardCallIndicators);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getBackwardGVNS()
     */
    public BackwardGVNS getBackwardGVNS() {
        return (BackwardGVNS) super.o_Parameters.get(this._INDEX_O_BackwardGVNS);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getCallHistoryInformation()
     */
    public CallHistoryInformation getCallHistoryInformation() {
        return (CallHistoryInformation) super.o_Parameters.get(this._INDEX_O_CallHistoryInformation);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getCallReference()
     */
    public CallReference getCallReference() {
        return (CallReference) super.o_Parameters.get(this._INDEX_O_CallReference);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getConferenceTreatmentIndicators()
     */
    public ConferenceTreatmentIndicators getConferenceTreatmentIndicators() {
        return (ConferenceTreatmentIndicators) super.o_Parameters.get(this._INDEX_O_ConferenceTreatmentIndicators);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getConnectedNumber ()
     */
    public ConnectedNumber getConnectedNumber() {
        return (ConnectedNumber) super.o_Parameters.get(this._INDEX_O_ConnectedNumber);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getEchoControlInformation()
     */
    public EchoControlInformation getEchoControlInformation() {
        return (EchoControlInformation) super.o_Parameters.get(this._INDEX_O_EchoControlInformation);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getGenericNotificationIndicator()
     */
    public GenericNotificationIndicator getGenericNotificationIndicator() {
        return (GenericNotificationIndicator) super.o_Parameters.get(this._INDEX_O_GenericNotificationIndicator);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getGenericNumber()
     */
    public GenericNumber getGenericNumber() {
        return (GenericNumber) super.o_Parameters.get(this._INDEX_O_GenericNumber);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getNetworkSpecificFacility()
     */
    public NetworkSpecificFacility getNetworkSpecificFacility() {
        return (NetworkSpecificFacility) super.o_Parameters.get(this._INDEX_O_NetworkSpecificFacility);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getOptionalBackwardCallIndicators()
     */
    public OptionalBackwardCallIndicators getOptionalBackwardCallIndicators() {
        return (OptionalBackwardCallIndicators) super.o_Parameters.get(this._INDEX_O_OptionalBackwardCallIndicators);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getParameterCompatibilityInformation()
     */
    public ParameterCompatibilityInformation getParameterCompatibilityInformation() {
        return (ParameterCompatibilityInformation) super.o_Parameters.get(this._INDEX_O_ParameterCompatibilityInformation);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getPivotRoutingBackwardInformation()
     */
    public PivotRoutingBackwardInformation getPivotRoutingBackwardInformation() {
        return (PivotRoutingBackwardInformation) super.o_Parameters.get(this._INDEX_O_PivotRoutingBackwardInformation);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getRedirectionNumberRestriction()
     */
    public RedirectionNumberRestriction getRedirectionNumberRestriction() {
        return (RedirectionNumberRestriction) super.o_Parameters.get(this._INDEX_O_RedirectionNumberRestriction);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getRedirectStatus ()
     */
    public RedirectStatus getRedirectStatus() {
        return (RedirectStatus) super.o_Parameters.get(this._INDEX_O_RedirectStatus);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getRemoteOperations ()
     */
    public RemoteOperations getRemoteOperations() {
        return (RemoteOperations) super.o_Parameters.get(this._INDEX_O_RemoteOperations);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#getServiceActivation ()
     */
    public ServiceActivation getServiceActivation() {
        return (ServiceActivation) super.o_Parameters.get(this._INDEX_O_ServiceActivation);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getTransmissionMediumUsed()
     */
    public TransmissionMediumUsed getTransmissionMediumUsed() {
        return (TransmissionMediumUsed) super.o_Parameters.get(this._INDEX_O_TransmissionMediumUsed);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getUserToUserIndicators()
     */
    public UserToUserIndicators getUserToUserIndicators() {
        return (UserToUserIndicators) super.o_Parameters.get(this._INDEX_O_UserToUserIndicators);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# getUserToUserInformation()
     */
    public UserToUserInformation getUserToUserInformation() {
        return (UserToUserInformation) super.o_Parameters.get(this._INDEX_O_UserToUserInformation);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setAccessDeliveryInformation
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .AccessDeliveryInformation)
     */
    public void setAccessDeliveryInformation(AccessDeliveryInformation value) {
        super.o_Parameters.put(this._INDEX_O_AccessDeliveryInformation, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setAccessTransport
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.accessTransport. AccessTransport)
     */
    public void setAccessTransport(AccessTransport value) {
        super.o_Parameters.put(this._INDEX_O_AccessTransport, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setApplicationTransportParameter
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message. parameter.ApplicationTransportParameter)
     */
    public void setApplicationTransportParameter(ApplicationTransport value) {
        super.o_Parameters.put(this._INDEX_O_ApplicationTransportParameter, value);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setBackwardCallIndicators
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .BackwardCallIndicators)
     */
    public void setBackwardCallIndicators(BackwardCallIndicators indicators) {
        super.f_Parameters.put(this._INDEX_F_BackwardCallIndicators, indicators);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setBackwardGVNS
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.BackwardGVNS)
     */
    public void setBackwardGVNS(BackwardGVNS value) {
        super.o_Parameters.put(this._INDEX_O_BackwardGVNS, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setCallHistoryInformation
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .CallHistoryInformation)
     */
    public void setCallHistoryInformation(CallHistoryInformation value) {
        super.o_Parameters.put(this._INDEX_O_CallHistoryInformation, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setCallReference
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.CallReference)
     */
    public void setCallReference(CallReference value) {
        super.o_Parameters.put(this._INDEX_O_CallReference, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setConferenceTreatmentIndicators
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message. parameter.ConferenceTreatmentIndicators)
     */
    public void setConferenceTreatmentIndicators(ConferenceTreatmentIndicators value) {
        super.o_Parameters.put(this._INDEX_O_ConferenceTreatmentIndicators, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setConnectedNumber
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.ConnectedNumber)
     */
    public void setConnectedNumber(ConnectedNumber value) {
        super.o_Parameters.put(this._INDEX_O_ConnectedNumber, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setEchoControlInformation
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .EchoControlInformation)
     */
    public void setEchoControlInformation(EchoControlInformation value) {
        super.o_Parameters.put(this._INDEX_O_EchoControlInformation, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setGenericNotificationIndicator
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .GenericNotificationIndicator)
     */
    public void setGenericNotificationIndicator(GenericNotificationIndicator value) {
        super.o_Parameters.put(this._INDEX_O_GenericNotificationIndicator, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setGenericNumber
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.GenericNumber)
     */
    public void setGenericNumber(GenericNumber value) {
        super.o_Parameters.put(this._INDEX_O_GenericNumber, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setNetworkSpecificFacility
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .NetworkSpecificFacility)
     */
    public void setNetworkSpecificFacility(NetworkSpecificFacility value) {
        super.o_Parameters.put(this._INDEX_O_NetworkSpecificFacility, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setOptionalBackwardCallIndicators
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message. parameter.OptionalBackwardCallIndicators)
     */
    public void setOptionalBackwardCallIndicators(OptionalBackwardCallIndicators value) {
        super.o_Parameters.put(this._INDEX_O_OptionalBackwardCallIndicators, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setParameterCompatibilityInformation
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message .parameter.ParameterCompatibilityInformation)
     */
    public void setParameterCompatibilityInformation(ParameterCompatibilityInformation value) {
        super.o_Parameters.put(this._INDEX_O_ParameterCompatibilityInformation, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setPivotRoutingBackwardInformation
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message .parameter.PivotRoutingBackwardInformation)
     */
    public void setPivotRoutingBackwardInformation(PivotRoutingBackwardInformation value) {
        super.o_Parameters.put(this._INDEX_O_PivotRoutingBackwardInformation, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setRedirectionNumberRestriction
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .RedirectionNumberRestriction)
     */
    public void setRedirectionNumberRestriction(RedirectionNumberRestriction value) {
        super.o_Parameters.put(this._INDEX_O_RedirectionNumberRestriction, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setRedirectStatus
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.RedirectStatus)
     */
    public void setRedirectStatus(RedirectStatus value) {
        super.o_Parameters.put(this._INDEX_O_RedirectStatus, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setRemoteOperations
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.RemoteOperations)
     */
    public void setRemoteOperations(RemoteOperations value) {
        super.o_Parameters.put(this._INDEX_O_RemoteOperations, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage#setServiceActivation
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.ServiceActivation)
     */
    public void setServiceActivation(ServiceActivation value) {
        super.o_Parameters.put(this._INDEX_O_ServiceActivation, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setTransmissionMediumUsed
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .TransmissionMediumUsed)
     */
    public void setTransmissionMediumUsed(TransmissionMediumUsed value) {
        super.o_Parameters.put(this._INDEX_O_TransmissionMediumUsed, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setUserToUserIndicators
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter.UserToUserIndicators)
     */
    public void setUserToUserIndicators(UserToUserIndicators value) {
        super.o_Parameters.put(this._INDEX_O_UserToUserIndicators, value);

    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.message.AnswerMessage# setUserToUserInformation
     * (org.mobicents.protocols.protocols.ss7.cap.api.isup.message.parameter .UserToUserInformation)
     */
    public void setUserToUserInformation(UserToUserInformation value) {
        super.o_Parameters.put(this._INDEX_O_UserToUserInformation, value);

    }

    public void setHTRInformation(HTRInformation value) {
        super.o_Parameters.put(_INDEX_O_HTRInformation, value);

    }

    public HTRInformation getHTRInformation() {

        return (HTRInformation) super.o_Parameters.get(_INDEX_O_HTRInformation);
    }

    protected int decodeMandatoryParameters(ISUPParameterFactory parameterFactory, byte[] b, int index)
            throws ParameterException {
        int localIndex = index;
        index += super.decodeMandatoryParameters(parameterFactory, b, index);

        if (b.length - index > 2) {

            try {
                byte[] body = new byte[2];
                body[0] = b[index++];
                body[1] = b[index++];

                BackwardCallIndicators v = parameterFactory.createBackwardCallIndicators();
                ((AbstractISUPParameter) v).decode(body);
                this.setBackwardCallIndicators(v);
            } catch (Exception e) {
                throw new ParameterException("Failed to parse BackwardCallIndicators due to: ", e);
            }

            return index - localIndex;
        } else {
            throw new ParameterException("byte[] must have at least 5 octets");
        }
    }

    protected int decodeMandatoryVariableParameters(ISUPParameterFactory parameterFactory, byte[] b, int index)
            throws ParameterException {
        throw new UnsupportedOperationException("This message does not support mandatory variable parameters.");
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeMandatoryVariableBody (byte [], int)
     */
    protected void decodeMandatoryVariableBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, int parameterIndex)
            throws ParameterException {
        throw new UnsupportedOperationException("This message does not support mandatory variable parameters.");
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#decodeOptionalBody(byte [], byte)
     */
    protected void decodeOptionalBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, byte parameterCode)
            throws ParameterException {
        switch (parameterCode & 0xFF) {
            case OptionalBackwardCallIndicators._PARAMETER_CODE:
                OptionalBackwardCallIndicators optionalBackwardCallIndicators = parameterFactory
                        .createOptionalBackwardCallIndicators();
                ((AbstractISUPParameter) optionalBackwardCallIndicators).decode(parameterBody);
                this.setOptionalBackwardCallIndicators(optionalBackwardCallIndicators);
                break;
            case BackwardGVNS._PARAMETER_CODE:
                BackwardGVNS backwardGVNS = new BackwardGVNSImpl(parameterBody);
                parameterFactory.createBackwardGVNS();
                ((AbstractISUPParameter) backwardGVNS).decode(parameterBody);
                this.setBackwardGVNS(backwardGVNS);
                break;
            case ConnectedNumber._PARAMETER_CODE:
                ConnectedNumber connectedNumber = parameterFactory.createConnectedNumber();
                ((AbstractISUPParameter) connectedNumber).decode(parameterBody);
                this.setConnectedNumber(connectedNumber);
                break;
            case CallReference._PARAMETER_CODE:
                CallReference callReference = parameterFactory.createCallReference();
                ((AbstractISUPParameter) callReference).decode(parameterBody);
                this.setCallReference(callReference);
                break;
            case UserToUserIndicators._PARAMETER_CODE:
                UserToUserIndicators userToUserIndicators = parameterFactory.createUserToUserIndicators();
                ((AbstractISUPParameter) userToUserIndicators).decode(parameterBody);
                this.setUserToUserIndicators(userToUserIndicators);
                break;
            case UserToUserInformation._PARAMETER_CODE:
                UserToUserInformation userToUserInformation = parameterFactory.createUserToUserInformation();
                ((AbstractISUPParameter) userToUserInformation).decode(parameterBody);
                this.setUserToUserInformation(userToUserInformation);
                break;
            case AccessTransport._PARAMETER_CODE:
                AccessTransport accessTransport = parameterFactory.createAccessTransport();
                ((AbstractISUPParameter) accessTransport).decode(parameterBody);
                this.setAccessTransport(accessTransport);
                break;
            case NetworkSpecificFacility._PARAMETER_CODE:
                NetworkSpecificFacility networkSpecificFacility = parameterFactory.createNetworkSpecificFacility();
                ((AbstractISUPParameter) networkSpecificFacility).decode(parameterBody);
                this.setNetworkSpecificFacility(networkSpecificFacility);
                break;
            case GenericNotificationIndicator._PARAMETER_CODE:
                GenericNotificationIndicator genericNotificationIndicator = parameterFactory
                        .createGenericNotificationIndicator();
                ((AbstractISUPParameter) genericNotificationIndicator).decode(parameterBody);
                this.setGenericNotificationIndicator(genericNotificationIndicator);
                break;
            case RemoteOperations._PARAMETER_CODE:
                RemoteOperations remoteOperations = parameterFactory.createRemoteOperations();
                ((AbstractISUPParameter) remoteOperations).decode(parameterBody);
                this.setRemoteOperations(remoteOperations);
                break;
            case TransmissionMediumUsed._PARAMETER_CODE:
                TransmissionMediumUsed transmissionMediumUsed = parameterFactory.createTransmissionMediumUsed();
                ((AbstractISUPParameter) transmissionMediumUsed).decode(parameterBody);
                this.setTransmissionMediumUsed(transmissionMediumUsed);
                break;
            case EchoControlInformation._PARAMETER_CODE:
                EchoControlInformation echoControlInformation = parameterFactory.createEchoControlInformation();
                ((AbstractISUPParameter) echoControlInformation).decode(parameterBody);
                this.setEchoControlInformation(echoControlInformation);
                break;
            case AccessDeliveryInformation._PARAMETER_CODE:
                AccessDeliveryInformation accessDeliveryInformation = parameterFactory.createAccessDeliveryInformation();
                ((AbstractISUPParameter) accessDeliveryInformation).decode(parameterBody);
                this.setAccessDeliveryInformation(accessDeliveryInformation);
                break;
            case CallHistoryInformation._PARAMETER_CODE:
                CallHistoryInformation callHistoryInformation = parameterFactory.createCallHistoryInformation();
                ((AbstractISUPParameter) callHistoryInformation).decode(parameterBody);
                this.setCallHistoryInformation(callHistoryInformation);
                break;
            case ParameterCompatibilityInformation._PARAMETER_CODE:
                ParameterCompatibilityInformation parameterCompatibilityInformation = parameterFactory
                        .createParameterCompatibilityInformation();
                ((AbstractISUPParameter) parameterCompatibilityInformation).decode(parameterBody);
                this.setParameterCompatibilityInformation(parameterCompatibilityInformation);
                break;
            case ServiceActivation._PARAMETER_CODE:
                ServiceActivation serviceActivation = parameterFactory.createServiceActivation();
                ((AbstractISUPParameter) serviceActivation).decode(parameterBody);
                this.setServiceActivation(serviceActivation);
                break;
            case GenericNumber._PARAMETER_CODE:
                GenericNumber genericNumber = parameterFactory.createGenericNumber();
                ((AbstractISUPParameter) genericNumber).decode(parameterBody);
                this.setGenericNumber(genericNumber);
                break;
            case RedirectionNumberRestriction._PARAMETER_CODE:
                RedirectionNumberRestriction redirectionNumberRestriction = parameterFactory
                        .createRedirectionNumberRestriction();
                ((AbstractISUPParameter) redirectionNumberRestriction).decode(parameterBody);
                this.setRedirectionNumberRestriction(redirectionNumberRestriction);
                break;
            case ConferenceTreatmentIndicators._PARAMETER_CODE:
                ConferenceTreatmentIndicators conferenceTreatmentIndicators = parameterFactory
                        .createConferenceTreatmentIndicators();
                ((AbstractISUPParameter) conferenceTreatmentIndicators).decode(parameterBody);
                this.setConferenceTreatmentIndicators(conferenceTreatmentIndicators);
                break;
            case ApplicationTransport._PARAMETER_CODE:
                ApplicationTransport applicationTransportParameter = parameterFactory
                        .createApplicationTransport();
                ((AbstractISUPParameter) applicationTransportParameter).decode(parameterBody);
                this.setApplicationTransportParameter(applicationTransportParameter);
                break;
            case HTRInformation._PARAMETER_CODE:
                HTRInformation htrInformation = parameterFactory.createHTRInformation();
                ((AbstractISUPParameter) htrInformation).decode(parameterBody);
                this.setHTRInformation(htrInformation);
                break;
            case PivotRoutingBackwardInformation._PARAMETER_CODE:
                PivotRoutingBackwardInformation pivotRoutingBackwardInformation = parameterFactory
                        .createPivotRoutingBackwardInformation();
                ((AbstractISUPParameter) pivotRoutingBackwardInformation).decode(parameterBody);
                this.setPivotRoutingBackwardInformation(pivotRoutingBackwardInformation);
                break;
            case RedirectStatus._PARAMETER_CODE:
                RedirectStatus redirectStatus = parameterFactory.createRedirectStatus();
                ((AbstractISUPParameter) redirectStatus).decode(parameterBody);
                this.setRedirectStatus(redirectStatus);
                break;
            default:
                throw new ParameterException("Unrecognized parameter code for optional part: " + parameterCode);
        }
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
     * @see org.mobicents.protocols.protocols.ss7.cap.api.isup.ISUPMessageImpl#hasAllMandatoryParameters ()
     */
    public boolean hasAllMandatoryParameters() {
        if (super.f_Parameters.get(_INDEX_F_BackwardCallIndicators) != null) {
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

        return true;
    }

}
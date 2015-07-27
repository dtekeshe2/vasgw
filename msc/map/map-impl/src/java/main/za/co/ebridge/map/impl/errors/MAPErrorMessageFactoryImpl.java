/* eBridge SS7 */

package za.co.ebridge.map.impl.errors;

import za.co.ebridge.map.api.errors.AbsentSubscriberDiagnosticSM;
import za.co.ebridge.map.api.errors.AbsentSubscriberReason;
import za.co.ebridge.map.api.errors.AdditionalNetworkResource;
import za.co.ebridge.map.api.errors.AdditionalRoamingNotAllowedCause;
import za.co.ebridge.map.api.errors.CUGRejectCause;
import za.co.ebridge.map.api.errors.CallBarringCause;
import za.co.ebridge.map.api.errors.MAPErrorCode;
import za.co.ebridge.map.api.errors.MAPErrorMessage;
import za.co.ebridge.map.api.errors.MAPErrorMessageAbsentSubscriber;
import za.co.ebridge.map.api.errors.MAPErrorMessageAbsentSubscriberSM;
import za.co.ebridge.map.api.errors.MAPErrorMessageBusySubscriber;
import za.co.ebridge.map.api.errors.MAPErrorMessageCUGReject;
import za.co.ebridge.map.api.errors.MAPErrorMessageCallBarred;
import za.co.ebridge.map.api.errors.MAPErrorMessageExtensionContainer;
import za.co.ebridge.map.api.errors.MAPErrorMessageFacilityNotSup;
import za.co.ebridge.map.api.errors.MAPErrorMessageFactory;
import za.co.ebridge.map.api.errors.MAPErrorMessageParameterless;
import za.co.ebridge.map.api.errors.MAPErrorMessagePositionMethodFailure;
import za.co.ebridge.map.api.errors.MAPErrorMessagePwRegistrationFailure;
import za.co.ebridge.map.api.errors.MAPErrorMessageRoamingNotAllowed;
import za.co.ebridge.map.api.errors.MAPErrorMessageSMDeliveryFailure;
import za.co.ebridge.map.api.errors.MAPErrorMessageSsErrorStatus;
import za.co.ebridge.map.api.errors.MAPErrorMessageSsIncompatibility;
import za.co.ebridge.map.api.errors.MAPErrorMessageSubscriberBusyForMtSms;
import za.co.ebridge.map.api.errors.MAPErrorMessageSystemFailure;
import za.co.ebridge.map.api.errors.MAPErrorMessageUnauthorizedLCSClient;
import za.co.ebridge.map.api.errors.MAPErrorMessageUnknownSubscriber;
import za.co.ebridge.map.api.errors.PWRegistrationFailureCause;
import za.co.ebridge.map.api.errors.PositionMethodFailureDiagnostic;
import za.co.ebridge.map.api.errors.RoamingNotAllowedCause;
import za.co.ebridge.map.api.errors.SMEnumeratedDeliveryFailureCause;
import za.co.ebridge.map.api.errors.UnauthorizedLCSClientDiagnostic;
import za.co.ebridge.map.api.errors.UnknownSubscriberDiagnostic;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.NetworkResource;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;
import za.co.ebridge.map.api.service.supplementary.SSCode;
import za.co.ebridge.map.api.service.supplementary.SSStatus;

/**
 * The factory of MAP ReturnError messages
 *
 * @author david@tekeshe.com
 *
 */
public class MAPErrorMessageFactoryImpl implements MAPErrorMessageFactory {

    /**
     * Generate the empty message depends of the error code (for incoming messages)
     *
     * @param errorCode
     * @return
     */
    public MAPErrorMessage createMessageFromErrorCode(Long errorCode) {
        long ec = (long) errorCode;
        switch ((int) ec) {
            case MAPErrorCode.unexpectedDataValue:
            case MAPErrorCode.dataMissing:
            case MAPErrorCode.unidentifiedSubscriber:
            case MAPErrorCode.illegalSubscriber:
            case MAPErrorCode.illegalEquipment:
            case MAPErrorCode.teleserviceNotProvisioned:
            case MAPErrorCode.messageWaitingListFull:
            case MAPErrorCode.unauthorizedRequestingNetwork:
            case MAPErrorCode.resourceLimitation:
            case MAPErrorCode.unknownOrUnreachableLCSClient:
            case MAPErrorCode.incompatibleTerminal:
            case MAPErrorCode.noRoamingNumberAvailable:
            case MAPErrorCode.noSubscriberReply:
            case MAPErrorCode.forwardingFailed:
            case MAPErrorCode.orNotAllowed:
            case MAPErrorCode.forwardingViolation:
            case MAPErrorCode.numberChanged:
            case MAPErrorCode.unknownMSC:
            case MAPErrorCode.unknownEquipment:
            case MAPErrorCode.bearerServiceNotProvisioned:
            case MAPErrorCode.mmEventNotSupported:
            case MAPErrorCode.illegalSSOperation:
            case MAPErrorCode.ssNotAvailable:
            case MAPErrorCode.ssSubscriptionViolation:
            case MAPErrorCode.unknownAlphabet:
            case MAPErrorCode.ussdBusy:
            case MAPErrorCode.negativePWCheck:
            case MAPErrorCode.numberOfPWAttemptsViolation:
            case MAPErrorCode.shortTermDenial:
            case MAPErrorCode.longTermDenial:
                return new MAPErrorMessageExtensionContainerImpl(errorCode);

            case MAPErrorCode.smDeliveryFailure:
                return new MAPErrorMessageSMDeliveryFailureImpl();

            case MAPErrorCode.absentSubscriberSM:
                return new MAPErrorMessageAbsentSubscriberSMImpl();

            case MAPErrorCode.systemFailure:
                return new MAPErrorMessageSystemFailureImpl();

            case MAPErrorCode.callBarred:
                return new MAPErrorMessageCallBarredImpl();

            case MAPErrorCode.facilityNotSupported:
                return new MAPErrorMessageFacilityNotSupImpl();

            case MAPErrorCode.unknownSubscriber:
                return new MAPErrorMessageUnknownSubscriberImpl();

            case MAPErrorCode.subscriberBusyForMTSMS:
                return new MAPErrorMessageSubscriberBusyForMtSmsImpl();

            case MAPErrorCode.absentSubscriber:
                return new MAPErrorMessageAbsentSubscriberImpl();

            case MAPErrorCode.unauthorizedLCSClient:
                return new MAPErrorMessageUnauthorizedLCSClientImpl();

            case MAPErrorCode.positionMethodFailure:
                return new MAPErrorMessagePositionMethodFailureImpl();

            case MAPErrorCode.busySubscriber:
                return new MAPErrorMessageBusySubscriberImpl();

            case MAPErrorCode.cugReject:
                return new MAPErrorMessageCUGRejectImpl();

            case MAPErrorCode.roamingNotAllowed:
                return new MAPErrorMessageRoamingNotAllowedImpl();

            case MAPErrorCode.ssErrorStatus:
                return new MAPErrorMessageSsErrorStatusImpl();

            case MAPErrorCode.ssIncompatibility:
                return new MAPErrorMessageSsIncompatibilityImpl();

            case MAPErrorCode.pwRegistrationFailure:
                return new MAPErrorMessagePwRegistrationFailureImpl();

            default:
                return new MAPErrorMessageParameterlessImpl(errorCode);
        }

    }

    public MAPErrorMessageParameterless createMAPErrorMessageParameterless(Long errorCode) {
        return new MAPErrorMessageParameterlessImpl(errorCode);
    }

    public MAPErrorMessageExtensionContainer createMAPErrorMessageExtensionContainer(Long errorCode,
            MAPExtensionContainer extensionContainer) {
        return new MAPErrorMessageExtensionContainerImpl(errorCode, extensionContainer);
    }

    public MAPErrorMessageSMDeliveryFailure createMAPErrorMessageSMDeliveryFailure(
            SMEnumeratedDeliveryFailureCause smEnumeratedDeliveryFailureCause, byte[] signalInfo,
            MAPExtensionContainer extensionContainer) {
        return new MAPErrorMessageSMDeliveryFailureImpl(smEnumeratedDeliveryFailureCause, signalInfo, extensionContainer);
    }

    public MAPErrorMessageFacilityNotSup createMAPErrorMessageFacilityNotSup(MAPExtensionContainer extensionContainer,
            Boolean shapeOfLocationEstimateNotSupported, Boolean neededLcsCapabilityNotSupportedInServingNode) {
        return new MAPErrorMessageFacilityNotSupImpl(extensionContainer, shapeOfLocationEstimateNotSupported,
                neededLcsCapabilityNotSupportedInServingNode);
    }

    public MAPErrorMessageSystemFailure createMAPErrorMessageSystemFailure(long mapVersion, NetworkResource networkResource,
            AdditionalNetworkResource additionalNetworkResource, MAPExtensionContainer extensionContainer) {
        return new MAPErrorMessageSystemFailureImpl(mapVersion, networkResource, additionalNetworkResource, extensionContainer);
    }

    public MAPErrorMessageUnknownSubscriber createMAPErrorMessageUnknownSubscriber(MAPExtensionContainer extensionContainer,
            UnknownSubscriberDiagnostic unknownSubscriberDiagnostic) {
        return new MAPErrorMessageUnknownSubscriberImpl(extensionContainer, unknownSubscriberDiagnostic);
    }

    public MAPErrorMessageAbsentSubscriberSM createMAPErrorMessageAbsentSubscriberSM(
            AbsentSubscriberDiagnosticSM absentSubscriberDiagnosticSM, MAPExtensionContainer extensionContainer,
            AbsentSubscriberDiagnosticSM additionalAbsentSubscriberDiagnosticSM) {
        return new MAPErrorMessageAbsentSubscriberSMImpl(absentSubscriberDiagnosticSM, extensionContainer,
                additionalAbsentSubscriberDiagnosticSM);
    }

    public MAPErrorMessageSubscriberBusyForMtSms createMAPErrorMessageSubscriberBusyForMtSms(
            MAPExtensionContainer extensionContainer, Boolean gprsConnectionSuspended) {
        return new MAPErrorMessageSubscriberBusyForMtSmsImpl(extensionContainer, gprsConnectionSuspended);
    }

    public MAPErrorMessageCallBarred createMAPErrorMessageCallBarred(Long mapVersion, CallBarringCause callBarringCause,
            MAPExtensionContainer extensionContainer, Boolean unauthorisedMessageOriginator) {
        return new MAPErrorMessageCallBarredImpl(mapVersion, callBarringCause, extensionContainer,
                unauthorisedMessageOriginator);
    }

    public MAPErrorMessageAbsentSubscriber createMAPErrorMessageAbsentSubscriber(MAPExtensionContainer extensionContainer,
            AbsentSubscriberReason absentSubscriberReason) {
        return new MAPErrorMessageAbsentSubscriberImpl(extensionContainer, absentSubscriberReason);
    }

    public MAPErrorMessageAbsentSubscriber createMAPErrorMessageAbsentSubscriber(Boolean mwdSet) {
        return new MAPErrorMessageAbsentSubscriberImpl(mwdSet);
    }

    public MAPErrorMessageUnauthorizedLCSClient createMAPErrorMessageUnauthorizedLCSClient(
            UnauthorizedLCSClientDiagnostic unauthorizedLCSClientDiagnostic, MAPExtensionContainer extensionContainer) {
        return new MAPErrorMessageUnauthorizedLCSClientImpl(unauthorizedLCSClientDiagnostic, extensionContainer);
    }

    public MAPErrorMessagePositionMethodFailure createMAPErrorMessagePositionMethodFailure(
            PositionMethodFailureDiagnostic positionMethodFailureDiagnostic, MAPExtensionContainer extensionContainer) {
        return new MAPErrorMessagePositionMethodFailureImpl(positionMethodFailureDiagnostic, extensionContainer);
    }

    public MAPErrorMessageBusySubscriber createMAPErrorMessageBusySubscriber(MAPExtensionContainer extensionContainer,
            boolean ccbsPossible, boolean ccbsBusy) {
        return new MAPErrorMessageBusySubscriberImpl(extensionContainer, ccbsPossible, ccbsBusy);
    }

    public MAPErrorMessageCUGReject createMAPErrorMessageCUGReject(CUGRejectCause cugRejectCause,
            MAPExtensionContainer extensionContainer) {
        return new MAPErrorMessageCUGRejectImpl(cugRejectCause, extensionContainer);
    }

    public MAPErrorMessageRoamingNotAllowed createMAPErrorMessageRoamingNotAllowed(
            RoamingNotAllowedCause roamingNotAllowedCause, MAPExtensionContainer extensionContainer,
            AdditionalRoamingNotAllowedCause additionalRoamingNotAllowedCause) {
        return new MAPErrorMessageRoamingNotAllowedImpl(roamingNotAllowedCause, extensionContainer,
                additionalRoamingNotAllowedCause);
    }

    public MAPErrorMessageSsErrorStatus createMAPErrorMessageSsErrorStatus(int data) {
        return new MAPErrorMessageSsErrorStatusImpl(data);
    }

    public MAPErrorMessageSsErrorStatus createMAPErrorMessageSsErrorStatus(boolean qBit, boolean pBit, boolean rBit,
            boolean aBit) {
        return new MAPErrorMessageSsErrorStatusImpl(qBit, pBit, rBit, aBit);
    }

    public MAPErrorMessageSsIncompatibility createMAPErrorMessageSsIncompatibility(SSCode ssCode,
            BasicServiceCode basicService, SSStatus ssStatus) {
        return new MAPErrorMessageSsIncompatibilityImpl(ssCode, basicService, ssStatus);
    }

    public MAPErrorMessagePwRegistrationFailure createMAPErrorMessagePwRegistrationFailure(
            PWRegistrationFailureCause pwRegistrationFailureCause) {
        return new MAPErrorMessagePwRegistrationFailureImpl(pwRegistrationFailureCause);
    }

}

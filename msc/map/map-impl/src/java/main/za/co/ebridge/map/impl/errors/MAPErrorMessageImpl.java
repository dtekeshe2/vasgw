/* eBridge SS7 */

package za.co.ebridge.map.impl.errors;

import za.co.ebridge.map.api.errors.MAPErrorMessage;
import za.co.ebridge.map.api.errors.MAPErrorMessageAbsentSubscriber;
import za.co.ebridge.map.api.errors.MAPErrorMessageAbsentSubscriberSM;
import za.co.ebridge.map.api.errors.MAPErrorMessageBusySubscriber;
import za.co.ebridge.map.api.errors.MAPErrorMessageCUGReject;
import za.co.ebridge.map.api.errors.MAPErrorMessageCallBarred;
import za.co.ebridge.map.api.errors.MAPErrorMessageExtensionContainer;
import za.co.ebridge.map.api.errors.MAPErrorMessageFacilityNotSup;
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
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 * Base class of MAP ReturnError messages
 *
 * @author david@tekeshe.com
 *
 */
public abstract class MAPErrorMessageImpl implements MAPErrorMessage, MAPAsnPrimitive {

    protected Long errorCode;

    protected MAPErrorMessageImpl(Long errorCode) {
        this.errorCode = errorCode;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public boolean isEmParameterless() {
        return false;
    }

    public boolean isEmExtensionContainer() {
        return false;
    }

    public boolean isEmFacilityNotSup() {
        return false;
    }

    public boolean isEmSMDeliveryFailure() {
        return false;
    }

    public boolean isEmSystemFailure() {
        return false;
    }

    public boolean isEmUnknownSubscriber() {
        return false;
    }

    public boolean isEmAbsentSubscriberSM() {
        return false;
    }

    public boolean isEmAbsentSubscriber() {
        return false;
    }

    public boolean isEmSubscriberBusyForMtSms() {
        return false;
    }

    public boolean isEmCallBarred() {
        return false;
    }

    public boolean isEmUnauthorizedLCSClient() {
        return false;
    }

    public boolean isEmPositionMethodFailure() {
        return false;
    }

    public boolean isEmBusySubscriber() {
        return false;
    }

    public boolean isEmCUGReject() {
        return false;
    }

    public boolean isEmRoamingNotAllowed() {
        return false;
    }

    public boolean isEmSsErrorStatus() {
        return false;
    }

    public boolean isEmSsIncompatibility() {
        return false;
    }

    public boolean isEmPwRegistrationFailure() {
        return false;
    }

    public MAPErrorMessageParameterless getEmParameterless() {
        return null;
    }

    public MAPErrorMessageExtensionContainer getEmExtensionContainer() {
        return null;
    }

    public MAPErrorMessageFacilityNotSup getEmFacilityNotSup() {
        return null;
    }

    public MAPErrorMessageSMDeliveryFailure getEmSMDeliveryFailure() {
        return null;
    }

    public MAPErrorMessageSystemFailure getEmSystemFailure() {
        return null;
    }

    public MAPErrorMessageUnknownSubscriber getEmUnknownSubscriber() {
        return null;
    }

    public MAPErrorMessageAbsentSubscriberSM getEmAbsentSubscriberSM() {
        return null;
    }

    public MAPErrorMessageAbsentSubscriber getEmAbsentSubscriber() {
        return null;
    }

    public MAPErrorMessageSubscriberBusyForMtSms getEmSubscriberBusyForMtSms() {
        return null;
    }

    public MAPErrorMessageCallBarred getEmCallBarred() {
        return null;
    }

    public MAPErrorMessageUnauthorizedLCSClient getEmUnauthorizedLCSClient() {
        return null;
    }

    public MAPErrorMessagePositionMethodFailure getEmPositionMethodFailure() {
        return null;
    }

    public MAPErrorMessageBusySubscriber getEmBusySubscriber() {
        return null;
    }

    public MAPErrorMessageCUGReject getEmCUGReject() {
        return null;
    }

    public MAPErrorMessageRoamingNotAllowed getEmRoamingNotAllowed() {
        return null;
    }

    public MAPErrorMessageSsErrorStatus getEmSsErrorStatus() {
        return null;
    }

    public MAPErrorMessageSsIncompatibility getEmSsIncompatibility() {
        return null;
    }

    public MAPErrorMessagePwRegistrationFailure getEmPwRegistrationFailure() {
        return null;
    }

}

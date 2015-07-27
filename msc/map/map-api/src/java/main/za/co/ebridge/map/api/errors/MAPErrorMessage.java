/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import java.io.Serializable;

/**
 * Base class of MAP ReturnError messages
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessage extends Serializable {

    Long getErrorCode();

    boolean isEmParameterless();

    boolean isEmExtensionContainer();

    boolean isEmFacilityNotSup();

    boolean isEmSMDeliveryFailure();

    boolean isEmSystemFailure();

    boolean isEmUnknownSubscriber();

    boolean isEmAbsentSubscriberSM();

    boolean isEmAbsentSubscriber();

    boolean isEmSubscriberBusyForMtSms();

    boolean isEmCallBarred();

    boolean isEmUnauthorizedLCSClient();

    boolean isEmPositionMethodFailure();

    MAPErrorMessageParameterless getEmParameterless();

    MAPErrorMessageExtensionContainer getEmExtensionContainer();

    MAPErrorMessageFacilityNotSup getEmFacilityNotSup();

    MAPErrorMessageSMDeliveryFailure getEmSMDeliveryFailure();

    MAPErrorMessageSystemFailure getEmSystemFailure();

    MAPErrorMessageUnknownSubscriber getEmUnknownSubscriber();

    MAPErrorMessageAbsentSubscriberSM getEmAbsentSubscriberSM();

    MAPErrorMessageAbsentSubscriber getEmAbsentSubscriber();

    MAPErrorMessageSubscriberBusyForMtSms getEmSubscriberBusyForMtSms();

    MAPErrorMessageCallBarred getEmCallBarred();

    MAPErrorMessageUnauthorizedLCSClient getEmUnauthorizedLCSClient();

    MAPErrorMessagePositionMethodFailure getEmPositionMethodFailure();

}

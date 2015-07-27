/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V2-3:
 *
 * MAP V3: informServiceCentre OPERATION ::= { --Timer s ARGUMENT InformServiceCentreArg CODE local:63 }
 *
 * MAP V2: InformServiceCentre ::= OPERATION --Timer s ARGUMENT informServiceCentreArg InformServiceCentreArg
 *
 * MAP V3: InformServiceCentreArg ::= SEQUENCE { storedMSISDN ISDN-AddressString OPTIONAL, mw-Status MW-Status OPTIONAL,
 * extensionContainer ExtensionContainer OPTIONAL, ... , absentSubscriberDiagnosticSM AbsentSubscriberDiagnosticSM OPTIONAL,
 * additionalAbsentSubscriberDiagnosticSM [0] AbsentSubscriberDiagnosticSM OPTIONAL } -- additionalAbsentSubscriberDiagnosticSM
 * may be present only if -- absentSubscriberDiagnosticSM is present. -- if included, additionalAbsentSubscriberDiagnosticSM is
 * for GPRS and -- absentSubscriberDiagnosticSM is for non-GPRS
 *
 * MAP V2: InformServiceCentreArg ::= SEQUENCE { storedMSISDN ISDN-AddressString OPTIONAL, mw-Status MW-Status OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface InformServiceCentreRequest extends SmsMessage {

    ISDNAddressString getStoredMSISDN();

    MWStatus getMwStatus();

    MAPExtensionContainer getExtensionContainer();

    Integer getAbsentSubscriberDiagnosticSM();

    Integer getAdditionalAbsentSubscriberDiagnosticSM();

}

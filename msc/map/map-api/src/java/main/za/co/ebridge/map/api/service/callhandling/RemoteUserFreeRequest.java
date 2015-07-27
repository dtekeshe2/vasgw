/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.supplementary.CCBSFeature;

/**
 *
 MAP V3:
 *
 * remoteUserFree OPERATION ::= { --Timer ml ARGUMENT RemoteUserFreeArg RESULT RemoteUserFreeRes ERRORS { unexpectedDataValue |
 * dataMissing | incompatibleTerminal | absentSubscriber | systemFailure | busySubscriber} CODE local:75 }
 *
 * RemoteUserFreeArg ::= SEQUENCE{ imsi [0] IMSI, callInfo [1] ExternalSignalInfo, ccbs-Feature [2] CCBS-Feature,
 * translatedB-Number [3] ISDN-AddressString, replaceB-Number [4] NULL OPTIONAL, alertingPattern [5] AlertingPattern OPTIONAL,
 * extensionContainer [6] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RemoteUserFreeRequest extends CallHandlingMessage {

     IMSI getImsi();

     ExternalSignalInfo getCallInfo();

     CCBSFeature getCcbsFeature();

     ISDNAddressString getTranslatedBNumber();

     boolean getReplaceBNumber();

     AlertingPattern getAlertingPattern();

     MAPExtensionContainer getExtensionContainer();

}

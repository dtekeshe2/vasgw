/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MT-ForwardSM-VGCS-Res ::= SEQUENCE { sm-RP-UI [0] SignalInfo OPTIONAL, dispatcherList [1] DispatcherList OPTIONAL,
 * ongoingCall NULL OPTIONAL, extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 * DispatcherList ::= SEQUENCE SIZE (1..5) OF ISDN-AddressString
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MtForwardSMVgscResponse extends SmsMessage {

    SmsSignalInfo getSM_RP_UI();

    ArrayList<ISDNAddressString> getDispatcherList();

    boolean getOngoingCall();

    MAPExtensionContainer getExtensionContainer();

}

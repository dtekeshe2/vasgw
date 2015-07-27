/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.supplementary.SSCode;
import za.co.ebridge.map.api.service.supplementary.SSSubscriptionOption;

/**
 *
 Ext-SS-Data ::= SEQUENCE { ss-Code SS-Code, ss-Status [4] Ext-SS-Status, ss-SubscriptionOption SS-SubscriptionOption
 * OPTIONAL, basicServiceGroupList Ext-BasicServiceGroupList OPTIONAL, extensionContainer [5] ExtensionContainer OPTIONAL, ...}
 *
 * Ext-BasicServiceGroupList ::= SEQUENCE SIZE (1..32) OF Ext-BasicServiceCode
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtSSData extends Serializable {

    SSCode getSsCode();

    ExtSSStatus getSsStatus();

    SSSubscriptionOption getSSSubscriptionOption();

    ArrayList<ExtBasicServiceCode> getBasicServiceGroupList();

    MAPExtensionContainer getExtensionContainer();

}

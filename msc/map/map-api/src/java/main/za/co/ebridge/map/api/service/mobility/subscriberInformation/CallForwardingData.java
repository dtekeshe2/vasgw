/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtForwFeature;

/**
 *
 CallForwardingData ::= SEQUENCE { forwardingFeatureList Ext-ForwFeatureList, notificationToCSE NULL OPTIONAL,
 * extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 * Ext-ForwFeatureList ::= SEQUENCE SIZE (1..32) OF Ext-ForwFeature
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CallForwardingData extends Serializable {

    ArrayList<ExtForwFeature> getForwardingFeatureList();

    MAPExtensionContainer getNotificationToCSE();

    MAPExtensionContainer getExtensionContainer();

}

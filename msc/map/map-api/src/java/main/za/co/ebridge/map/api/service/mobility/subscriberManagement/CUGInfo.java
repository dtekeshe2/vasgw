/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 CUG-Info ::= SEQUENCE { cug-SubscriptionList CUG-SubscriptionList, cug-FeatureList CUG-FeatureList OPTIONAL,
 * extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 * CUG-SubscriptionList ::= SEQUENCE SIZE (0..10) OF CUG-Subscription
 *
 * CUG-FeatureList ::= SEQUENCE SIZE (1..32) OF CUG-Feature
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CUGInfo extends Serializable {

    ArrayList<CUGSubscription> getCUGSubscriptionList();

    ArrayList<CUGFeature> getCUGFeatureList();

    MAPExtensionContainer getExtensionContainer();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.Time;

/**
 *
 CSG-SubscriptionData ::= SEQUENCE { csg-Id CSG-Id, expirationDate Time OPTIONAL, extensionContainer ExtensionContainer
 * OPTIONAL, ..., lipa-AllowedAPNList [0] LIPA-AllowedAPNList OPTIONAL }
 *
 * LIPA-AllowedAPNList ::= SEQUENCE SIZE (1..50) OF APN
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CSGSubscriptionData extends Serializable {

    CSGId getCsgId();

    Time getExpirationDate();

    MAPExtensionContainer getExtensionContainer();

    ArrayList<APN> getLipaAllowedAPNList();

}

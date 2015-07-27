/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 EPS-QoS-Subscribed ::= SEQUENCE { qos-Class-Identifier [0] QoS-Class-Identifier, allocation-Retention-Priority [1]
 * Allocation-Retention-Priority, extensionContainer [2] ExtensionContainer OPTIONAL, ... }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EPSQoSSubscribed extends Serializable {

    QoSClassIdentifier getQoSClassIdentifier();

    AllocationRetentionPriority getAllocationRetentionPriority();

    MAPExtensionContainer getExtensionContainer();

}

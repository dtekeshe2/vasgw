/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 Allocation-Retention-Priority ::= SEQUENCE { priority-level [0] INTEGER, pre-emption-capability [1] BOOLEAN OPTIONAL,
 * pre-emption-vulnerability [2] BOOLEAN OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ... }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AllocationRetentionPriority extends Serializable {

    int getPriorityLevel();

    Boolean getPreEmptionCapability();

    Boolean getPreEmptionVulnerability();

    MAPExtensionContainer getExtensionContainer();

}

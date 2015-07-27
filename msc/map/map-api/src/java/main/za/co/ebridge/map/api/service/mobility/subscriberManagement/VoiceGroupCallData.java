/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 VoiceGroupCallData ::= SEQUENCE { groupId GroupId, -- groupId shall be filled with six TBCD fillers (1111)if the longGroupId
 * is present extensionContainer ExtensionContainer OPTIONAL, ..., additionalSubscriptions AdditionalSubscriptions OPTIONAL,
 * additionalInfo [0] AdditionalInfo OPTIONAL, longGroupId [1] Long-GroupId OPTIONAL }
 *
 * -- VoiceGroupCallData containing a longGroupId shall not be sent to VLRs that did not -- indicate support of long Group IDs
 * within the Update Location or Restore Data -- request message
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface VoiceGroupCallData extends Serializable {

    GroupId getGroupId();

    MAPExtensionContainer getExtensionContainer();

    AdditionalSubscriptions getAdditionalSubscriptions();

    AdditionalInfo getAdditionalInfo();

    LongGroupId getLongGroupId();

}

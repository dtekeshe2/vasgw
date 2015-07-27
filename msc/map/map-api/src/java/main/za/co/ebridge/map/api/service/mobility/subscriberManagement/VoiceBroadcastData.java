/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 VoiceBroadcastData ::= SEQUENCE { groupid GroupId, -- groupId shall be filled with six TBCD fillers (1111)if the longGroupId
 * is present broadcastInitEntitlement NULL OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ..., longGroupId [0]
 * Long-GroupId OPTIONAL }
 *
 * -- VoiceBroadcastData containing a longGroupId shall not be sent to VLRs that did not -- indicate support of long Group IDs
 * within the Update Location or Restore Data -- request message
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface VoiceBroadcastData extends Serializable {

    GroupId getGroupId();

    boolean getBroadcastInitEntitlement();

    MAPExtensionContainer getExtensionContainer();

    LongGroupId getLongGroupId();

}

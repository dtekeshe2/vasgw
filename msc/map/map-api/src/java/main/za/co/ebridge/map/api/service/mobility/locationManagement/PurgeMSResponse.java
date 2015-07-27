/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: PurgeMS-Res ::= SEQUENCE {
   freezeTMSI         [0] NULL OPTIONAL,
   freezeP-TMSI       [1] NULL OPTIONAL,
   extensionContainer ExtensionContainer OPTIONAL,
   ...,
   freezeM-TMSI       [2] NULL OPTIONAL
 }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PurgeMSResponse extends MobilityMessage {

    boolean getFreezeTMSI();

    boolean getFreezePTMSI();

    MAPExtensionContainer getExtensionContainer();

    boolean getFreezeMTMSI();

}

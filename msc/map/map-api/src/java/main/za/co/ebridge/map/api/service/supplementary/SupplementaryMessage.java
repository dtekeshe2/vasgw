/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.MAPMessage;

/**
 *
 * @author amit bhayani
 *
 */
public interface SupplementaryMessage extends MAPMessage {

    MAPDialogSupplementary getMAPDialog();

}
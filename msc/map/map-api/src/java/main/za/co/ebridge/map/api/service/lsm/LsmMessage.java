/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import za.co.ebridge.map.api.MAPMessage;

/**
 * @author amit bhayani
 *
 */
public interface LsmMessage extends MAPMessage {
    MAPDialogLsm getMAPDialog();
}

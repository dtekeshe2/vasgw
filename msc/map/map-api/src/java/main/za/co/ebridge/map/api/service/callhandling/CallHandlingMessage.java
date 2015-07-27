/* eBridge SS7 */

package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.MAPMessage;

/**
 *
 * @author cristian veliscu
 *
 */
public interface CallHandlingMessage extends MAPMessage {
    MAPDialogCallHandling getMAPDialog();
}
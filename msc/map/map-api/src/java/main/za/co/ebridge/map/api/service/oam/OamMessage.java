/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import za.co.ebridge.map.api.MAPMessage;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface OamMessage extends MAPMessage {

    MAPDialogOam getMAPDialog();

}

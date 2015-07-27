/* eBridge SS7 */

package za.co.ebridge.map.api.service.pdpContextActivation;

import za.co.ebridge.map.api.MAPMessage;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface PdpContextActivationMessage extends MAPMessage {

    MAPDialogPdpContextActivation getMAPDialog();

}

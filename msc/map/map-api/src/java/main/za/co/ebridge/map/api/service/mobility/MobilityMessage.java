/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility;

import za.co.ebridge.map.api.MAPMessage;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface MobilityMessage extends MAPMessage {

    MAPDialogMobility getMAPDialog();

}

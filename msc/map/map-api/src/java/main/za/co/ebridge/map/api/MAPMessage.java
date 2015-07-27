/* eBridge SS7 */

package za.co.ebridge.map.api;

import java.io.Serializable;


/**
 * This is super interface for all service message in MAP
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPMessage extends Serializable {

    long getInvokeId();

    void setInvokeId(long invokeId);

    MAPDialog getMAPDialog();

    void setMAPDialog(MAPDialog mapDialog);

    MAPMessageType getMessageType();

    int getOperationCode();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import java.io.Serializable;

/**
 *
 ISR-Information::= BIT STRING { updateMME (0), cancelSGSN (1), initialAttachIndicator (2)} (SIZE (3..8)) -- exception
 * handling: reception of unknown bit assignments in the -- ISR-Information data type shall be discarded by the receiver
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ISRInformation extends Serializable {

    boolean getUpdateMME();

    boolean getCancelSGSN();

    boolean getInitialAttachIndicator();

}

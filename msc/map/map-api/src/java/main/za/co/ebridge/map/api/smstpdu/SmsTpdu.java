/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

import za.co.ebridge.map.api.MAPException;

/**
 * A Super class for SMS-DELIVER, SMS-DELIVER-REPORT, SMS-STATUS-REPORT, SMS-COMMAND, SMS-SUBMIT, SMS-SUBMIT-REPORT pdu's
 *
 * @author david@tekeshe.com
 *
 */
public interface SmsTpdu extends Serializable {

    SmsTpduType getSmsTpduType();

    byte[] encodeData() throws MAPException;

}
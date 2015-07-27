/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import java.io.Serializable;

import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.smstpdu.SmsTpdu;

/**
 * Sms signal info
 *
 * @author david@tekeshe.com
 *
 */
public interface SmsSignalInfo extends Serializable {

    byte[] getData();

    SmsTpdu decodeTpdu(boolean mobileOriginatedMessage) throws MAPException;

}

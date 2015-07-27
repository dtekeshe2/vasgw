/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import za.co.ebridge.map.api.primitives.IMSI;

/**
 *
 RESULT IMSI
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendImsiResponse extends OamMessage {

    IMSI getImsi();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

/**
 *
 ChannelType ::= octet STRING (SIZE (1..10)) -- concatenation of -- speech data indicator -- channel rate -- speech encoding
 * algorithm/ data rate -- and transparency indicator -- as defined in TS GSM 08.08
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ChannelType extends Serializable {

    byte[] getData();

}

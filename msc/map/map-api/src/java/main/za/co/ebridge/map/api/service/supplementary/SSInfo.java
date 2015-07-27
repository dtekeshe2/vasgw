/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

/**
 *
 SS-Info ::= CHOICE { forwardingInfo [0] ForwardingInfo, callBarringInfo [1] CallBarringInfo, ss-Data [3] SS-Data}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SSInfo extends Serializable {

    ForwardingInfo getForwardingInfo();

    CallBarringInfo getCallBarringInfo();

    SSData getSsData();

}
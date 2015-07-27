/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 Ext-SS-Info ::= CHOICE { forwardingInfo [0] Ext-ForwInfo, callBarringInfo [1] Ext-CallBarInfo, cug-Info [2] CUG-Info, ss-Data
 * [3] Ext-SS-Data, emlpp-Info [4] EMLPP-Info}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ExtSSInfo extends Serializable {

    ExtForwInfo getForwardingInfo();

    ExtCallBarInfo getCallBarringInfo();

    CUGInfo getCugInfo();

    ExtSSData getSsData();

    EMLPPInfo getEmlppInfo();

}

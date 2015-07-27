/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 *
 RequestedServingNode ::= BIT STRING { mmeAndSgsn (0)} (SIZE (1..8))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RequestedServingNode extends Serializable {

    boolean getMmeAndSgsn();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 *
 ServingNode ::= BIT STRING { mme (0), sgsn (1)} (SIZE (2..8)) -- Other bits than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ServingNode extends Serializable {

    boolean getMme();

    boolean getSgsn();

}

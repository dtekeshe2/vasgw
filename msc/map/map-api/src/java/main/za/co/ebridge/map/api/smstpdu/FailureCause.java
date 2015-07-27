/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface FailureCause extends Serializable {

    int getCode();

}
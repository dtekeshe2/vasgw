/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface CommandType extends Serializable {

    int getCode();

    CommandTypeValue getCommandTypeValue();

}

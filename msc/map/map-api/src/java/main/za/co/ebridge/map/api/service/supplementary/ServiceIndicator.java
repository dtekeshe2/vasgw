/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

/**
 *
 ServiceIndicator ::= BIT STRING { clir-invoked (0), camel-invoked (1)} (SIZE(2..32)) -- exception handling: -- bits 2 to 31
 * shall be ignored if received and not understood
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ServiceIndicator extends Serializable {

    boolean getClirInvoked();

    boolean getCamelInvoked();

}
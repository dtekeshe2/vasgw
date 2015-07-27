/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface ParameterIndicator extends Serializable {

    int getCode();

    boolean getTP_UDLPresence();

    boolean getTP_DCSPresence();

    boolean getTP_PIDPresence();;

}
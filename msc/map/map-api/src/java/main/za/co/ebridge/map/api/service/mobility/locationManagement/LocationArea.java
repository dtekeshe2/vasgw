/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.LAIFixedLength;

/**
 *
 LocationArea ::= CHOICE { laiFixedLength [0] LAIFixedLength, lac [1] LAC}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface LocationArea extends Serializable {

    LAIFixedLength getLAIFixedLength();

    LAC getLAC();

}

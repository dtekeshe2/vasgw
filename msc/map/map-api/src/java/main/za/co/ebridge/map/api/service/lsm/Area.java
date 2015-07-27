/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

/**
 * Area ::= SEQUENCE { areaType [0] AreaType, areaIdentification [1] AreaIdentification, ...}
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public interface Area extends Serializable {

    AreaType getAreaType();

    AreaIdentification getAreaIdentification();
}

/* eBridge SS7 */
package za.co.ebridge.map.api.service.mobility.locationManagement;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 PagingArea ::= SEQUENCE SIZE (1..5) OF LocationArea
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PagingArea extends Serializable {

    ArrayList<LocationArea> getLocationAreas();

}

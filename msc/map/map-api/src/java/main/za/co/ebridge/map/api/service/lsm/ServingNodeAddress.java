/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.DiameterIdentity;
import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 *
 ServingNodeAddress ::= CHOICE { msc-Number [0] ISDN-AddressString, sgsn-Number [1] ISDN-AddressString, mme-Number [2]
 * DiameterIdentity }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ServingNodeAddress extends Serializable {

    ISDNAddressString getMscNumber();

    ISDNAddressString getSgsnNumber();

    DiameterIdentity getMmeNumber();

}

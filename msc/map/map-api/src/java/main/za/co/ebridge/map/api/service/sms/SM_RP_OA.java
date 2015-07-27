/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 * SM-RP-OA ::= CHOICE { msisdn [2] ISDN-AddressString, serviceCentreAddressOA [4] AddressString, noSM-RP-OA [5] NULL}
 *
 * Only one method getMsisdn() or getServiceCentreAddressOA() will return the non null value If all these methods return null -
 * this means noSM-RP-OA value
 *
 * @author david@tekeshe.com
 *
 */
public interface SM_RP_OA extends Serializable {

    ISDNAddressString getMsisdn();

    AddressString getServiceCentreAddressOA();

}

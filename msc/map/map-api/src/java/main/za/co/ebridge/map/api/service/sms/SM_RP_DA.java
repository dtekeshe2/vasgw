/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.LMSI;

/**
 * SM-RP-DA ::= CHOICE { imsi [0] IMSI, lmsi [1] LMSI, serviceCentreAddressDA [4] AddressString, noSM-RP-DA [5] NULL}
 *
 * Only one method getIMSI(), getLMSI() or getServiceCentreAddressDA() will return the non null value If all these methods
 * return null - this means noSM-RP-DA value
 *
 * @author david@tekeshe.com
 *
 */
public interface SM_RP_DA extends Serializable {

    IMSI getIMSI();

    LMSI getLMSI();

    AddressString getServiceCentreAddressDA();

}

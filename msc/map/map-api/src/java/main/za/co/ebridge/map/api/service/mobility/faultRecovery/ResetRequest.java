/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.faultRecovery;

import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.NetworkResource;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V1-2:
 *
 * reset OPERATION ::= { --Timer m ARGUMENT ResetArg CODE local:37 }
 *
 * ResetArg ::= SEQUENCE { networkResource NetworkResource OPTIONAL, -- networkResource must be present in version 1 --
 * networkResource must be absent in version greater 1
 *
 * hlr-Number ISDN-AddressString, hlr-List HLR-List OPTIONAL, ...}
 *
 * HLR-List ::= SEQUENCE SIZE (1..50) OF HLR-Id
 *
 * HLR-Id ::= IMSI -- leading digits of IMSI, i.e. (MCC, MNC, leading digits of -- MSIN) forming HLR Id defined in TS 3GPP TS
 * 23.003 [17].
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ResetRequest extends MobilityMessage {

    NetworkResource getNetworkResource();

    ISDNAddressString getHlrNumber();

    ArrayList<IMSI> getHlrList();

}

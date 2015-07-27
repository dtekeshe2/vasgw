/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 *
 RelocationNumber ::= SEQUENCE { handoverNumber ISDN-AddressString, rab-Id RAB-Id, -- RAB Identity is needed to relate the
 * calls with the radio access bearers. ...}
 *
 * RAB-Id ::= INTEGER (1..255)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RelocationNumber extends Serializable {

    ISDNAddressString getHandoverNumber();

    Integer getRABId();

}

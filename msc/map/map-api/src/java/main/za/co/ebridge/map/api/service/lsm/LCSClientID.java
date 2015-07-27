/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.APN;

/**
 * LCS-ClientID ::= SEQUENCE { lcsClientType [0] LCSClientType, lcsClientExternalID [1] LCSClientExternalID OPTIONAL,
 * lcsClientDialedByMS [2] AddressString OPTIONAL, lcsClientInternalID [3] LCSClientInternalID OPTIONAL, lcsClientName [4]
 * LCSClientName OPTIONAL, ..., lcsAPN [5] APN OPTIONAL, lcsRequestorID [6] LCSRequestorID OPTIONAL }
 *
 * @author amit bhayani
 *
 */
public interface LCSClientID extends Serializable {
    LCSClientType getLCSClientType();

    LCSClientExternalID getLCSClientExternalID();

    AddressString getLCSClientDialedByMS();

    LCSClientInternalID getLCSClientInternalID();

    LCSClientName getLCSClientName();

    APN getLCSAPN();

    LCSRequestorID getLCSRequestorID();

}
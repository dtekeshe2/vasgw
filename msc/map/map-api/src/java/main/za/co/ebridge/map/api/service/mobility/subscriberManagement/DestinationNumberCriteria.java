/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 *
 DestinationNumberCriteria ::= SEQUENCE { matchType [0] MatchType, destinationNumberList [1] DestinationNumberList OPTIONAL,
 * destinationNumberLengthList [2] DestinationNumberLengthList OPTIONAL, -- one or both of destinationNumberList and
 * destinationNumberLengthList -- shall be present ...}
 *
 * DestinationNumberList ::= SEQUENCE SIZE (1..10) OF ISDN-AddressString -- The receiving entity shall not check the format of a
 * number in -- the dialled number list
 *
 * DestinationNumberLengthList ::= SEQUENCE SIZE (1..3) OF INTEGER(1..15)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface DestinationNumberCriteria extends Serializable {

    MatchType getMatchType();

    ArrayList<ISDNAddressString> getDestinationNumberList();

    ArrayList<Integer> getDestinationNumberLengthList();

}

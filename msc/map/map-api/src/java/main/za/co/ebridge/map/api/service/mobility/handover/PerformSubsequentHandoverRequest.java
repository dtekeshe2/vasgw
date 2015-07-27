/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.GlobalCellId;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V1:
 *
 * PerformSubsequentHandover ::= OPERATION --Timer m ARGUMENT performSubsequentHO-Arg PerformSubsequentHO-Arg RESULT
 * accessSignalInfo ExternalSignalInfo ERRORS { UnexpectedDataValue, UnknownBaseStation, UnknownMSC, InvalidTargetBaseStation,
 * SubsequentHandoverFailure}
 *
 * PerformSubsequentHO-Arg ::= SEQUENCE { targetCellId GlobalCellId, servingCellId GlobalCellId, targetMSC-Number
 * ISDN-AddressString, classmarkInfo [10] ClassmarkInfo OPTIONAL}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PerformSubsequentHandoverRequest extends MobilityMessage {

    GlobalCellId getTargetCellId();

    GlobalCellId getServingCellId();

    ISDNAddressString getTargetMSCNumber();

    ClassmarkInfo getClassmarkInfo();

}

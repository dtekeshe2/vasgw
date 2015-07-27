/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.GlobalCellId;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V1: PerformHandover ::= OPERATION --Timer s ARGUMENT performHO-Arg PerformHO-Arg RESULT performHO-Res PerformHO-Res
 * ERRORS { SystemFailure, UnexpectedDataValue, UnknownBaseStation, InvalidTargetBaseStation, NoRadioResourceAvailable,
 * NoHandoverNumberAvailable}
 *
 * MAP V1: PerformHO-Arg ::= SEQUENCE { 146 targetCellId GlobalCellId, servingCellId GlobalCellId, channelType ChannelType,
 * classmarkInfo ClassmarkInfo, handoverPriority [11] HandoverPriority OPTIONAL, kc [12] Kc OPTIONAL}
 *
 * Kc ::= octet STRING (SIZE (8))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PerformHandoverRequest extends MobilityMessage {

    GlobalCellId getTargetCellId();

    GlobalCellId getServingCellId();

    ChannelType getChannelType();

    ClassmarkInfo getClassmarkInfo();

    HandoverPriority getHandoverPriority();

    byte[] getKc();

}

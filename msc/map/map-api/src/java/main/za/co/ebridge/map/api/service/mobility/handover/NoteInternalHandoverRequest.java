/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.GlobalCellId;

/**
 *
 MAP V1: NoteInternalHandover ::= OPERATION --Timer s ARGUMENT noteInternalHO-Arg NoteInternalHO-Arg
 *
 * MAP V1: NoteInternalHO-Arg ::= SEQUENCE { handoverType HandoverType, targetCellId [1] GlobalCellId OPTIONAL, channelId [2]
 * ExternalSignalInfo OPTIONAL}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface NoteInternalHandoverRequest extends Serializable {

    HandoverType getHandoverType();

    GlobalCellId getServingCellId();

    ExternalSignalInfo getChannelId();

}

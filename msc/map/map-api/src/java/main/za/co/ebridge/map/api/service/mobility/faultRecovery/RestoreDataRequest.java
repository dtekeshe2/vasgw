/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.faultRecovery;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;
import za.co.ebridge.map.api.service.mobility.locationManagement.VLRCapability;

/**
 * <p>
 * The VLR uses MAP RD when it needs to reload its subscription data. The RD procedure is not triggered by subscriber action,
 * such as registration in MSC. The handling of the RD procedure is similar to the handling of the location update procedure.
 * That is, the VLR indicates to HLR which CAMEL capability is supported in the VLR, so the HLR can decide whether it can send
 * CAMEL data to the VLR for that subscriber
 * </p>
 *
 * MAP V2-3:
 *
 * MAP V3: restoreData OPERATION ::= { --Timer m ARGUMENT RestoreDataArg RESULT RestoreDataRes ERRORS { systemFailure |
 * dataMissing | unexpectedDataValue | unknownSubscriber} CODE local:57 }
 *
 * MAP V2: RestoreData ::= OPERATION--Timer m ARGUMENT restoreDataArg RestoreDataArg RESULT restoreDataRes RestoreDataRes ERRORS
 * { SystemFailure, DataMissing, UnexpectedDataValue, UnknownSubscriber}
 *
 * MAP V3: RestoreDataArg ::= SEQUENCE { imsi IMSI, lmsi LMSI OPTIONAL, extensionContainer ExtensionContainer OPTIONAL, ... ,
 * vlr-Capability [6] VLR-Capability OPTIONAL, restorationIndicator [7] NULL OPTIONAL }
 *
 * MAP V2: RestoreDataArg ::= SEQUENCE { imsi IMSI, lmsi LMSI OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RestoreDataRequest extends MobilityMessage {

    IMSI getImsi();

    LMSI getLmsi();

    VLRCapability getVLRCapability();

    MAPExtensionContainer getExtensionContainer();

    boolean getRestorationIndicator();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.AccessNetworkSignalInfo;
import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.GlobalCellId;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V2-3:
 *
 * MAP V3: prepareSubsequentHandover OPERATION ::= { --Timer m ARGUMENT PrepareSubsequentHO-Arg RESULT PrepareSubsequentHO-Res
 * ERRORS { unexpectedDataValue | dataMissing | unknownMSC | subsequentHandoverFailure} CODE local:69 }
 *
 * MAP V2: PrepareSubsequentHandover ::= OPERATION --Timer m ARGUMENT prepareSubsequentHO-Arg PrepareSubsequentHO-Arg RESULT
 * bss-APDU ExternalSignalInfo 191 ERRORS { UnexpectedDataValue, DataMissing, UnknownMSC, SubsequentHandoverFailure}
 *
 * MAP V3: PrepareSubsequentHO-Arg ::= [3] SEQUENCE { targetCellId [0] GlobalCellId OPTIONAL, targetMSC-Number [1]
 * ISDN-AddressString, targetRNCId [2] RNCId OPTIONAL, an-APDU [3] AccessNetworkSignalInfo OPTIONAL, selectedRab-Id [4] RAB-Id
 * OPTIONAL, extensionContainer [5] ExtensionContainer OPTIONAL, ..., geran-classmark [6] GERAN-Classmark OPTIONAL,
 * rab-ConfigurationIndicator [7] NULL OPTIONAL }
 *
 * MAP V2: PrepareSubsequentHO-Arg ::= SEQUENCE { targetCellId GlobalCellId, targetMSC-Number ISDN-AddressString, bss-APDU
 * ExternalSignalInfo, ...}
 *
 * RAB-Id ::= INTEGER (1..255)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PrepareSubsequentHandoverRequest extends MobilityMessage {

    GlobalCellId getTargetCellId();

    ISDNAddressString getTargetMSCNumber();

    RNCId getTargetRNCId();

    AccessNetworkSignalInfo getAnAPDU();

    Integer getSelectedRabId();

    MAPExtensionContainer getExtensionContainer();

    GERANClassmark getGERANClassmark();

    boolean getRabConfigurationIndicator();

    // MAP V2
    ExternalSignalInfo getBssAPDU();

}

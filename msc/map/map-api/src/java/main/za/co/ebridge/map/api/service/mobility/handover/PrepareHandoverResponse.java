/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.AccessNetworkSignalInfo;
import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V3: PrepareHO-Res ::= [3] SEQUENCE { handoverNumber [0] ISDN-AddressString OPTIONAL, relocationNumberList [1]
 * RelocationNumberList OPTIONAL, an-APDU [2] AccessNetworkSignalInfo OPTIONAL, multicallBearerInfo [3] MulticallBearerInfo
 * OPTIONAL, multipleBearerNotSupported NULL OPTIONAL, selectedUMTS-Algorithms [5] SelectedUMTS-Algorithms OPTIONAL,
 * chosenRadioResourceInformation [6] ChosenRadioResourceInformation OPTIONAL, extensionContainer [4] ExtensionContainer
 * OPTIONAL, ..., iuSelectedCodec [7] Codec OPTIONAL, iuAvailableCodecsList [8] CodecList OPTIONAL, aoipSelectedCodecTarget [9]
 * AoIPCodec OPTIONAL, aoipAvailableCodecsListMap [10] AoIPCodecsList OPTIONAL }
 *
 * MAP V2: PrepareHO-Res ::= SEQUENCE { handoverNumber ISDN-AddressString OPTIONAL, bss-APDU ExternalSignalInfo OPTIONAL, ...}
 *
 * RelocationNumberList ::= SEQUENCE SIZE (1..7) OF RelocationNumber
 *
 * MulticallBearerInfo ::= INTEGER (1..7)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PrepareHandoverResponse extends MobilityMessage {

    ISDNAddressString getHandoverNumber();

    ArrayList<RelocationNumber> getRelocationNumberList();

    AccessNetworkSignalInfo getAnAPDU();

    Integer getMulticallBearerInfo();

    boolean getMultipleBearerNotSupported();

    SelectedUMTSAlgorithms getSelectedUMTSAlgorithms();

    ChosenRadioResourceInformation getChosenRadioResourceInformation();

    MAPExtensionContainer getExtensionContainer();

    Codec getIuSelectedCodec();

    CodecList getIuAvailableCodecsList();

    AoIPCodec getAoipSelectedCodecTarget();

    AoIPCodecsList getAoipAvailableCodecsListMap();

    // this parameter is for MAP V2 only
    ExternalSignalInfo getBssAPDU();

}

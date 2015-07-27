/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.LAIFixedLength;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.TMSI;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V2-3:
 *
 * MAP V3: sendIdentification OPERATION ::= { --Timer s ARGUMENT SendIdentificationArg RESULT SendIdentificationRes ERRORS {
 * dataMissing | unidentifiedSubscriber} CODE local:55 }
 *
 * MAP V2: SendIdentification::= OPERATION --Timer s ARGUMENT tmsi TMSI RESULT sendIdentificationRes SendIdentificationRes
 * ERRORS { DataMissing, UnidentifiedSubscriber}
 *
 *
 * MAP V3: SendIdentificationArg ::= SEQUENCE { tmsi TMSI, numberOfRequestedVectors NumberOfRequestedVectors OPTIONAL, -- within
 * a dialogue numberOfRequestedVectors shall be present in -- the first service request and shall not be present in subsequent
 * service requests. -- If received in a subsequent service request it shall be discarded. segmentationProhibited NULL OPTIONAL,
 * extensionContainer ExtensionContainer OPTIONAL, ..., msc-Number ISDN-AddressString OPTIONAL, previous-LAI [0] LAIFixedLength
 * OPTIONAL, hopCounter [1] HopCounter OPTIONAL, mtRoamingForwardingSupported [2] NULL OPTIONAL, newVLR-Number [3]
 * ISDN-AddressString OPTIONAL, new-lmsi [4] LMSI OPTIONAL }
 *
 * NumberOfRequestedVectors ::= INTEGER (1..5) HopCounter ::= INTEGER (0..3)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendIdentificationRequest extends MobilityMessage {

    TMSI getTmsi();

    Integer getNumberOfRequestedVectors();

    boolean getSegmentationProhibited();

    MAPExtensionContainer getExtensionContainer();

    ISDNAddressString getMscNumber();

    LAIFixedLength getPreviousLAI();

    Integer getHopCounter();

    boolean getMtRoamingForwardingSupported();

    ISDNAddressString getNewVLRNumber();

    LMSI getNewLmsi();

}

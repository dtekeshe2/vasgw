/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 EPS-SubscriptionData ::= SEQUENCE { apn-oi-Replacement [0] APN-OI-Replacement OPTIONAL, -- this apn-oi-Replacement refers to
 * the UE level apn-oi-Replacement. rfsp-id [2] RFSP-ID OPTIONAL, ambr [3] AMBR OPTIONAL, apn-ConfigurationProfile [4]
 * APN-ConfigurationProfile OPTIONAL, stn-sr [6] ISDN-AddressString OPTIONAL, extensionContainer [5] ExtensionContainer
 * OPTIONAL, ..., mps-CSPriority [7] NULL OPTIONAL, mps-EPSPriority [8] NULL OPTIONAL } -- mps-CSPriority by its presence
 * indicates that the UE is subscribed to the eMLPP in -- the CS domain, referring to the 3GPP TS 29.272 [144] for details. --
 * mps-EPSPriority by its presence indicates that the UE is subscribed to the MPS in -- the EPS domain, referring to the 3GPP TS
 * 29.272 [144] for details.
 *
 * RFSP-ID ::= INTEGER (1..256)
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EPSSubscriptionData extends Serializable {

    APNOIReplacement getApnOiReplacement();

    Integer getRfspId();

    AMBR getAmbr();

    APNConfigurationProfile getAPNConfigurationProfile();

    ISDNAddressString getStnSr();

    MAPExtensionContainer getExtensionContainer();

    boolean getMpsCSPriority();

    boolean getMpsEPSPriority();

}

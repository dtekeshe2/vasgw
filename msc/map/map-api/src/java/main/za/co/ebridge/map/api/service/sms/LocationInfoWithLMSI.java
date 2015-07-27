/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.AdditionalNumberType;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 * LocationInfoWithLMSI ::= SEQUENCE { networkNode-Number [1] ISDN-AddressString, lmsi LMSI OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ..., gprsNodeIndicator [5] NULL OPTIONAL, -- gprsNodeIndicator is set only if the SGSN number is
 * sent as the -- Network Node Number additional-Number [6] Additional-Number OPTIONAL -- NetworkNode-number can be either
 * msc-number or sgsn-number }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface LocationInfoWithLMSI extends Serializable {

    ISDNAddressString getNetworkNodeNumber();

    LMSI getLMSI();

    MAPExtensionContainer getExtensionContainer();

    AdditionalNumberType getAdditionalNumberType();

    ISDNAddressString getAdditionalNumber();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 ODB-Data ::= SEQUENCE { odb-GeneralData ODB-GeneralData, odb-HPLMN-Data ODB-HPLMN-Data OPTIONAL, extensionContainer
 * ExtensionContainer OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ODBData extends Serializable {

    ODBGeneralData getODBGeneralData();

    ODBHPLMNData getOdbHplmnData();

    MAPExtensionContainer getExtensionContainer();

}

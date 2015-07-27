/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.aspsm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;
import za.co.ebridge.m3ua.api.parameter.InfoString;

/**
 * The ASP Up message is used to indicate to a remote M3UA peer that the adaptation layer is ready to receive any ASPSM/ASPTM
 * messages for all Routing Keys that the ASP is configured to serve. Both ASP Identifier and INFO String are optional
 *
 * @author amit bhayani
 *
 */
public interface ASPUp extends M3UAMessage {

    ASPIdentifier getASPIdentifier();

    void setASPIdentifier(ASPIdentifier aspId);

    InfoString getInfoString();

    void setInfoString(InfoString str);
}

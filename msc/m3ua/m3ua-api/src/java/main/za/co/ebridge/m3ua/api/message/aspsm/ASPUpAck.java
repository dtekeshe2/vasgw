/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.aspsm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.ASPIdentifier;
import za.co.ebridge.m3ua.api.parameter.InfoString;

/**
 * The ASP UP Ack message is used to acknowledge an ASP Up message received from a remote M3UA peer. Both ASP Identifier and
 * INFO String are optional
 *
 * @author amit bhayani
 *
 */
public interface ASPUpAck extends M3UAMessage {

    ASPIdentifier getASPIdentifier();

    void setASPIdentifier(ASPIdentifier aspId);

    InfoString getInfoString();

    void setInfoString(InfoString str);
}

/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.aspsm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.InfoString;

/**
 * The ASP Down Ack message is used to acknowledge an ASP Down message received from a remote M3UA peer.
 *
 * @author amit bhayani
 *
 */
public interface ASPDownAck extends M3UAMessage {

    InfoString getInfoString();

    void setInfoString(InfoString str);

}

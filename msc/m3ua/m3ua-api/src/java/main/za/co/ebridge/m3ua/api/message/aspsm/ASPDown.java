/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.aspsm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.InfoString;

/**
 * The ASP Down message is used to indicate to a remote M3UA peer that the adaptation layer is NOT ready to receive DATA, SSNM,
 * RKM, or ASPTM messages.
 *
 * @author amit bhayani
 *
 */
public interface ASPDown extends M3UAMessage {

    InfoString getInfoString();

    void setInfoString(InfoString str);

}

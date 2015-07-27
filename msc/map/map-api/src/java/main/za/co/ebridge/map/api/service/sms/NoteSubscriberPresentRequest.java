/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.primitives.IMSI;

/**
 *
 MAP V1: NoteSubscriberPresent ::= OPERATION --Timer s ARGUMENT imsi IMSI
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface NoteSubscriberPresentRequest extends SmsMessage {

    IMSI getIMSI();

}

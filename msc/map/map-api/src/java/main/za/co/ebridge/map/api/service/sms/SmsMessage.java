/* eBridge SS7 */

package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.MAPMessage;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface SmsMessage extends MAPMessage {

    MAPDialogSms getMAPDialog();

}

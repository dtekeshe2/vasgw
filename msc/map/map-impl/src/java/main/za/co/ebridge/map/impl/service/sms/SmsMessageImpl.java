/* eBridge SS7 */

package za.co.ebridge.map.impl.service.sms;

import za.co.ebridge.map.impl.MessageImpl;
import za.co.ebridge.map.api.service.sms.MAPDialogSms;
import za.co.ebridge.map.api.service.sms.SmsMessage;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 *
 * @author david@tekeshe.com
 *
 */
public abstract class SmsMessageImpl extends MessageImpl implements SmsMessage, MAPAsnPrimitive {

    @Override
    public MAPDialogSms getMAPDialog() {
        return (MAPDialogSms) super.getMAPDialog();
    }

}

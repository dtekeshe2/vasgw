/* eBridge SS7 */

package za.co.ebridge.map.impl.service.callhandling;

import za.co.ebridge.map.impl.MessageImpl;
import za.co.ebridge.map.api.service.callhandling.CallHandlingMessage;
import za.co.ebridge.map.api.service.callhandling.MAPDialogCallHandling;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/*
 *
 * @author cristian veliscu
 *
 */
public abstract class CallHandlingMessageImpl extends MessageImpl implements CallHandlingMessage, MAPAsnPrimitive {

    @Override
    public MAPDialogCallHandling getMAPDialog() {
        return (MAPDialogCallHandling) super.getMAPDialog();
    }
}
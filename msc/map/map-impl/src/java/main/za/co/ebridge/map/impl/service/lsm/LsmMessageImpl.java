/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import za.co.ebridge.map.impl.MessageImpl;
import za.co.ebridge.map.api.service.lsm.LsmMessage;
import za.co.ebridge.map.api.service.lsm.MAPDialogLsm;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 * @author amit bhayani
 *
 */
public abstract class LsmMessageImpl extends MessageImpl implements LsmMessage, MAPAsnPrimitive {

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.LsmMessage#getMAPDialog()
     */
    @Override
    public MAPDialogLsm getMAPDialog() {
        return (MAPDialogLsm) super.getMAPDialog();
    }

}

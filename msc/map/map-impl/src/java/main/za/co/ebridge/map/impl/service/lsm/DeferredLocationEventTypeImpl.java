/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import za.co.ebridge.map.api.service.lsm.DeferredLocationEventType;
import za.co.ebridge.map.impl.primitives.BitStringBase;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class DeferredLocationEventTypeImpl extends BitStringBase implements DeferredLocationEventType {

    private static final int _INDEX_MS_AVAILABLE = 0;
    private static final int _INDEX__ENTERING_INTO_AREA = 1;
    private static final int _INDEX_LEAVING_FROM_AREA = 2;
    private static final int _INDEX_BEING_INSIDE_AREA = 3;

    public DeferredLocationEventTypeImpl() {
        super(1, 16, 4, "DeferredLocationEventType");
    }

    public DeferredLocationEventTypeImpl(boolean msAvailable, boolean enteringIntoArea, boolean leavingFromArea,
            boolean beingInsideArea) {
        super(1, 16, 4, "DeferredLocationEventType");

        if (msAvailable)
            this.bitString.set(_INDEX_MS_AVAILABLE);
        if (enteringIntoArea)
            this.bitString.set(_INDEX__ENTERING_INTO_AREA);
        if (leavingFromArea)
            this.bitString.set(_INDEX_LEAVING_FROM_AREA);
        if (beingInsideArea)
            this.bitString.set(_INDEX_BEING_INSIDE_AREA);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.DeferredLocationEventType#getMsAvailable()
     */
    public boolean getMsAvailable() {
        return this.bitString.get(_INDEX_MS_AVAILABLE);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.DeferredLocationEventType#getEnteringIntoArea()
     */
    public boolean getEnteringIntoArea() {
        return this.bitString.get(_INDEX__ENTERING_INTO_AREA);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.DeferredLocationEventType#getLeavingFromArea()
     */
    public boolean getLeavingFromArea() {
        return this.bitString.get(_INDEX_LEAVING_FROM_AREA);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api.service.lsm.DeferredLocationEventType#beingInsideArea()
     */
    public boolean getBeingInsideArea() {
        return this.bitString.get(_INDEX_BEING_INSIDE_AREA);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (getMsAvailable()) {
            sb.append("MsAvailable, ");
        }
        if (getEnteringIntoArea()) {
            sb.append("EnteringIntoArea, ");
        }
        if (getLeavingFromArea()) {
            sb.append("LeavingFromArea, ");
        }
        if (getBeingInsideArea()) {
            sb.append("BeingInsideArea, ");
        }

        sb.append("]");

        return sb.toString();
    }
}

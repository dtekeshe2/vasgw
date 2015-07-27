/* eBridge SS7 */

package za.co.ebridge.map.impl.service.supplementary;

import za.co.ebridge.map.api.service.supplementary.SSStatus;
import za.co.ebridge.map.impl.primitives.OctetStringLength1Base;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class SSStatusImpl extends OctetStringLength1Base implements SSStatus {

    public static final int _mask_QBit = 0x08;
    public static final int _mask_PBit = 0x04;
    public static final int _mask_RBit = 0x02;
    public static final int _mask_ABit = 0x01;

    public SSStatusImpl() {
        super("SSStatus");
    }

    public SSStatusImpl(int data) {
        super("SSStatus", data);
    }

    public SSStatusImpl(boolean qBit, boolean pBit, boolean rBit, boolean aBit) {
        super("SSStatus", (qBit ? _mask_QBit : 0) + (pBit ? _mask_PBit : 0) + (rBit ? _mask_RBit : 0) + (aBit ? _mask_ABit : 0));
    }

    public int getData() {
        return data;
    }

    public boolean getQBit() {
        return (this.data & _mask_QBit) != 0;
    }

    public boolean getPBit() {
        return (this.data & _mask_PBit) != 0;
    }

    public boolean getRBit() {
        return (this.data & _mask_RBit) != 0;
    }

    public boolean getABit() {
        return (this.data & _mask_ABit) != 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.getQBit()) {
            sb.append("QBit");
            sb.append(", ");
        }
        if (this.getPBit()) {
            sb.append("PBit");
            sb.append(", ");
        }
        if (this.getRBit()) {
            sb.append("RBit");
            sb.append(", ");
        }
        if (this.getABit()) {
            sb.append("ABit");
            sb.append(", ");
        }
        sb.append("]");

        return sb.toString();
    }

}

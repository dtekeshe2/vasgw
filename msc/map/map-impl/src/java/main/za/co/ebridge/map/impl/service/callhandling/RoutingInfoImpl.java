/* eBridge SS7 */

package za.co.ebridge.map.impl.service.callhandling;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.callhandling.ForwardingData;
import za.co.ebridge.map.api.service.callhandling.RoutingInfo;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/*
 *
 * @author cristian veliscu
 *
 */
public class RoutingInfoImpl implements RoutingInfo, MAPAsnPrimitive {
    private ISDNAddressString roamingNumber = null;
    private ForwardingData forwardingData = null;

    private static final String _PrimitiveName = "RoutingInfo";

    public RoutingInfoImpl() {
    }

    public RoutingInfoImpl(ISDNAddressString roamingNumber) {
        this.roamingNumber = roamingNumber;
    }

    public RoutingInfoImpl(ForwardingData forwardingData) {
        this.forwardingData = forwardingData;
    }

    @Override
    public ISDNAddressString getRoamingNumber() {
        return this.roamingNumber;
    }

    @Override
    public ForwardingData getForwardingData() {
        return this.forwardingData;
    }

    @Override
    public int getTag() throws MAPException {
        if (roamingNumber != null)
            return Tag.STRING_OCTET;
        return Tag.SEQUENCE;
    }

    @Override
    public int getTagClass() {
        if (roamingNumber != null)
            return Tag.CLASS_UNIVERSAL;
        return Tag.CLASS_UNIVERSAL;
    }

    @Override
    public boolean getIsPrimitive() {
        if (roamingNumber != null)
            return true;
        return false;
    }

    @Override
    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {
        try {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    @Override
    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {
        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding " + _PrimitiveName + ": " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ais, int length) throws MAPParsingComponentException, IOException, AsnException {
        this.roamingNumber = null;
        this.forwardingData = null;

        int tag = ais.getTag();
        if (ais.getTagClass() == Tag.CLASS_UNIVERSAL) {
            switch (tag) {
                case Tag.STRING_OCTET:
                    this.roamingNumber = new ISDNAddressStringImpl();
                    ((ISDNAddressStringImpl) this.roamingNumber).decodeData(ais, length);
                    break;
                case Tag.SEQUENCE:
                    this.forwardingData = new ForwardingDataImpl();
                    ((ForwardingDataImpl) this.forwardingData).decodeData(ais, length);
                    break;
                default:
                    throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": bad choice tagNumber",
                            MAPParsingComponentExceptionReason.MistypedParameter);
            }
        } else {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": bad choice tagClass",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        }
    }

    @Override
    public void encodeAll(AsnOutputStream asnOs) throws MAPException {
        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

    @Override
    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {
        try {
            asnOs.writeTag(tagClass, this.getIsPrimitive(), tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws MAPException {
        if (this.roamingNumber == null && this.forwardingData == null)
            throw new MAPException("Both roamingNumber and forwardingData must not be null");
        if (this.roamingNumber != null && this.forwardingData != null)
            throw new MAPException("Both roamingNumber and forwardingData must not be not null");

        if (this.roamingNumber != null) {
            ((ISDNAddressStringImpl) this.roamingNumber).encodeData(asnOs);
        } else {
            ((ForwardingDataImpl) this.forwardingData).encodeData(asnOs);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.roamingNumber != null) {
            sb.append(this.roamingNumber.toString());
        } else if (this.forwardingData != null) {
            sb.append(this.forwardingData.toString());
        }

        sb.append("]");
        return sb.toString();
    }
}
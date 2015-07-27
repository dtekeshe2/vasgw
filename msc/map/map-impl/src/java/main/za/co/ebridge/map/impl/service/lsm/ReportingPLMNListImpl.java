/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import java.io.IOException;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.lsm.ReportingPLMN;
import za.co.ebridge.map.api.service.lsm.ReportingPLMNList;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class ReportingPLMNListImpl implements ReportingPLMNList, MAPAsnPrimitive {

    public static final int _ID_plmnListPrioritized = 0;
    public static final int _ID_plmnList = 1;

    public static final String _PrimitiveName = "ReportingPLMNList";

    private boolean plmnListPrioritized;
    private ArrayList<ReportingPLMN> plmnList;

    public ReportingPLMNListImpl() {
    }

    public ReportingPLMNListImpl(boolean plmnListPrioritized, ArrayList<ReportingPLMN> plmnList) {
        this.plmnListPrioritized = plmnListPrioritized;
        this.plmnList = plmnList;
    }

    public boolean getPlmnListPrioritized() {
        return plmnListPrioritized;
    }

    public ArrayList<ReportingPLMN> getPlmnList() {
        return plmnList;
    }

    public int getTag() throws MAPException {
        return Tag.SEQUENCE;
    }

    public int getTagClass() {
        return Tag.CLASS_UNIVERSAL;
    }

    public boolean getIsPrimitive() {
        return false;
    }

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

    private void _decode(AsnInputStream ansIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.plmnListPrioritized = false;
        this.plmnList = null;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC) {

                switch (tag) {
                    case _ID_plmnListPrioritized:
                        if (!ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " plmnListPrioritized: Parameter is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        ais.readNull();
                        this.plmnListPrioritized = true;
                        break;
                    case _ID_plmnList:
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + " plmnList: Parameter is primitive", MAPParsingComponentExceptionReason.MistypedParameter);

                        this.plmnList = new ArrayList<ReportingPLMN>();
                        AsnInputStream ais2 = ais.readSequenceStream();
                        while (true) {
                            if (ais2.available() == 0)
                                break;

                            int tag2 = ais2.readTag();
                            if (tag2 != Tag.SEQUENCE || ais2.getTagClass() != Tag.CLASS_UNIVERSAL || ais2.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ": bad ReportingPLMN tag or tagClass or is primitive ",
                                        MAPParsingComponentExceptionReason.MistypedParameter);

                            ReportingPLMNImpl el = new ReportingPLMNImpl();
                            el.decodeAll(ais2);
                            this.plmnList.add(el);
                        }
                        break;

                    default:
                        ais.advanceElement();
                        break;
                }
            } else {
                ais.advanceElement();
            }
        }

        if (plmnList == null) {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament plmnList is mandatory but does not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        if (this.plmnList.size() < 1 || this.plmnList.size() > 20) {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament plmnList size must be from 1 to 20, found: " + this.plmnList.size(),
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void encodeAll(AsnOutputStream asnOs) throws MAPException {

        this.encodeAll(asnOs, this.getTagClass(), this.getTag());
    }

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

    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.plmnList == null)
            throw new MAPException("plmnList parameter must not be null");
        if (this.plmnList.size() < 1 || this.plmnList.size() > 20)
            throw new MAPException("plmnList size must be from 1 to 20, found: " + this.plmnList.size());

        try {
            if (this.plmnListPrioritized) {
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _ID_plmnListPrioritized);
            }

            asnOs.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _ID_plmnList);
            int pos = asnOs.StartContentDefiniteLength();
            for (ReportingPLMN ri : this.plmnList) {
                if (ri != null) {
                    ReportingPLMNImpl rii = (ReportingPLMNImpl) ri;
                    rii.encodeAll(asnOs);
                }
            }
            asnOs.FinalizeContent(pos);
        } catch (IOException e) {
            throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.plmnListPrioritized) {
            sb.append("plmnListPrioritized");
        }

        if (this.plmnList != null) {
            sb.append(", plmnList= [");
            for (ReportingPLMN ri : this.plmnList) {
                sb.append("ReportingPLMN=");
                sb.append(ri);
                sb.append(", ");
            }
            sb.append("]");
        }

        sb.append("]");

        return sb.toString();
    }
}

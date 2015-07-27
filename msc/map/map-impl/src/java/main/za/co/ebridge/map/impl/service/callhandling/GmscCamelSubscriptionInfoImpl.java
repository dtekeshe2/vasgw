/* eBridge SS7 */

package za.co.ebridge.map.impl.service.callhandling;

import java.io.IOException;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.callhandling.GmscCamelSubscriptionInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OBcsmCamelTdpCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TBcsmCamelTdpCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TCSI;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.OCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.TCSIImpl;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class GmscCamelSubscriptionInfoImpl extends SequenceBase implements GmscCamelSubscriptionInfo {

    private static final int _TAG_t_CSI = 0;
    private static final int _TAG_o_CSI = 1;
    private static final int _TAG_extensionContainer = 2;
    private static final int _TAG_o_BcsmCamelTDP_CriteriaList = 3;
    private static final int _TAG_t_BCSM_CAMEL_TDP_CriteriaList = 4;
    private static final int _TAG_d_csi = 5;

    private TCSI tCsi;
    private OCSI oCsi;
    private MAPExtensionContainer extensionContainer;
    private ArrayList<OBcsmCamelTdpCriteria> oBcsmCamelTdpCriteriaList;
    private ArrayList<TBcsmCamelTdpCriteria> tBcsmCamelTdpCriteriaList;
    private DCSI dCsi;

    public GmscCamelSubscriptionInfoImpl() {
        super("GmscCamelSubscriptionInfo");
    }

    public GmscCamelSubscriptionInfoImpl(TCSI tCsi, OCSI oCsi, MAPExtensionContainer extensionContainer,
            ArrayList<OBcsmCamelTdpCriteria> oBcsmCamelTDPCriteriaList,
            ArrayList<TBcsmCamelTdpCriteria> tBcsmCamelTdpCriteriaList, DCSI dCsi) {
        super("GmscCamelSubscriptionInfo");

        this.tCsi = tCsi;
        this.oCsi = oCsi;
        this.extensionContainer = extensionContainer;
        this.oBcsmCamelTdpCriteriaList = oBcsmCamelTDPCriteriaList;
        this.tBcsmCamelTdpCriteriaList = tBcsmCamelTdpCriteriaList;
        this.dCsi = dCsi;
    }

    @Override
    public TCSI getTCsi() {
        return tCsi;
    }

    @Override
    public OCSI getOCsi() {
        return oCsi;
    }

    @Override
    public MAPExtensionContainer getMAPExtensionContainer() {
        return extensionContainer;
    }

    @Override
    public ArrayList<OBcsmCamelTdpCriteria> getOBcsmCamelTdpCriteriaList() {
        return oBcsmCamelTdpCriteriaList;
    }

    @Override
    public ArrayList<TBcsmCamelTdpCriteria> getTBcsmCamelTdpCriteriaList() {
        return tBcsmCamelTdpCriteriaList;
    }

    @Override
    public DCSI getDCsi() {
        return dCsi;
    }

    protected void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.tCsi = null;
        this.oCsi = null;
        this.extensionContainer = null;
        this.oBcsmCamelTdpCriteriaList = null;
        this.tBcsmCamelTdpCriteriaList = null;
        this.dCsi = null;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (ais.getTagClass()) {
                case Tag.CLASS_CONTEXT_SPECIFIC: {
                    switch (tag) {

                        case _TAG_t_CSI:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".t_CSI: Parameter is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            this.tCsi = new TCSIImpl();
                            ((TCSIImpl) this.tCsi).decodeAll(ais);
                            break;
                        case _TAG_o_CSI:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".o_CSI: Parameter is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            this.oCsi = new OCSIImpl();
                            ((OCSIImpl) this.oCsi).decodeAll(ais);
                            break;
                        case _TAG_extensionContainer:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".extensionContainer: Parameter extensionContainer is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            this.extensionContainer = new MAPExtensionContainerImpl();
                            ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                            break;
                        case _TAG_o_BcsmCamelTDP_CriteriaList:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".o_BcsmCamelTDP_CriteriaList: Parameter is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            // TODO: implement it
                            ais.advanceElement();
                            break;
                        case _TAG_t_BCSM_CAMEL_TDP_CriteriaList:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".o_BcsmCamelTDP_CriteriaList: Parameter is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            // TODO: implement it
                            ais.advanceElement();
                            break;
                        case _TAG_d_csi:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".o_BcsmCamelTDP_CriteriaList: Parameter is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            // TODO: implement it
                            ais.advanceElement();
                            break;
                        default:
                            ais.advanceElement();
                            break;
                    }
                }
                    break;
                default:
                    ais.advanceElement();
                    break;
            }
        }
    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws MAPException {
        if (this.tCsi != null)
            ((TCSIImpl) this.tCsi).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_t_CSI);

        if (this.oCsi != null)
            ((OCSIImpl) this.oCsi).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_o_CSI);

        if (this.extensionContainer != null)
            ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                    _TAG_extensionContainer);

        if (this.oBcsmCamelTdpCriteriaList != null) {
            // TODO: implement it
            // _TAG_o_BcsmCamelTDP_CriteriaList
        }
        if (this.tBcsmCamelTdpCriteriaList != null) {
            // TODO: implement it
            // _TAG_t_BCSM_CAMEL_TDP_CriteriaList
        }
        if (this.dCsi != null) {
            // TODO: implement it
            // _TAG_d_csi
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this._PrimitiveName);
        sb.append(" [");

        if (this.tCsi != null) {
            sb.append("tCsi=");
            sb.append(this.tCsi.toString());
        }
        if (this.oCsi != null) {
            sb.append(", oCsi=");
            sb.append(this.oCsi.toString());
        }
        if (this.extensionContainer != null) {
            sb.append(", extensionContainer=");
            sb.append(this.extensionContainer.toString());
        }

        if (this.oBcsmCamelTdpCriteriaList != null) {
            sb.append("oBcsmCamelTDPCriteriaList=[");
            for (OBcsmCamelTdpCriteria be : this.oBcsmCamelTdpCriteriaList) {
                sb.append(be.toString());
            }
            sb.append("]");
        }
        if (this.tBcsmCamelTdpCriteriaList != null) {
            sb.append("tBcsmCamelTdpCriteriaList=[");
            for (TBcsmCamelTdpCriteria be : this.tBcsmCamelTdpCriteriaList) {
                sb.append(be.toString());
            }
            sb.append("]");
        }

        if (this.dCsi != null) {
            sb.append(", dCsi=");
            sb.append(this.dCsi.toString());
        }

        sb.append("]");

        return sb.toString();
    }

}

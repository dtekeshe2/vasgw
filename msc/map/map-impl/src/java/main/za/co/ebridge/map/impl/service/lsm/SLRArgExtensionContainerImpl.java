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
import za.co.ebridge.map.api.primitives.MAPPrivateExtension;
import za.co.ebridge.map.api.service.lsm.SLRArgExtensionContainer;
import za.co.ebridge.map.api.service.lsm.SLRArgPCSExtensions;
import za.co.ebridge.map.impl.primitives.MAPPrivateExtensionImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

/**
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class SLRArgExtensionContainerImpl extends SequenceBase implements SLRArgExtensionContainer {

    private static final int _TAG_privateExtensionList = 0;
    private static final int _TAG_slr_Arg_PCS_Extensions = 1;

    private ArrayList<MAPPrivateExtension> privateExtensionList;
    private SLRArgPCSExtensions slrArgPcsExtensions;

    public SLRArgExtensionContainerImpl() {
        super("SLRArgExtensionContainer");
    }

    public SLRArgExtensionContainerImpl(ArrayList<MAPPrivateExtension> privateExtensionList,
            SLRArgPCSExtensions slrArgPcsExtensions) {
        super("SLRArgExtensionContainer");

        this.privateExtensionList = privateExtensionList;
        this.slrArgPcsExtensions = slrArgPcsExtensions;
    }

    public ArrayList<MAPPrivateExtension> getPrivateExtensionList() {
        return privateExtensionList;
    }

    public SLRArgPCSExtensions getSlrArgPcsExtensions() {
        return slrArgPcsExtensions;
    }

    protected void _decode(AsnInputStream ansIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.privateExtensionList = null;
        this.slrArgPcsExtensions = null;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC) {
                switch (tag) {
                    case _TAG_privateExtensionList:
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while " + _PrimitiveName
                                    + " decoding: privateExtensionList is primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        if (this.privateExtensionList != null)
                            throw new MAPParsingComponentException("Error while " + _PrimitiveName
                                    + " decoding: More than one PrivateExtensionList has found",
                                    MAPParsingComponentExceptionReason.MistypedParameter);

                        AsnInputStream localAis2 = ais.readSequenceStream();
                        this.privateExtensionList = new ArrayList<MAPPrivateExtension>();
                        while (localAis2.available() > 0) {
                            tag = localAis2.readTag();
                            if (tag != Tag.SEQUENCE || localAis2.getTagClass() != Tag.CLASS_UNIVERSAL
                                    || localAis2.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while " + _PrimitiveName
                                        + " decoding: Bad tag, tagClass or primitiveFactor of PrivateExtension",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            if (this.privateExtensionList.size() >= 10)
                                throw new MAPParsingComponentException("More then 10 " + _PrimitiveName
                                        + " found when PrivateExtensionList decoding",
                                        MAPParsingComponentExceptionReason.MistypedParameter);

                            MAPPrivateExtensionImpl privateExtension = new MAPPrivateExtensionImpl();
                            privateExtension.decodeAll(localAis2);
                            this.privateExtensionList.add(privateExtension);
                        }
                        break;

                    case _TAG_slr_Arg_PCS_Extensions:
                        if (ais.isTagPrimitive())
                            throw new MAPParsingComponentException("Error while " + _PrimitiveName
                                    + " decoding: slrArgPcsExtensions is primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        if (this.slrArgPcsExtensions != null)
                            throw new MAPParsingComponentException("Error while " + _PrimitiveName
                                    + " decoding: More than one slrArgPcsExtensions has found",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        this.slrArgPcsExtensions = new SLRArgPCSExtensionsImpl();
                        ((SLRArgPCSExtensionsImpl) this.slrArgPcsExtensions).decodeAll(ais);
                        break;

                    default:
                        ais.advanceElement();
                        break;
                }
            } else {
                ais.advanceElement();
            }
        }
    }

    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.privateExtensionList == null && this.slrArgPcsExtensions == null)
            throw new MAPException("Error when encoding " + _PrimitiveName
                    + ": Both PrivateExtensionList and slrArgPcsExtensions are empty when ExtensionContainer encoding");
        if (this.privateExtensionList != null
                && (this.privateExtensionList.size() == 0 || this.privateExtensionList.size() > 10))
            throw new MAPException("Error when encoding " + _PrimitiveName
                    + ": PrivateExtensionList must contains from 1 to 10 elements when ExtensionContainer encoding");

        try {

            if (this.privateExtensionList != null) {
                asnOs.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG_privateExtensionList);
                int pos2 = asnOs.StartContentDefiniteLength();

                for (MAPPrivateExtension pe : this.privateExtensionList) {
                    ((MAPPrivateExtensionImpl) pe).encodeAll(asnOs);
                }

                asnOs.FinalizeContent(pos2);
            }

            if (this.slrArgPcsExtensions != null) {
                ((SLRArgPCSExtensionsImpl) this.slrArgPcsExtensions).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                        _TAG_slr_Arg_PCS_Extensions);
            }
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.privateExtensionList != null && this.privateExtensionList.size() > 0) {
            sb.append("privateExtensionList [");
            for (MAPPrivateExtension pe : this.privateExtensionList) {
                sb.append(pe.toString());
                sb.append(", ");
            }
            sb.append("]");
        }

        if (this.slrArgPcsExtensions != null) {
            sb.append(", slrArgPcsExtensions=");
            sb.append(this.slrArgPcsExtensions);
        }

        sb.append("]");

        return sb.toString();
    }
}
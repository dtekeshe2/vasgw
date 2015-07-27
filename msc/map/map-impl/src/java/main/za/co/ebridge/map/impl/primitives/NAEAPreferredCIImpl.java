/* eBridge SS7 */
package za.co.ebridge.map.impl.primitives;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.NAEACIC;
import za.co.ebridge.map.api.primitives.NAEAPreferredCI;

/**
 *
 * @author Lasith Waruna Perera
 *
 */
public class NAEAPreferredCIImpl extends SequenceBase implements NAEAPreferredCI {

    public static final int _TAG_naeaPreferredCIC = 0;
    public static final int _TAG_extensionContainer = 1;

    private NAEACIC naeaPreferredCIC;
    private MAPExtensionContainer extensionContainer;

    public NAEAPreferredCIImpl() {
        super("NAEAPreferredCI");
    }

    public NAEAPreferredCIImpl(NAEACIC naeaPreferredCIC, MAPExtensionContainer extensionContainer) {
        super("NAEAPreferredCI");
        this.naeaPreferredCIC = naeaPreferredCIC;
        this.extensionContainer = extensionContainer;
    }

    @Override
    public NAEACIC getNaeaPreferredCIC() {
        return this.naeaPreferredCIC;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer() {
        return this.extensionContainer;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.naeaPreferredCIC = null;
        this.extensionContainer = null;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (ais.getTagClass()) {
                case Tag.CLASS_CONTEXT_SPECIFIC: {
                    switch (tag) {
                        case _TAG_naeaPreferredCIC:
                            if (!ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".naeaPreferredCIC: Parameter is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            this.naeaPreferredCIC = new NAEACICImpl();
                            ((NAEACICImpl) this.naeaPreferredCIC).decodeAll(ais);
                            break;
                        case _TAG_extensionContainer:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".extensionContainer: Parameter is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            this.extensionContainer = new MAPExtensionContainerImpl();
                            ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
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

        if (this.naeaPreferredCIC == null)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament naeaPreferredCIC is mandatory but does not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.naeaPreferredCIC == null)
            throw new MAPException("Error while encoding" + _PrimitiveName + ": naeaPreferredCIC must not be null");

        if (this.naeaPreferredCIC != null)
            ((NAEACICImpl) this.naeaPreferredCIC).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, _TAG_naeaPreferredCIC);

        if (this.extensionContainer != null)
            ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                    _TAG_extensionContainer);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.naeaPreferredCIC != null) {
            sb.append("naeaPreferredCIC=");
            sb.append(this.naeaPreferredCIC.toString());
            sb.append(", ");
        }

        if (this.extensionContainer != null) {
            sb.append("extensionContainer=");
            sb.append(this.extensionContainer.toString());
            sb.append(" ");
        }

        sb.append("]");

        return sb.toString();
    }

}

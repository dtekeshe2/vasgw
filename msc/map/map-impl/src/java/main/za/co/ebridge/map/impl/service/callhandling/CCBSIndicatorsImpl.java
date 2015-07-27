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
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.callhandling.CCBSIndicators;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

/**
 *
 * @author Lasith Waruna Perera
 *
 */
public class CCBSIndicatorsImpl extends SequenceBase implements CCBSIndicators {

    private static final int _TAG_ccbsPossible = 0;
    private static final int _TAG_keepCCBSCallIndicator = 1;
    private static final int _TAG_mapExtensionContainer = 2;

    private boolean ccbsPossible;
    private boolean keepCCBSCallIndicator;
    private MAPExtensionContainer mapExtensionContainer;

    public CCBSIndicatorsImpl() {
        super("CCBSIndicators");
    }

    public CCBSIndicatorsImpl(boolean ccbsPossible, boolean keepCCBSCallIndicator, MAPExtensionContainer mapExtensionContainer) {
        super("CCBSIndicators");
        this.ccbsPossible = ccbsPossible;
        this.keepCCBSCallIndicator = keepCCBSCallIndicator;
        this.mapExtensionContainer = mapExtensionContainer;
    }

    @Override
    public boolean getCCBSPossible() {
        return this.ccbsPossible;
    }

    @Override
    public boolean getKeepCCBSCallIndicator() {
        return this.keepCCBSCallIndicator;
    }

    @Override
    public MAPExtensionContainer getMAPExtensionContainer() {
        return this.mapExtensionContainer;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.ccbsPossible = false;
        this.keepCCBSCallIndicator = false;
        this.mapExtensionContainer = null;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (ais.getTagClass()) {
                case Tag.CLASS_CONTEXT_SPECIFIC: {
                    switch (tag) {
                        case _TAG_ccbsPossible:
                            if (!ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".ccbsPossible: Parameter is not primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            ais.readNull();
                            this.ccbsPossible = true;
                            break;
                        case _TAG_keepCCBSCallIndicator:
                            if (!ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".keepCCBSCallIndicator: Parameter is not primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            ais.readNull();
                            this.keepCCBSCallIndicator = true;
                            break;
                        case _TAG_mapExtensionContainer:
                            if (ais.isTagPrimitive())
                                throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                        + ".mapExtensionContainer: Parameter mapExtensionContainer is primitive",
                                        MAPParsingComponentExceptionReason.MistypedParameter);
                            this.mapExtensionContainer = new MAPExtensionContainerImpl();
                            ((MAPExtensionContainerImpl) this.mapExtensionContainer).decodeAll(ais);
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

        try {
            if (this.ccbsPossible)
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_ccbsPossible);

            if (this.keepCCBSCallIndicator)
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_keepCCBSCallIndicator);

            if (this.mapExtensionContainer != null)
                ((MAPExtensionContainerImpl) this.mapExtensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                        _TAG_mapExtensionContainer);

        } catch (IOException e) {
            throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.ccbsPossible) {
            sb.append("ccbsPossible, ");
        }

        if (this.keepCCBSCallIndicator) {
            sb.append("keepCCBSCallIndicator, ");
        }

        if (this.mapExtensionContainer != null) {
            sb.append("mapExtensionContainer=");
            sb.append(this.mapExtensionContainer.toString());
            sb.append(" ");
        }

        sb.append("]");

        return sb.toString();
    }

}

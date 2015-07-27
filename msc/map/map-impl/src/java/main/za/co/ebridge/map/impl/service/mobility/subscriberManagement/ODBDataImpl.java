package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBGeneralData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBHPLMNData;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class ODBDataImpl extends SequenceBase implements ODBData {

    private static final long serialVersionUID = 1L;

    private ODBGeneralData oDBGeneralData;
    private ODBHPLMNData odbHplmnData;
    private MAPExtensionContainer extensionContainer;

    public ODBDataImpl() {
        super("ODBData");
    }

    public ODBDataImpl(ODBGeneralData oDBGeneralData, ODBHPLMNData odbHplmnData, MAPExtensionContainer extensionContainer) {
        super("ODBData");
        this.oDBGeneralData = oDBGeneralData;
        this.odbHplmnData = odbHplmnData;
        this.extensionContainer = extensionContainer;
    }

    @Override
    public ODBGeneralData getODBGeneralData() {
        return this.oDBGeneralData;
    }

    @Override
    public ODBHPLMNData getOdbHplmnData() {
        return this.odbHplmnData;
    }

    @Override
    public MAPExtensionContainer getExtensionContainer() {
        return this.extensionContainer;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length) throws
            MAPParsingComponentException, IOException,
            AsnException
    {

        this.oDBGeneralData = null;
        this.odbHplmnData = null;
        this.extensionContainer = null;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        int num = 0;
        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (num) {
                case 0:
                    if (!ais.isTagPrimitive() || tag != Tag.STRING_BIT)
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".oDBGeneralData: bad tag or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.oDBGeneralData = new ODBGeneralDataImpl();
                    ((ODBGeneralDataImpl) this.oDBGeneralData).decodeAll(ais);
                    break;
                default:
                    switch (ais.getTagClass()) {
                        case Tag.CLASS_UNIVERSAL: {
                            switch (tag) {
                                case Tag.STRING_BIT:
                                    if (!ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".odbHplmnData: Parameter is not primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);
                                    this.odbHplmnData = new ODBHPLMNDataImpl();
                                    ((ODBHPLMNDataImpl) this.odbHplmnData).decodeAll(ais);
                                    break;
                                case Tag.SEQUENCE:
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

            num++;
        }

        if (this.oDBGeneralData == null) {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parament oDBGeneralData is mandatory but does not found",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }

    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws
            MAPException
    {
        if (this.oDBGeneralData == null)
            throw new MAPException("Error while encoding" + _PrimitiveName + ": oDBGeneralData must not be null");

        ((ODBGeneralDataImpl) this.oDBGeneralData).encodeAll(asnOs, Tag.CLASS_UNIVERSAL, Tag.STRING_BIT);

        if (this.odbHplmnData != null)
            ((ODBHPLMNDataImpl) this.odbHplmnData).encodeAll(asnOs, Tag.CLASS_UNIVERSAL, Tag.STRING_BIT);

        if (this.extensionContainer != null)
            ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_UNIVERSAL, Tag.SEQUENCE);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.oDBGeneralData != null) {
            sb.append("oDBGeneralData=");
            sb.append(this.oDBGeneralData.toString());
            sb.append(", ");
        }

        if (this.odbHplmnData != null) {
            sb.append("odbHplmnData=");
            sb.append(this.odbHplmnData.toString());
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

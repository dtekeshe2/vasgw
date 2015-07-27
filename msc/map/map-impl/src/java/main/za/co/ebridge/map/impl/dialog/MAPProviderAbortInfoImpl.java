/* eBridge SS7 */

package za.co.ebridge.map.impl.dialog;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;


import za.co.ebridge.map.api.dialog.MAPProviderAbortReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

/**
 *
 MAP-ProviderAbortInfo ::= SEQUENCE { map-ProviderAbortReason MAP-ProviderAbortReason, ..., extensionContainer
 * ExtensionContainer OPTIONAL -- extensionContainer must not be used in version 2 }
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class MAPProviderAbortInfoImpl implements MAPAsnPrimitive {

    public static final int MAP_PROVIDER_ABORT_INFO_TAG = 0x05;

    protected static final int PROVIDER_ABORT_TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    protected static final boolean PROVIDER_ABORT_TAG_PC_CONSTRUCTED = false;

    private MAPProviderAbortReason mapProviderAbortReason = null;
    private MAPExtensionContainer extensionContainer;

    public MAPProviderAbortInfoImpl() {
    }

    public MAPProviderAbortReason getMAPProviderAbortReason() {
        return this.mapProviderAbortReason;
    }

    public MAPExtensionContainer getExtensionContainer() {
        return extensionContainer;
    }

    public void setMAPProviderAbortReason(MAPProviderAbortReason mapProvAbrtReas) {
        this.mapProviderAbortReason = mapProvAbrtReas;
    }

    public void setExtensionContainer(MAPExtensionContainer extensionContainer) {
        this.extensionContainer = extensionContainer;
    }

    public int getTag() throws MAPException {
        return MAP_PROVIDER_ABORT_INFO_TAG;
    }

    public int getTagClass() {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    public boolean getIsPrimitive() {
        return false;
    }

    public void decodeAll(AsnInputStream ansIS) throws MAPParsingComponentException {

        try {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding MAPProviderAbortInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPProviderAbortInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding MAPProviderAbortInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAPProviderAbortInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ais, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.setMAPProviderAbortReason(null);
        this.setExtensionContainer(null);

        AsnInputStream localAis = ais.readSequenceStreamData(length);

        int tag = localAis.readTag();
        if (localAis.getTagClass() != Tag.CLASS_UNIVERSAL && tag != Tag.ENUMERATED)
            throw new MAPParsingComponentException(
                    "Error decoding MAP-ProviderAbortInfo.map-ProviderAbortReason: bad tagClass or tag: tagClass="
                            + localAis.getTagClass() + ", tag=" + tag, MAPParsingComponentExceptionReason.MistypedParameter);
        int code = (int) localAis.readInteger();
        this.mapProviderAbortReason = MAPProviderAbortReason.getInstance(code);
        if (this.mapProviderAbortReason == null)
            throw new MAPParsingComponentException(
                    "Bad map-ProviderAbortReason code received when decoding MAP-ProviderAbortInfo" + code,
                    MAPParsingComponentExceptionReason.MistypedParameter);

        while (localAis.available() > 0) {
            tag = localAis.readTag();

            switch (localAis.getTagClass()) {
                case Tag.CLASS_UNIVERSAL:
                    switch (tag) {
                        case Tag.SEQUENCE:
                            this.extensionContainer = new MAPExtensionContainerImpl();
                            ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(localAis);
                            break;

                        default:
                            localAis.advanceElement();
                            break;
                    }
                    break;

                default:
                    localAis.advanceElement();
                    break;
            }
        }
    }

    public void encodeAll(AsnOutputStream asnOs) throws MAPException {

        this.encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, MAP_PROVIDER_ABORT_INFO_TAG);
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {

        try {
            asnOs.writeTag(tagClass, false, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAP-ProviderAbortInfo: " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream asnOS) throws MAPException {

        if (this.mapProviderAbortReason == null)
            throw new MAPException("Error while encoding MAP-ProviderAbortInfo: MapProviderAbortReason parameter has not set");

        try {
            asnOS.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, this.mapProviderAbortReason.getCode());

            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOS);

        } catch (IOException e) {
            throw new MAPException("IOException when encoding MAPProviderAbortInfo: " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAPProviderAbortInfo: " + e.getMessage(), e);
        }
    }
}

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
import za.co.ebridge.map.api.dialog.Reason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.ApplicationContextNameImpl;

/**
 * MAP-RefuseInfo ::= SEQUENCE { reason Reason, ..., extensionContainer ExtensionContainer -- extensionContainer must not be
 * used in version 2 }
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public class MAPRefuseInfoImpl implements MAPAsnPrimitive {

    public static final int MAP_REFUSE_INFO_TAG = 0x03;

    protected static final int REFUSE_TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    protected static final boolean REFUSE_TAG_PC_CONSTRUCTED = false;
    protected static final boolean REFUSE_TAG_PC_PRIMITIVE = true;

    private Reason reason;
    private MAPExtensionContainer extensionContainer;
    private ApplicationContextName alternativeAcn;

    public Reason getReason() {
        return this.reason;
    }

    public MAPExtensionContainer getExtensionContainer() {
        return extensionContainer;
    }

    public ApplicationContextName getAlternativeAcn() {
        return this.alternativeAcn;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public void setExtensionContainer(MAPExtensionContainer extensionContainer) {
        this.extensionContainer = extensionContainer;
    }

    public void setAlternativeAcn(ApplicationContextName alternativeAcn) {
        this.alternativeAcn = alternativeAcn;
    }

    public int getTag() throws MAPException {
        return MAP_REFUSE_INFO_TAG;
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
            throw new MAPParsingComponentException("IOException when decoding MAP-RefuseInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAP-RefuseInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length) throws MAPParsingComponentException {

        try {
            this._decode(ansIS, length);
        } catch (IOException e) {
            throw new MAPParsingComponentException("IOException when decoding MAP-RefuseInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        } catch (AsnException e) {
            throw new MAPParsingComponentException("AsnException when decoding MAP-RefuseInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ais, int length) throws MAPParsingComponentException, IOException, AsnException {
        // MAP-RefuseInfo ::= SEQUENCE {
        // reason ENUMERATED {
        // noReasonGiven ( 0 ),
        // invalidDestinationReference ( 1 ),
        // invalidOriginatingReference ( 2 ) },
        // ... ,
        // extensionContainer SEQUENCE {
        // privateExtensionList [0] IMPLICIT SEQUENCE ( SIZE( 1 .. 10 ) ) OF
        // SEQUENCE {
        // extId MAP-EXTENSION .&extensionId ( {
        // ,
        // ...} ) ,
        // extType MAP-EXTENSION .&ExtensionType ( {
        // ,
        // ...} { @extId } ) OPTIONAL} OPTIONAL,
        // pcs-Extensions [1] IMPLICIT SEQUENCE {
        // ... } OPTIONAL,
        // ... } OPTIONAL,
        // alternativeApplicationContext OBJECT IDENTIFIER OPTIONAL}

        this.reason = null;
        this.alternativeAcn = null;
        this.extensionContainer = null;

        AsnInputStream localAis = ais.readSequenceStreamData(length);

        int tag = localAis.readTag();
        if (tag != Tag.ENUMERATED || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            throw new MAPParsingComponentException("Error decoding MAP-RefuseInfo.Reason: bad tag or tagClass",
                    MAPParsingComponentExceptionReason.MistypedParameter);
        int reasonCode = (int) localAis.readInteger();
        this.reason = Reason.getReason(reasonCode);

        while (localAis.available() > 0) {
            tag = localAis.readTag();

            switch (localAis.getTagClass()) {
                case Tag.CLASS_UNIVERSAL:
                    switch (tag) {
                        case Tag.SEQUENCE:
                            this.extensionContainer = new MAPExtensionContainerImpl();
                            ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(localAis);
                            break;

                        case Tag.OBJECT_IDENTIFIER:
                            this.alternativeAcn = new ApplicationContextNameImpl();
                            long[] oid = localAis.readObjectIdentifier();
                            this.alternativeAcn.setOid(oid);
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

        this.encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, MAP_REFUSE_INFO_TAG);
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag) throws MAPException {

        try {
            asnOs.writeTag(tagClass, false, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAPRefuseInfo: " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream asnOS) throws MAPException {

        if (this.reason == null)
            throw new MAPException("Error decoding MAP-RefuseInfo: Reason field must not be empty");

        try {
            asnOS.writeInteger(Tag.CLASS_UNIVERSAL, Tag.ENUMERATED, this.reason.getCode());

            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOS);
            if (this.alternativeAcn != null)
                asnOS.writeObjectIdentifier(this.alternativeAcn.getOid());

        } catch (IOException e) {
            throw new MAPException("IOException when encoding MAPRefuseInfo: " + e.getMessage(), e);
        } catch (AsnException e) {
            throw new MAPException("AsnException when encoding MAPRefuseInfo: " + e.getMessage(), e);
        }
    }
}

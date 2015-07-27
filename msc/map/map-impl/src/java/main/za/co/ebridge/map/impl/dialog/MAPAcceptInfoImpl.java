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
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.impl.primitives.MAPAsnPrimitive;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;

/**
 * map-accept [1] IMPLICIT SEQUENCE { ... , extensionContainer SEQUENCE { privateExtensionList [0] IMPLICIT SEQUENCE
 * SIZE (1 ..
 * SEQUENCE { extId MAP-EXTENSION .&extensionId ( { , ...} ) , extType MAP-EXTENSION .&ExtensionType ( { , ...} {
 * @extId } )
 * OPTIONAL} OPTIONAL, pcs-Extensions [1] IMPLICIT SEQUENCE { ... } OPTIONAL, ... } OPTIONAL},
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 */
public class MAPAcceptInfoImpl
        implements MAPAsnPrimitive
{

    public static final int MAP_ACCEPT_INFO_TAG = 0x01;

    protected static final int ACCEPT_INFO_TAG_CLASS = Tag.CLASS_CONTEXT_SPECIFIC;
    protected static final boolean ACCEPT_INFO_TAG_PC_PRIMITIVE = true;
    protected static final boolean ACCEPT_INFO_TAG_PC_CONSTRUCTED = false;

    private MAPExtensionContainer extensionContainer;

    public MAPExtensionContainer getExtensionContainer()
    {
        return extensionContainer;
    }

    public void setExtensionContainer(MAPExtensionContainer extensionContainer)
    {
        this.extensionContainer = extensionContainer;
    }

    public int getTag()
            throws
            MAPException
    {
        return MAP_ACCEPT_INFO_TAG;
    }

    public int getTagClass()
    {
        return Tag.CLASS_CONTEXT_SPECIFIC;
    }

    public boolean getIsPrimitive()
    {
        return false;
    }

    public void decodeAll(AsnInputStream ansIS)
            throws
            MAPParsingComponentException
    {

        try
        {
            int length = ansIS.readLength();
            this._decode(ansIS, length);
        }
        catch (IOException e)
        {
            throw new MAPParsingComponentException("IOException when decoding MAPAcceptInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        catch (AsnException e)
        {
            throw new MAPParsingComponentException("AsnException when decoding MAPAcceptInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    public void decodeData(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException
    {

        try
        {
            this._decode(ansIS, length);
        }
        catch (IOException e)
        {
            throw new MAPParsingComponentException("IOException when decoding MAPAcceptInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
        catch (AsnException e)
        {
            throw new MAPParsingComponentException("AsnException when decoding MAPAcceptInfo: " + e.getMessage(), e,
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    private void _decode(AsnInputStream ais, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {
        // MAP-AcceptInfo ::= SEQUENCE {
        // ... ,
        // extensionContainer SEQUENCE {
        // privateExtensionList [0] IMPLICIT SEQUENCE SIZE (1 .. 10 ) OF
        // SEQUENCE {
        // extId MAP-EXTENSION .&extensionId ( {
        // ,
        // ...} ) ,
        // extType MAP-EXTENSION .&ExtensionType ( {
        // ,
        // ...} { @extId } ) OPTIONAL} OPTIONAL,
        // pcs-Extensions [1] IMPLICIT SEQUENCE {
        // ... } OPTIONAL,
        // ... } OPTIONAL}

        this.setExtensionContainer(null);

        AsnInputStream localAis = ais.readSequenceStreamData(length);

        while (localAis.available() > 0)
        {
            int tag = localAis.readTag();

            switch (localAis.getTagClass())
            {
                case Tag.CLASS_UNIVERSAL:
                    switch (tag)
                    {
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

    public void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException
    {

        this.encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC, MAP_ACCEPT_INFO_TAG);
    }

    public void encodeAll(AsnOutputStream asnOs, int tagClass, int tag)
            throws
            MAPException
    {

        try
        {
            asnOs.writeTag(tagClass, false, tag);
            int pos = asnOs.StartContentDefiniteLength();
            this.encodeData(asnOs);
            asnOs.FinalizeContent(pos);
        }
        catch (AsnException e)
        {
            throw new MAPException("AsnException when encoding MAPAcceptInfo: " + e.getMessage(), e);
        }
    }

    public void encodeData(AsnOutputStream asnOS)
            throws
            MAPException
    {
        if (this.extensionContainer != null)
            ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOS);
    }
}

package za.co.ebridge.map.impl.primitives;

import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;

import java.io.Serializable;

public interface MAPAsnPrimitive
        extends Serializable
{

    int getTag()
            throws
            MAPException;

    int getTagClass();

    boolean getIsPrimitive();

    /**
     * Decoding the length and the content of the primitive (the tag has already read)
     *
     * @param ansIS The AsnInputStream that contains the length and the content of the primitive
     * @throws MAPParsingComponentException
     */
    void decodeAll(AsnInputStream ansIS)
            throws
            MAPParsingComponentException;

    /**
     * Decoding the content of the primitive (the tag and the length have already read)
     *
     * @param ansIS  The AsnInputStream that contains the content of the primitive
     * @param length The length of the content
     * @throws MAPParsingComponentException
     */
    void decodeData(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException;

    /**
     * Encoding the tag, the length and the content. Tag and tag class are universal
     *
     * @param asnOs
     * @throws MAPException
     */
    void encodeAll(AsnOutputStream asnOs)
            throws
            MAPException;

    /**
     * Encoding the tag, the length and the content. Tag and tag class are defined
     *
     * @param asnOs
     * @param tagClass
     * @param tag
     * @throws MAPException
     */
    void encodeAll(AsnOutputStream asnOs, int tagClass, int tag)
            throws
            MAPException;

    /**
     * Encoding the content.
     *
     * @param asnOs
     * @throws MAPException
     */
    void encodeData(AsnOutputStream asnOs)
            throws
            MAPException;

}

package za.co.ebridge.tcap.api.api;

import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;

import java.io.IOException;

/**
 * Message type tag - it holds whole representation of tag - along with universal and other bits set.
 */
public enum MessageType
{

    Unidirectional(0x61), Begin(0x62), End(0x64), Continue(0x65), Abort(0x67), Unknown(-1);

    private int tagContent = -1;

    private MessageType(int tagContent)
    {
        this.tagContent = tagContent;
    }

    public MessageType decode(AsnInputStream asnIs)
            throws
            IOException
    {
        int t = asnIs.readTag();
        switch (t)
        {
            case 0x61:
                return Unidirectional;
            case 0x62:
                return Begin;
            case 0x65:
                return Continue;
            case 0x64:
                return End;
            case 0x67:
                return Abort;
            default:
                return Unknown;
        }

    }

    public void encode(AsnOutputStream asnO)
    {
        // write directly, we know its applciation class, constructed and num is
        // in range of 5 bits
        // this way its faster.
        asnO.write(tagContent);
    }

    public int getTag()
    {
        return this.tagContent;
    }
}

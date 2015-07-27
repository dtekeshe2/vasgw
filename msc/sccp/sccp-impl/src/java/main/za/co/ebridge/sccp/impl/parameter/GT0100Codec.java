package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.indicator.EncodingScheme;
import za.co.ebridge.sccp.api.indicator.NatureOfAddress;
import za.co.ebridge.sccp.api.indicator.NumberingPlan;
import za.co.ebridge.sccp.api.parameter.GT0100;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;

public class GT0100Codec
        extends GTCodec
{

    private GT0100 gt;

    /**
     * Creates a new instance of GT0100Codec
     */
    public GT0100Codec()
    {
    }

    /**
     * Creates a new instance of GT0100Codec
     */
    public GT0100Codec(GT0100 gt)
    {
        this.gt = gt;
    }

    public GlobalTitle decode(InputStream in)
            throws
            IOException
    {
        int b1 = in.read() & 0xff;
        int b2 = in.read() & 0xff;
        int b3 = in.read() & 0xff;

        int tt = b1;

        EncodingScheme es = EncodingScheme.valueOf(b2 & 0x0f);
        NumberingPlan np = NumberingPlan.valueOf((b2 & 0xf0) >> 4);
        NatureOfAddress na = NatureOfAddress.valueOf(b3 & 0x7f);

        String digits = es.decodeDigits(in);
        return new GT0100(tt, np, na, digits);
    }

    public void encode(OutputStream out)
            throws
            IOException
    {
        String digits = gt.getDigits();
        EncodingScheme es = digits.length() % 2 == 0 ? EncodingScheme.BCD_EVEN : EncodingScheme.BCD_ODD;

        out.write((byte) gt.getTranslationType());

        byte b = (byte) ((gt.getNumberingPlan().getValue() << 4) | (es.getValue()));
        out.write(b);

        b = (byte) (gt.getNatureOfAddress().getValue() & 0x7f);
        out.write(b);

        es.encodeDigits(digits, out);
    }

}

/* eBridge SS7 */

package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.indicator.EncodingScheme;
import za.co.ebridge.sccp.api.indicator.NumberingPlan;
import za.co.ebridge.sccp.api.parameter.GT0011;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;

/**
 *
 * @author kulikov
 */
public class GT0011Codec extends GTCodec {
    private GT0011 gt;

    public GT0011Codec() {
    }

    public GT0011Codec(GT0011 gt) {
        this.gt = gt;
    }

    public GlobalTitle decode(InputStream in) throws IOException {
        int b = in.read() & 0xff;
        int tt = b;

        b = in.read() & 0xff;

        EncodingScheme es = EncodingScheme.valueOf(b & 0x0f);
        NumberingPlan np = NumberingPlan.valueOf((b & 0xf0) >> 4);

        String digits = es.decodeDigits(in);
        return new GT0011(tt, np, digits);
    }

    public void encode(OutputStream out) throws IOException {
        String digits = gt.getDigits();
        EncodingScheme es = digits.length() % 2 == 0 ? EncodingScheme.BCD_EVEN : EncodingScheme.BCD_ODD;
        out.write(gt.getTranslationType());
        out.write((gt.getNp().getValue() << 4) | es.getValue());
        es.encodeDigits(digits, out);
    }

}

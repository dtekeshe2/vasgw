/* eBridge SS7 */

package za.co.ebridge.sccp.impl.parameter;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import za.co.ebridge.sccp.api.indicator.NatureOfAddress;
import za.co.ebridge.sccp.api.parameter.GT0001;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;

/**
 *
 * @author kulikov
 */
public class GT0001Codec extends GTCodec {

    private GT0001 gt;

    protected GT0001Codec() {
    }

    public GT0001Codec(GT0001 gt) {
        this.gt = gt;
    }

    public GlobalTitle decode(InputStream in) throws IOException {
        int b = in.read() & 0xff;

        NatureOfAddress nai = NatureOfAddress.valueOf(b & 0x7f);
        boolean odd = (b & 0x80) == 0x80;

        String digits = "";
        while (in.available() > 0) {
            b = in.read() & 0xff;
            digits += Integer.toHexString(b & 0x0f) + Integer.toHexString((b & 0xf0) >> 4);
        }

        if (odd) {
            digits = digits.substring(0, digits.length() - 1);
        }
        return new GT0001(nai, digits);
    }

    public void encode(OutputStream out) throws IOException {
        // determine if number of digits is even or odd
        String digits = gt.getDigits();
        boolean odd = (digits.length() % 2) != 0;

        // encoding first byte
        int b = 0x00;
        if (odd) {
            b = b | (byte) 0x80;
        }

        // adding nature of address indicator
        b = b | (byte) gt.getNoA().getValue();

        // write first byte
        out.write((byte) b);

        // writting digits
        int count = odd ? digits.length() - 1 : digits.length();
        for (int i = 0; i < count - 1; i += 2) {
            String ds1 = digits.substring(i, i + 1);
            String ds2 = digits.substring(i + 1, i + 2);

            int d1 = Integer.parseInt(ds1, 16);
            int d2 = Integer.parseInt(ds2, 16);

            b = (byte) (d2 << 4 | d1);
            out.write(b);
        }

        // if number is odd append last digit with filler
        if (odd) {
            String ds1 = digits.substring(count, count + 1);
            int d = Integer.parseInt(ds1);

            b = (byte) (d & 0x0f);
            out.write(b);
        }
    }

}

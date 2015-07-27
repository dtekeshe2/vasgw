/* eBridge SS7 */

/**
 * Start time:14:56:41 2009-04-20<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import java.io.ByteArrayOutputStream;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.MessageType;

/**
 * Start time:14:56:41 2009-04-20<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 *
 */
public class MessageTypeImpl extends AbstractISUPParameter implements MessageType {

    // we even cant use -1, since it may be avlid value, ech, those binary protocols.
    private int code;

    public MessageTypeImpl(byte[] code) throws ParameterException {
        super();
        this.decode(code);
    }

    public MessageTypeImpl(int code) {
        super();
        this.code = code;
    }

    public int decode(byte[] b) throws ParameterException {
        if (b == null || b.length != 1)
            throw new ParameterException();
        return 1;
    }

    public byte[] encode() throws ParameterException {
        return new byte[] { (byte) this.code };
    }

    public int encode(ByteArrayOutputStream bos) throws ParameterException {
        bos.write(this.code);
        return 1;
    }

    public int getCode() {

        return code;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */

    public String toString() {

        return super.toString() + "-" + this.code;
    }

}

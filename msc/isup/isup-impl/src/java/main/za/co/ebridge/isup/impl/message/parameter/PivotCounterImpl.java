/* eBridge SS7 */

/**
 * Start time:08:44:19 2009-04-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.PivotCounter;

/**
 * Start time:08:44:19 2009-04-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class PivotCounterImpl extends AbstractISUPParameter implements PivotCounter {

    private int counter = 0;

    public PivotCounterImpl(byte[] b) throws ParameterException {
        super();
        decode(b);
    }

    public PivotCounterImpl() {
        super();

    }

    public PivotCounterImpl(int counter) {
        super();
        this.setCounter(counter);
    }

    public int decode(byte[] b) throws ParameterException {
        if (b == null || b.length != 1) {
            throw new ParameterException("byte[] must not be null and length must be 1");
        }

        this.counter = b[0] & 0x1F;
        return 1;
    }

    public byte[] encode() throws ParameterException {

        return new byte[] { (byte) (this.counter & 0x1F) };
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCode() {

        return _PARAMETER_CODE;
    }

}

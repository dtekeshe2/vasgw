/* eBridge SS7 */

/**
 * Start time:13:04:01 2009-07-17<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.GenericReference;

/**
 * Start time:13:04:01 2009-07-17<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class GenericReferenceImpl extends AbstractISUPParameter implements GenericReference {

    /**
     *
     */
    public GenericReferenceImpl() {
        //FIXME: XXX
    }

    /**
     * @throws ParameterException
     * @throws ParameterException
     *
     */
    public GenericReferenceImpl(byte[] b) throws ParameterException {
        decode(b);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.isup.parameters.ISUPParameter#getCode()
     */
    public int getCode() {
        // TODO Auto-generated method stub
        return _PARAMETER_CODE;
    }

    public int decode(byte[] b) throws ParameterException {
        // TODO Auto-generated method stub
        return 0;
    }

    public byte[] encode() throws ParameterException {
        // TODO Auto-generated method stub
        return null;
    }

}

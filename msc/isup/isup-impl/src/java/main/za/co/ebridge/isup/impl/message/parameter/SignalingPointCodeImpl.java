/* eBridge SS7 */

/**
 * Start time:12:23:47 2009-04-02<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.SignalingPointCode;

/**
 * Start time:12:23:47 2009-04-02<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class SignalingPointCodeImpl extends AbstractPointCode implements SignalingPointCode {

    public int getCode() {

        return _PARAMETER_CODE;
    }

    public SignalingPointCodeImpl() {
        super();

    }

    public SignalingPointCodeImpl(byte[] b) throws ParameterException {
        super(b);

    }

}

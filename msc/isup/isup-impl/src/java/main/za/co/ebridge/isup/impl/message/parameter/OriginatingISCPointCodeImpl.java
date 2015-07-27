/* eBridge SS7 */

/**
 * Start time:12:31:58 2009-04-02<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.OriginatingISCPointCode;

/**
 * Start time:12:31:58 2009-04-02<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class OriginatingISCPointCodeImpl extends AbstractPointCode implements OriginatingISCPointCode {

    public int getCode() {

        return _PARAMETER_CODE;
    }

    public OriginatingISCPointCodeImpl() {
        super();

    }

    public OriginatingISCPointCodeImpl(byte[] b) throws ParameterException {
        super(b);

    }
}

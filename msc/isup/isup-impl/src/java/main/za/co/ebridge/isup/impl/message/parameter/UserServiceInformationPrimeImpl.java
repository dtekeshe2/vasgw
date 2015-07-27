/* eBridge SS7 */

package za.co.ebridge.isup.impl.message.parameter;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.UserServiceInformationPrime;

/**
 * Start time:12:36:18 2009-04-04<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 * @author david@tekeshe.com
 */
public class UserServiceInformationPrimeImpl extends UserServiceInformationBaseImpl implements UserServiceInformationPrime {

    public UserServiceInformationPrimeImpl() {
        super();

    }

    public UserServiceInformationPrimeImpl(byte[] b) throws ParameterException {
        super(b);
    }

    protected String getPrimitiveName() {
        return "UserServiceInformationPrime";
    }

    public int getCode() {

        return _PARAMETER_CODE;
    }

}

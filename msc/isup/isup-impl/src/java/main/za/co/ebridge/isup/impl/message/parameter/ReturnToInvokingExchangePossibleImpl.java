/* eBridge SS7 */

/**
 * Start time:09:06:33 2009-04-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.InformationType;
import za.co.ebridge.isup.api.message.parameter.ReturnToInvokingExchangePossible;

/**
 * Start time:09:06:33 2009-04-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class ReturnToInvokingExchangePossibleImpl extends AbstractInformationImpl implements ReturnToInvokingExchangePossible {
    //its empty param, its existence is information.
    private static final byte[] DATA = new byte[]{};
    public ReturnToInvokingExchangePossibleImpl() {
        super(InformationType.ReturnToInvokingExchangePossible);
        //This is always 0x01;
        super.tag = 0x01;
    }

    public void decode(byte[] b) throws ParameterException {
        return;
    }

    public byte[] encode() throws ParameterException {
        return DATA;
    }


}

/* eBridge SS7 */

/**
 * Start time:18:36:26 2009-04-05<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import java.io.ByteArrayInputStream;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.OriginalCalledINNumber;

/**
 * Start time:18:36:26 2009-04-05<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class OriginalCalledINNumberImpl extends CalledNumberImpl implements OriginalCalledINNumber {

    public OriginalCalledINNumberImpl(byte[] representation) throws ParameterException {
        super(representation);

    }

    public OriginalCalledINNumberImpl(ByteArrayInputStream bis) throws ParameterException {
        super(bis);

    }

    public OriginalCalledINNumberImpl(int natureOfAddresIndicator, String address, int numberingPlanIndicator,
            int addressRepresentationREstrictedIndicator) {
        super(natureOfAddresIndicator, address, numberingPlanIndicator, addressRepresentationREstrictedIndicator);

    }

    public OriginalCalledINNumberImpl() {
        super();

    }

    protected String getPrimitiveName() {
        return "OriginalCalledINNumber";
    }

    public int getCode() {

        return _PARAMETER_CODE;
    }
}

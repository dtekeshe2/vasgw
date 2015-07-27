/* eBridge SS7 */

package za.co.ebridge.isup.impl.message.parameter;

import java.io.ByteArrayInputStream;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.OriginalCalledNumber;

/**
 * Start time:17:30:47 2009-03-29<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class OriginalCalledNumberImpl extends CalledNumberImpl implements OriginalCalledNumber {

    public OriginalCalledNumberImpl(byte[] representation) throws ParameterException {
        super(representation);

    }

    public OriginalCalledNumberImpl(ByteArrayInputStream bis) throws ParameterException {
        super(bis);

    }

    public OriginalCalledNumberImpl(int natureOfAddresIndicator, String address, int numberingPlanIndicator,
            int addressRepresentationRestrictedIndicator) {
        super(natureOfAddresIndicator, address, numberingPlanIndicator, addressRepresentationRestrictedIndicator);

    }

    public OriginalCalledNumberImpl() {
        super();

    }

    protected String getPrimitiveName() {
        return "OriginalCalledNumber";
    }

    public int getCode() {

        return _PARAMETER_CODE;
    }
}

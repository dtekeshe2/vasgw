/* eBridge SS7 */

package za.co.ebridge.map.impl.primitives;

import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.AddressNature;
import za.co.ebridge.map.api.primitives.FTNAddressString;
import za.co.ebridge.map.api.primitives.NumberingPlan;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class FTNAddressStringImpl extends AddressStringImpl implements FTNAddressString {

    public FTNAddressStringImpl() {
    }

    public FTNAddressStringImpl(AddressNature addressNature, NumberingPlan numberingPlan, String address) {
        super(addressNature, numberingPlan, address);
    }

    @Override
    protected void _testLengthDecode(int length) throws MAPParsingComponentException {
        if (length > 15)
            throw new MAPParsingComponentException("Error when decoding FTNAddressString: mesage length must not exceed 15",
                    MAPParsingComponentExceptionReason.MistypedParameter);
    }

    @Override
    protected void _testLengthEncode() throws MAPException {

        if (this.address == null && this.address.length() > 28)
            throw new MAPException("Error when encoding FTNAddressString: address length must not exceed 28 digits");
    }

    @Override
    public String toString() {
        return "FTNAddressString[AddressNature=" + this.addressNature.toString() + ", NumberingPlan="
                + this.numberingPlan.toString() + ", Address=" + this.address + "]";
    }

}

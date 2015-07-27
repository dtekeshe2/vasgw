/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;
import za.co.ebridge.map.api.service.supplementary.SSCode;
import za.co.ebridge.map.api.service.supplementary.SSStatus;

/**
 *
 ss-Incompatibility ERROR ::= { PARAMETER SS-IncompatibilityCause -- optional CODE local:20 }
 *
 * SS-IncompatibilityCause ::= SEQUENCE { ss-Code [1] SS-Code OPTIONAL, basicService BasicServiceCode OPTIONAL, ss-Status [4]
 * SS-Status OPTIONAL, ...}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageSsIncompatibility extends MAPErrorMessage {

    SSCode getSSCode();

    BasicServiceCode getBasicService();

    SSStatus getSSStatus();

    void setSSCode(SSCode val);

    void setBasicService(BasicServiceCode val);

    void setSSStatus(SSStatus val);

}

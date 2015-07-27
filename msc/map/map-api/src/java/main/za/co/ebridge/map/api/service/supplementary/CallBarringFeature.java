/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;

/**
 *
 CallBarringFeature ::= SEQUENCE { basicService BasicServiceCode OPTIONAL, ss-Status [4] SS-Status OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CallBarringFeature extends Serializable {

    BasicServiceCode getBasicService();

    SSStatus getSsStatus();

}

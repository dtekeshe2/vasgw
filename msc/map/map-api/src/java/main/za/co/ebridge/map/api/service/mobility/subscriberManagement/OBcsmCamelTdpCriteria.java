/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 O-BcsmCamelTDP-Criteria ::= SEQUENCE { o-BcsmTriggerDetectionPoint O-BcsmTriggerDetectionPoint, destinationNumberCriteria [0]
 * DestinationNumberCriteria OPTIONAL, basicServiceCriteria [1] BasicServiceCriteria OPTIONAL, callTypeCriteria [2]
 * CallTypeCriteria OPTIONAL, ..., o-CauseValueCriteria [3] O-CauseValueCriteria OPTIONAL, extensionContainer [4]
 * ExtensionContainer OPTIONAL }
 *
 * BasicServiceCriteria ::= SEQUENCE SIZE(1..5) OF Ext-BasicServiceCode
 *
 * O-CauseValueCriteria ::= SEQUENCE SIZE(1..5) OF CauseValue
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface OBcsmCamelTdpCriteria extends Serializable {

    OBcsmTriggerDetectionPoint getOBcsmTriggerDetectionPoint();

    DestinationNumberCriteria getDestinationNumberCriteria();

    ArrayList<ExtBasicServiceCode> getBasicServiceCriteria();

    CallTypeCriteria getCallTypeCriteria();

    ArrayList<CauseValue> getOCauseValueCriteria();

    MAPExtensionContainer getExtensionContainer();

}

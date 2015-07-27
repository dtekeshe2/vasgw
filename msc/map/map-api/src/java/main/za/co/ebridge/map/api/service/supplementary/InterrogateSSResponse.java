/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.util.ArrayList;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;

/**
 *
 InterrogateSS-Res ::= CHOICE { ss-Status [0] SS-Status, basicServiceGroupList [2] BasicServiceGroupList,
 * forwardingFeatureList [3] ForwardingFeatureList, genericServiceInfo [4] GenericServiceInfo }
 *
 * BasicServiceGroupList ::= SEQUENCE SIZE (1..13) OF BasicServiceCode
 *
 * ForwardingFeatureList ::= SEQUENCE SIZE (1..13) OF ForwardingFeature
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface InterrogateSSResponse extends SupplementaryMessage {

    SSStatus getSsStatus();

    ArrayList<BasicServiceCode> getBasicServiceGroupList();

    ArrayList<ForwardingFeature> getForwardingFeatureList();

    GenericServiceInfo getGenericServiceInfo();

}
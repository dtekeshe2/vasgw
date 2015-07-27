/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.EMLPPPriority;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;

/**
 *
 SS-Data ::= SEQUENCE { ss-Code SS-Code OPTIONAL, ss-Status [4] SS-Status OPTIONAL, ss-SubscriptionOption
 * SS-SubscriptionOption OPTIONAL, basicServiceGroupList BasicServiceGroupList OPTIONAL, ..., defaultPriority EMLPP-Priority
 * OPTIONAL, nbrUser [5] MC-Bearers OPTIONAL }
 *
 * BasicServiceGroupList ::= SEQUENCE SIZE (1..13) OF BasicServiceCode
 *
 * MC-Bearers ::= INTEGER (1..7)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SSData extends Serializable {

    SSCode getCode();

    SSStatus getSsStatus();

    SSSubscriptionOption getSsSubscriptionOption();

    ArrayList<BasicServiceCode> getBasicServiceGroupList();

    EMLPPPriority getDefaultPriority();

    Integer getNbrUser();

}
/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 SGSN-CAMEL-SubscriptionInfo ::= SEQUENCE { gprs-CSI [0] GPRS-CSI OPTIONAL, mo-sms-CSI [1] SMS-CSI OPTIONAL,
 * extensionContainer [2] ExtensionContainer OPTIONAL, ..., mt-sms-CSI [3] SMS-CSI OPTIONAL, mt-smsCAMELTDP-CriteriaList [4]
 * MT-smsCAMELTDP-CriteriaList OPTIONAL, mg-csi [5] MG-CSI OPTIONAL }
 *
 * MT-smsCAMELTDP-CriteriaList ::= SEQUENCE SIZE (1.. 10) OF MT-smsCAMELTDP-Criteria
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SGSNCAMELSubscriptionInfo extends Serializable {

    GPRSCSI getGprsCsi();

    SMSCSI getMoSmsCsi();

    MAPExtensionContainer getExtensionContainer();

    SMSCSI getMtSmsCsi();

    ArrayList<MTsmsCAMELTDPCriteria> getMtSmsCamelTdpCriteriaList();

    MGCSI getMgCsi();

}

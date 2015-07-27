/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;

/**
 *
 SS-ForBS-Code ::= SEQUENCE { ss-Code SS-Code, basicService BasicServiceCode OPTIONAL, ..., longFTN-Supported [4] NULL
 * OPTIONAL }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SSForBSCode extends Serializable {

    SSCode getSsCode();

    BasicServiceCode getBasicService(); // -> BasicServiceCode -> subscriber management !!!!!

    boolean getLongFtnSupported();

}
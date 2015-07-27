/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 ForwardingInfo ::= SEQUENCE { ss-Code SS-Code OPTIONAL, forwardingFeatureList ForwardingFeatureList, ...}
 *
 * ForwardingFeatureList ::= SEQUENCE SIZE (1..13) OF ForwardingFeature
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ForwardingInfo extends Serializable {

    SSCode getSsCode();

    ArrayList<ForwardingFeature> getForwardingFeatureList();

}

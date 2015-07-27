/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 CallBarringInfo ::= SEQUENCE { ss-Code SS-Code OPTIONAL, callBarringFeatureList CallBarringFeatureList, ...}
 *
 * CallBarringFeatureList ::= SEQUENCE SIZE (1..13) OF CallBarringFeature
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CallBarringInfo extends Serializable {

    SSCode getSsCode();

    ArrayList<CallBarringFeature> getCallBarringFeatureList();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 EPS-SubscriptionDataWithdraw ::= CHOICE { allEPS-Data NULL, contextIdList ContextIdList}
 *
 * ContextIdList ::= SEQUENCE SIZE (1..50) OF ContextId
 *
 * ContextId ::= INTEGER (1..50)
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface EPSSubscriptionDataWithdraw extends Serializable {

    boolean getAllEpsData();

    ArrayList<Integer> getContextIdList();

}

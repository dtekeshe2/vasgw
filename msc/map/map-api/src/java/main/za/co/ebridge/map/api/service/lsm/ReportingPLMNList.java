/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 ReportingPLMNList::= SEQUENCE { plmn-ListPrioritized [0] NULL OPTIONAL, plmn-List [1] PLMNList, ...}
 *
 * PLMNList::= SEQUENCE SIZE (1..20) OF ReportingPLMN
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ReportingPLMNList extends Serializable {

    boolean getPlmnListPrioritized();

    ArrayList<ReportingPLMN> getPlmnList();

}

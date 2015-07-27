/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.PlmnId;

/**
 *
 ReportingPLMN::= SEQUENCE { plmn-Id [0] PLMN-Id, ran-Technology [1] RAN-Technology OPTIONAL, ran-PeriodicLocationSupport [2]
 * NULL OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ReportingPLMN extends Serializable {

    PlmnId getPlmnId();

    RANTechnology getRanTechnology();

    boolean getRanPeriodicLocationSupport();

}

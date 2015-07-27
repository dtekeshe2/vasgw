/* eBridge SS7 */

package za.co.ebridge.map.api.dialog;

import java.io.Serializable;

import za.co.ebridge.tcap.api.asn.ApplicationContextName;

/**
 * @author david@tekeshe.com
 *
 */
public interface ServingCheckData extends Serializable {

    ServingCheckResult getResult();

    ApplicationContextName getAlternativeApplicationContext();
}

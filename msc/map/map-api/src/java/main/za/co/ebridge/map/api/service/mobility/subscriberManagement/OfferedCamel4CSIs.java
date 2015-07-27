/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 * OfferedCamel4CSIs ::= BIT STRING { o-csi (0), d-csi (1), vt-csi (2), t-csi (3), mt-sms-csi (4), mg-csi (5), psi-enhancements
 * (6) } (SIZE (7..16)) -- A node supporting Camel phase 4 shall mark in the BIT STRING all Camel4 CSIs -- it offers. -- Other
 * values than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface OfferedCamel4CSIs extends Serializable {

    boolean getOCsi();

    boolean getDCsi();

    boolean getVtCsi();

    boolean getTCsi();

    boolean getMtSmsCsi();

    boolean getMgCsi();

    boolean getPsiEnhancements();

}

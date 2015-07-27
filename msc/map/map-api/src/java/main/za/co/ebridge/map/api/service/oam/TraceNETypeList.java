/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 TraceNE-TypeList ::= BIT STRING { msc-s (0), mgw (1), sgsn (2), ggsn (3), rnc (4), bm-sc (5) , mme (6), sgw (7), pgw (8), eNB
 * (9)} (SIZE (6..16)) -- Other bits than listed above shall be discarded.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TraceNETypeList extends Serializable {

    boolean getMscS();

    boolean getMgw();

    boolean getSgsn();

    boolean getGgsn();

    boolean getRnc();

    boolean getBmSc();

    boolean getMme();

    boolean getSgw();

    boolean getPgw();

    boolean getEnb();

}

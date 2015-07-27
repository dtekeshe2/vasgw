/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;

/**
 *
 TraceEventList ::= SEQUENCE { msc-s-List [0] MSC-S-EventList OPTIONAL, mgw-List [1] MGW-EventList OPTIONAL, sgsn-List [2]
 * SGSN-EventList OPTIONAL, ggsn-List [3] GGSN-EventList OPTIONAL, bmsc-List [4] BMSC-EventList OPTIONAL, ..., mme-List [5]
 * MME-EventList OPTIONAL, sgw-List [6] SGW-EventList OPTIONAL, pgw-List [7] PGW-EventList OPTIONAL}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TraceEventList extends Serializable {

    MSCSEventList getMscSList();

    MGWEventList getMgwList();

    SGSNEventList getSgsnList();

    GGSNEventList getGgsnList();

    BMSCEventList getBmscList();

    MMEEventList getMmeList();

    SGWEventList getSgwList();

    PGWEventList getPgwList();

}

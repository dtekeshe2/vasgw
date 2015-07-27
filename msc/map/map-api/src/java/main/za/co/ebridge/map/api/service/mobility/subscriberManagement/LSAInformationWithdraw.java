/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

/**
 *
 LSAInformationWithdraw ::= CHOICE { allLSAData NULL, lsaIdentityList LSAIdentityList }
 *
 * LSAIdentityList ::= SEQUENCE SIZE (1..20) OF LSAIdentity
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface LSAInformationWithdraw extends Serializable {

    boolean getAllLSAData();

    LSAIdentity getLSAIdentityList();

}

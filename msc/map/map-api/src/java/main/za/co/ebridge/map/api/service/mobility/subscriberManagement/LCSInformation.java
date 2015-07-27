/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 *
 LCSInformation ::= SEQUENCE { gmlc-List [0] GMLC-List OPTIONAL, lcs-PrivacyExceptionList [1] LCS-PrivacyExceptionList
 * OPTIONAL, molr-List [2] MOLR-List OPTIONAL, ..., add-lcs-PrivacyExceptionList [3] LCS-PrivacyExceptionList OPTIONAL } --
 * add-lcs-PrivacyExceptionList may be sent only if lcs-PrivacyExceptionList is -- present and contains four instances of
 * LCS-PrivacyClass. If the mentioned condition -- is not satisfied the receiving node shall discard
 * add-lcs-PrivacyExceptionList. -- If an LCS-PrivacyClass is received both in lcs-PrivacyExceptionList and in --
 * add-lcs-PrivacyExceptionList with the same SS-Code, then the error unexpected -- data value shall be returned.
 *
 * GMLC-List ::= SEQUENCE SIZE (1..5) OF ISDN-AddressString -- if segmentation is used, the complete GMLC-List shall be sent in
 * one segment
 *
 * LCS-PrivacyExceptionList ::= SEQUENCE SIZE (1..4) OF LCS-PrivacyClass
 *
 * MOLR-List ::= SEQUENCE SIZE (1..3) OF MOLR-Class
 *
 * LCS-PrivacyExceptionList ::= SEQUENCE SIZE (1..4) OF LCS-PrivacyClass
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface LCSInformation extends Serializable {

    ArrayList<ISDNAddressString> getGmlcList();

    ArrayList<LCSPrivacyClass> getLcsPrivacyExceptionList();

    ArrayList<MOLRClass> getMOLRList();

    ArrayList<LCSPrivacyClass> getAddLcsPrivacyExceptionList();

}

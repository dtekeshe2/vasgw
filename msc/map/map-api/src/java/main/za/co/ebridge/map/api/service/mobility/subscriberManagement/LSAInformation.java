/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 LSAInformation ::= SEQUENCE { completeDataListIncluded NULL OPTIONAL,
 *
 * -- If segmentation is used, completeDataListIncluded may only be present in the -- first segment. lsaOnlyAccessIndicator [1]
 * LSAOnlyAccessIndicator OPTIONAL, lsaDataList [2] LSADataList OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL,
 * ...}
 *
 * LSADataList ::= SEQUENCE SIZE (1..20) OF LSAData
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface LSAInformation extends Serializable {

    boolean getCompleteDataListIncluded();

    LSAOnlyAccessIndicator getLSAOnlyAccessIndicator();

    ArrayList<LSAData> getLSADataList();

    MAPExtensionContainer getExtensionContainer();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.USSDString;

/**
 *
 USSD-Res ::= SEQUENCE { ussd-DataCodingScheme USSD-DataCodingScheme, ussd-String USSD-String, ...}
 *
 *
 * @author amit bhayani
 *
 */
public interface ProcessUnstructuredSSResponse extends SupplementaryMessage {

    CBSDataCodingScheme getDataCodingScheme();

    USSDString getUSSDString();

}
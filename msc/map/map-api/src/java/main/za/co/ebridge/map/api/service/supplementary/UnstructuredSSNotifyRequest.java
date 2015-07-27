/* eBridge SS7 */
package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.USSDString;

/**
 * unstructuredSS-Notify OPERATION ::= { --Timer ml ARGUMENT USSD-Arg RETURN RESULT TRUE ERRORS { systemFailure | dataMissing |
 * unexpectedDataValue | absentSubscriber | illegalSubscriber | illegalEquipment | unknownAlphabet | ussd-Busy} CODE local:61 }
 *
 * @author amit bhayani
 *
 */
public interface UnstructuredSSNotifyRequest extends SupplementaryMessage {

    CBSDataCodingScheme getDataCodingScheme();

    USSDString getUSSDString();

    ISDNAddressString getMSISDNAddressString();

    AlertingPattern getAlertingPattern();
}
/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 MAP V3:
 *
 * registerCC-Entry OPERATION ::= { --Timer m ARGUMENT RegisterCC-EntryArg RESULT RegisterCC-EntryRes ERRORS { systemFailure |
 * dataMissing | unexpectedDataValue | callBarred | illegalSS-Operation | ss-ErrorStatus | ss-Incompatibility | shortTermDenial
 * | longTermDenial | facilityNotSupported} CODE local:76 }
 *
 * RegisterCC-EntryArg ::= SEQUENCE { ss-Code [0] SS-Code, ccbs-Data [1] CCBS-Data OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface RegisterCCEntryRequest extends SupplementaryMessage {

    SSCode getSsCode();

    CCBSData getCcbsData();

}
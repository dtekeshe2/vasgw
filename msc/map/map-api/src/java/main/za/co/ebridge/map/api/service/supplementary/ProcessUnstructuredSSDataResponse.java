/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

/**
 *
 RESULT ss-UserData -- optional
 *
 * SS-UserData ::= IA5String (SIZE (1.. 200))
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ProcessUnstructuredSSDataResponse extends SupplementaryMessage {

    String getData();

}

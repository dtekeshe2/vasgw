/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

/**
 *
 Password ::= NumericString (FROM ("0"|"1"|"2"|"3"|"4"|"5"|"6"|"7"|"8"|"9")) (SIZE (4))
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface Password extends Serializable {

    String getData();

}
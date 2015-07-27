/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

/**
 *
 SS-SubscriptionOption ::= CHOICE { cliRestrictionOption [2] CliRestrictionOption, overrideCategory [1] OverrideCategory}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SSSubscriptionOption extends Serializable {

    CliRestrictionOption getCliRestrictionOption();

    OverrideCategory getOverrideCategory();

}
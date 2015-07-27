/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.EMLPPPriority;

/**
 *
 GenericServiceInfo ::= SEQUENCE { ss-Status SS-Status, cliRestrictionOption CliRestrictionOption OPTIONAL, ...,
 * maximumEntitledPriority [0] EMLPP-Priority OPTIONAL, defaultPriority [1] EMLPP-Priority OPTIONAL, ccbs-FeatureList [2]
 * CCBS-FeatureList OPTIONAL, nbrSB [3] MaxMC-Bearers OPTIONAL, nbrUser [4] MC-Bearers OPTIONAL, nbrSN [5] MC-Bearers OPTIONAL }
 *
 * CCBS-FeatureList ::= SEQUENCE SIZE (1..5) OF CCBS-Feature
 *
 * MC-Bearers ::= INTEGER (1..7) MaxMC-Bearers ::= INTEGER (2..7)
 *
 * @author david@tekeshe.com
 *
 */
public interface GenericServiceInfo extends Serializable {

    SSStatus getSsStatus();

    CliRestrictionOption getCliRestrictionOption();

    EMLPPPriority getMaximumEntitledPriority();

    EMLPPPriority getDefaultPriority();

    ArrayList<CCBSFeature> getCcbsFeatureList();

    Integer getNbrSB();

    Integer getNbrUser();

    Integer getNbrSN();

}

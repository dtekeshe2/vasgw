/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 CUG-Subscription ::= SEQUENCE { cug-Index CUG-Index, cug-Interlock CUG-Interlock, intraCUG-Options IntraCUG-Options,
 * basicServiceGroupList Ext-BasicServiceGroupList OPTIONAL, extensionContainer [0] ExtensionContainer OPTIONAL, ...}
 *
 * CUG-Index ::= INTEGER (0..32767) -- The internal structure is defined in ETS 300 138.
 *
 * Ext-BasicServiceGroupList ::= SEQUENCE SIZE (1..32) OF Ext-BasicServiceCode
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CUGSubscription extends Serializable {

    int getCUGIndex();

    CUGInterlock getCugInterlock();

    IntraCUGOptions getIntraCugOptions();

    ArrayList<ExtBasicServiceCode> getBasicServiceGroupList();

    MAPExtensionContainer getExtensionContainer();

}

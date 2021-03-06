/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 PDN-GW-Identity ::= SEQUENCE { pdn-gw-ipv4-Address [0] PDP-Address OPTIONAL, pdn-gw-ipv6-Address [1] PDP-Address OPTIONAL,
 * pdn-gw-name [2] FQDN OPTIONAL, extensionContainer [3] ExtensionContainer OPTIONAL, ... }
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PDNGWIdentity extends Serializable {

    PDPAddress getPdnGwIpv4Address();

    PDPAddress getPdnGwIpv6Address();

    FQDN getPdnGwName();

    MAPExtensionContainer getExtensionContainer();

}

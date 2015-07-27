/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.NetworkResource;

/**
 * The MAP ReturnError message: SystemFailure
 *
 * systemFailure ERROR ::= { PARAMETER SystemFailureParam -- optional CODE local:34 }
 *
 *
 * SystemFailureParam ::= CHOICE { networkResource NetworkResource, -- networkResource must not be used in version 3
 * extensibleSystemFailureParam ExtensibleSystemFailureParam -- extensibleSystemFailureParam must not be used in version <3 }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageSystemFailure extends MAPErrorMessage {

    NetworkResource getNetworkResource();

    AdditionalNetworkResource getAdditionalNetworkResource();

    MAPExtensionContainer getExtensionContainer();

    long getMapProtocolVersion();

    void setNetworkResource(NetworkResource networkResource);

    void setAdditionalNetworkResource(AdditionalNetworkResource additionalNetworkResource);

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

    void setMapProtocolVersion(long mapProtocolVersion);
}

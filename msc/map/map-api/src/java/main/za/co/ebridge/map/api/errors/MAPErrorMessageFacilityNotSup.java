/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 * The MAP ReturnError message: MessageFacilityNotSup with parameters
 *
 * facilityNotSupported ERROR ::= { PARAMETER FacilityNotSupParam -- optional -- FacilityNotSupParam must not be used in version
 * <3 CODE local:21 }
 *
 *
 * FacilityNotSupParam ::= SEQUENCE { extensionContainer ExtensionContainer OPTIONAL, ..., shapeOfLocationEstimateNotSupported
 * [0] NULL OPTIONAL, neededLcsCapabilityNotSupportedInServingNode [1] NULL OPTIONAL }
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageFacilityNotSup extends MAPErrorMessage {

    MAPExtensionContainer getExtensionContainer();

    Boolean getShapeOfLocationEstimateNotSupported();

    Boolean getNeededLcsCapabilityNotSupportedInServingNode();

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

    void setShapeOfLocationEstimateNotSupported(Boolean shapeOfLocationEstimateNotSupported);

    void getNeededLcsCapabilityNotSupportedInServingNode(Boolean neededLcsCapabilityNotSupportedInServingNode);

}

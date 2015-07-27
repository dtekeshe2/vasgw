/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 SupportedCodecsList ::= SEQUENCE { utranCodecList [0] CodecList OPTIONAL, geranCodecList [1] CodecList OPTIONAL,
 * extensionContainer [2] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SupportedCodecsList extends Serializable {

    CodecList getUtranCodecList();

    CodecList getGeranCodecList();

    MAPExtensionContainer getExtensionContainer();

}

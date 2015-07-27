/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 CodecList ::= SEQUENCE { codec1 [1] Codec, codec2 [2] Codec OPTIONAL, codec3 [3] Codec OPTIONAL, codec4 [4] Codec OPTIONAL,
 * codec5 [5] Codec OPTIONAL, codec6 [6] Codec OPTIONAL, codec7 [7] Codec OPTIONAL, codec8 [8] Codec OPTIONAL,
 * extensionContainer [9] ExtensionContainer OPTIONAL, ...} -- Codecs are sent in priority order where codec1 has highest
 * priority
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CodecList extends Serializable {

    Codec getCodec1();

    Codec getCodec2();

    Codec getCodec3();

    Codec getCodec4();

    Codec getCodec5();

    Codec getCodec6();

    Codec getCodec7();

    Codec getCodec8();

    MAPExtensionContainer getExtensionContainer();

}

/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 EPC-AV ::= SEQUENCE { rand RAND, xres XRES, autn AUTN, kasme KASME, extensionContainer ExtensionContainer OPTIONAL, ...}
 *
 *
 * RAND ::= OCTET STRING (SIZE (16)) XRES ::= OCTET STRING (SIZE (4..16)) AUTN ::= OCTET STRING (SIZE (16)) KASME ::= OCTET
 * STRING (SIZE (32))
 *
 * @author david@tekeshe.com
 *
 */
public interface EpcAv extends Serializable {

    byte[] getRand();

    byte[] getXres();

    byte[] getAutn();

    byte[] getKasme();

    MAPExtensionContainer getExtensionContainer();

}

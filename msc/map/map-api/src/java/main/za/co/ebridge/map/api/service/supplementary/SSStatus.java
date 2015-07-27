/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

/**
 *
 SS-Status ::= OCTET STRING (SIZE (1))
 *
 * -- bits 8765: 0000 (unused) -- bits 4321: Used to convey the "P bit","R bit","A bit" and "Q bit", -- representing
 * supplementary service state information -- as defined in TS 3GPP TS 23.011 [22]
 *
 * -- bit 4: "Q bit"
 *
 * -- bit 3: "P bit"
 *
 * -- bit 2: "R bit"
 *
 * -- bit 1: "A bit"
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SSStatus extends Serializable {

    int getData();

    boolean getQBit();

    boolean getPBit();

    boolean getRBit();

    boolean getABit();

}
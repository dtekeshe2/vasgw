package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import za.co.ebridge.asn.impl.BitSetStrictLength;

import java.io.Serializable;

/**
 * CSG-Id ::= BIT STRING (SIZE (27)) -- coded according to 3GPP TS 23.003 [17].
 */
public interface CSGId
        extends Serializable
{

    BitSetStrictLength getData();

    // TODO: add implementing of internal structure (?)

}

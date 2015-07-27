package za.co.ebridge.map.api.service.mobility.imei;

import za.co.ebridge.asn.impl.BitSetStrictLength;

import java.io.Serializable;

/**
 * UESBI-IuA ::= BIT STRING (SIZE(1..128)) -- See 3GPP TS 25.413
 */
public interface UESBIIuA
        extends Serializable
{

    BitSetStrictLength getData();

}

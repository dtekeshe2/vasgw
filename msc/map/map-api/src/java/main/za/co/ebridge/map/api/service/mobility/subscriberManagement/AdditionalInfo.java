package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import za.co.ebridge.asn.impl.BitSetStrictLength;

import java.io.Serializable;

/**
 * AdditionalInfo ::= BIT STRING (SIZE (1..136)) -- Refers to Additional Info as specified in 3GPP TS 43.068
 */
public interface AdditionalInfo
        extends Serializable
{

    BitSetStrictLength getData();

}

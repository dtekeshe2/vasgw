package za.co.ebridge.map.api.primitives;

import java.io.Serializable;

/**
 * LMSI ::= OCTET STRING (SIZE (4))
 */
public interface LMSI
        extends Serializable
{

    byte[] getData();

}

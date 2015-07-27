package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;

import java.io.Serializable;

public interface Encodable
        extends Serializable
{

    void encode(AsnOutputStream aos)
            throws
            EncodeException;

    void decode(AsnInputStream ais)
            throws
            ParseException;

}

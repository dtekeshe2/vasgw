package za.co.ebridge.map.impl.service.mobility.authentication;

import za.co.ebridge.map.api.service.mobility.authentication.CK;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class CKImpl
        extends OctetStringBase
        implements CK
{

    public CKImpl(byte[] data)
    {
        super(16, 16, "CK", data);
    }

    public CKImpl()
    {
        super(16, 16, "CK");
    }

    @Override
    public byte[] getData()
    {
        return this.data;
    }

}

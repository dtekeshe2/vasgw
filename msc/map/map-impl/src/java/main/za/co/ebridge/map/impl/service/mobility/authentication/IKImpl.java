package za.co.ebridge.map.impl.service.mobility.authentication;

import za.co.ebridge.map.api.service.mobility.authentication.IK;
import za.co.ebridge.map.impl.primitives.OctetStringBase;

public class IKImpl
        extends OctetStringBase
        implements IK
{

    public IKImpl(byte[] data)
    {
        super(16, 16, "IK", data);
    }

    public IKImpl()
    {
        super(16, 16, "IK");
    }

    @Override
    public byte[] getData()
    {
        return this.data;
    }

}

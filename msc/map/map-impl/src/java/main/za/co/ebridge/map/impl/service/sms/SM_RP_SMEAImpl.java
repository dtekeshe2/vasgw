package za.co.ebridge.map.impl.service.sms;

import java.io.ByteArrayInputStream;

import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.service.sms.SM_RP_SMEA;
import za.co.ebridge.map.api.smstpdu.AddressField;
import za.co.ebridge.map.impl.primitives.OctetStringBase;
import za.co.ebridge.map.impl.smstpdu.AddressFieldImpl;

public class SM_RP_SMEAImpl
        extends OctetStringBase
        implements SM_RP_SMEA
{

    public SM_RP_SMEAImpl()
    {
        super(1, 12, "SM_RP_SMEA");
    }

    public SM_RP_SMEAImpl(byte[] data)
    {
        super(1, 12, "SM_RP_SMEA", data);
    }

    public SM_RP_SMEAImpl(AddressField addressField)
            throws
            MAPException
    {
        super(1, 12, "SM_RP_SMEA");

        if (addressField == null)
        {
            throw new MAPException("addressField field must not be equal null");
        }

        AsnOutputStream res = new AsnOutputStream();
        addressField.encodeData(res);
        this.data = res.toByteArray();
    }

    public byte[] getData()
    {
        return data;
    }

    @Override
    public AddressField getAddressField()
            throws
            MAPException
    {

        ByteArrayInputStream stm = new ByteArrayInputStream(data);
        AddressField res = AddressFieldImpl.createMessage(stm);
        return res;
    }
}

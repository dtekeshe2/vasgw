package za.co.ebridge.map.impl.smstpdu;

import za.co.ebridge.map.api.datacoding.NationalLanguageIdentifier;
import za.co.ebridge.map.api.smstpdu.NationalLanguageSingleShiftIdentifier;
import za.co.ebridge.map.api.smstpdu.UserDataHeader;

public class NationalLanguageSingleShiftIdentifierImpl
        extends Gsm7NationalLanguageIdentifierImpl
        implements
        NationalLanguageSingleShiftIdentifier
{

    public NationalLanguageSingleShiftIdentifierImpl(NationalLanguageIdentifier nationalLanguageCode)
    {
        super(nationalLanguageCode);
    }

    public NationalLanguageSingleShiftIdentifierImpl(byte[] encodedInformationElementData)
    {
        super(encodedInformationElementData);
    }

    public int getEncodedInformationElementIdentifier()
    {
        return UserDataHeader._InformationElementIdentifier_NationalLanguageSingleShift;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("NationalLanguageSingleShiftIdentifier [");
        sb.append("nationalLanguageCode=");
        sb.append(this.getNationalLanguageIdentifier());
        sb.append("]");

        return sb.toString();
    }
}

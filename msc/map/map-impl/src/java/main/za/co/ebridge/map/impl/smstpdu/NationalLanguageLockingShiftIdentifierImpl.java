package za.co.ebridge.map.impl.smstpdu;

import za.co.ebridge.map.api.datacoding.NationalLanguageIdentifier;
import za.co.ebridge.map.api.smstpdu.NationalLanguageLockingShiftIdentifier;
import za.co.ebridge.map.api.smstpdu.UserDataHeader;

public class NationalLanguageLockingShiftIdentifierImpl
        extends Gsm7NationalLanguageIdentifierImpl
        implements
        NationalLanguageLockingShiftIdentifier
{

    public NationalLanguageLockingShiftIdentifierImpl(NationalLanguageIdentifier nationalLanguageCode)
    {
        super(nationalLanguageCode);
    }

    public NationalLanguageLockingShiftIdentifierImpl(byte[] encodedInformationElementData)
    {
        super(encodedInformationElementData);
    }

    public int getEncodedInformationElementIdentifier()
    {
        return UserDataHeader._InformationElementIdentifier_NationalLanguageLockingShift;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("NationalLanguageLockingShiftIdentifier [");
        sb.append("nationalLanguageCode=");
        sb.append(this.getNationalLanguageIdentifier());
        sb.append("]");

        return sb.toString();
    }
}

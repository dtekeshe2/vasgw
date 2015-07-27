package za.co.ebridge.map.api.datacoding;


import za.co.ebridge.map.api.smstpdu.CharacterSet;
import za.co.ebridge.map.api.smstpdu.DataCodingSchemaMessageClass;

import java.io.Serializable;

public interface CBSDataCodingScheme
        extends Serializable
{
    int getCode();

    CBSDataCodingGroup getDataCodingGroup();

    CBSNationalLanguage getNationalLanguageShiftTable();


    CharacterSet getCharacterSet();

    DataCodingSchemaMessageClass getMessageClass();

    boolean getIsCompressed();
}

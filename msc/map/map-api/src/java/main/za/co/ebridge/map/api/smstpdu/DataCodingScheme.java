/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

/**
 * See 3GPP TS 23.038 Chapter 4 SMS Data Coding Scheme
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface DataCodingScheme extends Serializable {

    int getCode();

    DataCodingGroup getDataCodingGroup();

    DataCodingSchemaMessageClass getMessageClass();

    DataCodingSchemaIndicationType getDataCodingSchemaIndicationType();

    Boolean getSetIndicationActive();

    CharacterSet getCharacterSet();

    boolean getIsCompressed();

}
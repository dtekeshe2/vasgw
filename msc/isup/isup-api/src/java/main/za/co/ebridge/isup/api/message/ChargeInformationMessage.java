package za.co.ebridge.isup.api.message;

public interface ChargeInformationMessage
        extends ISUPMessage
{
    /**
     * Charge Information Message, Q.763 reference table (Note) <br>
     * {@link ChargeInformationMessage}
     */
    int MESSAGE_CODE = 0x31;
    //Q763 - > – "The format of this message is a national matter."

}

package za.co.ebridge.isup.api.message.parameter;

public interface RedirectionNumber
        extends NAINumber, Number, ISUPParameter
{
    /**
     * numbering plan indicator indicator value. See Q.763 - 3.9d
     */
    int _NPI_ISDN = 1;
    /**
     * numbering plan indicator indicator value. See Q.763 - 3.9d
     */
    int _NPI_DATA = 3;
    /**
     * numbering plan indicator indicator value. See Q.763 - 3.9d
     */
    int _NPI_TELEX = 4;

    /**
     * internal network number indicator indicator value. See Q.763 - 3.9c
     */
    int _INN_ROUTING_ALLOWED = 0;
    /**
     * internal network number indicator indicator value. See Q.763 - 3.9c
     */
    int _INN_ROUTING_NOT_ALLOWED = 1;
    int _PARAMETER_CODE = 0x0C;

}

package za.co.ebridge.sccp.api.parameter;

/**
 * Return cause values for connectionless message
 */
public enum ReturnCauseValue
{

    NO_TRANSLATION_FOR_NATURE(0x0), NO_TRANSLATION_FOR_ADDRESS(0x1), SUBSYSTEM_CONGESTION(0x2), SUBSYSTEM_FAILURE
        (0x3), UNEQUIPED_USER(
        0x4), MTP_FAILURE(0x5), NETWORK_CONGESTION(0x6), UNQALIFIED(0x7), ERR_IN_MSG_TRANSPORT(0x8),
    ERR_IN_LOCAL_PROCESSING(
        0x9), CANNOT_REASEMBLE(0xA), SCCP_FAILURE(0xB), HOP_COUNTER_VIOLATION(0xC), SEG_NOT_SUPPORTED(0xD),
    SEG_FAILURE(0xE);

    private int code;

    private ReturnCauseValue(int code)
    {
        this.code = code;
    }

    public int getCode()
    {
        return this.code;
    }

    public static ReturnCauseValue getInstance(int code)
    {
        switch (code)
        {
            case 0x0:
                return NO_TRANSLATION_FOR_NATURE;
            case 0x1:
                return NO_TRANSLATION_FOR_ADDRESS;
            case 0x2:
                return SUBSYSTEM_CONGESTION;
            case 0x3:
                return SUBSYSTEM_FAILURE;
            case 0x4:
                return UNEQUIPED_USER;
            case 0x5:
                return MTP_FAILURE;
            case 0x6:
                return NETWORK_CONGESTION;
            case 0x7:
                return UNQALIFIED;
            case 0x8:
                return ERR_IN_MSG_TRANSPORT;
            case 0x9:
                return ERR_IN_LOCAL_PROCESSING;
            case 0xA:
                return CANNOT_REASEMBLE;
            case 0xB:
                return SCCP_FAILURE;
            case 0xC:
                return HOP_COUNTER_VIOLATION;
            case 0xD:
                return SEG_NOT_SUPPORTED;
            case 0xE:
                return SEG_FAILURE;
            default:
                return UNQALIFIED;

        }
    }
}

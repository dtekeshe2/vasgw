package za.co.ebridge.sccp.api.parameter;

/**
 * Return cause values parameter for connectionless message
 */
public interface ReturnCause
        extends Parameter
{

    int PARAMETER_CODE = 0xB;

    // public static final int NO_TRANSLATION_FOR_NATURE = 0x0;
    // public static final int NO_TRANSLATION_FOR_ADDRESS = 0x1;
    // public static final int SUBSYSTEM_CONGESTION = 0x2;
    // public static final int SUBSYSTEM_FAILURE = 0x3;
    // public static final int UNEQUIPED_USER = 0x4;
    // public static final int MTP_FAILURE = 0x5;
    // public static final int NETWORK_CONGESTION = 0x6;
    // public static final int UNQALIFIED = 0x7;
    // public static final int ERR_IN_MSG_TRANSPORT = 0x8;
    // public static final int ERR_IN_LOCAL_PROCESSING = 0x9;
    // public static final int CANNOT_REASEMBLE = 0xA;
    // public static final int SCCP_FAILURE = 0xB;
    // public static final int HOP_COUNTER_VIOLATION = 0xC;
    // public static final int SEG_NOT_SUPPORTED = 0xD;
    // public static final int SEG_FAILURE = 0xE;

    /**
     * Gets the value of this parameter.
     *
     * @return the value of this parameter.
     */
    ReturnCauseValue getValue();
}

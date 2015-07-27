package za.co.ebridge.isup.api.message.parameter;

/**
 * This RangeAndStatus indiactes whcih CICs, starting from one present in message are affected. Range indicates how
 * many CICs
 * are potentially affected. Status contains bits indicating CIC affected(1 - affected, 0 - not affected) <br>
 * For content interpretation refer to Q.763 3.43
 */
public interface RangeAndStatus
        extends ISUPParameter
{

    int _PARAMETER_CODE = 0x16;

    /**
     * Fetches range.
     *
     * @return
     */
    byte getRange();

    /**
     * Sets range.
     *
     * @param range
     * @param addStatus - flag indicates if implementation should create proper status
     */
    void setRange(byte range, boolean addStatus);

    /**
     * Sets range.
     *
     * @param range
     */
    void setRange(byte range);

    /**
     * Gets raw status part.
     *
     * @return
     */
    byte[] getStatus();

    /**
     * Gets raw status part.
     *
     * @return
     */
    void setStatus(byte[] status);

    void setAffected(byte subrange, boolean v)
            throws
            IllegalArgumentException;

    boolean isAffected(byte b)
            throws
            IllegalArgumentException;
}

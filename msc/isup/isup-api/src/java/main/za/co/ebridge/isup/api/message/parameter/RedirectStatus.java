package za.co.ebridge.isup.api.message.parameter;

public interface RedirectStatus
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x8A;

    /**
     * See Q.763 3.98 Redirect status indicator : not used
     */
    int _RSI_NOT_USED = 0;
    /**
     * See Q.763 3.98 Redirect status indicator : ack of redirection
     */
    int _RSI_AOR = 1;
    /**
     * See Q.763 3.98 Redirect status indicator : redirection will not be invoked
     */
    int _RSI_RWNBI = 2;

    byte[] getStatus();

    void setStatus(byte[] status);

    int getStatusIndicator(byte b);
}

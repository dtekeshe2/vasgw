package za.co.ebridge.isup.api.message.parameter;

public interface UIDCapabilityIndicators
        extends ISUPParameter
{

    int _PARAMETER_CODE = 0x75;

    // FIXME: add C defs
    /**
     * See Q.763 3.79 Through-connection instruction indicator : no indication
     */
    boolean _TCI_NO_INDICATION = false;

    /**
     * See Q.763 3.79 Through-connection instruction indicator : through-connection modification possible
     */
    boolean _TCI_TCMP = true;

    /**
     * See Q.763 3.79 T9 timer indicator : no indication
     */
    boolean _T9_TII_NO_INDICATION = false;

    /**
     * See Q.763 3.79 T9 timer indicator : stopping of T9 timer possible
     */
    boolean _T9_TI_SOT9P = false;

    byte[] getUIDCapabilityIndicators();

    void setUIDCapabilityIndicators(byte[] uidCapabilityIndicators);

    byte createUIDAction(boolean TCI, boolean T9);

    boolean getT9Indicator(byte b);

    boolean getTCIndicator(byte b);
}

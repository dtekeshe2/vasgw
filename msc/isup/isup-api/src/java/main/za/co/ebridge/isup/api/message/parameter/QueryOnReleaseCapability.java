package za.co.ebridge.isup.api.message.parameter;

public interface QueryOnReleaseCapability
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x85;

    // FIXME: add C defs
    /**
     * See Q.763 QoR capability indicator : no indication
     */
    boolean _QoRI_NO_INDICATION = false;

    /**
     * See Q.763 QoR capability indicator : QoR support
     */
    boolean _QoRI_SUPPORT = true;

    byte[] getCapabilities();

    void setCapabilities(byte[] capabilities);

    boolean isQoRSupport(byte b);

    byte createQoRSupport(boolean enabled);
}

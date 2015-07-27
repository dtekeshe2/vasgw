package za.co.ebridge.isup.api.message.parameter;

public interface CollectCallRequest
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x79;

    /**
     * See Q.763 3.81 Collect call request indicator : no indication
     */
    boolean _CCRI_NO_INDICATION = false;
    /**
     * See Q.763 3.81 Collect call request indicator : collect call requested
     */
    boolean _CCRI_CCR = true;

    boolean isCollectCallRequested();

    void setCollectCallRequested(boolean collectCallRequested);
}

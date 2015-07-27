package za.co.ebridge.isup.api.message.parameter;

public interface OptionalForwardCallIndicators
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x08;

    /**
     * See Q.763 3.38 Simple segmentation indicator : no additional information will be sent
     */
    boolean _SSI_NO_ADDITIONAL_INFO = false;

    /**
     * See Q.763 3.38 Simple segmentation indicator : additional information will be sent in a segmentation message
     */
    boolean _SSI_ADDITIONAL_INFO = true;

    /**
     * See Q.763 3.38 Connected line identity request indicator :
     */
    boolean _CLIRI_NOT_REQUESTED = false;

    /**
     * See Q.763 3.38 Connected line identity request indicator :
     */
    boolean _CLIRI_REQUESTED = true;
    /**
     * See Q.763 3.38 Closed user group call indicator : non-CUG call
     */
    int _CUGCI_NON_CUG_CALL = 0;

    /**
     * See Q.763 3.38 Closed user group call indicator : closed user group call, outgoing access allowed
     */
    int _CUGCI_CUG_CALL_OAL = 2;

    /**
     * See Q.763 3.38 Closed user group call indicator : closed user group call, outgoing access not allowed
     */
    int _CUGCI_CUG_CALL_OANL = 3;

    int getClosedUserGroupCallIndicator();

    void setClosedUserGroupCallIndicator(int closedUserGroupCallIndicator);

    boolean isSimpleSegmentationIndicator();

    void setSimpleSegmentationIndicator(boolean simpleSegmentationIndicator);

    boolean isConnectedLineIdentityRequestIndicator();

    void setConnectedLineIdentityRequestIndicator(boolean connectedLineIdentityRequestIndicator);
}

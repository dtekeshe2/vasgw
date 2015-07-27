package za.co.ebridge.isup.api.message.parameter;

public interface RedirectionNumberRestriction
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x40;
    // FIXME: add C defs
    /**
     * See Q.763 Presentation restricted indicator presentation allowed
     */
    byte _PRI_PA = 0;
    /**
     * See Q.763 Presentation restricted indicator presentation restricted
     */
    byte _PRI_PR = 1;

    int getPresentationRestrictedIndicator();

    void setPresentationRestrictedIndicator(int presentationRestrictedIndicator);
}

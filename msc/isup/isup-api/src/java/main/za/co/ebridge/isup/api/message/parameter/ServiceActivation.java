package za.co.ebridge.isup.api.message.parameter;

public interface ServiceActivation
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0x33;

    byte[] getFeatureCodes();

    void setFeatureCodes(byte[] featureCodes);

}

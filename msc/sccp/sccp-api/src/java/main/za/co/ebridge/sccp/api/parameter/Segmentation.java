package za.co.ebridge.sccp.api.parameter;

public interface Segmentation
        extends Parameter
{

    int PARAMETER_CODE = 0x10;

    boolean isFirstSegIndication();

    boolean isClass1Selected();

    byte getRemainingSegments();

    int getSegmentationLocalRef();

}

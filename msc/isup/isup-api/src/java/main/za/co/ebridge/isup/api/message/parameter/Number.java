package za.co.ebridge.isup.api.message.parameter;

public interface Number
        extends ISUPParameter
{
    boolean isOddFlag();

    String getAddress();

    void setAddress(String address);
}

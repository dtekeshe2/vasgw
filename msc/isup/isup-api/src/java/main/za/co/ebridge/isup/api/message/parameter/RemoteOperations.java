package za.co.ebridge.isup.api.message.parameter;

public interface RemoteOperations
        extends ISUPParameter
{
    // FIXME: fill this!
    int _PARAMETER_CODE = 0x32;

    int PROTOCOL_REMOTE_OPERATIONS = 0x11;

    void setProtocol(byte protocol);

    byte getProtocol();

    void setOperations(RemoteOperation... operations);

    RemoteOperation[] getOperations();
}

package za.co.ebridge.sccp.api;

public interface RemoteSignalingPointCode
{

    int getRemoteSpc();

    int getRemoteSpcFlag();

    int getMask();

    boolean isRemoteSpcProhibited();

    boolean isRemoteSccpProhibited();

}

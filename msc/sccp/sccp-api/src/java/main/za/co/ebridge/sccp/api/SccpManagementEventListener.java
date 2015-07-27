package za.co.ebridge.sccp.api;

public interface SccpManagementEventListener
{

    void onServiceStarted();

    void onServiceStopped();

    void onRemoveAllResources();

    void onRemoteSubSystemUp(RemoteSubSystem rss);

    void onRemoteSubSystemDown(RemoteSubSystem rss);

    void onRemoteSpcUp(RemoteSignalingPointCode remoteSpc);

    void onRemoteSpcDown(RemoteSignalingPointCode remoteSpc);

    void onRemoteSccpUp(RemoteSignalingPointCode remoteSpc);

    void onRemoteSccpDown(RemoteSignalingPointCode remoteSpc);

}

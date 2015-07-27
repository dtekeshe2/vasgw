package za.co.ebridge.isup.api;

public interface ISUPListener
{

    void onEvent(ISUPEvent event);

    void onTimeout(ISUPTimeoutEvent event);

}

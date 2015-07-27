package za.co.ebridge.sccp.api;

public interface RemoteSubSystem
{

    boolean isRemoteSsnProhibited();

    int getRemoteSpc();

    int getRemoteSsn();

    int getRemoteSsnFlag();

    boolean getMarkProhibitedWhenSpcResuming();
}

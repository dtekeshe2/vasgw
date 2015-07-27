package za.co.ebridge.sctp.api;

public interface ServerListener
{
	public void onNewRemoteConnection( Server server, Association association );
}

package za.co.ebridge.sctp.api;

public interface ManagementEventListener
{

	public void onServiceStarted();

	public void onServiceStopped();

	public void onRemoveAllResources();

	public void onServerAdded(Server server);

	public void onServerRemoved(Server serverName);

	public void onAssociationAdded(Association association);

	public void onAssociationRemoved(Association association);

	public void onAssociationStarted(Association association);

	public void onAssociationStopped(Association association);

	public void onAssociationUp(Association association);

	public void onAssociationDown(Association association);
	
}

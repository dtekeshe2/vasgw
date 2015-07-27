package za.co.ebridge.isup.api;

/**
 * Simple class to hide details how circuits are managed
 */
public interface CircuitManager
{
    void addCircuit(int cic, int dpc);

    void removeCircuit(int cic, int dpc);

    boolean isCircuitPresent(int cic, int dpc);

    long[] getChannelIDs();

    int getCIC(long channelID);

    int getDPC(long channelID);

    long getChannelID(int cic, int dpc);
}

package za.co.ebridge.sccp.api;

public interface Mtp3Destination
{

    int getFirstDpc();

    int getLastDpc();

    int getFirstSls();

    int getLastSls();

    int getSlsMask();

    boolean match(int dpc, int sls);
}

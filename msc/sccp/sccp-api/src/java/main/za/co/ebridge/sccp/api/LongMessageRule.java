package za.co.ebridge.sccp.api;

public interface LongMessageRule
{
    LongMessageRuleType getLongMessageRuleType();

    int getFirstSpc();

    int getLastSpc();

    boolean matches(int dpc);

}

package za.co.ebridge.m3ua.api;

public interface State
{
    String STATE_DOWN = "DOWN";
    String STATE_INACTIVE = "INACTIVE";
    String STATE_ACTIVE = "ACTIVE";
    String STATE_PENDING = "PENDING";

    String getName();
}

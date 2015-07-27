package za.co.ebridge.tcap.api.api.tc.dialog;

public enum TRPseudoState
{

    Idle,

    InitialReceived, InitialSent,

    Active,
    // additional state to mark removal
    Expunged;
}

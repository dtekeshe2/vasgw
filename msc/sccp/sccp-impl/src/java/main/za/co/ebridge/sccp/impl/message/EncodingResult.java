package za.co.ebridge.sccp.impl.message;

public enum EncodingResult
{

    // Successed encoding, data available for transfer
    Success,
    // Sccp error, returnCause should be returned or message discarded
    ReturnFailure,
    // Exception: data==null or has zero length
    DataMissed,
    // Exception: data length exceeds maximum possible safe length (2560)
    DataMaxLengthExceeded,
    // Exception: CalledPartyAddress is missed
    CalledPartyAddressMissing,
    // Exception: CallingPartyAddress is missed
    CallingPartyAddressMissing,
    // Exception: ProtocolClass is missed
    ProtocolClassMissing;

}

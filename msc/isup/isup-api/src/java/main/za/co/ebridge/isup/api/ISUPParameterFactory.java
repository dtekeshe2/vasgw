package za.co.ebridge.isup.api;


import za.co.ebridge.isup.api.message.parameter.AccessDeliveryInformation;
import za.co.ebridge.isup.api.message.parameter.ApplicationTransport;
import za.co.ebridge.isup.api.message.parameter.AutomaticCongestionLevel;
import za.co.ebridge.isup.api.message.parameter.BackwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.BackwardGVNS;
import za.co.ebridge.isup.api.message.parameter.CCNRPossibleIndicator;
import za.co.ebridge.isup.api.message.parameter.CCSS;
import za.co.ebridge.isup.api.message.parameter.CallDiversionInformation;
import za.co.ebridge.isup.api.message.parameter.CallDiversionTreatmentIndicators;
import za.co.ebridge.isup.api.message.parameter.CallHistoryInformation;
import za.co.ebridge.isup.api.message.parameter.CallOfferingTreatmentIndicators;
import za.co.ebridge.isup.api.message.parameter.CallReference;
import za.co.ebridge.isup.api.message.parameter.CallTransferNumber;
import za.co.ebridge.isup.api.message.parameter.CallTransferReference;
import za.co.ebridge.isup.api.message.parameter.CalledDirectoryNumber;
import za.co.ebridge.isup.api.message.parameter.CalledINNumber;
import za.co.ebridge.isup.api.message.parameter.CalledPartyNumber;
import za.co.ebridge.isup.api.message.parameter.CallingPartyCategory;
import za.co.ebridge.isup.api.message.parameter.CallingPartyNumber;
import za.co.ebridge.isup.api.message.parameter.CauseIndicators;
import za.co.ebridge.isup.api.message.parameter.ChargedPartyIdentification;
import za.co.ebridge.isup.api.message.parameter.CircuitAssigmentMap;
import za.co.ebridge.isup.api.message.parameter.CircuitGroupSuperVisionMessageType;
import za.co.ebridge.isup.api.message.parameter.CircuitIdentificationCode;
import za.co.ebridge.isup.api.message.parameter.CircuitStateIndicator;
import za.co.ebridge.isup.api.message.parameter.ClosedUserGroupInterlockCode;
import za.co.ebridge.isup.api.message.parameter.CollectCallRequest;
import za.co.ebridge.isup.api.message.parameter.ConferenceTreatmentIndicators;
import za.co.ebridge.isup.api.message.parameter.ConnectedNumber;
import za.co.ebridge.isup.api.message.parameter.ConnectionRequest;
import za.co.ebridge.isup.api.message.parameter.ContinuityIndicators;
import za.co.ebridge.isup.api.message.parameter.CorrelationID;
import za.co.ebridge.isup.api.message.parameter.DisplayInformation;
import za.co.ebridge.isup.api.message.parameter.EchoControlInformation;
import za.co.ebridge.isup.api.message.parameter.EventInformation;
import za.co.ebridge.isup.api.message.parameter.FacilityIndicator;
import za.co.ebridge.isup.api.message.parameter.ForwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.ForwardGVNS;
import za.co.ebridge.isup.api.message.parameter.GVNSUserGroup;
import za.co.ebridge.isup.api.message.parameter.GenericNotificationIndicator;
import za.co.ebridge.isup.api.message.parameter.GenericNumber;
import za.co.ebridge.isup.api.message.parameter.GenericReference;
import za.co.ebridge.isup.api.message.parameter.HTRInformation;
import za.co.ebridge.isup.api.message.parameter.HopCounter;
import za.co.ebridge.isup.api.message.parameter.InformationIndicators;
import za.co.ebridge.isup.api.message.parameter.InformationRequestIndicators;
import za.co.ebridge.isup.api.message.parameter.InvokingPivotReason;
import za.co.ebridge.isup.api.message.parameter.LocationNumber;
import za.co.ebridge.isup.api.message.parameter.LoopPreventionIndicators;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.MCIDRequestIndicators;
import za.co.ebridge.isup.api.message.parameter.MCIDResponseIndicators;
import za.co.ebridge.isup.api.message.parameter.MLPPPrecedence;
import za.co.ebridge.isup.api.message.parameter.NatureOfConnectionIndicators;
import za.co.ebridge.isup.api.message.parameter.NetworkManagementControls;
import za.co.ebridge.isup.api.message.parameter.NetworkRoutingNumber;
import za.co.ebridge.isup.api.message.parameter.NetworkSpecificFacility;
import za.co.ebridge.isup.api.message.parameter.OptionalBackwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.OptionalForwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.OriginalCalledINNumber;
import za.co.ebridge.isup.api.message.parameter.OriginalCalledNumber;
import za.co.ebridge.isup.api.message.parameter.OriginatingISCPointCode;
import za.co.ebridge.isup.api.message.parameter.OriginatingParticipatingServiceProvider;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInstructionIndicators;
import za.co.ebridge.isup.api.message.parameter.PerformingPivotIndicator;
import za.co.ebridge.isup.api.message.parameter.PivotCapability;
import za.co.ebridge.isup.api.message.parameter.PivotCounter;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingBackwardInformation;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingForwardInformation;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingIndicators;
import za.co.ebridge.isup.api.message.parameter.PivotStatus;
import za.co.ebridge.isup.api.message.parameter.PropagationDelayCounter;
import za.co.ebridge.isup.api.message.parameter.QueryOnReleaseCapability;
import za.co.ebridge.isup.api.message.parameter.RangeAndStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectBackwardInformation;
import za.co.ebridge.isup.api.message.parameter.RedirectCapability;
import za.co.ebridge.isup.api.message.parameter.RedirectCounter;
import za.co.ebridge.isup.api.message.parameter.RedirectStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectingNumber;
import za.co.ebridge.isup.api.message.parameter.RedirectionInformation;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumber;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumberRestriction;
import za.co.ebridge.isup.api.message.parameter.RemoteOperations;
import za.co.ebridge.isup.api.message.parameter.Reserved;
import za.co.ebridge.isup.api.message.parameter.ReturnToInvokingExchangeCallIdentifier;
import za.co.ebridge.isup.api.message.parameter.ReturnToInvokingExchangePossible;
import za.co.ebridge.isup.api.message.parameter.SCFID;
import za.co.ebridge.isup.api.message.parameter.ServiceActivation;
import za.co.ebridge.isup.api.message.parameter.SignalingPointCode;
import za.co.ebridge.isup.api.message.parameter.SubsequentNumber;
import za.co.ebridge.isup.api.message.parameter.SuspendResumeIndicators;
import za.co.ebridge.isup.api.message.parameter.TerminatingNetworkRoutingNumber;
import za.co.ebridge.isup.api.message.parameter.TransimissionMediumRequierementPrime;
import za.co.ebridge.isup.api.message.parameter.TransitNetworkSelection;
import za.co.ebridge.isup.api.message.parameter.TransmissionMediumRequirement;
import za.co.ebridge.isup.api.message.parameter.TransmissionMediumUsed;
import za.co.ebridge.isup.api.message.parameter.UIDActionIndicators;
import za.co.ebridge.isup.api.message.parameter.UIDCapabilityIndicators;
import za.co.ebridge.isup.api.message.parameter.UserServiceInformation;
import za.co.ebridge.isup.api.message.parameter.UserServiceInformationPrime;
import za.co.ebridge.isup.api.message.parameter.UserTeleserviceInformation;
import za.co.ebridge.isup.api.message.parameter.UserToUserIndicators;
import za.co.ebridge.isup.api.message.parameter.UserToUserInformation;
import za.co.ebridge.isup.api.message.parameter.GenericDigits;
import za.co.ebridge.isup.api.message.parameter.accessTransport.AccessTransport;
import za.co.ebridge.isup.api.message.parameter.InvokingRedirectReasonType;
import za.co.ebridge.isup.api.message.parameter.PerformingRedirectIndicator;
import za.co.ebridge.isup.api.message.parameter.ErrorCode;
import za.co.ebridge.isup.api.message.parameter.Problem;
import za.co.ebridge.isup.api.message.parameter.Parameter;
import za.co.ebridge.isup.api.message.parameter.Reject;
import za.co.ebridge.isup.api.message.parameter.ReturnResult;
import za.co.ebridge.isup.api.message.parameter.OperationCode;
import za.co.ebridge.isup.api.message.parameter.Invoke;
import za.co.ebridge.isup.api.message.parameter.RedirectForwardInformation;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInstructionIndicator;
import za.co.ebridge.isup.api.message.parameter.InvokingRedirectReason;
import za.co.ebridge.isup.api.message.parameter.RedirectReason;
import za.co.ebridge.isup.api.message.parameter.ReturnToInvokingExchangeDuration;
import za.co.ebridge.isup.api.message.parameter.ReturnError;
import za.co.ebridge.isup.api.message.parameter.PivotReason;
import za.co.ebridge.isup.api.message.parameter.InvokingPivotReasonType;
import za.co.ebridge.isup.api.message.parameter.Status;

public interface ISUPParameterFactory
{

    AccessDeliveryInformation createAccessDeliveryInformation();

    AccessTransport createAccessTransport();

    ApplicationTransport createApplicationTransport();

    AutomaticCongestionLevel createAutomaticCongestionLevel();

    BackwardCallIndicators createBackwardCallIndicators();

    BackwardGVNS createBackwardGVNS();

    CallDiversionInformation createCallDiversionInformation();

    CallDiversionTreatmentIndicators createCallDiversionTreatmentIndicators();

    CalledDirectoryNumber createCalledDirectoryNumber();

    CalledINNumber createCalledINNumber();

    CalledPartyNumber createCalledPartyNumber();

    CallHistoryInformation createCallHistoryInformation();

    CallingPartyCategory createCallingPartyCategory();

    CallingPartyNumber createCallingPartyNumber();

    CallOfferingTreatmentIndicators createCallOfferingTreatmentIndicators();

    CallReference createCallReference();

    CallTransferNumber createCallTransferNumber();

    CallTransferReference createCallTransferReference();

    CauseIndicators createCauseIndicators();

    CCNRPossibleIndicator createCCNRPossibleIndicator();

    CCSS createCCSS();

    ChargedPartyIdentification createChargedPartyIdentification();

    CircuitAssigmentMap createCircuitAssigmentMap();

    CircuitGroupSuperVisionMessageType createCircuitGroupSuperVisionMessageType();

    CircuitIdentificationCode createCircuitIdentificationCode();

    CircuitStateIndicator createCircuitStateIndicator();

    ClosedUserGroupInterlockCode createClosedUserGroupInterlockCode();

    CollectCallRequest createCollectCallRequest();

    ConferenceTreatmentIndicators createConferenceTreatmentIndicators();

    ConnectedNumber createConnectedNumber();

    ConnectionRequest createConnectionRequest();

    ContinuityIndicators createContinuityIndicators();

    CorrelationID createCorrelationID();

    DisplayInformation createDisplayInformation();

    EchoControlInformation createEchoControlInformation();

    ErrorCode createErrorCode();

    EventInformation createEventInformation();

    FacilityIndicator createFacilityIndicator();

    ForwardCallIndicators createForwardCallIndicators();

    ForwardGVNS createForwardGVNS();

    GenericDigits createGenericDigits();

    GenericNotificationIndicator createGenericNotificationIndicator();

    GenericNumber createGenericNumber();

    GenericReference createGenericReference();

    GVNSUserGroup createGVNSUserGroup();

    HopCounter createHopCounter();

    HTRInformation createHTRInformation();

    InformationIndicators createInformationIndicators();

    InformationRequestIndicators createInformationRequestIndicators();

    Invoke createInvoke();

    InvokingPivotReason createInvokingPivotReason(InvokingPivotReasonType type);

    InvokingRedirectReason createInvokingRedirectReason(InvokingRedirectReasonType type);

    LocationNumber createLocationNumber();

    LoopPreventionIndicators createLoopPreventionIndicators();

    MCIDRequestIndicators createMCIDRequestIndicators();

    MCIDResponseIndicators createMCIDResponseIndicators();

    MessageCompatibilityInformation createMessageCompatibilityInformation();

    MessageCompatibilityInstructionIndicator createMessageCompatibilityInstructionIndicator();

    MLPPPrecedence createMLPPPrecedence();

    NatureOfConnectionIndicators createNatureOfConnectionIndicators();

    NetworkManagementControls createNetworkManagementControls();

    NetworkRoutingNumber createNetworkRoutingNumber();

    NetworkSpecificFacility createNetworkSpecificFacility();

    OperationCode createOperationCode();

    OptionalBackwardCallIndicators createOptionalBackwardCallIndicators();

    OptionalForwardCallIndicators createOptionalForwardCallIndicators();

    OriginalCalledINNumber createOriginalCalledINNumber();

    OriginalCalledNumber createOriginalCalledNumber();

    OriginatingISCPointCode createOriginatingISCPointCode();

    OriginatingParticipatingServiceProvider createOriginatingParticipatingServiceProvider();

    Parameter createParameter();

    ParameterCompatibilityInformation createParameterCompatibilityInformation();

    ParameterCompatibilityInstructionIndicators createParameterCompatibilityInstructionIndicators();

    PerformingPivotIndicator createPerformingPivotIndicator();

    PerformingRedirectIndicator createPerformingRedirectIndicator();

    PivotCapability createPivotCapability();

    PivotCounter createPivotCounter();

    PivotReason createPivotReason();

    PivotRoutingBackwardInformation createPivotRoutingBackwardInformation();

    PivotRoutingForwardInformation createPivotRoutingForwardInformation();

    PivotRoutingIndicators createPivotRoutingIndicators();

    PivotStatus createPivotStatus();

    Problem createProblem();

    PropagationDelayCounter createPropagationDelayCounter();

    QueryOnReleaseCapability createQueryOnReleaseCapability();

    RangeAndStatus createRangeAndStatus();

    RedirectBackwardInformation createRedirectBackwardInformation();

    RedirectCapability createRedirectCapability();

    RedirectCounter createRedirectCounter();

    RedirectForwardInformation createRedirectForwardformation();

    RedirectingNumber createRedirectingNumber();

    RedirectionInformation createRedirectionInformation();

    RedirectionNumber createRedirectionNumber();

    RedirectionNumberRestriction createRedirectionNumberRestriction();

    RedirectReason createRedirectReason();

    RedirectStatus createRedirectStatus();

    Reject createReject();

    RemoteOperations createRemoteOperations();

    Reserved createReserved();

    ReturnError createReturnError();

    ReturnResult createReturnResult();

    ReturnToInvokingExchangeCallIdentifier createReturnToInvokingExchangeCallIdentifier();

    ReturnToInvokingExchangeDuration createReturnToInvokingExchangeDuration();

    ReturnToInvokingExchangePossible createReturnToInvokingExchangePossible();

    SCFID createSCFID();

    ServiceActivation createServiceActivation();

    SignalingPointCode createSignalingPointCode();

    Status createStatus();

    SubsequentNumber createSubsequentNumber();

    SuspendResumeIndicators createSuspendResumeIndicators();

    TerminatingNetworkRoutingNumber createTerminatingNetworkRoutingNumber();

    TransimissionMediumRequierementPrime createTransimissionMediumRequierementPrime();

    TransitNetworkSelection createTransitNetworkSelection();

    TransmissionMediumRequirement createTransmissionMediumRequirement();

    TransmissionMediumUsed createTransmissionMediumUsed();

    UIDActionIndicators createUIDActionIndicators();

    UIDCapabilityIndicators createUIDCapabilityIndicators();

    UserServiceInformation createUserServiceInformation();

    UserServiceInformationPrime createUserServiceInformationPrime();

    UserTeleserviceInformation createUserTeleserviceInformation();

    UserToUserIndicators createUserToUserIndicators();

    UserToUserInformation createUserToUserInformation();
}

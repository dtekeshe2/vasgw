package za.co.ebridge.isup.impl.message.parameter;

import za.co.ebridge.isup.api.ISUPParameterFactory;
import za.co.ebridge.isup.impl.message.parameter.accessTransport.AccessTransportImpl;
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
import za.co.ebridge.isup.api.message.parameter.Status;
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
import za.co.ebridge.isup.api.message.parameter.InvokingRedirectReasonType;

public class ISUPParameterFactoryImpl
        implements ISUPParameterFactory
{

    public AccessDeliveryInformation createAccessDeliveryInformation()
    {

        return new AccessDeliveryInformationImpl();
    }

    public AccessTransport createAccessTransport()
    {

        return new AccessTransportImpl();
    }

    public ApplicationTransport createApplicationTransport()
    {

        return new ApplicationTransportImpl();
    }

    public AutomaticCongestionLevel createAutomaticCongestionLevel()
    {

        return new AutomaticCongestionLevelImpl();
    }

    public BackwardCallIndicators createBackwardCallIndicators()
    {

        return new BackwardCallIndicatorsImpl();
    }

    public BackwardGVNS createBackwardGVNS()
    {

        return new BackwardGVNSImpl();
    }

    public CallDiversionInformation createCallDiversionInformation()
    {

        return new CallDiversionInformationImpl();
    }

    public CallDiversionTreatmentIndicators createCallDiversionTreatmentIndicators()
    {

        return new CallDiversionTreatmentIndicatorsImpl();
    }

    public CalledDirectoryNumber createCalledDirectoryNumber()
    {

        return new CalledDirectoryNumberImpl();
    }

    public CalledINNumber createCalledINNumber()
    {

        return new CalledINNumberImpl();
    }

    public CalledPartyNumber createCalledPartyNumber()
    {

        return new CalledPartyNumberImpl();
    }

    public CallHistoryInformation createCallHistoryInformation()
    {

        return new CallHistoryInformationImpl();
    }

    public CallingPartyCategory createCallingPartyCategory()
    {

        return new CallingPartyCategoryImpl();
    }

    public CallingPartyNumber createCallingPartyNumber()
    {

        return new CallingPartyNumberImpl();
    }

    public CallOfferingTreatmentIndicators createCallOfferingTreatmentIndicators()
    {

        return new CallOfferingTreatmentIndicatorsImpl();
    }

    public CallReference createCallReference()
    {

        return new CallReferenceImpl();
    }

    public CallTransferNumber createCallTransferNumber()
    {

        return new CallTransferNumberImpl();
    }

    public CallTransferReference createCallTransferReference()
    {

        return new CallTransferReferenceImpl();
    }

    public CauseIndicators createCauseIndicators()
    {

        return new CauseIndicatorsImpl();
    }

    public CCNRPossibleIndicator createCCNRPossibleIndicator()
    {

        return new CCNRPossibleIndicatorImpl();
    }

    public CCSS createCCSS()
    {

        return new CCSSImpl();
    }

    public ChargedPartyIdentification createChargedPartyIdentification()
    {
        return new ChargedPartyIdentificationImpl();
    }

    public CircuitAssigmentMap createCircuitAssigmentMap()
    {

        return new CircuitAssigmentMapImpl();
    }

    public CircuitGroupSuperVisionMessageType createCircuitGroupSuperVisionMessageType()
    {

        return new CircuitGroupSuperVisionMessageTypeImpl();
    }

    public CircuitIdentificationCode createCircuitIdentificationCode()
    {

        return new CircuitIdentificationCodeImpl();
    }

    public CircuitStateIndicator createCircuitStateIndicator()
    {

        return new CircuitStateIndicatorImpl();
    }

    public ClosedUserGroupInterlockCode createClosedUserGroupInterlockCode()
    {

        return new ClosedUserGroupInterlockCodeImpl();
    }

    public CollectCallRequest createCollectCallRequest()
    {

        return new CollectCallRequestImpl();
    }

    public ConferenceTreatmentIndicators createConferenceTreatmentIndicators()
    {

        return new ConferenceTreatmentIndicatorsImpl();
    }

    public ConnectedNumber createConnectedNumber()
    {

        return new ConnectedNumberImpl();
    }

    public ConnectionRequest createConnectionRequest()
    {

        return new ConnectionRequestImpl();
    }

    public ContinuityIndicators createContinuityIndicators()
    {

        return new ContinuityIndicatorsImpl();
    }

    public CorrelationID createCorrelationID()
    {

        return new CorrelationIDImpl();
    }

    public DisplayInformation createDisplayInformation()
    {

        return new DisplayInformationImpl();
    }

    public EchoControlInformation createEchoControlInformation()
    {

        return new EchoControlInformationImpl();
    }

    @Override
    public ErrorCode createErrorCode()
    {
        return new ErrorCodeImpl();
    }

    public EventInformation createEventInformation()
    {

        return new EventInformationImpl();
    }

    public FacilityIndicator createFacilityIndicator()
    {

        return new FacilityIndicatorImpl();
    }

    public ForwardCallIndicators createForwardCallIndicators()
    {

        return new ForwardCallIndicatorsImpl();
    }

    public ForwardGVNS createForwardGVNS()
    {

        return new ForwardGVNSImpl();
    }

    public GenericDigits createGenericDigits()
    {
        return new GenericDigitsImpl();
    }

    public GenericNotificationIndicator createGenericNotificationIndicator()
    {

        return new GenericNotificationIndicatorImpl();
    }

    public GenericNumber createGenericNumber()
    {

        return new GenericNumberImpl();
    }

    public GenericReference createGenericReference()
    {

        return new GenericReferenceImpl();
    }

    public GVNSUserGroup createGVNSUserGroup()
    {

        return new GVNSUserGroupImpl();
    }

    public HopCounter createHopCounter()
    {

        return new HopCounterImpl();
    }

    public HTRInformation createHTRInformation()
    {

        return new HTRInformationImpl();
    }

    public InformationIndicators createInformationIndicators()
    {

        return new InformationIndicatorsImpl();
    }

    public InformationRequestIndicators createInformationRequestIndicators()
    {

        return new InformationRequestIndicatorsImpl();
    }

    @Override
    public Invoke createInvoke()
    {
        return new InvokeImpl();
    }

    public InvokingPivotReason createInvokingPivotReason(InvokingPivotReasonType type)
    {
        int tag = -1;
        switch (type)
        {
            case PivotRoutingBackwardInformation:
                tag = PivotRoutingBackwardInformation.INFORMATION_INVOKING_PIVOT_REASON;
                break;
            case PivotRoutingForwardInformation:
                tag = PivotRoutingForwardInformation.INFORMATION_INVOKING_PIVOT_REASON;
                break;
            default:
                throw new IllegalArgumentException();
        }
        InvokingPivotReasonImpl reason = new InvokingPivotReasonImpl();
        reason.setTag(tag);
        return reason;
    }

    @Override
    public InvokingRedirectReason createInvokingRedirectReason(InvokingRedirectReasonType type)
    {
        int tag = -1;
        switch (type)
        {
            case RedirectBackwardInformation:
                tag = RedirectBackwardInformation.INFORMATION_INVOKING_REDIRECT_REASON;
                break;
            case RedirectForwardInformation:
                tag = RedirectForwardInformation.INFORMATION_INVOKING_REDIRECT_REASON;
                break;
            default:
                throw new IllegalArgumentException();
        }
        InvokingRedirectReasonImpl reason = new InvokingRedirectReasonImpl();
        reason.setTag(tag);
        return reason;
    }

    public LocationNumber createLocationNumber()
    {

        return new LocationNumberImpl();
    }

    public LoopPreventionIndicators createLoopPreventionIndicators()
    {

        return new LoopPreventionIndicatorsImpl();
    }

    public MCIDRequestIndicators createMCIDRequestIndicators()
    {

        return new MCIDRequestIndicatorsImpl();
    }

    public MCIDResponseIndicators createMCIDResponseIndicators()
    {

        return new MCIDResponseIndicatorsImpl();
    }

    public MessageCompatibilityInformation createMessageCompatibilityInformation()
    {
        return new MessageCompatibilityInformationImpl();
    }

    @Override
    public MessageCompatibilityInstructionIndicator createMessageCompatibilityInstructionIndicator()
    {
        return new MessageCompatibilityInstructionIndicatorImpl();
    }

    public MLPPPrecedence createMLPPPrecedence()
    {

        return new MLPPPrecedenceImpl();
    }

    public NatureOfConnectionIndicators createNatureOfConnectionIndicators()
    {

        return new NatureOfConnectionIndicatorsImpl();
    }

    public NetworkManagementControls createNetworkManagementControls()
    {

        return new NetworkManagementControlsImpl();
    }

    public NetworkRoutingNumber createNetworkRoutingNumber()
    {

        return new NetworkRoutingNumberImpl();
    }

    public NetworkSpecificFacility createNetworkSpecificFacility()
    {

        return new NetworkSpecificFacilityImpl();
    }

    @Override
    public OperationCode createOperationCode()
    {
        return new OperationCodeImpl();
    }

    public OptionalBackwardCallIndicators createOptionalBackwardCallIndicators()
    {

        return new OptionalBackwardCallIndicatorsImpl();
    }

    public OptionalForwardCallIndicators createOptionalForwardCallIndicators()
    {

        return new OptionalForwardCallIndicatorsImpl();
    }

    public OriginalCalledINNumber createOriginalCalledINNumber()
    {

        return new OriginalCalledINNumberImpl();
    }

    public OriginalCalledNumber createOriginalCalledNumber()
    {

        return new OriginalCalledNumberImpl();
    }

    public OriginatingISCPointCode createOriginatingISCPointCode()
    {

        return new OriginatingISCPointCodeImpl();
    }

    public OriginatingParticipatingServiceProvider createOriginatingParticipatingServiceProvider()
    {

        return new OriginatingParticipatingServiceProviderImpl();
    }

    @Override
    public Parameter createParameter()
    {
        return new ParameterImpl();
    }

    public ParameterCompatibilityInformation createParameterCompatibilityInformation()
    {

        return new ParameterCompatibilityInformationImpl();
    }

    public ParameterCompatibilityInstructionIndicators createParameterCompatibilityInstructionIndicators()
    {

        return new ParameterCompatibilityInstructionIndicatorsImpl();
    }

    public PerformingPivotIndicator createPerformingPivotIndicator()
    {
        PerformingPivotIndicatorImpl indicator = new PerformingPivotIndicatorImpl();
        indicator.setTag(PivotRoutingForwardInformation.INFORMATION_PERFORMING_PIVOT_INDICATOR);
        return indicator;
    }

    @Override
    public PerformingRedirectIndicator createPerformingRedirectIndicator()
    {
        PerformingRedirectIndicatorImpl indicator = new PerformingRedirectIndicatorImpl();
        indicator.setTag(RedirectForwardInformation.INFORMATION_PERFORMING_REDIRECT_INDICATOR);
        return indicator;
    }

    public PivotCapability createPivotCapability()
    {

        return new PivotCapabilityImpl();
    }

    public PivotCounter createPivotCounter()
    {

        return new PivotCounterImpl();
    }

    @Override
    public PivotReason createPivotReason()
    {
        return new PivotReasonImpl();
    }

    public PivotRoutingBackwardInformation createPivotRoutingBackwardInformation()
    {

        return new PivotRoutingBackwardInformationImpl();
    }

    public PivotRoutingForwardInformation createPivotRoutingForwardInformation()
    {

        return new PivotRoutingForwardInformationImpl();
    }

    public PivotRoutingIndicators createPivotRoutingIndicators()
    {

        return new PivotRoutingIndicatorsImpl();
    }

    public PivotStatus createPivotStatus()
    {
        return new PivotStatusImpl();
    }

    @Override
    public Problem createProblem()
    {
        return new ProblemImpl();
    }

    public PropagationDelayCounter createPropagationDelayCounter()
    {

        return new PropagationDelayCounterImpl();
    }

    public QueryOnReleaseCapability createQueryOnReleaseCapability()
    {

        return new QueryOnReleaseCapabilityImpl();
    }

    public RangeAndStatus createRangeAndStatus()
    {

        return new RangeAndStatusImpl();
    }

    public RedirectBackwardInformation createRedirectBackwardInformation()
    {

        return new RedirectBackwardInformationImpl();
    }

    public RedirectCapability createRedirectCapability()
    {

        return new RedirectCapabilityImpl();
    }

    public RedirectCounter createRedirectCounter()
    {

        return new RedirectCounterImpl();
    }

    @Override
    public RedirectForwardInformation createRedirectForwardformation()
    {
        return new RedirectForwardInformationImpl();
    }

    public RedirectingNumber createRedirectingNumber()
    {

        return new RedirectingNumberImpl();
    }

    public RedirectionInformation createRedirectionInformation()
    {

        return new RedirectionInformationImpl();
    }

    public RedirectionNumber createRedirectionNumber()
    {

        return new RedirectionNumberImpl();
    }

    public RedirectionNumberRestriction createRedirectionNumberRestriction()
    {

        return new RedirectionNumberRestrictionImpl();
    }

    @Override
    public RedirectReason createRedirectReason()
    {
        return new RedirectReasonImpl();
    }

    public RedirectStatus createRedirectStatus()
    {

        return new RedirectStatusImpl();
    }

    @Override
    public Reject createReject()
    {
        return new RejectImpl();
    }

    public RemoteOperations createRemoteOperations()
    {

        return new RemoteOperationsImpl();
    }

    public Reserved createReserved()
    {

        return new ReservedImpl();
    }

    @Override
    public ReturnError createReturnError()
    {
        return new ReturnErrorImpl();
    }

    @Override
    public ReturnResult createReturnResult()
    {
        return new ReturnResultImpl();
    }

    public ReturnToInvokingExchangeCallIdentifier createReturnToInvokingExchangeCallIdentifier()
    {
        ReturnToInvokingExchangeCallIdentifierImpl cid = new ReturnToInvokingExchangeCallIdentifierImpl();
        cid.setTag(PivotRoutingForwardInformation.INFORMATION_RETURN_TO_INVOKING_EXCHANGE_CALL_ID);
        return cid;
    }

    @Override
    public ReturnToInvokingExchangeDuration createReturnToInvokingExchangeDuration()
    {
        ReturnToInvokingExchangeDurationImpl duration = new ReturnToInvokingExchangeDurationImpl();
        duration.setTag(PivotRoutingBackwardInformation.INFORMATION_RETURN_TO_INVOKING_EXCHANGE_DURATION);
        return duration;
    }

    public ReturnToInvokingExchangePossible createReturnToInvokingExchangePossible()
    {
        ReturnToInvokingExchangePossibleImpl iWonderWhenSomeoneWillNoticeThisLongishName = new
                ReturnToInvokingExchangePossibleImpl();
        iWonderWhenSomeoneWillNoticeThisLongishName.setTag(PivotRoutingForwardInformation
                .INFORMATION_RETURN_TO_INVOKING_EXCHANGE_POSSIBLE);
        return new ReturnToInvokingExchangePossibleImpl();
    }

    public SCFID createSCFID()
    {

        return new SCFIDImpl();
    }

    public ServiceActivation createServiceActivation()
    {

        return new ServiceActivationImpl();
    }

    public SignalingPointCode createSignalingPointCode()
    {

        return new SignalingPointCodeImpl();
    }

    public Status createStatus()
    {
        return new StatusImpl();
    }

    public SubsequentNumber createSubsequentNumber()
    {

        return new SubsequentNumberImpl();
    }

    public SuspendResumeIndicators createSuspendResumeIndicators()
    {

        return new SuspendResumeIndicatorsImpl();
    }

    public TerminatingNetworkRoutingNumber createTerminatingNetworkRoutingNumber()
    {

        return new TerminatingNetworkRoutingNumberImpl();
    }

    public TransimissionMediumRequierementPrime createTransimissionMediumRequierementPrime()
    {

        return new TransimissionMediumRequierementPrimeImpl();
    }

    public TransitNetworkSelection createTransitNetworkSelection()
    {

        return new TransitNetworkSelectionImpl();
    }

    public TransmissionMediumRequirement createTransmissionMediumRequirement()
    {

        return new TransmissionMediumRequirementImpl();
    }

    public TransmissionMediumUsed createTransmissionMediumUsed()
    {

        return new TransmissionMediumUsedImpl();
    }

    public UIDActionIndicators createUIDActionIndicators()
    {

        return new UIDActionIndicatorsImpl();
    }

    public UIDCapabilityIndicators createUIDCapabilityIndicators()
    {

        return new UIDCapabilityIndicatorsImpl();
    }

    public UserServiceInformation createUserServiceInformation()
    {

        return new UserServiceInformationImpl();
    }

    public UserServiceInformationPrime createUserServiceInformationPrime()
    {

        return new UserServiceInformationPrimeImpl();
    }

    public UserTeleserviceInformation createUserTeleserviceInformation()
    {

        return new UserTeleserviceInformationImpl();
    }

    public UserToUserIndicators createUserToUserIndicators()
    {

        return new UserToUserIndicatorsImpl();
    }

    public UserToUserInformation createUserToUserInformation()
    {

        return new UserToUserInformationImpl();
    }
}

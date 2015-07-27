package za.co.ebridge.map.api;

import java.nio.charset.Charset;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.isup.api.message.parameter.LocationNumber;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.dialog.MAPUserAbortChoice;
import za.co.ebridge.map.api.primitives.AdditionalNumberType;
import za.co.ebridge.map.api.primitives.AddressNature;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.CellGlobalIdOrServiceAreaIdFixedLength;
import za.co.ebridge.map.api.primitives.CellGlobalIdOrServiceAreaIdOrLAI;
import za.co.ebridge.map.api.primitives.DiameterIdentity;
import za.co.ebridge.map.api.primitives.FTNAddressString;
import za.co.ebridge.map.api.primitives.GSNAddress;
import za.co.ebridge.map.api.primitives.IMEI;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.ISDNSubaddressString;
import za.co.ebridge.map.api.primitives.LAIFixedLength;
import za.co.ebridge.map.api.primitives.LMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.primitives.MAPPrivateExtension;
import za.co.ebridge.map.api.primitives.NAEACIC;
import za.co.ebridge.map.api.primitives.NAEAPreferredCI;
import za.co.ebridge.map.api.primitives.NetworkIdentificationPlanValue;
import za.co.ebridge.map.api.primitives.NetworkIdentificationTypeValue;
import za.co.ebridge.map.api.primitives.NumberingPlan;
import za.co.ebridge.map.api.primitives.PlmnId;
import za.co.ebridge.map.api.primitives.SubscriberIdentity;
import za.co.ebridge.map.api.primitives.TMSI;
import za.co.ebridge.map.api.primitives.Time;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.callhandling.CUGCheckInfo;
import za.co.ebridge.map.api.service.callhandling.CallReferenceNumber;
import za.co.ebridge.map.api.service.callhandling.CamelInfo;
import za.co.ebridge.map.api.service.callhandling.CamelRoutingInfo;
import za.co.ebridge.map.api.service.callhandling.ExtendedRoutingInfo;
import za.co.ebridge.map.api.service.callhandling.ForwardingData;
import za.co.ebridge.map.api.service.callhandling.GmscCamelSubscriptionInfo;
import za.co.ebridge.map.api.service.callhandling.RoutingInfo;
import za.co.ebridge.map.api.service.lsm.AddGeographicalInformation;
import za.co.ebridge.map.api.service.lsm.AdditionalNumber;
import za.co.ebridge.map.api.service.lsm.Area;
import za.co.ebridge.map.api.service.lsm.AreaDefinition;
import za.co.ebridge.map.api.service.lsm.AreaEventInfo;
import za.co.ebridge.map.api.service.lsm.AreaIdentification;
import za.co.ebridge.map.api.service.lsm.AreaType;
import za.co.ebridge.map.api.service.lsm.DeferredLocationEventType;
import za.co.ebridge.map.api.service.lsm.DeferredmtlrData;
import za.co.ebridge.map.api.service.lsm.ExtGeographicalInformation;
import za.co.ebridge.map.api.service.lsm.GeranGANSSpositioningData;
import za.co.ebridge.map.api.service.lsm.LCSClientExternalID;
import za.co.ebridge.map.api.service.lsm.LCSClientID;
import za.co.ebridge.map.api.service.lsm.LCSClientInternalID;
import za.co.ebridge.map.api.service.lsm.LCSClientName;
import za.co.ebridge.map.api.service.lsm.LCSClientType;
import za.co.ebridge.map.api.service.lsm.LCSCodeword;
import za.co.ebridge.map.api.service.lsm.LCSFormatIndicator;
import za.co.ebridge.map.api.service.lsm.LCSLocationInfo;
import za.co.ebridge.map.api.service.lsm.LCSPrivacyCheck;
import za.co.ebridge.map.api.service.lsm.LCSQoS;
import za.co.ebridge.map.api.service.lsm.LCSRequestorID;
import za.co.ebridge.map.api.service.lsm.LocationEstimateType;
import za.co.ebridge.map.api.service.lsm.LocationType;
import za.co.ebridge.map.api.service.lsm.OccurrenceInfo;
import za.co.ebridge.map.api.service.lsm.PeriodicLDRInfo;
import za.co.ebridge.map.api.service.lsm.PositioningDataInformation;
import za.co.ebridge.map.api.service.lsm.PrivacyCheckRelatedAction;
import za.co.ebridge.map.api.service.lsm.RANTechnology;
import za.co.ebridge.map.api.service.lsm.ReportingPLMN;
import za.co.ebridge.map.api.service.lsm.ReportingPLMNList;
import za.co.ebridge.map.api.service.lsm.ResponseTime;
import za.co.ebridge.map.api.service.lsm.ResponseTimeCategory;
import za.co.ebridge.map.api.service.lsm.SLRArgExtensionContainer;
import za.co.ebridge.map.api.service.lsm.SLRArgPCSExtensions;
import za.co.ebridge.map.api.service.lsm.ServingNodeAddress;
import za.co.ebridge.map.api.service.lsm.SupportedGADShapes;
import za.co.ebridge.map.api.service.lsm.TerminationCause;
import za.co.ebridge.map.api.service.lsm.UtranGANSSpositioningData;
import za.co.ebridge.map.api.service.lsm.UtranPositioningDataInfo;
import za.co.ebridge.map.api.service.lsm.VelocityEstimate;
import za.co.ebridge.map.api.service.mobility.authentication.AuthenticationQuintuplet;
import za.co.ebridge.map.api.service.mobility.authentication.AuthenticationSetList;
import za.co.ebridge.map.api.service.mobility.authentication.AuthenticationTriplet;
import za.co.ebridge.map.api.service.mobility.authentication.CK;
import za.co.ebridge.map.api.service.mobility.authentication.Cksn;
import za.co.ebridge.map.api.service.mobility.authentication.CurrentSecurityContext;
import za.co.ebridge.map.api.service.mobility.authentication.EpcAv;
import za.co.ebridge.map.api.service.mobility.authentication.EpsAuthenticationSetList;
import za.co.ebridge.map.api.service.mobility.authentication.GSMSecurityContextData;
import za.co.ebridge.map.api.service.mobility.authentication.IK;
import za.co.ebridge.map.api.service.mobility.authentication.KSI;
import za.co.ebridge.map.api.service.mobility.authentication.Kc;
import za.co.ebridge.map.api.service.mobility.authentication.QuintupletList;
import za.co.ebridge.map.api.service.mobility.authentication.ReSynchronisationInfo;
import za.co.ebridge.map.api.service.mobility.authentication.TripletList;
import za.co.ebridge.map.api.service.mobility.authentication.UMTSSecurityContextData;
import za.co.ebridge.map.api.service.mobility.imei.RequestedEquipmentInfo;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIu;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIuA;
import za.co.ebridge.map.api.service.mobility.imei.UESBIIuB;
import za.co.ebridge.map.api.service.mobility.locationManagement.ADDInfo;
import za.co.ebridge.map.api.service.mobility.locationManagement.AgeIndicator;
import za.co.ebridge.map.api.service.mobility.locationManagement.EPSInfo;
import za.co.ebridge.map.api.service.mobility.locationManagement.ISRInformation;
import za.co.ebridge.map.api.service.mobility.locationManagement.ISTSupportIndicator;
import za.co.ebridge.map.api.service.mobility.locationManagement.LAC;
import za.co.ebridge.map.api.service.mobility.locationManagement.LocationArea;
import za.co.ebridge.map.api.service.mobility.locationManagement.PDNGWUpdate;
import za.co.ebridge.map.api.service.mobility.locationManagement.PagingArea;
import za.co.ebridge.map.api.service.mobility.locationManagement.SGSNCapability;
import za.co.ebridge.map.api.service.mobility.locationManagement.SuperChargerInfo;
import za.co.ebridge.map.api.service.mobility.locationManagement.SupportedFeatures;
import za.co.ebridge.map.api.service.mobility.locationManagement.SupportedLCSCapabilitySets;
import za.co.ebridge.map.api.service.mobility.locationManagement.SupportedRATTypes;
import za.co.ebridge.map.api.service.mobility.locationManagement.VLRCapability;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.AnyTimeInterrogationRequest;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.AnyTimeInterrogationResponse;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.DomainType;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.EUtranCgi;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.GPRSChargingID;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.GPRSMSClass;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.GeodeticInformation;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.GeographicalInformation;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.LIPAPermission;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.LocationInformation;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.LocationInformationEPS;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.LocationInformationGPRS;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.LocationNumberMap;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.MNPInfoRes;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSClassmark2;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSNetworkCapability;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.MSRadioAccessCapability;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.NotReachableReason;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.NumberPortabilityStatus;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.PDPContext;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.PDPContextInfo;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.PSSubscriberState;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.PSSubscriberStateChoice;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.RAIdentity;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.RequestedInfo;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.RouteingNumber;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.SIPTOPermission;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.SubscriberInfo;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.SubscriberState;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.SubscriberStateChoice;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.TAId;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.TEID;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.TransactionId;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.UserCSGInformation;

import za.co.ebridge.map.api.service.mobility.subscriberManagement.AMBR;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.APN;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.APNConfiguration;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.APNConfigurationProfile;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.APNOIReplacement;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AccessRestrictionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AdditionalSubscriptions;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.AllocationRetentionPriority;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BasicServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BearerServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BearerServiceCodeValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSAllocationRetentionPriority;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSGId;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CSGSubscriptionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGFeature;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGInterlock;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGSubscription;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CallTypeCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CauseValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ChargingCharacteristics;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DPAnalysedInfoCriterium;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DefaultCallHandling;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DefaultGPRSHandling;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DestinationNumberCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.EMLPPInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.EPSQoSSubscribed;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.EPSSubscriptionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.Ext2QoSSubscribed;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.Ext3QoSSubscribed;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.Ext4QoSSubscribed;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBasicServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtBearerServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtCallBarInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtCallBarringFeature;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtForwFeature;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtForwInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtForwOptions;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtForwOptionsForwardingReason;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtPDPType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtQoSSubscribed;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtSSStatus;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExtTeleserviceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ExternalClient;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.FQDN;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.GMLCRestriction;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.GPRSCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.GPRSCamelTDPData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.GPRSSubscriptionData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.GPRSTriggerDetectionPoint;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.InterCUGRestrictions;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.InterCUGRestrictionsValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.IntraCUGOptions;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LCSInformation;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LCSPrivacyClass;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAAttributes;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAIdentity;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAInformation;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAOnlyAccessIndicator;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MCSSInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MGCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MMCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MMCodeValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MOLRClass;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MTSMSTPDUType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MTsmsCAMELTDPCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.MatchType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.NotificationToMSUser;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OBcsmCamelTDPData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OBcsmCamelTdpCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OBcsmTriggerDetectionPoint;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OfferedCamel4CSIs;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDNGWAllocationType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDNGWIdentity;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDNType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDPAddress;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDPType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.QoSClassIdentifier;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.QoSSubscribed;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SMSTriggerDetectionPoint;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ServiceType;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SpecificAPNInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SupportedCamelPhases;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TBcsmCamelTDPData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TBcsmCamelTdpCriteria;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TBcsmTriggerDetectionPoint;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TeleserviceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TeleserviceCodeValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ZoneCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBGeneralData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBHPLMNData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.PDNTypeValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SGSNCAMELSubscriptionInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SMSCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SMSCAMELTDPData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.DefaultSMSHandling;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SSCamelData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SSCSI;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.VlrCamelSubscriptionInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.VoiceBroadcastData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.GroupId;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.VoiceGroupCallData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LongGroupId;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CauseValueCodeValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.LSAIdentificationPriorityValue;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.Category;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.OfferedCamel4Functionalities;

import za.co.ebridge.map.api.service.sms.LocationInfoWithLMSI;
import za.co.ebridge.map.api.service.sms.MWStatus;
import za.co.ebridge.map.api.service.sms.SM_RP_DA;
import za.co.ebridge.map.api.service.sms.SM_RP_OA;
import za.co.ebridge.map.api.service.sms.SM_RP_SMEA;
import za.co.ebridge.map.api.service.sms.SmsSignalInfo;
import za.co.ebridge.map.api.service.supplementary.CliRestrictionOption;
import za.co.ebridge.map.api.service.supplementary.OverrideCategory;
import za.co.ebridge.map.api.service.supplementary.ProcessUnstructuredSSRequest;
import za.co.ebridge.map.api.service.supplementary.ProcessUnstructuredSSResponse;
import za.co.ebridge.map.api.service.supplementary.SSCode;
import za.co.ebridge.map.api.service.supplementary.SSStatus;
import za.co.ebridge.map.api.service.supplementary.SSSubscriptionOption;
import za.co.ebridge.map.api.service.supplementary.SupplementaryCodeValue;
import za.co.ebridge.map.api.service.supplementary.UnstructuredSSNotifyRequest;
import za.co.ebridge.map.api.service.supplementary.UnstructuredSSNotifyResponse;
import za.co.ebridge.map.api.service.supplementary.UnstructuredSSRequest;
import za.co.ebridge.map.api.service.supplementary.UnstructuredSSResponse;
import za.co.ebridge.map.api.smstpdu.AddressField;
import za.co.ebridge.map.api.smstpdu.SmsTpdu;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.InvokeProblemType;
import za.co.ebridge.tcap.api.asn.comp.Problem;
import za.co.ebridge.tcap.api.asn.comp.ReturnErrorProblemType;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultProblemType;

public interface MAPParameterFactory
{

    ProcessUnstructuredSSRequest createProcessUnstructuredSSRequestIndication(
            CBSDataCodingScheme ussdDataCodingSch,
            USSDString ussdString, AlertingPattern alertingPattern, ISDNAddressString msisdnAddressString);

    ProcessUnstructuredSSResponse createProcessUnstructuredSSResponseIndication(
            CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString);

    UnstructuredSSRequest createUnstructuredSSRequestIndication(
            CBSDataCodingScheme ussdDataCodingSch,
            USSDString ussdString, AlertingPattern alertingPattern, ISDNAddressString msisdnAddressString);

    UnstructuredSSResponse createUnstructuredSSRequestIndication(
            CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString);

    UnstructuredSSNotifyRequest createUnstructuredSSNotifyRequestIndication(
            CBSDataCodingScheme ussdDataCodingSch,
            USSDString ussdString, AlertingPattern alertingPattern, ISDNAddressString msisdnAddressString);

    UnstructuredSSNotifyResponse createUnstructuredSSNotifyResponseIndication();

    /**
     * Creates a new instance of {@link USSDString}. The passed USSD String is encoded by using the default Charset
     * defined in
     * GSM 03.38 Specs
     *
     * @param ussdString The USSD String
     * @return new instance of {@link USSDString}
     */
    USSDString createUSSDString(String ussdString)
            throws
            MAPException;

    /**
     * Creates a new instance of {@link USSDString} using the passed {@link java.nio.charset.Charset} for encoding
     * the passed
     * ussdString String
     *
     * @param ussdString The USSD String
     * @param charSet    The Charset used for encoding the passed USSD String
     * @return new instance of {@link USSDString}
     */
    USSDString createUSSDString(String ussdString, CBSDataCodingScheme dataCodingScheme, Charset gsm8Charset)
            throws
            MAPException;

    /**
     * Creates a new instance of {@link USSDString}. The passed USSD String byte[] is encoded by using the default
     * Charset
     * defined in GSM 03.38 Specs
     *
     * @param ussdString The USSD String
     * @return new instance of {@link USSDString}
     */
    USSDString createUSSDString(byte[] ussdString);

    /**
     * Creates a new instance of {@link USSDString} using the passed {@link java.nio.charset.Charset} for encoding
     * the passed
     * ussdString byte[]
     *
     * @param ussdString The byte[] of the USSD String
     * @param charSet    The Charset used for encoding the passed USSD String byte[]
     * @return new instance of {@link USSDString}
     */
    USSDString createUSSDString(byte[] ussdString, CBSDataCodingScheme dataCodingScheme, Charset gsm8Charset);

    /**
     * Creates a new instance of {@link AddressString}
     *
     * @param addNature The nature of this AddressString. See {@link AddressNature}.
     * @param numPlan   The {@link NumberingPlan} of this AddressString
     * @param address   The actual address (number)
     * @return new instance of {@link AddressString}
     */
    AddressString createAddressString(AddressNature addNature, NumberingPlan numPlan, String address);

    ISDNAddressString createISDNAddressString(AddressNature addNature, NumberingPlan numPlan, String address);

    FTNAddressString createFTNAddressString(AddressNature addNature, NumberingPlan numPlan, String address);

    /**
     * Creates a new instance of {@link IMSI}
     *
     * @param data whole data string
     * @return new instance of {@link IMSI}
     */
    IMSI createIMSI(String data);

    IMEI createIMEI(String imei);

    /**
     * Creates a new instance of {@link LMSI}
     *
     * @param data
     * @return new instance of {@link LMSI}
     */
    LMSI createLMSI(byte[] data);

    /**
     * Creates a new instance of {@link SM_RP_DA} with imsi parameter
     *
     * @param imsi
     * @return
     */
    SM_RP_DA createSM_RP_DA(IMSI imsi);

    /**
     * Creates a new instance of {@link SM_RP_DA} with lmsi parameter
     *
     * @param lmsi
     * @return
     */
    SM_RP_DA createSM_RP_DA(LMSI lmsi);

    /**
     * Creates a new instance of {@link SM_RP_DA} with serviceCentreAddressDA parameter
     *
     * @param serviceCentreAddressDA
     * @return
     */
    SM_RP_DA createSM_RP_DA(AddressString serviceCentreAddressDA);

    /**
     * Creates a new instance of {@link SM_RP_DA} with noSM_RP_DA parameter
     *
     * @return
     */
    SM_RP_DA createSM_RP_DA();

    /**
     * Creates a new instance of {@link SM_RP_OA} with msisdn parameter
     *
     * @param msisdn
     * @return
     */
    SM_RP_OA createSM_RP_OA_Msisdn(ISDNAddressString msisdn);

    /**
     * Creates a new instance of {@link SM_RP_OA} with serviceCentreAddressOA parameter
     *
     * @param serviceCentreAddressOA
     * @return
     */
    SM_RP_OA createSM_RP_OA_ServiceCentreAddressOA(AddressString serviceCentreAddressOA);

    /**
     * Creates a new instance of {@link SM_RP_OA} with noSM_RP_OA parameter
     *
     * @return
     */
    SM_RP_OA createSM_RP_OA();

    SmsSignalInfo createSmsSignalInfo(byte[] data, Charset gsm8Charset);

    SmsSignalInfo createSmsSignalInfo(SmsTpdu data, Charset gsm8Charset)
            throws
            MAPException;

    SM_RP_SMEA createSM_RP_SMEA(byte[] data);

    SM_RP_SMEA createSM_RP_SMEA(AddressField addressField)
            throws
            MAPException;

    /**
     * Creates a new instance of {@link MAPUserAbortChoice}
     *
     * @return
     */
    MAPUserAbortChoice createMAPUserAbortChoice();

    MWStatus createMWStatus(boolean scAddressNotIncluded, boolean mnrfSet, boolean mcefSet, boolean mnrgSet);

    LocationInfoWithLMSI createLocationInfoWithLMSI(
            ISDNAddressString networkNodeNumber, LMSI lmsi,
            MAPExtensionContainer extensionContainer, AdditionalNumberType additionalNumberType,
            ISDNAddressString additionalNumber);

    /**
     * Creates a new instance of {@link MAPPrivateExtension} for {@link MAPExtensionContainer}
     *
     * @param oId  PrivateExtension ObjectIdentifier
     * @param data PrivateExtension data (ASN.1 encoded byte array with tag bytes)
     * @return
     */
    MAPPrivateExtension createMAPPrivateExtension(long[] oId, byte[] data);

    /**
     * @param privateExtensionList List of PrivateExtensions
     * @param pcsExtensions        pcsExtensions value (ASN.1 encoded byte array without tag byte)
     * @return
     */
    MAPExtensionContainer createMAPExtensionContainer(
            ArrayList<MAPPrivateExtension> privateExtensionList,
            byte[] pcsExtensions);

    CellGlobalIdOrServiceAreaIdOrLAI createCellGlobalIdOrServiceAreaIdOrLAI(
            CellGlobalIdOrServiceAreaIdFixedLength cellGlobalIdOrServiceAreaIdFixedLength);

    CellGlobalIdOrServiceAreaIdOrLAI createCellGlobalIdOrServiceAreaIdOrLAI(LAIFixedLength laiFixedLength);

    CellGlobalIdOrServiceAreaIdFixedLength createCellGlobalIdOrServiceAreaIdFixedLength(byte[] data);

    CellGlobalIdOrServiceAreaIdFixedLength createCellGlobalIdOrServiceAreaIdFixedLength(
            int mcc, int mnc, int lac,
            int cellId)
            throws
            MAPException;

    LAIFixedLength createLAIFixedLength(byte[] data);

    LAIFixedLength createLAIFixedLength(int mcc, int mnc, int lac)
            throws
            MAPException;

    CallReferenceNumber createCallReferenceNumber(byte[] data);

    LocationInformation createLocationInformation(
            Integer ageOfLocationInformation,
            GeographicalInformation geographicalInformation,
            ISDNAddressString vlrNumber,
            LocationNumberMap locationNumber,
            CellGlobalIdOrServiceAreaIdOrLAI cellGlobalIdOrServiceAreaIdOrLAI,
            MAPExtensionContainer extensionContainer,
            LSAIdentity selectedLSAId,
            ISDNAddressString mscNumber,
            GeodeticInformation geodeticInformation,
            boolean currentLocationRetrieved,
            boolean saiPresent,
            LocationInformationEPS locationInformationEPS,
            UserCSGInformation userCSGInformation);

    LocationNumberMap createLocationNumberMap(byte[] data);

    LocationNumberMap createLocationNumberMap(LocationNumber locationNumber)
            throws
            MAPException;

    SubscriberState createSubscriberState(
            SubscriberStateChoice subscriberStateChoice,
            NotReachableReason notReachableReason);

    PlmnId createPlmnId(byte[] data);

    PlmnId createPlmnId(int mcc, int mnc);

    GSNAddress createGSNAddress(byte[] data);

    AuthenticationTriplet createAuthenticationTriplet(byte[] rand, byte[] sres, byte[] kc);

    AuthenticationQuintuplet createAuthenticationQuintuplet(
            byte[] rand,
            byte[] xres,
            byte[] ck,
            byte[] ik,
            byte[] autn);

    TripletList createTripletList(ArrayList<AuthenticationTriplet> authenticationTriplets);

    QuintupletList createQuintupletList(ArrayList<AuthenticationQuintuplet> quintupletList);

    AuthenticationSetList createAuthenticationSetList(TripletList tripletList);

    AuthenticationSetList createAuthenticationSetList(QuintupletList quintupletList);

    ReSynchronisationInfo createReSynchronisationInfo(byte[] rand, byte[] auts);

    EpsAuthenticationSetList createEpsAuthenticationSetList(ArrayList<EpcAv> epcAv);

    EpcAv createEpcAv(byte[] rand, byte[] xres, byte[] autn, byte[] kasme, MAPExtensionContainer extensionContainer);

    VLRCapability createVlrCapability(
            SupportedCamelPhases supportedCamelPhases,
            MAPExtensionContainer extensionContainer,
            boolean solsaSupportIndicator,
            ISTSupportIndicator istSupportIndicator,
            SuperChargerInfo superChargerSupportedInServingNetworkEntity,
            boolean longFtnSupported,
            SupportedLCSCapabilitySets supportedLCSCapabilitySets,
            OfferedCamel4CSIs offeredCamel4CSIs,
            SupportedRATTypes supportedRATTypesIndicator,
            boolean longGroupIDSupported,
            boolean mtRoamingForwardingSupported);

    SupportedCamelPhases createSupportedCamelPhases(boolean phase1, boolean phase2, boolean phase3, boolean phase4);

    SuperChargerInfo createSuperChargerInfo(Boolean sendSubscriberData);

    SuperChargerInfo createSuperChargerInfo(byte[] subscriberDataStored);

    SupportedLCSCapabilitySets createSupportedLCSCapabilitySets(
            boolean lcsCapabilitySetRelease98_99,
            boolean lcsCapabilitySetRelease4, boolean lcsCapabilitySetRelease5, boolean lcsCapabilitySetRelease6,
            boolean lcsCapabilitySetRelease7);

    OfferedCamel4CSIs createOfferedCamel4CSIs(
            boolean oCsi, boolean dCsi, boolean vtCsi, boolean tCsi, boolean mtSMSCsi,
            boolean mgCsi, boolean psiEnhancements);

    SupportedRATTypes createSupportedRATTypes(
            boolean utran, boolean geran, boolean gan, boolean i_hspa_evolution,
            boolean e_utran);

    ADDInfo createADDInfo(IMEI imeisv, boolean skipSubscriberDataUpdate);

    PagingArea createPagingArea(ArrayList<LocationArea> locationAreas);

    LAC createLAC(byte[] data);

    LAC createLAC(int lac)
            throws
            MAPException;

    LocationArea createLocationArea(LAIFixedLength laiFixedLength);

    LocationArea createLocationArea(LAC lac);

    AnyTimeInterrogationRequest createAnyTimeInterrogationRequest(
            SubscriberIdentity subscriberIdentity,
            RequestedInfo requestedInfo, ISDNAddressString gsmSCFAddress, MAPExtensionContainer extensionContainer);

    AnyTimeInterrogationResponse createAnyTimeInterrogationResponse(
            SubscriberInfo subscriberInfo,
            MAPExtensionContainer extensionContainer);

    DiameterIdentity createDiameterIdentity(byte[] data);

    SubscriberIdentity createSubscriberIdentity(IMSI imsi);

    SubscriberIdentity createSubscriberIdentity(ISDNAddressString msisdn);

    APN createAPN(byte[] data);

    PDPAddress createPDPAddress(byte[] data);

    PDPType createPDPType(byte[] data);

    PDPContextInfo createPDPContextInfo(
            int pdpContextIdentifier,
            boolean pdpContextActive,
            PDPType pdpType,
            PDPAddress pdpAddress,
            APN apnSubscribed,
            APN apnInUse,
            Integer asapi,
            TransactionId transactionId,
            TEID teidForGnAndGp,
            TEID teidForIu,
            GSNAddress ggsnAddress,
            ExtQoSSubscribed qosSubscribed,
            ExtQoSSubscribed qosRequested,
            ExtQoSSubscribed qosNegotiated,
            GPRSChargingID chargingId,
            ChargingCharacteristics chargingCharacteristics,
            GSNAddress rncAddress,
            MAPExtensionContainer extensionContainer,
            Ext2QoSSubscribed qos2Subscribed,
            Ext2QoSSubscribed qos2Requested,
            Ext2QoSSubscribed qos2Negotiated,
            Ext3QoSSubscribed qos3Subscribed,
            Ext3QoSSubscribed qos3Requested,
            Ext3QoSSubscribed qos3Negotiated,
            Ext4QoSSubscribed qos4Subscribed,
            Ext4QoSSubscribed qos4Requested,
            Ext4QoSSubscribed qos4Negotiated,
            ExtPDPType extPdpType,
            PDPAddress extPdpAddress);

    PDPContext createPDPContext(
            int pdpContextId,
            PDPType pdpType,
            PDPAddress pdpAddress,
            QoSSubscribed qosSubscribed,
            boolean vplmnAddressAllowed,
            APN apn,
            MAPExtensionContainer extensionContainer,
            ExtQoSSubscribed extQoSSubscribed,
            ChargingCharacteristics chargingCharacteristics,
            Ext2QoSSubscribed ext2QoSSubscribed,
            Ext3QoSSubscribed ext3QoSSubscribed,
            Ext4QoSSubscribed ext4QoSSubscribed,
            APNOIReplacement apnoiReplacement,
            ExtPDPType extpdpType,
            PDPAddress extpdpAddress,
            SIPTOPermission sipToPermission,
            LIPAPermission lipaPermission);

    APNOIReplacement createAPNOIReplacement(byte[] data);

    QoSSubscribed createQoSSubscribed(byte[] data);

    CSGId createCSGId(BitSetStrictLength data);

    LSAIdentity createLSAIdentity(byte[] data);

    GPRSChargingID createGPRSChargingID(byte[] data);

    ChargingCharacteristics createChargingCharacteristics(byte[] data);

    ExtQoSSubscribed createExtQoSSubscribed(byte[] data);

    Ext2QoSSubscribed createExt2QoSSubscribed(byte[] data);

    Ext3QoSSubscribed createExt3QoSSubscribed(byte[] data);

    Ext4QoSSubscribed createExt4QoSSubscribed(int data);

    ExtPDPType createExtPDPType(byte[] data);

    TransactionId createTransactionId(byte[] data);

    TAId createTAId(byte[] data);

    RAIdentity createRAIdentity(byte[] data);

    EUtranCgi createEUtranCgi(byte[] data);

    TEID createTEID(byte[] data);

    GPRSMSClass createGPRSMSClass(
            MSNetworkCapability mSNetworkCapability,
            MSRadioAccessCapability mSRadioAccessCapability);

    GeographicalInformation createGeographicalInformation(byte[] data);

    GeographicalInformation createGeographicalInformation(double latitude, double longitude, double uncertainty)
            throws
            MAPException;

    GeodeticInformation createGeodeticInformation(byte[] data);

    GeodeticInformation createGeodeticInformation(
            int screeningAndPresentationIndicators, double latitude,
            double longitude, double uncertainty, int confidence)
            throws
            MAPException;

    LocationInformationEPS createLocationInformationEPS(
            EUtranCgi eUtranCellGlobalIdentity, TAId trackingAreaIdentity,
            MAPExtensionContainer extensionContainer, GeographicalInformation geographicalInformation,
            GeodeticInformation geodeticInformation, boolean currentLocationRetrieved, Integer ageOfLocationInformation,
            DiameterIdentity mmeName);

    LocationInformationGPRS createLocationInformationGPRS(
            CellGlobalIdOrServiceAreaIdOrLAI cellGlobalIdOrServiceAreaIdOrLAI,
            RAIdentity routeingAreaIdentity,
            GeographicalInformation geographicalInformation,
            ISDNAddressString sgsnNumber,
            LSAIdentity selectedLSAIdentity,
            MAPExtensionContainer extensionContainer,
            boolean saiPresent,
            GeodeticInformation geodeticInformation,
            boolean currentLocationRetrieved,
            Integer ageOfLocationInformation);

    MSNetworkCapability createMSNetworkCapability(byte[] data);

    MSRadioAccessCapability createMSRadioAccessCapability(byte[] data);

    MSClassmark2 createMSClassmark2(byte[] data);

    MNPInfoRes createMNPInfoRes(
            RouteingNumber routeingNumber, IMSI imsi, ISDNAddressString msisdn,
            NumberPortabilityStatus numberPortabilityStatus, MAPExtensionContainer extensionContainer);

    RequestedInfo createRequestedInfo(
            boolean locationInformation, boolean subscriberState,
            MAPExtensionContainer extensionContainer, boolean currentLocation, DomainType requestedDomain, boolean imei,
            boolean msClassmark, boolean mnpRequestedInfo);

    RouteingNumber createRouteingNumber(String data);

    SubscriberInfo createSubscriberInfo(
            LocationInformation locationInformation, SubscriberState subscriberState,
            MAPExtensionContainer extensionContainer, LocationInformationGPRS locationInformationGPRS,
            PSSubscriberState psSubscriberState, IMEI imei, MSClassmark2 msClassmark2, GPRSMSClass gprsMSClass,
            MNPInfoRes mnpInfoRes);

    UserCSGInformation createUserCSGInformation(
            CSGId csgId, MAPExtensionContainer extensionContainer,
            Integer accessMode, Integer cmi);

    PSSubscriberState createPSSubscriberState(
            PSSubscriberStateChoice choice, NotReachableReason netDetNotReachable,
            ArrayList<PDPContextInfo> pdpContextInfoList);

    AddGeographicalInformation createAddGeographicalInformation(byte[] data);

    AddGeographicalInformation createAddGeographicalInformation_EllipsoidPointWithUncertaintyCircle(
            double latitude,
            double longitude, double uncertainty)
            throws
            MAPException;

    AddGeographicalInformation createAddGeographicalInformation_EllipsoidPointWithUncertaintyEllipse(
            double latitude,
            double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis, double angleOfMajorAxis,
            int confidence)
            throws
            MAPException;

    AddGeographicalInformation createAddGeographicalInformation_EllipsoidPointWithAltitudeAndUncertaintyEllipsoid(
            double latitude, double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis,
            double angleOfMajorAxis, int confidence, int altitude, double uncertaintyAltitude)
            throws
            MAPException;

    AddGeographicalInformation createAddGeographicalInformation_EllipsoidArc(
            double latitude, double longitude,
            int innerRadius, double uncertaintyRadius, double offsetAngle, double includedAngle, int confidence)
            throws
            MAPException;

    AddGeographicalInformation createAddGeographicalInformation_EllipsoidPoint(double latitude, double longitude)
            throws
            MAPException;

    AdditionalNumber createAdditionalNumberMscNumber(ISDNAddressString mSCNumber);

    AdditionalNumber createAdditionalNumberSgsnNumber(ISDNAddressString sGSNNumber);

    AreaDefinition createAreaDefinition(ArrayList<Area> areaList);

    AreaEventInfo createAreaEventInfo(
            AreaDefinition areaDefinition,
            OccurrenceInfo occurrenceInfo,
            Integer intervalTime);

    AreaIdentification createAreaIdentification(byte[] data);

    AreaIdentification createAreaIdentification(AreaType type, int mcc, int mnc, int lac, int Rac_CellId_UtranCellId)
            throws
            MAPException;

    Area createArea(AreaType areaType, AreaIdentification areaIdentification);

    DeferredLocationEventType createDeferredLocationEventType(
            boolean msAvailable, boolean enteringIntoArea,
            boolean leavingFromArea, boolean beingInsideArea);

    DeferredmtlrData createDeferredmtlrData(
            DeferredLocationEventType deferredLocationEventType,
            TerminationCause terminationCause, LCSLocationInfo lcsLocationInfo);

    ExtGeographicalInformation createExtGeographicalInformation(byte[] data);

    ExtGeographicalInformation createExtGeographicalInformation_EllipsoidPointWithUncertaintyCircle(
            double latitude,
            double longitude, double uncertainty)
            throws
            MAPException;

    ExtGeographicalInformation createExtGeographicalInformation_EllipsoidPointWithUncertaintyEllipse(
            double latitude,
            double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis, double angleOfMajorAxis,
            int confidence)
            throws
            MAPException;

    ExtGeographicalInformation createExtGeographicalInformation_EllipsoidPointWithAltitudeAndUncertaintyEllipsoid(
            double latitude, double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis,
            double angleOfMajorAxis, int confidence, int altitude, double uncertaintyAltitude)
            throws
            MAPException;

    ExtGeographicalInformation createExtGeographicalInformation_EllipsoidArc(
            double latitude, double longitude,
            int innerRadius, double uncertaintyRadius, double offsetAngle, double includedAngle, int confidence)
            throws
            MAPException;

    ExtGeographicalInformation createExtGeographicalInformation_EllipsoidPoint(double latitude, double longitude)
            throws
            MAPException;

    GeranGANSSpositioningData createGeranGANSSpositioningData(byte[] data);

    LCSClientID createLCSClientID(
            LCSClientType lcsClientType, LCSClientExternalID lcsClientExternalID,
            LCSClientInternalID lcsClientInternalID, LCSClientName lcsClientName, AddressString lcsClientDialedByMS,
            APN lcsAPN, LCSRequestorID lcsRequestorID);

    LCSClientExternalID createLCSClientExternalID(
            final ISDNAddressString externalAddress,
            final MAPExtensionContainer extensionContainer);

    LCSClientName createLCSClientName(
            CBSDataCodingScheme dataCodingScheme, USSDString nameString,
            LCSFormatIndicator lcsFormatIndicator);

    LCSCodeword createLCSCodeword(CBSDataCodingScheme dataCodingScheme, USSDString lcsCodewordString);

    LCSLocationInfo createLCSLocationInfo(
            ISDNAddressString networkNodeNumber,
            LMSI lmsi,
            MAPExtensionContainer extensionContainer,
            boolean gprsNodeIndicator,
            AdditionalNumber additionalNumber,
            SupportedLCSCapabilitySets supportedLCSCapabilitySets,
            SupportedLCSCapabilitySets additionalLCSCapabilitySets,
            DiameterIdentity mmeName,
            DiameterIdentity aaaServerName);

    LCSPrivacyCheck createLCSPrivacyCheck(
            PrivacyCheckRelatedAction callSessionUnrelated,
            PrivacyCheckRelatedAction callSessionRelated);

    LCSQoS createLCSQoS(
            Integer horizontalAccuracy, Integer verticalAccuracy, boolean verticalCoordinateRequest,
            ResponseTime responseTime, MAPExtensionContainer extensionContainer);

    LCSRequestorID createLCSRequestorID(
            CBSDataCodingScheme dataCodingScheme, USSDString requestorIDString,
            LCSFormatIndicator lcsFormatIndicator);

    LocationType createLocationType(
            final LocationEstimateType locationEstimateType,
            final DeferredLocationEventType deferredLocationEventType);

    PeriodicLDRInfo createPeriodicLDRInfo(int reportingAmount, int reportingInterval);

    PositioningDataInformation createPositioningDataInformation(byte[] data);

    ReportingPLMN createReportingPLMN(PlmnId plmnId, RANTechnology ranTechnology, boolean ranPeriodicLocationSupport);

    ReportingPLMNList createReportingPLMNList(boolean plmnListPrioritized, ArrayList<ReportingPLMN> plmnList);

    ResponseTime createResponseTime(ResponseTimeCategory responseTimeCategory);

    ServingNodeAddress createServingNodeAddressMscNumber(ISDNAddressString mscNumber);

    ServingNodeAddress createServingNodeAddressSgsnNumber(ISDNAddressString sgsnNumber);

    ServingNodeAddress createServingNodeAddressMmeNumber(DiameterIdentity mmeNumber);

    SLRArgExtensionContainer createSLRArgExtensionContainer(
            ArrayList<MAPPrivateExtension> privateExtensionList,
            SLRArgPCSExtensions slrArgPcsExtensions);

    SLRArgPCSExtensions createSLRArgPCSExtensions(boolean naEsrkRequest);

    SupportedGADShapes createSupportedGADShapes(
            boolean ellipsoidPoint, boolean ellipsoidPointWithUncertaintyCircle,
            boolean ellipsoidPointWithUncertaintyEllipse, boolean polygon, boolean ellipsoidPointWithAltitude,
            boolean ellipsoidPointWithAltitudeAndUncertaintyElipsoid, boolean ellipsoidArc);

    UtranGANSSpositioningData createUtranGANSSpositioningData(byte[] data);

    UtranPositioningDataInfo createUtranPositioningDataInfo(byte[] data);

    VelocityEstimate createVelocityEstimate(byte[] data);

    VelocityEstimate createVelocityEstimate_HorizontalVelocity(int horizontalSpeed, int bearing)
            throws
            MAPException;

    VelocityEstimate createVelocityEstimate_HorizontalWithVerticalVelocity(
            int horizontalSpeed, int bearing,
            int verticalSpeed)
            throws
            MAPException;

    VelocityEstimate createVelocityEstimate_HorizontalVelocityWithUncertainty(
            int horizontalSpeed, int bearing,
            int uncertaintyHorizontalSpeed)
            throws
            MAPException;

    VelocityEstimate createVelocityEstimate_HorizontalWithVerticalVelocityAndUncertainty(
            int horizontalSpeed,
            int bearing, int verticalSpeed, int uncertaintyHorizontalSpeed, int uncertaintyVerticalSpeed)
            throws
            MAPException;

    ExtBasicServiceCode createExtBasicServiceCode(ExtBearerServiceCode extBearerServiceCode);

    ExtBasicServiceCode createExtBasicServiceCode(ExtTeleserviceCode extTeleserviceCode);

    ExtBearerServiceCode createExtBearerServiceCode(byte[] data);

    ExtBearerServiceCode createExtBearerServiceCode(BearerServiceCodeValue value);

    BearerServiceCode createBearerServiceCode(int data);

    BearerServiceCode createBearerServiceCode(BearerServiceCodeValue value);

    ExtTeleserviceCode createExtTeleserviceCode(byte[] data);

    ExtTeleserviceCode createExtTeleserviceCode(TeleserviceCodeValue value);

    TeleserviceCode createTeleserviceCode(int data);

    TeleserviceCode createTeleserviceCode(TeleserviceCodeValue value);

    CamelRoutingInfo createCamelRoutingInfo(
            ForwardingData forwardingData,
            GmscCamelSubscriptionInfo gmscCamelSubscriptionInfo, MAPExtensionContainer extensionContainer);

    GmscCamelSubscriptionInfo createGmscCamelSubscriptionInfo(
            TCSI tCsi, OCSI oCsi,
            MAPExtensionContainer extensionContainer, ArrayList<OBcsmCamelTdpCriteria> oBcsmCamelTDPCriteriaList,
            ArrayList<TBcsmCamelTdpCriteria> tBcsmCamelTdpCriteriaList, DCSI dCsi);

    TCSI createTCSI(
            ArrayList<TBcsmCamelTDPData> tBcsmCamelTDPDataList, MAPExtensionContainer extensionContainer,
            Integer camelCapabilityHandling, boolean notificationToCSE, boolean csiActive);

    OCSI createOCSI(
            ArrayList<OBcsmCamelTDPData> oBcsmCamelTDPDataList, MAPExtensionContainer extensionContainer,
            Integer camelCapabilityHandling, boolean notificationToCSE, boolean csiActive);

    TBcsmCamelTDPData createTBcsmCamelTDPData(
            TBcsmTriggerDetectionPoint tBcsmTriggerDetectionPoint,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultCallHandling defaultCallHandling,
            MAPExtensionContainer extensionContainer);

    OBcsmCamelTDPData createOBcsmCamelTDPData(
            OBcsmTriggerDetectionPoint oBcsmTriggerDetectionPoint,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultCallHandling defaultCallHandling,
            MAPExtensionContainer extensionContainer);

    CamelInfo createCamelInfo(
            SupportedCamelPhases supportedCamelPhases, boolean suppressTCSI,
            MAPExtensionContainer extensionContainer, OfferedCamel4CSIs offeredCamel4CSIs);

    CUGInterlock createCUGInterlock(byte[] data);

    CUGCheckInfo createCUGCheckInfo(
            CUGInterlock cugInterlock, boolean cugOutgoingAccess,
            MAPExtensionContainer extensionContainer);

    SSCode createSSCode(SupplementaryCodeValue value);

    SSCode createSSCode(int data);

    SSStatus createSSStatus(boolean qBit, boolean pBit, boolean rBit, boolean aBit);

    BasicServiceCode createBasicServiceCode(TeleserviceCode teleservice);

    BasicServiceCode createBasicServiceCode(BearerServiceCode bearerService);

    Problem createProblemGeneral(GeneralProblemType prob);

    Problem createProblemInvoke(InvokeProblemType prob);

    Problem createProblemResult(ReturnResultProblemType prob);

    Problem createProblemError(ReturnErrorProblemType prob);

    RequestedEquipmentInfo createRequestedEquipmentInfo(boolean equipmentStatus, boolean bmuef);

    UESBIIuA createUESBIIuA(BitSetStrictLength data);

    UESBIIuB createUESBIIuB(BitSetStrictLength data);

    UESBIIu createUESBIIu(UESBIIuA uesbiIuA, UESBIIuB uesbiIuB);

    CUGFeature createCUGFeature(
            ExtBasicServiceCode basicService, Integer preferentialCugIndicator,
            InterCUGRestrictions interCugRestrictions, MAPExtensionContainer extensionContainer);

    CUGInfo createCUGInfo(
            ArrayList<CUGSubscription> cugSubscriptionList, ArrayList<CUGFeature> cugFeatureList,
            MAPExtensionContainer extensionContainer);

    CUGSubscription createCUGSubscription(
            int cugIndex, CUGInterlock cugInterlock, IntraCUGOptions intraCugOptions,
            ArrayList<ExtBasicServiceCode> basicService, MAPExtensionContainer extensionContainer);

    EMLPPInfo createEMLPPInfo(
            int maximumentitledPriority,
            int defaultPriority,
            MAPExtensionContainer extensionContainer);

    ExtCallBarInfo createExtCallBarInfo(
            SSCode ssCode, ArrayList<ExtCallBarringFeature> callBarringFeatureList,
            MAPExtensionContainer extensionContainer);

    ExtCallBarringFeature createExtCallBarringFeature(
            ExtBasicServiceCode basicService, ExtSSStatus ssStatus,
            MAPExtensionContainer extensionContainer);

    ExtForwFeature createExtForwFeature(
            ExtBasicServiceCode basicService,
            ExtSSStatus ssStatus,
            ISDNAddressString forwardedToNumber,
            ISDNSubaddressString forwardedToSubaddress,
            ExtForwOptions forwardingOptions,
            Integer noReplyConditionTime,
            MAPExtensionContainer extensionContainer,
            FTNAddressString longForwardedToNumber);

    ExtForwInfo createExtForwInfo(
            SSCode ssCode, ArrayList<ExtForwFeature> forwardingFeatureList,
            MAPExtensionContainer extensionContainer);

    ExtForwOptions createExtForwOptions(
            boolean notificationToForwardingParty, boolean redirectingPresentation,
            boolean notificationToCallingParty, ExtForwOptionsForwardingReason extForwOptionsForwardingReason);

    ExtForwOptions createExtForwOptions(byte[] data);

    ExtSSData createExtSSData(
            SSCode ssCode, ExtSSStatus ssStatus, SSSubscriptionOption ssSubscriptionOption,
            ArrayList<ExtBasicServiceCode> basicServiceGroupList, MAPExtensionContainer extensionContainer);

    ExtSSInfo createExtSSInfo(ExtForwInfo forwardingInfo);

    ExtSSInfo createExtSSInfo(ExtCallBarInfo callBarringInfo);

    ExtSSInfo createExtSSInfo(CUGInfo cugInfo);

    ExtSSInfo createExtSSInfo(ExtSSData ssData);

    ExtSSInfo createExtSSInfo(EMLPPInfo emlppInfo);

    ExtSSStatus createExtSSStatus(boolean bitQ, boolean bitP, boolean bitR, boolean bitA);

    ExtSSStatus createExtSSStatus(byte[] data);

    GPRSSubscriptionData createGPRSSubscriptionData(
            boolean completeDataListIncluded,
            ArrayList<PDPContext> gprsDataList,
            MAPExtensionContainer extensionContainer,
            APNOIReplacement apnOiReplacement);

    SSSubscriptionOption createSSSubscriptionOption(CliRestrictionOption cliRestrictionOption);

    SSSubscriptionOption createSSSubscriptionOption(OverrideCategory overrideCategory);

    InterCUGRestrictions createInterCUGRestrictions(InterCUGRestrictionsValue val);

    InterCUGRestrictions createInterCUGRestrictions(int data);

    ZoneCode createZoneCode(int value);

    ZoneCode createZoneCode(byte[] data);

    AgeIndicator createAgeIndicator(byte[] data);

    CSAllocationRetentionPriority createCSAllocationRetentionPriority(int data);

    SupportedFeatures createSupportedFeatures(
            boolean odbAllApn,
            boolean odbHPLMNApn,
            boolean odbVPLMNApn,
            boolean odbAllOg,
            boolean odbAllInternationalOg,
            boolean odbAllIntOgNotToHPLMNCountry,
            boolean odbAllInterzonalOg,
            boolean odbAllInterzonalOgNotToHPLMNCountry,
            boolean odbAllInterzonalOgandInternatOgNotToHPLMNCountry,
            boolean regSub,
            boolean trace,
            boolean lcsAllPrivExcep,
            boolean lcsUniversal,
            boolean lcsCallSessionRelated,
            boolean lcsCallSessionUnrelated,
            boolean lcsPLMNOperator,
            boolean lcsServiceType,
            boolean lcsAllMOLRSS,
            boolean lcsBasicSelfLocation,
            boolean lcsAutonomousSelfLocation,
            boolean lcsTransferToThirdParty,
            boolean smMoPp,
            boolean barringOutgoingCalls,
            boolean baoc,
            boolean boic,
            boolean boicExHC);

    AccessRestrictionData createAccessRestrictionData(
            boolean utranNotAllowed, boolean geranNotAllowed,
            boolean ganNotAllowed, boolean iHspaEvolutionNotAllowed, boolean eUtranNotAllowed,
            boolean hoToNon3GPPAccessNotAllowed);

    AdditionalInfo createAdditionalInfo(BitSetStrictLength data);

    AdditionalSubscriptions createAdditionalSubscriptions(
            boolean privilegedUplinkRequest,
            boolean emergencyUplinkRequest, boolean emergencyReset);

    AMBR createAMBR(int maxRequestedBandwidthUL, int maxRequestedBandwidthDL, MAPExtensionContainer extensionContainer);

    APNConfiguration createAPNConfiguration(
            int contextId,
            PDNType pDNType,
            PDPAddress servedPartyIPIPv4Address,
            APN apn,
            EPSQoSSubscribed ePSQoSSubscribed,
            PDNGWIdentity pdnGwIdentity,
            PDNGWAllocationType pdnGwAllocationType,
            boolean vplmnAddressAllowed,
            ChargingCharacteristics chargingCharacteristics,
            AMBR ambr,
            ArrayList<SpecificAPNInfo> specificAPNInfoList,
            MAPExtensionContainer extensionContainer,
            PDPAddress servedPartyIPIPv6Address,
            APNOIReplacement apnOiReplacement,
            SIPTOPermission siptoPermission,
            LIPAPermission lipaPermission);

    APNConfigurationProfile createAPNConfigurationProfile(
            int defaultContext, boolean completeDataListIncluded,
            ArrayList<APNConfiguration> ePSDataList, MAPExtensionContainer extensionContainer);

    CSGSubscriptionData createCSGSubscriptionData(
            CSGId csgId, Time expirationDate,
            MAPExtensionContainer extensionContainer, ArrayList<APN> lipaAllowedAPNList);

    DCSI createDCSI(
            ArrayList<DPAnalysedInfoCriterium> dpAnalysedInfoCriteriaList, Integer camelCapabilityHandling,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive);

    DestinationNumberCriteria createDestinationNumberCriteria(
            MatchType matchType,
            ArrayList<ISDNAddressString> destinationNumberList, ArrayList<Integer> destinationNumberLengthList);

    DPAnalysedInfoCriterium createDPAnalysedInfoCriterium(
            ISDNAddressString dialledNumber,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultCallHandling defaultCallHandling,
            MAPExtensionContainer extensionContainer);

    EPSQoSSubscribed createEPSQoSSubscribed(
            QoSClassIdentifier qoSClassIdentifier,
            AllocationRetentionPriority allocationRetentionPriority, MAPExtensionContainer extensionContainer);

    EPSSubscriptionData createEPSSubscriptionData(
            APNOIReplacement apnOiReplacement,
            Integer rfspId,
            AMBR ambr,
            APNConfigurationProfile apnConfigurationProfile,
            ISDNAddressString stnSr,
            MAPExtensionContainer extensionContainer,
            boolean mpsCSPriority,
            boolean mpsEPSPriority);

    ExternalClient createExternalClient(
            LCSClientExternalID clientIdentity, GMLCRestriction gmlcRestriction,
            NotificationToMSUser notificationToMSUser, MAPExtensionContainer extensionContainer);

    FQDN createFQDN(byte[] data);

    GPRSCamelTDPData createGPRSCamelTDPData(
            GPRSTriggerDetectionPoint gprsTriggerDetectionPoint, long serviceKey,
            ISDNAddressString gsmSCFAddress, DefaultGPRSHandling defaultSessionHandling,
            MAPExtensionContainer extensionContainer);

    GPRSCSI createGPRSCSI(
            ArrayList<GPRSCamelTDPData> gprsCamelTDPDataList, Integer camelCapabilityHandling,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive);

    LCSInformation createLCSInformation(
            ArrayList<ISDNAddressString> gmlcList,
            ArrayList<LCSPrivacyClass> lcsPrivacyExceptionList, ArrayList<MOLRClass> molrList,
            ArrayList<LCSPrivacyClass> addLcsPrivacyExceptionList);

    LCSPrivacyClass createLCSPrivacyClass(
            SSCode ssCode, ExtSSStatus ssStatus,
            NotificationToMSUser notificationToMSUser, ArrayList<ExternalClient> externalClientList,
            ArrayList<LCSClientInternalID> plmnClientList, MAPExtensionContainer extensionContainer,
            ArrayList<ExternalClient> extExternalClientList, ArrayList<ServiceType> serviceTypeList);

    LSAData createLSAData(
            LSAIdentity lsaIdentity, LSAAttributes lsaAttributes, boolean lsaActiveModeIndicator,
            MAPExtensionContainer extensionContainer);

    LSAInformation createLSAInformation(
            boolean completeDataListIncluded, LSAOnlyAccessIndicator lsaOnlyAccessIndicator,
            ArrayList<LSAData> lsaDataList, MAPExtensionContainer extensionContainer);

    MCSI createMCSI(
            ArrayList<MMCode> mobilityTriggers, long serviceKey, ISDNAddressString gsmSCFAddress,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive);

    MCSSInfo createMCSSInfo(
            SSCode ssCode, ExtSSStatus ssStatus, int nbrSB, int nbrUser,
            MAPExtensionContainer extensionContainer);

    MGCSI createMGCSI(
            ArrayList<MMCode> mobilityTriggers, long serviceKey, ISDNAddressString gsmSCFAddress,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive);

    MMCode createMMCode(MMCodeValue value);

    MOLRClass createMOLRClass(SSCode ssCode, ExtSSStatus ssStatus, MAPExtensionContainer extensionContainer);

    MTsmsCAMELTDPCriteria createMTsmsCAMELTDPCriteria(
            SMSTriggerDetectionPoint smsTriggerDetectionPoint,
            ArrayList<MTSMSTPDUType> tPDUTypeCriterion);

    OBcsmCamelTdpCriteria createOBcsmCamelTdpCriteria(
            OBcsmTriggerDetectionPoint oBcsmTriggerDetectionPoint,
            DestinationNumberCriteria destinationNumberCriteria, ArrayList<ExtBasicServiceCode> basicServiceCriteria,
            CallTypeCriteria callTypeCriteria, ArrayList<CauseValue> oCauseValueCriteria,
            MAPExtensionContainer extensionContainer);

    ODBData createODBData(
            ODBGeneralData oDBGeneralData, ODBHPLMNData odbHplmnData,
            MAPExtensionContainer extensionContainer);

    ODBGeneralData createODBGeneralData(
            boolean allOGCallsBarred,
            boolean internationalOGCallsBarred,
            boolean internationalOGCallsNotToHPLMNCountryBarred,
            boolean interzonalOGCallsBarred,
            boolean interzonalOGCallsNotToHPLMNCountryBarred,
            boolean interzonalOGCallsAndInternationalOGCallsNotToHPLMNCountryBarred,
            boolean premiumRateInformationOGCallsBarred,
            boolean premiumRateEntertainementOGCallsBarred,
            boolean ssAccessBarred,
            boolean allECTBarred,
            boolean chargeableECTBarred,
            boolean internationalECTBarred,
            boolean interzonalECTBarred,
            boolean doublyChargeableECTBarred,
            boolean multipleECTBarred,
            boolean allPacketOrientedServicesBarred,
            boolean roamerAccessToHPLMNAPBarred,
            boolean roamerAccessToVPLMNAPBarred,
            boolean roamingOutsidePLMNOGCallsBarred,
            boolean allICCallsBarred,
            boolean roamingOutsidePLMNICCallsBarred,
            boolean roamingOutsidePLMNICountryICCallsBarred,
            boolean roamingOutsidePLMNBarred,
            boolean roamingOutsidePLMNCountryBarred,
            boolean registrationAllCFBarred,
            boolean registrationCFNotToHPLMNBarred,
            boolean registrationInterzonalCFBarred,
            boolean registrationInterzonalCFNotToHPLMNBarred,
            boolean registrationInternationalCFBarred);

    ODBHPLMNData createODBHPLMNData(
            boolean plmnSpecificBarringType1, boolean plmnSpecificBarringType2,
            boolean plmnSpecificBarringType3, boolean plmnSpecificBarringType4);

    PDNGWIdentity createPDNGWIdentity(
            PDPAddress pdnGwIpv4Address, PDPAddress pdnGwIpv6Address, FQDN pdnGwName,
            MAPExtensionContainer extensionContainer);

    PDNType createPDNType(PDNTypeValue value);

    PDNType createPDNType(int data);

    ServiceType createServiceType(
            int serviceTypeIdentity, GMLCRestriction gmlcRestriction,
            NotificationToMSUser notificationToMSUser, MAPExtensionContainer extensionContainer);

    SGSNCAMELSubscriptionInfo createSGSNCAMELSubscriptionInfo(
            GPRSCSI gprsCsi, SMSCSI moSmsCsi,
            MAPExtensionContainer extensionContainer, SMSCSI mtSmsCsi,
            ArrayList<MTsmsCAMELTDPCriteria> mtSmsCamelTdpCriteriaList, MGCSI mgCsi);

    SMSCAMELTDPData createSMSCAMELTDPData(
            SMSTriggerDetectionPoint smsTriggerDetectionPoint,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultSMSHandling defaultSMSHandling,
            MAPExtensionContainer extensionContainer);

    SMSCSI createSMSCSI(
            ArrayList<SMSCAMELTDPData> smsCamelTdpDataList, Integer camelCapabilityHandling,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive);

    SpecificAPNInfo createSpecificAPNInfo(
            APN apn,
            PDNGWIdentity pdnGwIdentity,
            MAPExtensionContainer extensionContainer);

    SSCamelData createSSCamelData(
            ArrayList<SSCode> ssEventList, ISDNAddressString gsmSCFAddress,
            MAPExtensionContainer extensionContainer);

    SSCSI createSSCSI(
            SSCamelData ssCamelData, MAPExtensionContainer extensionContainer, boolean notificationToCSE,
            boolean csiActive);

    TBcsmCamelTdpCriteria createTBcsmCamelTdpCriteria(
            TBcsmTriggerDetectionPoint tBcsmTriggerDetectionPoint,
            ArrayList<ExtBasicServiceCode> basicServiceCriteria, ArrayList<CauseValue> tCauseValueCriteria); // /

    VlrCamelSubscriptionInfo createVlrCamelSubscriptionInfo(
            OCSI oCsi,
            MAPExtensionContainer extensionContainer,
            SSCSI ssCsi,
            ArrayList<OBcsmCamelTdpCriteria> oBcsmCamelTDPCriteriaList,
            boolean tifCsi,
            MCSI mCsi,
            SMSCSI smsCsi,
            TCSI vtCsi,
            ArrayList<TBcsmCamelTdpCriteria> tBcsmCamelTdpCriteriaList,
            DCSI dCsi,
            SMSCSI mtSmsCSI,
            ArrayList<MTsmsCAMELTDPCriteria> mtSmsCamelTdpCriteriaList);

    VoiceBroadcastData createVoiceBroadcastData(
            GroupId groupId, boolean broadcastInitEntitlement,
            MAPExtensionContainer extensionContainer, LongGroupId longGroupId);

    VoiceGroupCallData createVoiceGroupCallData(
            GroupId groupId, MAPExtensionContainer extensionContainer,
            AdditionalSubscriptions additionalSubscriptions, AdditionalInfo additionalInfo, LongGroupId longGroupId);

    ISDNSubaddressString createISDNSubaddressString(byte[] data);

    CauseValue createCauseValue(CauseValueCodeValue value);

    CauseValue createCauseValue(int data);

    GroupId createGroupId(String data);

    LongGroupId createLongGroupId(String data);

    LSAAttributes createLSAAttributes(
            LSAIdentificationPriorityValue value, boolean preferentialAccessAvailable,
            boolean activeModeSupportAvailable);

    LSAAttributes createLSAAttributes(int data);

    Time createTime(int year, int month, int day, int hour, int minute, int second);

    Time createTime(byte[] data);

    NAEACIC createNAEACIC(
            String carrierCode, NetworkIdentificationPlanValue networkIdentificationPlanValue,
            NetworkIdentificationTypeValue networkIdentificationTypeValue)
            throws
            MAPException;

    NAEACIC createNAEACIC(byte[] data);

    NAEAPreferredCI createNAEAPreferredCI(NAEACIC naeaPreferredCIC, MAPExtensionContainer extensionContainer);

    Category createCategory(int data);

    RoutingInfo createRoutingInfo(ISDNAddressString roamingNumber);

    RoutingInfo createRoutingInfo(ForwardingData forwardingData);

    ExtendedRoutingInfo createExtendedRoutingInfo(RoutingInfo routingInfo);

    ExtendedRoutingInfo createExtendedRoutingInfo(CamelRoutingInfo camelRoutingInfo);

    TMSI createTMSI(byte[] data);

    CK createCK(byte[] data);

    Cksn createCksn(int data);

    CurrentSecurityContext createCurrentSecurityContext(GSMSecurityContextData gsmSecurityContextData);

    CurrentSecurityContext createCurrentSecurityContext(UMTSSecurityContextData umtsSecurityContextData);

    GSMSecurityContextData createGSMSecurityContextData(Kc kc, Cksn cksn);

    IK createIK(byte[] data);

    Kc createKc(byte[] data);

    KSI createKSI(int data);

    UMTSSecurityContextData createUMTSSecurityContextData(CK ck, IK ik, KSI ksi);

    EPSInfo createEPSInfo(PDNGWUpdate pndGwUpdate);

    EPSInfo createEPSInfo(ISRInformation isrInformation);

    ISRInformation createISRInformation(boolean updateMME, boolean cancelSGSN, boolean initialAttachIndicator);

    PDNGWUpdate createPDNGWUpdate(
            APN apn, PDNGWIdentity pdnGwIdentity, Integer contextId,
            MAPExtensionContainer extensionContainer);

    SGSNCapability createSGSNCapability(
            boolean solsaSupportIndicator,
            MAPExtensionContainer extensionContainer,
            SuperChargerInfo superChargerSupportedInServingNetworkEntity,
            boolean gprsEnhancementsSupportIndicator,
            SupportedCamelPhases supportedCamelPhases,
            SupportedLCSCapabilitySets supportedLCSCapabilitySets,
            OfferedCamel4CSIs offeredCamel4CSIs,
            boolean smsCallBarringSupportIndicator,
            SupportedRATTypes supportedRATTypesIndicator,
            SupportedFeatures supportedFeatures,
            boolean tAdsDataRetrieval,
            Boolean homogeneousSupportOfIMSVoiceOverPSSessions);

    OfferedCamel4Functionalities createOfferedCamel4Functionalities(
            boolean initiateCallAttempt,
            boolean splitLeg,
            boolean moveLeg,
            boolean disconnectLeg,
            boolean entityReleased,
            boolean dfcWithArgument,
            boolean playTone,
            boolean dtmfMidCall,
            boolean chargingIndicator,
            boolean alertingDP,
            boolean locationAtAlerting,
            boolean changeOfPositionDP,
            boolean orInteractions,
            boolean warningToneEnhancements,
            boolean cfEnhancements,
            boolean subscribedEnhancedDialledServices,
            boolean servingNetworkEnhancedDialledServices,
            boolean criteriaForChangeOfPositionDP,
            boolean serviceChangeDP,
            boolean collectInformation);

}

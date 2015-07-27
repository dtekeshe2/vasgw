package za.co.ebridge.map.impl;

import java.nio.charset.Charset;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.BitSetStrictLength;
import za.co.ebridge.isup.api.message.parameter.LocationNumber;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParameterFactory;
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
import za.co.ebridge.map.api.service.lsm.VelocityType;
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
import za.co.ebridge.map.api.service.mobility.locationManagement.IMSIWithLMSI;
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
import za.co.ebridge.map.api.service.mobility.subscriberInformation.TypeOfShape;
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
import za.co.ebridge.tcap.api.asn.comp.ProblemType;
import za.co.ebridge.tcap.api.asn.comp.ReturnErrorProblemType;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultProblemType;
import za.co.ebridge.map.impl.dialog.MAPUserAbortChoiceImpl;
import za.co.ebridge.map.impl.primitives.AddressStringImpl;
import za.co.ebridge.map.impl.primitives.CellGlobalIdOrServiceAreaIdFixedLengthImpl;
import za.co.ebridge.map.impl.primitives.CellGlobalIdOrServiceAreaIdOrLAIImpl;
import za.co.ebridge.map.impl.primitives.DiameterIdentityImpl;
import za.co.ebridge.map.impl.primitives.FTNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.GSNAddressImpl;
import za.co.ebridge.map.impl.primitives.IMEIImpl;
import za.co.ebridge.map.impl.primitives.IMSIImpl;
import za.co.ebridge.map.impl.primitives.ISDNAddressStringImpl;
import za.co.ebridge.map.impl.primitives.ISDNSubaddressStringImpl;
import za.co.ebridge.map.impl.primitives.LAIFixedLengthImpl;
import za.co.ebridge.map.impl.primitives.LMSIImpl;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.MAPPrivateExtensionImpl;
import za.co.ebridge.map.impl.primitives.NAEACICImpl;
import za.co.ebridge.map.impl.primitives.NAEAPreferredCIImpl;
import za.co.ebridge.map.impl.primitives.PlmnIdImpl;
import za.co.ebridge.map.impl.primitives.SubscriberIdentityImpl;
import za.co.ebridge.map.impl.primitives.TMSIImpl;
import za.co.ebridge.map.impl.primitives.TimeImpl;
import za.co.ebridge.map.impl.primitives.USSDStringImpl;
import za.co.ebridge.map.impl.service.callhandling.CUGCheckInfoImpl;
import za.co.ebridge.map.impl.service.callhandling.CallReferenceNumberImpl;
import za.co.ebridge.map.impl.service.callhandling.CamelInfoImpl;
import za.co.ebridge.map.impl.service.callhandling.CamelRoutingInfoImpl;
import za.co.ebridge.map.impl.service.callhandling.ExtendedRoutingInfoImpl;
import za.co.ebridge.map.impl.service.callhandling.GmscCamelSubscriptionInfoImpl;
import za.co.ebridge.map.impl.service.callhandling.RoutingInfoImpl;
import za.co.ebridge.map.impl.service.lsm.AddGeographicalInformationImpl;
import za.co.ebridge.map.impl.service.lsm.AdditionalNumberImpl;
import za.co.ebridge.map.impl.service.lsm.AreaDefinitionImpl;
import za.co.ebridge.map.impl.service.lsm.AreaEventInfoImpl;
import za.co.ebridge.map.impl.service.lsm.AreaIdentificationImpl;
import za.co.ebridge.map.impl.service.lsm.AreaImpl;
import za.co.ebridge.map.impl.service.lsm.DeferredLocationEventTypeImpl;
import za.co.ebridge.map.impl.service.lsm.DeferredmtlrDataImpl;
import za.co.ebridge.map.impl.service.lsm.ExtGeographicalInformationImpl;
import za.co.ebridge.map.impl.service.lsm.GeranGANSSpositioningDataImpl;
import za.co.ebridge.map.impl.service.lsm.LCSClientExternalIDImpl;
import za.co.ebridge.map.impl.service.lsm.LCSClientIDImpl;
import za.co.ebridge.map.impl.service.lsm.LCSClientNameImpl;
import za.co.ebridge.map.impl.service.lsm.LCSCodewordImpl;
import za.co.ebridge.map.impl.service.lsm.LCSLocationInfoImpl;
import za.co.ebridge.map.impl.service.lsm.LCSPrivacyCheckImpl;
import za.co.ebridge.map.impl.service.lsm.LCSQoSImpl;
import za.co.ebridge.map.impl.service.lsm.LCSRequestorIDImpl;
import za.co.ebridge.map.impl.service.lsm.LocationTypeImpl;
import za.co.ebridge.map.impl.service.lsm.PeriodicLDRInfoImpl;
import za.co.ebridge.map.impl.service.lsm.PositioningDataInformationImpl;
import za.co.ebridge.map.impl.service.lsm.ReportingPLMNImpl;
import za.co.ebridge.map.impl.service.lsm.ReportingPLMNListImpl;
import za.co.ebridge.map.impl.service.lsm.ResponseTimeImpl;
import za.co.ebridge.map.impl.service.lsm.SLRArgExtensionContainerImpl;
import za.co.ebridge.map.impl.service.lsm.SLRArgPCSExtensionsImpl;
import za.co.ebridge.map.impl.service.lsm.ServingNodeAddressImpl;
import za.co.ebridge.map.impl.service.lsm.SupportedGADShapesImpl;
import za.co.ebridge.map.impl.service.lsm.UtranGANSSpositioningDataImpl;
import za.co.ebridge.map.impl.service.lsm.UtranPositioningDataInfoImpl;
import za.co.ebridge.map.impl.service.lsm.VelocityEstimateImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.AuthenticationQuintupletImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.AuthenticationSetListImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.AuthenticationTripletImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.CKImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.CksnImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.CurrentSecurityContextImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.EpcAvImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.EpsAuthenticationSetListImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.GSMSecurityContextDataImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.IKImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.KSIImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.KcImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.QuintupletListImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.ReSynchronisationInfoImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.TripletListImpl;
import za.co.ebridge.map.impl.service.mobility.authentication.UMTSSecurityContextDataImpl;
import za.co.ebridge.map.impl.service.mobility.imei.RequestedEquipmentInfoImpl;
import za.co.ebridge.map.impl.service.mobility.imei.UESBIIuAImpl;
import za.co.ebridge.map.impl.service.mobility.imei.UESBIIuBImpl;
import za.co.ebridge.map.impl.service.mobility.imei.UESBIIuImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.ADDInfoImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.EPSInfoImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.IMSIWithLMSIImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.ISRInformationImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.LACImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.LocationAreaImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.PDNGWUpdateImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.PagingAreaImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.SGSNCapabilityImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.SuperChargerInfoImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.SupportedFeaturesImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.SupportedLCSCapabilitySetsImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.SupportedRATTypesImpl;
import za.co.ebridge.map.impl.service.mobility.locationManagement.VLRCapabilityImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.AnyTimeInterrogationRequestImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.AnyTimeInterrogationResponseImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.EUtranCgiImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.GPRSChargingIDImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.GPRSMSClassImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.GeodeticInformationImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.GeographicalInformationImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.LocationInformationEPSImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.LocationInformationGPRSImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.LocationInformationImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.LocationNumberMapImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.MNPInfoResImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.MSClassmark2Impl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.MSNetworkCapabilityImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.MSRadioAccessCapabilityImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.PDPContextImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.PDPContextInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.PSSubscriberStateImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.RAIdentityImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.RequestedInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.RouteingNumberImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.SubscriberInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.SubscriberStateImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.TAIdImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.TEIDImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.TransactionIdImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberInformation.UserCSGInformationImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.AMBRImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.APNConfigurationImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.APNConfigurationProfileImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.APNImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.APNOIReplacementImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.AccessRestrictionDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.AdditionalInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.AdditionalSubscriptionsImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.AgeIndicatorImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.BasicServiceCodeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.BearerServiceCodeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CSAllocationRetentionPriorityImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CSGIdImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CSGSubscriptionDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CUGFeatureImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CUGInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CUGInterlockImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CUGSubscriptionImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CategoryImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.CauseValueImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ChargingCharacteristicsImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.DCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.DPAnalysedInfoCriteriumImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.DestinationNumberCriteriaImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.EMLPPInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.EPSQoSSubscribedImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.EPSSubscriptionDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.Ext2QoSSubscribedImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.Ext3QoSSubscribedImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.Ext4QoSSubscribedImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtBasicServiceCodeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtBearerServiceCodeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtCallBarInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtCallBarringFeatureImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtForwFeatureImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtForwInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtForwOptionsImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtPDPTypeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtQoSSubscribedImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtSSDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtSSInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtSSStatusImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExtTeleserviceCodeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ExternalClientImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.FQDNImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.GPRSCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.GPRSCamelTDPDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.GPRSSubscriptionDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.GroupIdImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.InterCUGRestrictionsImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.LCSInformationImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.LCSPrivacyClassImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.LSAAttributesImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.LSADataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.LSAIdentityImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.LSAInformationImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.LongGroupIdImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.MCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.MCSSInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.MGCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.MMCodeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.MOLRClassImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.MTsmsCAMELTDPCriteriaImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.OBcsmCamelTDPDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.OBcsmCamelTdpCriteriaImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.OCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ODBDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ODBGeneralDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ODBHPLMNDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.OfferedCamel4CSIsImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.OfferedCamel4FunctionalitiesImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.PDNGWIdentityImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.PDNTypeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.PDPAddressImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.PDPTypeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.QoSSubscribedImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.SGSNCAMELSubscriptionInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.SMSCAMELTDPDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.SMSCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.SSCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.SSCamelDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ServiceTypeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.SpecificAPNInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.SupportedCamelPhasesImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.TBcsmCamelTDPDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.TBcsmCamelTdpCriteriaImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.TCSIImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.TeleserviceCodeImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.VlrCamelSubscriptionInfoImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.VoiceBroadcastDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.VoiceGroupCallDataImpl;
import za.co.ebridge.map.impl.service.mobility.subscriberManagement.ZoneCodeImpl;
import za.co.ebridge.map.impl.service.sms.LocationInfoWithLMSIImpl;
import za.co.ebridge.map.impl.service.sms.MWStatusImpl;
import za.co.ebridge.map.impl.service.sms.SM_RP_DAImpl;
import za.co.ebridge.map.impl.service.sms.SM_RP_OAImpl;
import za.co.ebridge.map.impl.service.sms.SM_RP_SMEAImpl;
import za.co.ebridge.map.impl.service.sms.SmsSignalInfoImpl;
import za.co.ebridge.map.impl.service.supplementary.ProcessUnstructuredSSRequestImpl;
import za.co.ebridge.map.impl.service.supplementary.ProcessUnstructuredSSResponseImpl;
import za.co.ebridge.map.impl.service.supplementary.SSCodeImpl;
import za.co.ebridge.map.impl.service.supplementary.SSStatusImpl;
import za.co.ebridge.map.impl.service.supplementary.SSSubscriptionOptionImpl;
import za.co.ebridge.map.impl.service.supplementary.UnstructuredSSNotifyRequestImpl;
import za.co.ebridge.map.impl.service.supplementary.UnstructuredSSNotifyResponseImpl;
import za.co.ebridge.map.impl.service.supplementary.UnstructuredSSRequestImpl;
import za.co.ebridge.map.impl.service.supplementary.UnstructuredSSResponseImpl;
import za.co.ebridge.tcap.api.asn.TcapFactory;

public class MAPParameterFactoryImpl
        implements MAPParameterFactory
{

    public ProcessUnstructuredSSRequest createProcessUnstructuredSSRequestIndication(
            CBSDataCodingScheme ussdDataCodingSch,
            USSDString ussdString, AlertingPattern alertingPattern, ISDNAddressString msisdnAddressString)
    {

        ProcessUnstructuredSSRequest request = new ProcessUnstructuredSSRequestImpl(ussdDataCodingSch, ussdString,
                alertingPattern, msisdnAddressString);
        return request;
    }

    public ProcessUnstructuredSSResponse createProcessUnstructuredSSResponseIndication(
            CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString)
    {
        ProcessUnstructuredSSResponse response = new ProcessUnstructuredSSResponseImpl(ussdDataCodingScheme,
                ussdString);
        return response;
    }

    public UnstructuredSSRequest createUnstructuredSSRequestIndication(
            CBSDataCodingScheme ussdDataCodingSch,
            USSDString ussdString, AlertingPattern alertingPattern, ISDNAddressString msisdnAddressString)
    {
        UnstructuredSSRequest request = new UnstructuredSSRequestImpl(ussdDataCodingSch, ussdString, alertingPattern,
                msisdnAddressString);
        return request;
    }

    public UnstructuredSSResponse createUnstructuredSSRequestIndication(
            CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString)
    {
        UnstructuredSSResponse response = new UnstructuredSSResponseImpl(ussdDataCodingScheme, ussdString);
        return response;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api
     * .MAPParameterFactory#createUnstructuredSSNotifyRequestIndication(byte,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.USSDString,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.AlertingPattern,
     * org.mobicents.protocols.protocols.ss7.cap.api.map.api.primitives.ISDNAddressString)
     */
    public UnstructuredSSNotifyRequest createUnstructuredSSNotifyRequestIndication(
            CBSDataCodingScheme ussdDataCodingSch,
            USSDString ussdString, AlertingPattern alertingPattern, ISDNAddressString msisdnAddressString)
    {
        UnstructuredSSNotifyRequest request = new UnstructuredSSNotifyRequestImpl(ussdDataCodingSch, ussdString,
                alertingPattern, msisdnAddressString);
        return request;
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.api
     * .MAPParameterFactory#createUnstructuredSSNotifyResponseIndication()
     */
    public UnstructuredSSNotifyResponse createUnstructuredSSNotifyResponseIndication()
    {
        UnstructuredSSNotifyResponse response = new UnstructuredSSNotifyResponseImpl();
        return response;
    }

    public USSDString createUSSDString(String ussdString, CBSDataCodingScheme dataCodingScheme, Charset gsm8Charset)
            throws
            MAPException
    {
        return new USSDStringImpl(ussdString, dataCodingScheme, gsm8Charset);
    }

    public USSDString createUSSDString(String ussdString)
            throws
            MAPException
    {
        return new USSDStringImpl(ussdString, null, null);
    }

    public USSDString createUSSDString(byte[] ussdString, CBSDataCodingScheme dataCodingScheme, Charset gsm8Charset)
    {
        return new USSDStringImpl(ussdString, dataCodingScheme);
    }

    public USSDString createUSSDString(byte[] ussdString)
    {
        return new USSDStringImpl(ussdString, null);
    }

    public AddressString createAddressString(AddressNature addNature, NumberingPlan numPlan, String address)
    {
        return new AddressStringImpl(addNature, numPlan, address);
    }

    public ISDNAddressString createISDNAddressString(AddressNature addNature, NumberingPlan numPlan, String address)
    {
        return new ISDNAddressStringImpl(addNature, numPlan, address);
    }

    public FTNAddressString createFTNAddressString(AddressNature addNature, NumberingPlan numPlan, String address)
    {
        return new FTNAddressStringImpl(addNature, numPlan, address);
    }

    public MAPUserAbortChoice createMAPUserAbortChoice()
    {
        MAPUserAbortChoiceImpl mapUserAbortChoice = new MAPUserAbortChoiceImpl();
        return mapUserAbortChoice;
    }

    public MAPPrivateExtension createMAPPrivateExtension(long[] oId, byte[] data)
    {
        return new MAPPrivateExtensionImpl(oId, data);
    }

    public MAPExtensionContainer createMAPExtensionContainer(
            ArrayList<MAPPrivateExtension> privateExtensionList,
            byte[] pcsExtensions)
    {
        return new MAPExtensionContainerImpl(privateExtensionList, pcsExtensions);
    }

    public IMSI createIMSI(String data)
    {
        return new IMSIImpl(data);
    }

    public IMEI createIMEI(String imei)
    {
        return new IMEIImpl(imei);
    }

    public LMSI createLMSI(byte[] data)
    {
        return new LMSIImpl(data);
    }

    public SM_RP_DA createSM_RP_DA(IMSI imsi)
    {
        return new SM_RP_DAImpl(imsi);
    }

    public SM_RP_DA createSM_RP_DA(LMSI lmsi)
    {
        return new SM_RP_DAImpl(lmsi);
    }

    public SM_RP_DA createSM_RP_DA(AddressString serviceCentreAddressDA)
    {
        return new SM_RP_DAImpl(serviceCentreAddressDA);
    }

    public SM_RP_DA createSM_RP_DA()
    {
        return new SM_RP_DAImpl();
    }

    public SM_RP_OA createSM_RP_OA_Msisdn(ISDNAddressString msisdn)
    {
        SM_RP_OAImpl res = new SM_RP_OAImpl();
        res.setMsisdn(msisdn);
        return res;
    }

    public SM_RP_OA createSM_RP_OA_ServiceCentreAddressOA(AddressString serviceCentreAddressOA)
    {
        SM_RP_OAImpl res = new SM_RP_OAImpl();
        res.setServiceCentreAddressOA(serviceCentreAddressOA);
        return res;
    }

    public SM_RP_OA createSM_RP_OA()
    {
        return new SM_RP_OAImpl();
    }

    public SmsSignalInfo createSmsSignalInfo(byte[] data, Charset gsm8Charset)
    {
        return new SmsSignalInfoImpl(data, gsm8Charset);
    }

    public SmsSignalInfo createSmsSignalInfo(SmsTpdu data, Charset gsm8Charset)
            throws
            MAPException
    {
        return new SmsSignalInfoImpl(data, gsm8Charset);
    }

    public SM_RP_SMEA createSM_RP_SMEA(byte[] data)
    {
        return new SM_RP_SMEAImpl(data);
    }

    public SM_RP_SMEA createSM_RP_SMEA(AddressField addressField)
            throws
            MAPException
    {
        return new SM_RP_SMEAImpl(addressField);
    }

    public MWStatus createMWStatus(boolean scAddressNotIncluded, boolean mnrfSet, boolean mcefSet, boolean mnrgSet)
    {
        return new MWStatusImpl(scAddressNotIncluded, mnrfSet, mcefSet, mnrgSet);
    }

    public LocationInfoWithLMSI createLocationInfoWithLMSI(
            ISDNAddressString networkNodeNumber, LMSI lmsi,
            MAPExtensionContainer extensionContainer, AdditionalNumberType additionalNumberType,
            ISDNAddressString additionalNumber)
    {
        return new LocationInfoWithLMSIImpl(networkNodeNumber, lmsi, extensionContainer, additionalNumberType,
                additionalNumber);
    }

    public Problem createProblemGeneral(GeneralProblemType prob)
    {
        Problem pb = TcapFactory.createProblem(ProblemType.General);
        pb.setGeneralProblemType(prob);
        return pb;
    }

    public Problem createProblemInvoke(InvokeProblemType prob)
    {
        Problem pb = TcapFactory.createProblem(ProblemType.Invoke);
        pb.setInvokeProblemType(prob);
        return pb;
    }

    public Problem createProblemResult(ReturnResultProblemType prob)
    {
        Problem pb = TcapFactory.createProblem(ProblemType.ReturnResult);
        pb.setReturnResultProblemType(prob);
        return pb;
    }

    public Problem createProblemError(ReturnErrorProblemType prob)
    {
        Problem pb = TcapFactory.createProblem(ProblemType.ReturnError);
        pb.setReturnErrorProblemType(prob);
        return pb;
    }

    public CellGlobalIdOrServiceAreaIdOrLAI createCellGlobalIdOrServiceAreaIdOrLAI(
            CellGlobalIdOrServiceAreaIdFixedLength cellGlobalIdOrServiceAreaIdFixedLength)
    {
        return new CellGlobalIdOrServiceAreaIdOrLAIImpl(cellGlobalIdOrServiceAreaIdFixedLength);
    }

    public CellGlobalIdOrServiceAreaIdOrLAI createCellGlobalIdOrServiceAreaIdOrLAI(LAIFixedLength laiFixedLength)
    {
        return new CellGlobalIdOrServiceAreaIdOrLAIImpl(laiFixedLength);
    }

    public CellGlobalIdOrServiceAreaIdFixedLength createCellGlobalIdOrServiceAreaIdFixedLength(byte[] data)
    {
        return new CellGlobalIdOrServiceAreaIdFixedLengthImpl(data);
    }

    public CellGlobalIdOrServiceAreaIdFixedLength createCellGlobalIdOrServiceAreaIdFixedLength(
            int mcc, int mnc, int lac,
            int cellIdOrServiceAreaCode)
            throws
            MAPException
    {
        return new CellGlobalIdOrServiceAreaIdFixedLengthImpl(mcc, mnc, lac, cellIdOrServiceAreaCode);
    }

    public LAIFixedLength createLAIFixedLength(byte[] data)
    {
        return new LAIFixedLengthImpl(data);
    }

    public LAIFixedLength createLAIFixedLength(int mcc, int mnc, int lac)
            throws
            MAPException
    {
        return new LAIFixedLengthImpl(mcc, mnc, lac);
    }

    public CallReferenceNumber createCallReferenceNumber(byte[] data)
    {
        return new CallReferenceNumberImpl(data);
    }

    public LocationInformation createLocationInformation(
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
            UserCSGInformation userCSGInformation)
    {
        return new LocationInformationImpl(ageOfLocationInformation, geographicalInformation, vlrNumber, locationNumber,
                cellGlobalIdOrServiceAreaIdOrLAI, extensionContainer, selectedLSAId, mscNumber, geodeticInformation,
                currentLocationRetrieved, saiPresent, locationInformationEPS, userCSGInformation);
    }

    public LocationNumberMap createLocationNumberMap(byte[] data)
    {
        return new LocationNumberMapImpl(data);
    }

    public LocationNumberMap createLocationNumberMap(LocationNumber locationNumber)
            throws
            MAPException
    {
        return new LocationNumberMapImpl(locationNumber);
    }

    public SubscriberState createSubscriberState(
            SubscriberStateChoice subscriberStateChoice,
            NotReachableReason notReachableReason)
    {
        return new SubscriberStateImpl(subscriberStateChoice, notReachableReason);
    }

    public ExtBasicServiceCode createExtBasicServiceCode(ExtBearerServiceCode extBearerServiceCode)
    {
        return new ExtBasicServiceCodeImpl(extBearerServiceCode);
    }

    public ExtBasicServiceCode createExtBasicServiceCode(ExtTeleserviceCode extTeleserviceCode)
    {
        return new ExtBasicServiceCodeImpl(extTeleserviceCode);
    }

    public ExtBearerServiceCode createExtBearerServiceCode(byte[] data)
    {
        return new ExtBearerServiceCodeImpl(data);
    }

    public ExtBearerServiceCode createExtBearerServiceCode(BearerServiceCodeValue value)
    {
        return new ExtBearerServiceCodeImpl(value);
    }

    public BearerServiceCode createBearerServiceCode(int data)
    {
        return new BearerServiceCodeImpl(data);
    }

    public BearerServiceCode createBearerServiceCode(BearerServiceCodeValue value)
    {
        return new BearerServiceCodeImpl(value);
    }

    public ExtTeleserviceCode createExtTeleserviceCode(byte[] data)
    {
        return new ExtTeleserviceCodeImpl(data);
    }

    public ExtTeleserviceCode createExtTeleserviceCode(TeleserviceCodeValue value)
    {
        return new ExtTeleserviceCodeImpl(value);
    }

    public TeleserviceCode createTeleserviceCode(int data)
    {
        return new TeleserviceCodeImpl(data);
    }

    public TeleserviceCode createTeleserviceCode(TeleserviceCodeValue value)
    {
        return new TeleserviceCodeImpl(value);
    }

    public AuthenticationTriplet createAuthenticationTriplet(byte[] rand, byte[] sres, byte[] kc)
    {
        return new AuthenticationTripletImpl(rand, sres, kc);
    }

    public AuthenticationQuintuplet createAuthenticationQuintuplet(
            byte[] rand,
            byte[] xres,
            byte[] ck,
            byte[] ik,
            byte[] autn)
    {
        return new AuthenticationQuintupletImpl(rand, xres, ck, ik, autn);
    }

    public TripletList createTripletList(ArrayList<AuthenticationTriplet> authenticationTriplets)
    {
        return new TripletListImpl(authenticationTriplets);
    }

    public QuintupletList createQuintupletList(ArrayList<AuthenticationQuintuplet> quintupletList)
    {
        return new QuintupletListImpl(quintupletList);
    }

    public AuthenticationSetList createAuthenticationSetList(TripletList tripletList)
    {
        return new AuthenticationSetListImpl(tripletList);
    }

    public AuthenticationSetList createAuthenticationSetList(QuintupletList quintupletList)
    {
        return new AuthenticationSetListImpl(quintupletList);
    }

    public PlmnId createPlmnId(byte[] data)
    {
        return new PlmnIdImpl(data);
    }

    public PlmnId createPlmnId(int mcc, int mnc)
    {
        return new PlmnIdImpl(mcc, mnc);
    }

    public GSNAddress createGSNAddress(byte[] data)
    {
        return new GSNAddressImpl(data);
    }

    public ReSynchronisationInfo createReSynchronisationInfo(byte[] rand, byte[] auts)
    {
        return new ReSynchronisationInfoImpl(rand, auts);
    }

    public EpsAuthenticationSetList createEpsAuthenticationSetList(ArrayList<EpcAv> epcAv)
    {
        return new EpsAuthenticationSetListImpl(epcAv);
    }

    public EpcAv createEpcAv(
            byte[] rand,
            byte[] xres,
            byte[] autn,
            byte[] kasme,
            MAPExtensionContainer extensionContainer)
    {
        return new EpcAvImpl(rand, xres, autn, kasme, extensionContainer);
    }

    public VLRCapability createVlrCapability(
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
            boolean mtRoamingForwardingSupported)
    {
        return new VLRCapabilityImpl(supportedCamelPhases, extensionContainer, solsaSupportIndicator,
                istSupportIndicator,
                superChargerSupportedInServingNetworkEntity, longFtnSupported, supportedLCSCapabilitySets,
                offeredCamel4CSIs,
                supportedRATTypesIndicator, longGroupIDSupported, mtRoamingForwardingSupported);
    }

    public SupportedCamelPhases createSupportedCamelPhases(
            boolean phase1,
            boolean phase2,
            boolean phase3,
            boolean phase4)
    {
        return new SupportedCamelPhasesImpl(phase1, phase2, phase3, phase4);
    }

    public SuperChargerInfo createSuperChargerInfo(Boolean sendSubscriberData)
    {
        return new SuperChargerInfoImpl(sendSubscriberData);
    }

    public SuperChargerInfo createSuperChargerInfo(byte[] subscriberDataStored)
    {
        return new SuperChargerInfoImpl(subscriberDataStored);
    }

    public SupportedLCSCapabilitySets createSupportedLCSCapabilitySets(
            boolean lcsCapabilitySetRelease98_99,
            boolean lcsCapabilitySetRelease4, boolean lcsCapabilitySetRelease5, boolean lcsCapabilitySetRelease6,
            boolean lcsCapabilitySetRelease7)
    {
        return new SupportedLCSCapabilitySetsImpl(lcsCapabilitySetRelease98_99, lcsCapabilitySetRelease4,
                lcsCapabilitySetRelease5, lcsCapabilitySetRelease6, lcsCapabilitySetRelease7);
    }

    public OfferedCamel4CSIs createOfferedCamel4CSIs(
            boolean oCsi, boolean dCsi, boolean vtCsi, boolean tCsi, boolean mtSMSCsi,
            boolean mgCsi, boolean psiEnhancements)
    {
        return new OfferedCamel4CSIsImpl(oCsi, dCsi, vtCsi, tCsi, mtSMSCsi, mgCsi, psiEnhancements);
    }

    public SupportedRATTypes createSupportedRATTypes(
            boolean utran, boolean geran, boolean gan, boolean i_hspa_evolution,
            boolean e_utran)
    {
        return new SupportedRATTypesImpl(utran, geran, gan, i_hspa_evolution, e_utran);
    }

    public ADDInfo createADDInfo(IMEI imeisv, boolean skipSubscriberDataUpdate)
    {
        return new ADDInfoImpl(imeisv, skipSubscriberDataUpdate);
    }

    public PagingArea createPagingArea(ArrayList<LocationArea> locationAreas)
    {
        return new PagingAreaImpl(locationAreas);
    }

    public LAC createLAC(byte[] data)
    {
        return new LACImpl(data);
    }

    public LAC createLAC(int lac)
            throws
            MAPException
    {
        return new LACImpl(lac);
    }

    public LocationArea createLocationArea(LAIFixedLength laiFixedLength)
    {
        return new LocationAreaImpl(laiFixedLength);
    }

    public LocationArea createLocationArea(LAC lac)
    {
        return new LocationAreaImpl(lac);
    }

    public AnyTimeInterrogationRequest createAnyTimeInterrogationRequest(
            SubscriberIdentity subscriberIdentity,
            RequestedInfo requestedInfo, ISDNAddressString gsmSCFAddress, MAPExtensionContainer extensionContainer)
    {
        return new AnyTimeInterrogationRequestImpl(subscriberIdentity, requestedInfo, gsmSCFAddress,
                extensionContainer);
    }

    public AnyTimeInterrogationResponse createAnyTimeInterrogationResponse(
            SubscriberInfo subscriberInfo,
            MAPExtensionContainer extensionContainer)
    {
        return new AnyTimeInterrogationResponseImpl(subscriberInfo, extensionContainer);
    }

    public DiameterIdentity createDiameterIdentity(byte[] data)
    {
        return new DiameterIdentityImpl(data);
    }

    public SubscriberIdentity createSubscriberIdentity(IMSI imsi)
    {
        return new SubscriberIdentityImpl(imsi);
    }

    public SubscriberIdentity createSubscriberIdentity(ISDNAddressString msisdn)
    {
        return new SubscriberIdentityImpl(msisdn);
    }

    public APN createAPN(byte[] data)
    {
        return new APNImpl(data);
    }

    public PDPAddress createPDPAddress(byte[] data)
    {
        return new PDPAddressImpl(data);
    }

    public PDPType createPDPType(byte[] data)
    {
        return new PDPTypeImpl(data);
    }

    public PDPContextInfo createPDPContextInfo(
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
            PDPAddress extPdpAddress)
    {
        return new PDPContextInfoImpl(pdpContextIdentifier, pdpContextActive, pdpType, pdpAddress, apnSubscribed,
                apnInUse,
                asapi, transactionId, teidForGnAndGp, teidForIu, ggsnAddress, qosSubscribed, qosRequested,
                qosNegotiated,
                chargingId, chargingCharacteristics, rncAddress, extensionContainer, qos2Subscribed, qos2Requested,
                qos2Negotiated, qos3Subscribed, qos3Requested, qos3Negotiated, qos4Subscribed, qos4Requested,
                qos4Negotiated,
                extPdpType, extPdpAddress);
    }

    public CSGId createCSGId(BitSetStrictLength data)
    {
        return new CSGIdImpl(data);
    }

    public LSAIdentity createLSAIdentity(byte[] data)
    {
        return new LSAIdentityImpl(data);
    }

    public GPRSChargingID createGPRSChargingID(byte[] data)
    {
        return new GPRSChargingIDImpl(data);
    }

    public ChargingCharacteristics createChargingCharacteristics(byte[] data)
    {
        return new ChargingCharacteristicsImpl(data);
    }

    public ExtQoSSubscribed createExtQoSSubscribed(byte[] data)
    {
        return new ExtQoSSubscribedImpl(data);
    }

    public Ext2QoSSubscribed createExt2QoSSubscribed(byte[] data)
    {
        return new Ext2QoSSubscribedImpl(data);
    }

    public Ext3QoSSubscribed createExt3QoSSubscribed(byte[] data)
    {
        return new Ext3QoSSubscribedImpl(data);
    }

    public Ext4QoSSubscribed createExt4QoSSubscribed(int data)
    {
        return new Ext4QoSSubscribedImpl(data);
    }

    public ExtPDPType createExtPDPType(byte[] data)
    {
        return new ExtPDPTypeImpl(data);
    }

    public TransactionId createTransactionId(byte[] data)
    {
        return new TransactionIdImpl(data);
    }

    public TAId createTAId(byte[] data)
    {
        return new TAIdImpl(data);
    }

    public RAIdentity createRAIdentity(byte[] data)
    {
        return new RAIdentityImpl(data);
    }

    public EUtranCgi createEUtranCgi(byte[] data)
    {
        return new EUtranCgiImpl(data);
    }

    public TEID createTEID(byte[] data)
    {
        return new TEIDImpl(data);
    }

    public GPRSMSClass createGPRSMSClass(
            MSNetworkCapability mSNetworkCapability,
            MSRadioAccessCapability mSRadioAccessCapability)
    {
        return new GPRSMSClassImpl(mSNetworkCapability, mSRadioAccessCapability);
    }

    public GeodeticInformation createGeodeticInformation(byte[] data)
    {
        return new GeodeticInformationImpl(data);
    }

    public GeographicalInformation createGeographicalInformation(byte[] data)
    {
        return new GeographicalInformationImpl(data);
    }

    public LocationInformationEPS createLocationInformationEPS(
            EUtranCgi eUtranCellGlobalIdentity, TAId trackingAreaIdentity,
            MAPExtensionContainer extensionContainer, GeographicalInformation geographicalInformation,
            GeodeticInformation geodeticInformation, boolean currentLocationRetrieved, Integer ageOfLocationInformation,
            DiameterIdentity mmeName)
    {
        return new LocationInformationEPSImpl(eUtranCellGlobalIdentity, trackingAreaIdentity, extensionContainer,
                geographicalInformation, geodeticInformation, currentLocationRetrieved, ageOfLocationInformation,
                mmeName);
    }

    public LocationInformationGPRS createLocationInformationGPRS(
            CellGlobalIdOrServiceAreaIdOrLAI cellGlobalIdOrServiceAreaIdOrLAI,
            RAIdentity routeingAreaIdentity,
            GeographicalInformation geographicalInformation,
            ISDNAddressString sgsnNumber,
            LSAIdentity selectedLSAIdentity,
            MAPExtensionContainer extensionContainer,
            boolean saiPresent,
            GeodeticInformation geodeticInformation,
            boolean currentLocationRetrieved,
            Integer ageOfLocationInformation)
    {
        return new LocationInformationGPRSImpl(cellGlobalIdOrServiceAreaIdOrLAI, routeingAreaIdentity,
                geographicalInformation,
                sgsnNumber, selectedLSAIdentity, extensionContainer, saiPresent, geodeticInformation,
                currentLocationRetrieved,
                ageOfLocationInformation);
    }

    public MSNetworkCapability createMSNetworkCapability(byte[] data)
    {
        return new MSNetworkCapabilityImpl(data);
    }

    public MSRadioAccessCapability createMSRadioAccessCapability(byte[] data)
    {
        return new MSRadioAccessCapabilityImpl(data);
    }

    public MSClassmark2 createMSClassmark2(byte[] data)
    {
        return new MSClassmark2Impl(data);
    }

    public MNPInfoRes createMNPInfoRes(
            RouteingNumber routeingNumber, IMSI imsi, ISDNAddressString msisdn,
            NumberPortabilityStatus numberPortabilityStatus, MAPExtensionContainer extensionContainer)
    {
        return new MNPInfoResImpl(routeingNumber, imsi, msisdn, numberPortabilityStatus, extensionContainer);
    }

    public RequestedInfo createRequestedInfo(
            boolean locationInformation, boolean subscriberState,
            MAPExtensionContainer extensionContainer, boolean currentLocation, DomainType requestedDomain, boolean imei,
            boolean msClassmark, boolean mnpRequestedInfo)
    {
        return new RequestedInfoImpl(locationInformation, subscriberState, extensionContainer, currentLocation,
                requestedDomain, imei, msClassmark, mnpRequestedInfo);
    }

    public RouteingNumber createRouteingNumber(String data)
    {
        return new RouteingNumberImpl(data);
    }

    public SubscriberInfo createSubscriberInfo(
            LocationInformation locationInformation, SubscriberState subscriberState,
            MAPExtensionContainer extensionContainer, LocationInformationGPRS locationInformationGPRS,
            PSSubscriberState psSubscriberState, IMEI imei, MSClassmark2 msClassmark2, GPRSMSClass gprsMSClass,
            MNPInfoRes mnpInfoRes)
    {
        return new SubscriberInfoImpl(locationInformation, subscriberState, extensionContainer, locationInformationGPRS,
                psSubscriberState, imei, msClassmark2, gprsMSClass, mnpInfoRes);
    }

    public UserCSGInformation createUserCSGInformation(
            CSGId csgId, MAPExtensionContainer extensionContainer,
            Integer accessMode, Integer cmi)
    {
        return new UserCSGInformationImpl(csgId, extensionContainer, accessMode, cmi);
    }

    public PSSubscriberState createPSSubscriberState(
            PSSubscriberStateChoice choice, NotReachableReason netDetNotReachable,
            ArrayList<PDPContextInfo> pdpContextInfoList)
    {
        return new PSSubscriberStateImpl(choice, netDetNotReachable, pdpContextInfoList);
    }

    public AddGeographicalInformation createAddGeographicalInformation(byte[] data)
    {
        return new AddGeographicalInformationImpl(data);
    }

    public AdditionalNumber createAdditionalNumberMscNumber(ISDNAddressString mSCNumber)
    {
        return new AdditionalNumberImpl(mSCNumber, null);
    }

    public AdditionalNumber createAdditionalNumberSgsnNumber(ISDNAddressString sGSNNumber)
    {
        return new AdditionalNumberImpl(null, sGSNNumber);
    }

    public AreaDefinition createAreaDefinition(ArrayList<Area> areaList)
    {
        return new AreaDefinitionImpl(areaList);
    }

    public AreaEventInfo createAreaEventInfo(
            AreaDefinition areaDefinition,
            OccurrenceInfo occurrenceInfo,
            Integer intervalTime)
    {
        return new AreaEventInfoImpl(areaDefinition, occurrenceInfo, intervalTime);
    }

    public AreaIdentification createAreaIdentification(byte[] data)
    {
        return new AreaIdentificationImpl(data);
    }

    public AreaIdentification createAreaIdentification(
            AreaType type,
            int mcc,
            int mnc,
            int lac,
            int Rac_CellId_UtranCellId)
            throws
            MAPException
    {
        return new AreaIdentificationImpl(type, mcc, mnc, lac, Rac_CellId_UtranCellId);
    }

    public Area createArea(AreaType areaType, AreaIdentification areaIdentification)
    {
        return new AreaImpl(areaType, areaIdentification);
    }

    public DeferredLocationEventType createDeferredLocationEventType(
            boolean msAvailable, boolean enteringIntoArea,
            boolean leavingFromArea, boolean beingInsideArea)
    {
        return new DeferredLocationEventTypeImpl(msAvailable, enteringIntoArea, leavingFromArea, beingInsideArea);
    }

    public DeferredmtlrData createDeferredmtlrData(
            DeferredLocationEventType deferredLocationEventType,
            TerminationCause terminationCause, LCSLocationInfo lcsLocationInfo)
    {
        return new DeferredmtlrDataImpl(deferredLocationEventType, terminationCause, lcsLocationInfo);
    }

    public ExtGeographicalInformation createExtGeographicalInformation(byte[] data)
    {
        return new ExtGeographicalInformationImpl(data);
    }

    public GeranGANSSpositioningData createGeranGANSSpositioningData(byte[] data)
    {
        return new GeranGANSSpositioningDataImpl(data);
    }

    public LCSClientID createLCSClientID(
            LCSClientType lcsClientType, LCSClientExternalID lcsClientExternalID,
            LCSClientInternalID lcsClientInternalID, LCSClientName lcsClientName, AddressString lcsClientDialedByMS,
            APN lcsAPN, LCSRequestorID lcsRequestorID)
    {
        return new LCSClientIDImpl(lcsClientType, lcsClientExternalID, lcsClientInternalID, lcsClientName,
                lcsClientDialedByMS,
                lcsAPN, lcsRequestorID);
    }

    public LCSClientExternalID createLCSClientExternalID(
            ISDNAddressString externalAddress,
            MAPExtensionContainer extensionContainer)
    {
        return new LCSClientExternalIDImpl(externalAddress, extensionContainer);
    }

    public LCSClientName createLCSClientName(
            CBSDataCodingScheme dataCodingScheme, USSDString nameString,
            LCSFormatIndicator lcsFormatIndicator)
    {
        return new LCSClientNameImpl(dataCodingScheme, nameString, lcsFormatIndicator);
    }

    public LCSCodeword createLCSCodeword(CBSDataCodingScheme dataCodingScheme, USSDString lcsCodewordString)
    {
        return new LCSCodewordImpl(dataCodingScheme, lcsCodewordString);
    }

    public LCSLocationInfo createLCSLocationInfo(
            ISDNAddressString networkNodeNumber,
            LMSI lmsi,
            MAPExtensionContainer extensionContainer,
            boolean gprsNodeIndicator,
            AdditionalNumber additionalNumber,
            SupportedLCSCapabilitySets supportedLCSCapabilitySets,
            SupportedLCSCapabilitySets additionalLCSCapabilitySets,
            DiameterIdentity mmeName,
            DiameterIdentity aaaServerName)
    {
        return new LCSLocationInfoImpl(networkNodeNumber, lmsi, extensionContainer, gprsNodeIndicator, additionalNumber,
                supportedLCSCapabilitySets, additionalLCSCapabilitySets, mmeName, aaaServerName);
    }

    public LCSPrivacyCheck createLCSPrivacyCheck(
            PrivacyCheckRelatedAction callSessionUnrelated,
            PrivacyCheckRelatedAction callSessionRelated)
    {
        return new LCSPrivacyCheckImpl(callSessionUnrelated, callSessionRelated);
    }

    public LCSQoS createLCSQoS(
            Integer horizontalAccuracy, Integer verticalAccuracy, boolean verticalCoordinateRequest,
            ResponseTime responseTime, MAPExtensionContainer extensionContainer)
    {
        return new LCSQoSImpl(horizontalAccuracy, verticalAccuracy, verticalCoordinateRequest, responseTime,
                extensionContainer);
    }

    public LCSRequestorID createLCSRequestorID(
            CBSDataCodingScheme dataCodingScheme, USSDString requestorIDString,
            LCSFormatIndicator lcsFormatIndicator)
    {
        return new LCSRequestorIDImpl(dataCodingScheme, requestorIDString, lcsFormatIndicator);
    }

    public LocationType createLocationType(
            LocationEstimateType locationEstimateType,
            DeferredLocationEventType deferredLocationEventType)
    {
        return new LocationTypeImpl(locationEstimateType, deferredLocationEventType);
    }

    public PeriodicLDRInfo createPeriodicLDRInfo(int reportingAmount, int reportingInterval)
    {
        return new PeriodicLDRInfoImpl(reportingAmount, reportingInterval);
    }

    public PositioningDataInformation createPositioningDataInformation(byte[] data)
    {
        return new PositioningDataInformationImpl(data);
    }

    public ReportingPLMN createReportingPLMN(
            PlmnId plmnId,
            RANTechnology ranTechnology,
            boolean ranPeriodicLocationSupport)
    {
        return new ReportingPLMNImpl(plmnId, ranTechnology, ranPeriodicLocationSupport);
    }

    public ReportingPLMNList createReportingPLMNList(boolean plmnListPrioritized, ArrayList<ReportingPLMN> plmnList)
    {
        return new ReportingPLMNListImpl(plmnListPrioritized, plmnList);
    }

    public ResponseTime createResponseTime(ResponseTimeCategory responseTimeCategory)
    {
        return new ResponseTimeImpl(responseTimeCategory);
    }

    public ServingNodeAddress createServingNodeAddressMscNumber(ISDNAddressString mscNumber)
    {
        return new ServingNodeAddressImpl(mscNumber, true);
    }

    public ServingNodeAddress createServingNodeAddressSgsnNumber(ISDNAddressString sgsnNumber)
    {
        return new ServingNodeAddressImpl(sgsnNumber, false);
    }

    public ServingNodeAddress createServingNodeAddressMmeNumber(DiameterIdentity mmeNumber)
    {
        return new ServingNodeAddressImpl(mmeNumber);
    }

    public SLRArgExtensionContainer createSLRArgExtensionContainer(
            ArrayList<MAPPrivateExtension> privateExtensionList,
            SLRArgPCSExtensions slrArgPcsExtensions)
    {
        return new SLRArgExtensionContainerImpl(privateExtensionList, slrArgPcsExtensions);
    }

    public SLRArgPCSExtensions createSLRArgPCSExtensions(boolean naEsrkRequest)
    {
        return new SLRArgPCSExtensionsImpl(naEsrkRequest);
    }

    public SupportedGADShapes createSupportedGADShapes(
            boolean ellipsoidPoint, boolean ellipsoidPointWithUncertaintyCircle,
            boolean ellipsoidPointWithUncertaintyEllipse, boolean polygon, boolean ellipsoidPointWithAltitude,
            boolean ellipsoidPointWithAltitudeAndUncertaintyElipsoid, boolean ellipsoidArc)
    {
        return new SupportedGADShapesImpl(ellipsoidPoint, ellipsoidPointWithUncertaintyCircle,
                ellipsoidPointWithUncertaintyEllipse, polygon, ellipsoidPointWithAltitude,
                ellipsoidPointWithAltitudeAndUncertaintyElipsoid, ellipsoidArc);
    }

    public UtranGANSSpositioningData createUtranGANSSpositioningData(byte[] data)
    {
        return new UtranGANSSpositioningDataImpl(data);
    }

    public UtranPositioningDataInfo createUtranPositioningDataInfo(byte[] data)
    {
        return new UtranPositioningDataInfoImpl(data);
    }

    public VelocityEstimate createVelocityEstimate(byte[] data)
    {
        return new VelocityEstimateImpl(data);
    }

    @Override
    public RequestedEquipmentInfo createRequestedEquipmentInfo(boolean equipmentStatus, boolean bmuef)
    {
        return new RequestedEquipmentInfoImpl(equipmentStatus, bmuef);
    }

    @Override
    public UESBIIuA createUESBIIuA(BitSetStrictLength data)
    {
        return new UESBIIuAImpl(data);
    }

    @Override
    public UESBIIuB createUESBIIuB(BitSetStrictLength data)
    {
        return new UESBIIuBImpl(data);
    }

    @Override
    public UESBIIu createUESBIIu(UESBIIuA uesbiIuA, UESBIIuB uesbiIuB)
    {
        return new UESBIIuImpl(uesbiIuA, uesbiIuB);
    }

    public IMSIWithLMSI createServingNodeAddressMmeNumber(IMSI imsi, LMSI lmsi)
    {
        return new IMSIWithLMSIImpl(imsi, lmsi);
    }

    @Override
    public CamelRoutingInfo createCamelRoutingInfo(
            ForwardingData forwardingData,
            GmscCamelSubscriptionInfo gmscCamelSubscriptionInfo, MAPExtensionContainer extensionContainer)
    {
        return new CamelRoutingInfoImpl(forwardingData, gmscCamelSubscriptionInfo, extensionContainer);
    }

    @Override
    public GmscCamelSubscriptionInfo createGmscCamelSubscriptionInfo(
            TCSI tCsi, OCSI oCsi,
            MAPExtensionContainer extensionContainer, ArrayList<OBcsmCamelTdpCriteria> oBcsmCamelTDPCriteriaList,
            ArrayList<TBcsmCamelTdpCriteria> tBcsmCamelTdpCriteriaList, DCSI dCsi)
    {
        return new GmscCamelSubscriptionInfoImpl(tCsi, oCsi, extensionContainer, oBcsmCamelTDPCriteriaList,
                tBcsmCamelTdpCriteriaList, dCsi);
    }

    @Override
    public TCSI createTCSI(
            ArrayList<TBcsmCamelTDPData> tBcsmCamelTDPDataList, MAPExtensionContainer extensionContainer,
            Integer camelCapabilityHandling, boolean notificationToCSE, boolean csiActive)
    {
        return new TCSIImpl(tBcsmCamelTDPDataList, extensionContainer, camelCapabilityHandling, notificationToCSE,
                csiActive);
    }

    @Override
    public OCSI createOCSI(
            ArrayList<OBcsmCamelTDPData> oBcsmCamelTDPDataList, MAPExtensionContainer extensionContainer,
            Integer camelCapabilityHandling, boolean notificationToCSE, boolean csiActive)
    {
        return new OCSIImpl(oBcsmCamelTDPDataList, extensionContainer, camelCapabilityHandling, notificationToCSE,
                csiActive);
    }

    @Override
    public TBcsmCamelTDPData createTBcsmCamelTDPData(
            TBcsmTriggerDetectionPoint tBcsmTriggerDetectionPoint,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultCallHandling defaultCallHandling,
            MAPExtensionContainer extensionContainer)
    {
        return new TBcsmCamelTDPDataImpl(tBcsmTriggerDetectionPoint, serviceKey, gsmSCFAddress, defaultCallHandling,
                extensionContainer);
    }

    @Override
    public OBcsmCamelTDPData createOBcsmCamelTDPData(
            OBcsmTriggerDetectionPoint oBcsmTriggerDetectionPoint,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultCallHandling defaultCallHandling,
            MAPExtensionContainer extensionContainer)
    {
        return new OBcsmCamelTDPDataImpl(oBcsmTriggerDetectionPoint, serviceKey, gsmSCFAddress, defaultCallHandling,
                extensionContainer);
    }

    @Override
    public CamelInfo createCamelInfo(
            SupportedCamelPhases supportedCamelPhases, boolean suppressTCSI,
            MAPExtensionContainer extensionContainer, OfferedCamel4CSIs offeredCamel4CSIs)
    {
        return new CamelInfoImpl(supportedCamelPhases, suppressTCSI, extensionContainer, offeredCamel4CSIs);
    }

    @Override
    public CUGInterlock createCUGInterlock(byte[] data)
    {
        return new CUGInterlockImpl(data);
    }

    @Override
    public CUGCheckInfo createCUGCheckInfo(
            CUGInterlock cugInterlock, boolean cugOutgoingAccess,
            MAPExtensionContainer extensionContainer)
    {
        return new CUGCheckInfoImpl(cugInterlock, cugOutgoingAccess, extensionContainer);
    }

    @Override
    public PDPContext createPDPContext(
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
            LIPAPermission lipaPermission)
    {
        return new PDPContextImpl(pdpContextId, pdpType, pdpAddress, qosSubscribed, vplmnAddressAllowed, apn,
                extensionContainer, extQoSSubscribed, chargingCharacteristics, ext2QoSSubscribed, ext3QoSSubscribed,
                ext4QoSSubscribed, apnoiReplacement, extpdpType, extpdpAddress, sipToPermission, lipaPermission);
    }

    @Override
    public APNOIReplacement createAPNOIReplacement(byte[] data)
    {
        return new APNOIReplacementImpl(data);
    }

    @Override
    public QoSSubscribed createQoSSubscribed(byte[] data)
    {
        return new QoSSubscribedImpl(data);
    }

    @Override
    public SSCode createSSCode(SupplementaryCodeValue value)
    {
        return new SSCodeImpl(value);
    }

    @Override
    public SSCode createSSCode(int data)
    {
        return new SSCodeImpl(data);
    }

    @Override
    public SSStatus createSSStatus(boolean qBit, boolean pBit, boolean rBit, boolean aBit)
    {
        return new SSStatusImpl(qBit, pBit, rBit, aBit);
    }

    @Override
    public BasicServiceCode createBasicServiceCode(TeleserviceCode teleservice)
    {
        return new BasicServiceCodeImpl(teleservice);
    }

    @Override
    public BasicServiceCode createBasicServiceCode(BearerServiceCode bearerService)
    {
        return new BasicServiceCodeImpl(bearerService);
    }

    @Override
    public GeographicalInformation createGeographicalInformation(double latitude, double longitude, double uncertainty)
            throws
            MAPException
    {
        return new GeographicalInformationImpl(TypeOfShape.EllipsoidPointWithUncertaintyCircle, latitude, longitude,
                uncertainty);
    }

    @Override
    public GeodeticInformation createGeodeticInformation(
            int screeningAndPresentationIndicators, double latitude,
            double longitude, double uncertainty, int confidence)
            throws
            MAPException
    {
        return new GeodeticInformationImpl(screeningAndPresentationIndicators, TypeOfShape
                .EllipsoidPointWithUncertaintyCircle,
                latitude, longitude, uncertainty, confidence);
    }

    @Override
    public ExtGeographicalInformation createExtGeographicalInformation_EllipsoidPointWithUncertaintyCircle(
            double latitude,
            double longitude, double uncertainty)
            throws
            MAPException
    {
        return new ExtGeographicalInformationImpl(TypeOfShape.EllipsoidPointWithUncertaintyCircle, latitude, longitude,
                uncertainty, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Override
    public ExtGeographicalInformation createExtGeographicalInformation_EllipsoidPointWithUncertaintyEllipse(
            double latitude,
            double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis, double angleOfMajorAxis,
            int confidence)
            throws
            MAPException
    {
        return new ExtGeographicalInformationImpl(TypeOfShape.EllipsoidPointWithUncertaintyEllipse, latitude,
                longitude, 0,
                uncertaintySemiMajorAxis, uncertaintySemiMinorAxis, angleOfMajorAxis, confidence, 0, 0, 0, 0, 0, 0);
    }

    @Override
    public ExtGeographicalInformation
    createExtGeographicalInformation_EllipsoidPointWithAltitudeAndUncertaintyEllipsoid(
            double latitude, double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis,
            double angleOfMajorAxis, int confidence, int altitude, double uncertaintyAltitude)
            throws
            MAPException
    {
        return new ExtGeographicalInformationImpl(TypeOfShape.EllipsoidPointWithAltitudeAndUncertaintyEllipsoid,
                latitude,
                longitude, 0, uncertaintySemiMajorAxis, uncertaintySemiMinorAxis, angleOfMajorAxis, confidence,
                altitude,
                uncertaintyAltitude, 0, 0, 0, 0);
    }

    @Override
    public ExtGeographicalInformation createExtGeographicalInformation_EllipsoidArc(
            double latitude, double longitude,
            int innerRadius, double uncertaintyRadius, double offsetAngle, double includedAngle, int confidence)
            throws
            MAPException
    {
        return new ExtGeographicalInformationImpl(TypeOfShape.EllipsoidArc, latitude, longitude, 0, 0, 0, 0,
                confidence, 0, 0,
                innerRadius, uncertaintyRadius, offsetAngle, includedAngle);
    }

    @Override
    public ExtGeographicalInformation createExtGeographicalInformation_EllipsoidPoint(double latitude, double longitude)
            throws
            MAPException
    {
        return new ExtGeographicalInformationImpl(TypeOfShape.EllipsoidPoint, latitude, longitude, 0, 0, 0, 0, 0, 0,
                0, 0, 0,
                0, 0);
    }

    @Override
    public AddGeographicalInformation createAddGeographicalInformation_EllipsoidPointWithUncertaintyCircle(
            double latitude,
            double longitude, double uncertainty)
            throws
            MAPException
    {
        return new AddGeographicalInformationImpl(TypeOfShape.EllipsoidPointWithUncertaintyCircle, latitude, longitude,
                uncertainty, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    @Override
    public AddGeographicalInformation createAddGeographicalInformation_EllipsoidPointWithUncertaintyEllipse(
            double latitude,
            double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis, double angleOfMajorAxis,
            int confidence)
            throws
            MAPException
    {
        return new AddGeographicalInformationImpl(TypeOfShape.EllipsoidPointWithUncertaintyEllipse, latitude,
                longitude, 0,
                uncertaintySemiMajorAxis, uncertaintySemiMinorAxis, angleOfMajorAxis, confidence, 0, 0, 0, 0, 0, 0);
    }

    @Override
    public AddGeographicalInformation
    createAddGeographicalInformation_EllipsoidPointWithAltitudeAndUncertaintyEllipsoid(
            double latitude, double longitude, double uncertaintySemiMajorAxis, double uncertaintySemiMinorAxis,
            double angleOfMajorAxis, int confidence, int altitude, double uncertaintyAltitude)
            throws
            MAPException
    {
        return new AddGeographicalInformationImpl(TypeOfShape.EllipsoidPointWithAltitudeAndUncertaintyEllipsoid,
                latitude,
                longitude, 0, uncertaintySemiMajorAxis, uncertaintySemiMinorAxis, angleOfMajorAxis, confidence,
                altitude,
                uncertaintyAltitude, 0, 0, 0, 0);
    }

    @Override
    public AddGeographicalInformation createAddGeographicalInformation_EllipsoidArc(
            double latitude, double longitude,
            int innerRadius, double uncertaintyRadius, double offsetAngle, double includedAngle, int confidence)
            throws
            MAPException
    {
        return new AddGeographicalInformationImpl(TypeOfShape.EllipsoidArc, latitude, longitude, 0, 0, 0, 0,
                confidence, 0, 0,
                innerRadius, uncertaintyRadius, offsetAngle, includedAngle);
    }

    @Override
    public AddGeographicalInformation createAddGeographicalInformation_EllipsoidPoint(double latitude, double longitude)
            throws
            MAPException
    {
        return new AddGeographicalInformationImpl(TypeOfShape.EllipsoidPoint, latitude, longitude, 0, 0, 0, 0, 0, 0,
                0, 0, 0,
                0, 0);
    }

    @Override
    public VelocityEstimate createVelocityEstimate_HorizontalVelocity(int horizontalSpeed, int bearing)
            throws
            MAPException
    {
        return new VelocityEstimateImpl(VelocityType.HorizontalVelocity, horizontalSpeed, bearing, 0, 0, 0);
    }

    @Override
    public VelocityEstimate createVelocityEstimate_HorizontalWithVerticalVelocity(
            int horizontalSpeed, int bearing,
            int verticalSpeed)
            throws
            MAPException
    {
        return new VelocityEstimateImpl(VelocityType.HorizontalWithVerticalVelocity, horizontalSpeed, bearing,
                verticalSpeed,
                0, 0);
    }

    @Override
    public VelocityEstimate createVelocityEstimate_HorizontalVelocityWithUncertainty(
            int horizontalSpeed, int bearing,
            int uncertaintyHorizontalSpeed)
            throws
            MAPException
    {
        return new VelocityEstimateImpl(VelocityType.HorizontalVelocityWithUncertainty, horizontalSpeed, bearing, 0,
                uncertaintyHorizontalSpeed, 0);
    }

    @Override
    public VelocityEstimate createVelocityEstimate_HorizontalWithVerticalVelocityAndUncertainty(
            int horizontalSpeed,
            int bearing, int verticalSpeed, int uncertaintyHorizontalSpeed, int uncertaintyVerticalSpeed)
            throws
            MAPException
    {
        return new VelocityEstimateImpl(VelocityType.HorizontalWithVerticalVelocityAndUncertainty, horizontalSpeed,
                bearing,
                verticalSpeed, uncertaintyHorizontalSpeed, uncertaintyVerticalSpeed);
    }

    @Override
    public CUGFeature createCUGFeature(
            ExtBasicServiceCode basicService, Integer preferentialCugIndicator,
            InterCUGRestrictions interCugRestrictions, MAPExtensionContainer extensionContainer)
    {
        return new CUGFeatureImpl(basicService, preferentialCugIndicator, interCugRestrictions, extensionContainer);
    }

    @Override
    public CUGInfo createCUGInfo(
            ArrayList<CUGSubscription> cugSubscriptionList, ArrayList<CUGFeature> cugFeatureList,
            MAPExtensionContainer extensionContainer)
    {
        return new CUGInfoImpl(cugSubscriptionList, cugFeatureList, extensionContainer);
    }

    @Override
    public CUGSubscription createCUGSubscription(
            int cugIndex, CUGInterlock cugInterlock, IntraCUGOptions intraCugOptions,
            ArrayList<ExtBasicServiceCode> basicService, MAPExtensionContainer extensionContainer)
    {
        return new CUGSubscriptionImpl(cugIndex, cugInterlock, intraCugOptions, basicService, extensionContainer);
    }

    @Override
    public EMLPPInfo createEMLPPInfo(
            int maximumentitledPriority,
            int defaultPriority,
            MAPExtensionContainer extensionContainer)
    {
        return new EMLPPInfoImpl(maximumentitledPriority, defaultPriority, extensionContainer);
    }

    @Override
    public ExtCallBarInfo createExtCallBarInfo(
            SSCode ssCode, ArrayList<ExtCallBarringFeature> callBarringFeatureList,
            MAPExtensionContainer extensionContainer)
    {
        return new ExtCallBarInfoImpl(ssCode, callBarringFeatureList, extensionContainer);
    }

    @Override
    public ExtCallBarringFeature createExtCallBarringFeature(
            ExtBasicServiceCode basicService, ExtSSStatus ssStatus,
            MAPExtensionContainer extensionContainer)
    {
        return new ExtCallBarringFeatureImpl(basicService, ssStatus, extensionContainer);
    }

    @Override
    public ExtForwFeature createExtForwFeature(
            ExtBasicServiceCode basicService,
            ExtSSStatus ssStatus,
            ISDNAddressString forwardedToNumber,
            ISDNSubaddressString forwardedToSubaddress,
            ExtForwOptions forwardingOptions,
            Integer noReplyConditionTime,
            MAPExtensionContainer extensionContainer,
            FTNAddressString longForwardedToNumber)
    {
        return new ExtForwFeatureImpl(basicService, ssStatus, forwardedToNumber, forwardedToSubaddress,
                forwardingOptions,
                noReplyConditionTime, extensionContainer, longForwardedToNumber);
    }

    @Override
    public ExtForwInfo createExtForwInfo(
            SSCode ssCode, ArrayList<ExtForwFeature> forwardingFeatureList,
            MAPExtensionContainer extensionContainer)
    {
        return new ExtForwInfoImpl(ssCode, forwardingFeatureList, extensionContainer);
    }

    @Override
    public ExtForwOptions createExtForwOptions(
            boolean notificationToForwardingParty, boolean redirectingPresentation,
            boolean notificationToCallingParty, ExtForwOptionsForwardingReason extForwOptionsForwardingReason)
    {
        return new ExtForwOptionsImpl(notificationToForwardingParty, redirectingPresentation,
                notificationToCallingParty,
                extForwOptionsForwardingReason);
    }

    @Override
    public ExtForwOptions createExtForwOptions(byte[] data)
    {
        return new ExtForwOptionsImpl(data);
    }

    @Override
    public ExtSSData createExtSSData(
            SSCode ssCode, ExtSSStatus ssStatus, SSSubscriptionOption ssSubscriptionOption,
            ArrayList<ExtBasicServiceCode> basicServiceGroupList, MAPExtensionContainer extensionContainer)
    {
        return new ExtSSDataImpl(ssCode, ssStatus, ssSubscriptionOption, basicServiceGroupList, extensionContainer);
    }

    @Override
    public ExtSSInfo createExtSSInfo(ExtForwInfo forwardingInfo)
    {
        return new ExtSSInfoImpl(forwardingInfo);
    }

    @Override
    public ExtSSInfo createExtSSInfo(ExtCallBarInfo callBarringInfo)
    {
        return new ExtSSInfoImpl(callBarringInfo);
    }

    @Override
    public ExtSSInfo createExtSSInfo(CUGInfo cugInfo)
    {
        return new ExtSSInfoImpl(cugInfo);
    }

    @Override
    public ExtSSInfo createExtSSInfo(ExtSSData ssData)
    {
        return new ExtSSInfoImpl(ssData);
    }

    @Override
    public ExtSSInfo createExtSSInfo(EMLPPInfo emlppInfo)
    {
        return new ExtSSInfoImpl(emlppInfo);
    }

    @Override
    public ExtSSStatus createExtSSStatus(boolean bitQ, boolean bitP, boolean bitR, boolean bitA)
    {
        return new ExtSSStatusImpl(bitQ, bitP, bitR, bitA);
    }

    @Override
    public ExtSSStatus createExtSSStatus(byte[] data)
    {
        return new ExtSSStatusImpl(data);
    }

    @Override
    public GPRSSubscriptionData createGPRSSubscriptionData(
            boolean completeDataListIncluded,
            ArrayList<PDPContext> gprsDataList,
            MAPExtensionContainer extensionContainer,
            APNOIReplacement apnOiReplacement)
    {
        return new GPRSSubscriptionDataImpl(completeDataListIncluded, gprsDataList, extensionContainer,
                apnOiReplacement);
    }

    @Override
    public SSSubscriptionOption createSSSubscriptionOption(CliRestrictionOption cliRestrictionOption)
    {
        return new SSSubscriptionOptionImpl(cliRestrictionOption);
    }

    @Override
    public SSSubscriptionOption createSSSubscriptionOption(OverrideCategory overrideCategory)
    {
        return new SSSubscriptionOptionImpl(overrideCategory);
    }

    @Override
    public InterCUGRestrictions createInterCUGRestrictions(InterCUGRestrictionsValue val)
    {
        return new InterCUGRestrictionsImpl(val);
    }

    @Override
    public InterCUGRestrictions createInterCUGRestrictions(int data)
    {
        return new InterCUGRestrictionsImpl(data);
    }

    @Override
    public ZoneCode createZoneCode(int value)
    {
        return new ZoneCodeImpl(value);
    }

    @Override
    public ZoneCode createZoneCode(byte[] data)
    {
        return new ZoneCodeImpl(data);
    }

    @Override
    public AgeIndicator createAgeIndicator(byte[] data)
    {
        return new AgeIndicatorImpl(data);
    }

    @Override
    public CSAllocationRetentionPriority createCSAllocationRetentionPriority(int data)
    {
        return new CSAllocationRetentionPriorityImpl(data);
    }

    @Override
    public SupportedFeatures createSupportedFeatures(
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
            boolean boicExHC)
    {
        return new SupportedFeaturesImpl(odbAllApn, odbHPLMNApn, odbVPLMNApn, odbAllOg, odbAllInternationalOg,
                odbAllIntOgNotToHPLMNCountry, odbAllInterzonalOg, odbAllInterzonalOgNotToHPLMNCountry,
                odbAllInterzonalOgandInternatOgNotToHPLMNCountry, regSub, trace, lcsAllPrivExcep, lcsUniversal,
                lcsCallSessionRelated, lcsCallSessionUnrelated, lcsPLMNOperator, lcsServiceType, lcsAllMOLRSS,
                lcsBasicSelfLocation, lcsAutonomousSelfLocation, lcsTransferToThirdParty, smMoPp,
                barringOutgoingCalls, baoc,
                boic, boicExHC);
    }

    @Override
    public AccessRestrictionData createAccessRestrictionData(
            boolean utranNotAllowed, boolean geranNotAllowed,
            boolean ganNotAllowed, boolean iHspaEvolutionNotAllowed, boolean eUtranNotAllowed,
            boolean hoToNon3GPPAccessNotAllowed)
    {
        return new AccessRestrictionDataImpl(utranNotAllowed, geranNotAllowed, ganNotAllowed, iHspaEvolutionNotAllowed,
                eUtranNotAllowed, hoToNon3GPPAccessNotAllowed);
    }

    @Override
    public AdditionalInfo createAdditionalInfo(BitSetStrictLength data)
    {
        return new AdditionalInfoImpl(data);
    }

    @Override
    public AdditionalSubscriptions createAdditionalSubscriptions(
            boolean privilegedUplinkRequest,
            boolean emergencyUplinkRequest, boolean emergencyReset)
    {
        return new AdditionalSubscriptionsImpl(privilegedUplinkRequest, emergencyUplinkRequest, emergencyReset);
    }

    @Override
    public AMBR createAMBR(
            int maxRequestedBandwidthUL,
            int maxRequestedBandwidthDL,
            MAPExtensionContainer extensionContainer)
    {
        return new AMBRImpl(maxRequestedBandwidthUL, maxRequestedBandwidthDL, extensionContainer);
    }

    @Override
    public APNConfiguration createAPNConfiguration(
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
            LIPAPermission lipaPermission)
    {
        return new APNConfigurationImpl(contextId, pDNType, servedPartyIPIPv4Address, apn, ePSQoSSubscribed,
                pdnGwIdentity,
                pdnGwAllocationType, vplmnAddressAllowed, chargingCharacteristics, ambr, specificAPNInfoList,
                extensionContainer, servedPartyIPIPv6Address, apnOiReplacement, siptoPermission, lipaPermission);
    }

    @Override
    public APNConfigurationProfile createAPNConfigurationProfile(
            int defaultContext, boolean completeDataListIncluded,
            ArrayList<APNConfiguration> ePSDataList, MAPExtensionContainer extensionContainer)
    {
        return new APNConfigurationProfileImpl(defaultContext, completeDataListIncluded, ePSDataList,
                extensionContainer);
    }

    @Override
    public CSGSubscriptionData createCSGSubscriptionData(
            CSGId csgId, Time expirationDate,
            MAPExtensionContainer extensionContainer, ArrayList<APN> lipaAllowedAPNList)
    {
        return new CSGSubscriptionDataImpl(csgId, expirationDate, extensionContainer, lipaAllowedAPNList);
    }

    @Override
    public DCSI createDCSI(
            ArrayList<DPAnalysedInfoCriterium> dpAnalysedInfoCriteriaList, Integer camelCapabilityHandling,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive)
    {
        return new DCSIImpl(dpAnalysedInfoCriteriaList, camelCapabilityHandling, extensionContainer, notificationToCSE,
                csiActive);
    }

    @Override
    public DestinationNumberCriteria createDestinationNumberCriteria(
            MatchType matchType,
            ArrayList<ISDNAddressString> destinationNumberList, ArrayList<Integer> destinationNumberLengthList)
    {
        return new DestinationNumberCriteriaImpl(matchType, destinationNumberList, destinationNumberLengthList);
    }

    @Override
    public DPAnalysedInfoCriterium createDPAnalysedInfoCriterium(
            ISDNAddressString dialledNumber,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultCallHandling defaultCallHandling,
            MAPExtensionContainer extensionContainer)
    {
        return new DPAnalysedInfoCriteriumImpl(dialledNumber, serviceKey, gsmSCFAddress, defaultCallHandling,
                extensionContainer);
    }

    @Override
    public EPSQoSSubscribed createEPSQoSSubscribed(
            QoSClassIdentifier qoSClassIdentifier,
            AllocationRetentionPriority allocationRetentionPriority, MAPExtensionContainer extensionContainer)
    {
        return new EPSQoSSubscribedImpl(qoSClassIdentifier, allocationRetentionPriority, extensionContainer);
    }

    @Override
    public EPSSubscriptionData createEPSSubscriptionData(
            APNOIReplacement apnOiReplacement,
            Integer rfspId,
            AMBR ambr,
            APNConfigurationProfile apnConfigurationProfile,
            ISDNAddressString stnSr,
            MAPExtensionContainer extensionContainer,
            boolean mpsCSPriority,
            boolean mpsEPSPriority)
    {
        return new EPSSubscriptionDataImpl(apnOiReplacement, rfspId, ambr, apnConfigurationProfile, stnSr,
                extensionContainer,
                mpsCSPriority, mpsEPSPriority);
    }

    @Override
    public ExternalClient createExternalClient(
            LCSClientExternalID clientIdentity, GMLCRestriction gmlcRestriction,
            NotificationToMSUser notificationToMSUser, MAPExtensionContainer extensionContainer)
    {
        return new ExternalClientImpl(clientIdentity, gmlcRestriction, notificationToMSUser, extensionContainer);
    }

    @Override
    public FQDN createFQDN(byte[] data)
    {
        return new FQDNImpl(data);
    }

    @Override
    public GPRSCamelTDPData createGPRSCamelTDPData(
            GPRSTriggerDetectionPoint gprsTriggerDetectionPoint, long serviceKey,
            ISDNAddressString gsmSCFAddress, DefaultGPRSHandling defaultSessionHandling,
            MAPExtensionContainer extensionContainer)
    {
        return new GPRSCamelTDPDataImpl(gprsTriggerDetectionPoint, serviceKey, gsmSCFAddress, defaultSessionHandling,
                extensionContainer);
    }

    @Override
    public GPRSCSI createGPRSCSI(
            ArrayList<GPRSCamelTDPData> gprsCamelTDPDataList, Integer camelCapabilityHandling,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive)
    {
        return new GPRSCSIImpl(gprsCamelTDPDataList, camelCapabilityHandling, extensionContainer, notificationToCSE,
                csiActive);
    }

    @Override
    public LCSInformation createLCSInformation(
            ArrayList<ISDNAddressString> gmlcList,
            ArrayList<LCSPrivacyClass> lcsPrivacyExceptionList, ArrayList<MOLRClass> molrList,
            ArrayList<LCSPrivacyClass> addLcsPrivacyExceptionList)
    {
        return new LCSInformationImpl(gmlcList, lcsPrivacyExceptionList, molrList, addLcsPrivacyExceptionList);
    }

    @Override
    public LCSPrivacyClass createLCSPrivacyClass(
            SSCode ssCode, ExtSSStatus ssStatus,
            NotificationToMSUser notificationToMSUser, ArrayList<ExternalClient> externalClientList,
            ArrayList<LCSClientInternalID> plmnClientList, MAPExtensionContainer extensionContainer,
            ArrayList<ExternalClient> extExternalClientList, ArrayList<ServiceType> serviceTypeList)
    {
        return new LCSPrivacyClassImpl(ssCode, ssStatus, notificationToMSUser, externalClientList, plmnClientList,
                extensionContainer, extExternalClientList, serviceTypeList);
    }

    @Override
    public LSAData createLSAData(
            LSAIdentity lsaIdentity, LSAAttributes lsaAttributes, boolean lsaActiveModeIndicator,
            MAPExtensionContainer extensionContainer)
    {
        return new LSADataImpl(lsaIdentity, lsaAttributes, lsaActiveModeIndicator, extensionContainer);
    }

    @Override
    public LSAInformation createLSAInformation(
            boolean completeDataListIncluded, LSAOnlyAccessIndicator lsaOnlyAccessIndicator,
            ArrayList<LSAData> lsaDataList, MAPExtensionContainer extensionContainer)
    {
        return new LSAInformationImpl(completeDataListIncluded, lsaOnlyAccessIndicator, lsaDataList,
                extensionContainer);
    }

    @Override
    public MCSI createMCSI(
            ArrayList<MMCode> mobilityTriggers, long serviceKey, ISDNAddressString gsmSCFAddress,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive)
    {
        return new MCSIImpl(mobilityTriggers, serviceKey, gsmSCFAddress, extensionContainer, notificationToCSE,
                csiActive);
    }

    @Override
    public MCSSInfo createMCSSInfo(
            SSCode ssCode, ExtSSStatus ssStatus, int nbrSB, int nbrUser,
            MAPExtensionContainer extensionContainer)
    {
        return new MCSSInfoImpl(ssCode, ssStatus, nbrSB, nbrUser, extensionContainer);
    }

    @Override
    public MGCSI createMGCSI(
            ArrayList<MMCode> mobilityTriggers, long serviceKey, ISDNAddressString gsmSCFAddress,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive)
    {
        return new MGCSIImpl(mobilityTriggers, serviceKey, gsmSCFAddress, extensionContainer, notificationToCSE,
                csiActive);
    }

    @Override
    public MMCode createMMCode(MMCodeValue value)
    {
        return new MMCodeImpl(value);
    }

    @Override
    public MOLRClass createMOLRClass(SSCode ssCode, ExtSSStatus ssStatus, MAPExtensionContainer extensionContainer)
    {
        return new MOLRClassImpl(ssCode, ssStatus, extensionContainer);
    }

    @Override
    public MTsmsCAMELTDPCriteria createMTsmsCAMELTDPCriteria(
            SMSTriggerDetectionPoint smsTriggerDetectionPoint,
            ArrayList<MTSMSTPDUType> tPDUTypeCriterion)
    {
        return new MTsmsCAMELTDPCriteriaImpl(smsTriggerDetectionPoint, tPDUTypeCriterion);
    }

    @Override
    public OBcsmCamelTdpCriteria createOBcsmCamelTdpCriteria(
            OBcsmTriggerDetectionPoint oBcsmTriggerDetectionPoint,
            DestinationNumberCriteria destinationNumberCriteria, ArrayList<ExtBasicServiceCode> basicServiceCriteria,
            CallTypeCriteria callTypeCriteria, ArrayList<CauseValue> oCauseValueCriteria,
            MAPExtensionContainer extensionContainer)
    {
        return new OBcsmCamelTdpCriteriaImpl(oBcsmTriggerDetectionPoint, destinationNumberCriteria,
                basicServiceCriteria,
                callTypeCriteria, oCauseValueCriteria, extensionContainer);
    }

    @Override
    public ODBData createODBData(
            ODBGeneralData oDBGeneralData, ODBHPLMNData odbHplmnData,
            MAPExtensionContainer extensionContainer)
    {
        return new ODBDataImpl(oDBGeneralData, odbHplmnData, extensionContainer);
    }

    @Override
    public ODBGeneralData createODBGeneralData(
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
            boolean registrationInternationalCFBarred)
    {
        return new ODBGeneralDataImpl(allOGCallsBarred, internationalOGCallsBarred,
                internationalOGCallsNotToHPLMNCountryBarred, interzonalOGCallsBarred,
                interzonalOGCallsNotToHPLMNCountryBarred,
                interzonalOGCallsAndInternationalOGCallsNotToHPLMNCountryBarred, premiumRateInformationOGCallsBarred,
                premiumRateEntertainementOGCallsBarred, ssAccessBarred, allECTBarred, chargeableECTBarred,
                internationalECTBarred, interzonalECTBarred, doublyChargeableECTBarred, multipleECTBarred,
                allPacketOrientedServicesBarred, roamerAccessToHPLMNAPBarred, roamerAccessToVPLMNAPBarred,
                roamingOutsidePLMNOGCallsBarred, allICCallsBarred, roamingOutsidePLMNICCallsBarred,
                roamingOutsidePLMNICountryICCallsBarred, roamingOutsidePLMNBarred, roamingOutsidePLMNCountryBarred,
                registrationAllCFBarred, registrationCFNotToHPLMNBarred, registrationInterzonalCFBarred,
                registrationInterzonalCFNotToHPLMNBarred, registrationInternationalCFBarred);
    }

    @Override
    public ODBHPLMNData createODBHPLMNData(
            boolean plmnSpecificBarringType1, boolean plmnSpecificBarringType2,
            boolean plmnSpecificBarringType3, boolean plmnSpecificBarringType4)
    {
        return new ODBHPLMNDataImpl(plmnSpecificBarringType1, plmnSpecificBarringType2, plmnSpecificBarringType3,
                plmnSpecificBarringType4);
    }

    @Override
    public PDNGWIdentity createPDNGWIdentity(
            PDPAddress pdnGwIpv4Address, PDPAddress pdnGwIpv6Address, FQDN pdnGwName,
            MAPExtensionContainer extensionContainer)
    {
        return new PDNGWIdentityImpl(pdnGwIpv4Address, pdnGwIpv6Address, pdnGwName, extensionContainer);
    }

    @Override
    public PDNType createPDNType(PDNTypeValue value)
    {
        return new PDNTypeImpl(value);
    }

    @Override
    public PDNType createPDNType(int data)
    {
        return new PDNTypeImpl(data);
    }

    @Override
    public ServiceType createServiceType(
            int serviceTypeIdentity, GMLCRestriction gmlcRestriction,
            NotificationToMSUser notificationToMSUser, MAPExtensionContainer extensionContainer)
    {
        return new ServiceTypeImpl(serviceTypeIdentity, gmlcRestriction, notificationToMSUser, extensionContainer);
    }

    @Override
    public SGSNCAMELSubscriptionInfo createSGSNCAMELSubscriptionInfo(
            GPRSCSI gprsCsi, SMSCSI moSmsCsi,
            MAPExtensionContainer extensionContainer, SMSCSI mtSmsCsi,
            ArrayList<MTsmsCAMELTDPCriteria> mtSmsCamelTdpCriteriaList, MGCSI mgCsi)
    {
        return new SGSNCAMELSubscriptionInfoImpl(gprsCsi, moSmsCsi, extensionContainer, mtSmsCsi,
                mtSmsCamelTdpCriteriaList,
                mgCsi);
    }

    @Override
    public SMSCAMELTDPData createSMSCAMELTDPData(
            SMSTriggerDetectionPoint smsTriggerDetectionPoint,
            long serviceKey,
            ISDNAddressString gsmSCFAddress,
            DefaultSMSHandling defaultSMSHandling,
            MAPExtensionContainer extensionContainer)
    {
        return new SMSCAMELTDPDataImpl(smsTriggerDetectionPoint, serviceKey, gsmSCFAddress, defaultSMSHandling,
                extensionContainer);
    }

    @Override
    public SMSCSI createSMSCSI(
            ArrayList<SMSCAMELTDPData> smsCamelTdpDataList, Integer camelCapabilityHandling,
            MAPExtensionContainer extensionContainer, boolean notificationToCSE, boolean csiActive)
    {
        return new SMSCSIImpl(smsCamelTdpDataList, camelCapabilityHandling, extensionContainer, notificationToCSE,
                csiActive);
    }

    @Override
    public SpecificAPNInfo createSpecificAPNInfo(
            APN apn,
            PDNGWIdentity pdnGwIdentity,
            MAPExtensionContainer extensionContainer)
    {
        return new SpecificAPNInfoImpl(apn, pdnGwIdentity, extensionContainer);
    }

    @Override
    public SSCamelData createSSCamelData(
            ArrayList<SSCode> ssEventList, ISDNAddressString gsmSCFAddress,
            MAPExtensionContainer extensionContainer)
    {
        return new SSCamelDataImpl(ssEventList, gsmSCFAddress, extensionContainer);
    }

    @Override
    public SSCSI createSSCSI(
            SSCamelData ssCamelData, MAPExtensionContainer extensionContainer, boolean notificationToCSE,
            boolean csiActive)
    {
        return new SSCSIImpl(ssCamelData, extensionContainer, notificationToCSE, csiActive);
    }

    @Override
    public TBcsmCamelTdpCriteria createTBcsmCamelTdpCriteria(
            TBcsmTriggerDetectionPoint tBcsmTriggerDetectionPoint,
            ArrayList<ExtBasicServiceCode> basicServiceCriteria, ArrayList<CauseValue> tCauseValueCriteria)
    {
        return new TBcsmCamelTdpCriteriaImpl(tBcsmTriggerDetectionPoint, basicServiceCriteria, tCauseValueCriteria);
    }

    @Override
    public VlrCamelSubscriptionInfo createVlrCamelSubscriptionInfo(
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
            ArrayList<MTsmsCAMELTDPCriteria> mtSmsCamelTdpCriteriaList)
    {
        return new VlrCamelSubscriptionInfoImpl(oCsi, extensionContainer, ssCsi, oBcsmCamelTDPCriteriaList, tifCsi,
                mCsi,
                smsCsi, vtCsi, tBcsmCamelTdpCriteriaList, dCsi, mtSmsCSI, mtSmsCamelTdpCriteriaList);
    }

    @Override
    public VoiceBroadcastData createVoiceBroadcastData(
            GroupId groupId, boolean broadcastInitEntitlement,
            MAPExtensionContainer extensionContainer, LongGroupId longGroupId)
    {
        return new VoiceBroadcastDataImpl(groupId, broadcastInitEntitlement, extensionContainer, longGroupId);
    }

    @Override
    public VoiceGroupCallData createVoiceGroupCallData(
            GroupId groupId, MAPExtensionContainer extensionContainer,
            AdditionalSubscriptions additionalSubscriptions, AdditionalInfo additionalInfo, LongGroupId longGroupId)
    {
        return new VoiceGroupCallDataImpl(groupId, extensionContainer, additionalSubscriptions, additionalInfo,
                longGroupId);
    }

    @Override
    public ISDNSubaddressString createISDNSubaddressString(byte[] data)
    {
        return new ISDNSubaddressStringImpl(data);
    }

    @Override
    public CauseValue createCauseValue(CauseValueCodeValue value)
    {
        return new CauseValueImpl(value);
    }

    @Override
    public CauseValue createCauseValue(int data)
    {
        return new CauseValueImpl(data);
    }

    @Override
    public GroupId createGroupId(String data)
    {
        return new GroupIdImpl(data);
    }

    @Override
    public LongGroupId createLongGroupId(String data)
    {
        return new LongGroupIdImpl(data);
    }

    @Override
    public LSAAttributes createLSAAttributes(
            LSAIdentificationPriorityValue value, boolean preferentialAccessAvailable,
            boolean activeModeSupportAvailable)
    {
        return new LSAAttributesImpl(value, preferentialAccessAvailable, activeModeSupportAvailable);
    }

    @Override
    public LSAAttributes createLSAAttributes(int data)
    {
        return new LSAAttributesImpl(data);
    }

    @Override
    public Time createTime(int year, int month, int day, int hour, int minute, int second)
    {
        return new TimeImpl(year, month, day, hour, minute, second);
    }

    @Override
    public Time createTime(byte[] data)
    {
        return new TimeImpl(data);
    }

    @Override
    public NAEACIC createNAEACIC(
            String carrierCode, NetworkIdentificationPlanValue networkIdentificationPlanValue,
            NetworkIdentificationTypeValue networkIdentificationTypeValue)
            throws
            MAPException
    {
        return new NAEACICImpl(carrierCode, networkIdentificationPlanValue, networkIdentificationTypeValue);
    }

    @Override
    public NAEACIC createNAEACIC(byte[] data)
    {
        return new NAEACICImpl(data);
    }

    @Override
    public NAEAPreferredCI createNAEAPreferredCI(NAEACIC naeaPreferredCIC, MAPExtensionContainer extensionContainer)
    {
        return new NAEAPreferredCIImpl(naeaPreferredCIC, extensionContainer);
    }

    @Override
    public Category createCategory(int data)
    {
        return new CategoryImpl(data);
    }

    @Override
    public RoutingInfo createRoutingInfo(ISDNAddressString roamingNumber)
    {
        return new RoutingInfoImpl(roamingNumber);
    }

    @Override
    public RoutingInfo createRoutingInfo(ForwardingData forwardingData)
    {
        return new RoutingInfoImpl(forwardingData);
    }

    @Override
    public ExtendedRoutingInfo createExtendedRoutingInfo(RoutingInfo routingInfo)
    {
        return new ExtendedRoutingInfoImpl(routingInfo);
    }

    @Override
    public ExtendedRoutingInfo createExtendedRoutingInfo(CamelRoutingInfo camelRoutingInfo)
    {
        return new ExtendedRoutingInfoImpl(camelRoutingInfo);
    }

    @Override
    public TMSI createTMSI(byte[] data)
    {
        return new TMSIImpl(data);
    }

    @Override
    public CK createCK(byte[] data)
    {
        return new CKImpl(data);
    }

    @Override
    public Cksn createCksn(int data)
    {
        return new CksnImpl(data);
    }

    @Override
    public CurrentSecurityContext createCurrentSecurityContext(GSMSecurityContextData gsmSecurityContextData)
    {
        return new CurrentSecurityContextImpl(gsmSecurityContextData);
    }

    @Override
    public CurrentSecurityContext createCurrentSecurityContext(UMTSSecurityContextData umtsSecurityContextData)
    {
        return new CurrentSecurityContextImpl(umtsSecurityContextData);
    }

    @Override
    public GSMSecurityContextData createGSMSecurityContextData(Kc kc, Cksn cksn)
    {
        return new GSMSecurityContextDataImpl(kc, cksn);
    }

    @Override
    public IK createIK(byte[] data)
    {
        return new IKImpl(data);
    }

    @Override
    public Kc createKc(byte[] data)
    {
        return new KcImpl(data);
    }

    @Override
    public KSI createKSI(int data)
    {
        return new KSIImpl(data);
    }

    @Override
    public UMTSSecurityContextData createUMTSSecurityContextData(CK ck, IK ik, KSI ksi)
    {
        return new UMTSSecurityContextDataImpl(ck, ik, ksi);
    }

    @Override
    public EPSInfo createEPSInfo(PDNGWUpdate pndGwUpdate)
    {
        return new EPSInfoImpl(pndGwUpdate);
    }

    @Override
    public EPSInfo createEPSInfo(ISRInformation isrInformation)
    {
        return new EPSInfoImpl(isrInformation);
    }

    @Override
    public ISRInformation createISRInformation(boolean updateMME, boolean cancelSGSN, boolean initialAttachIndicator)
    {
        return new ISRInformationImpl(updateMME, cancelSGSN, initialAttachIndicator);
    }

    @Override
    public PDNGWUpdate createPDNGWUpdate(
            APN apn, PDNGWIdentity pdnGwIdentity, Integer contextId,
            MAPExtensionContainer extensionContainer)
    {
        return new PDNGWUpdateImpl(apn, pdnGwIdentity, contextId, extensionContainer);
    }

    @Override
    public SGSNCapability createSGSNCapability(
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
            Boolean homogeneousSupportOfIMSVoiceOverPSSessions)
    {
        return new SGSNCapabilityImpl(solsaSupportIndicator, extensionContainer, superChargerSupportedInServingNetworkEntity,
                gprsEnhancementsSupportIndicator, supportedCamelPhases, supportedLCSCapabilitySets, offeredCamel4CSIs,
                smsCallBarringSupportIndicator, supportedRATTypesIndicator, supportedFeatures, tAdsDataRetrieval,
                homogeneousSupportOfIMSVoiceOverPSSessions);
    }

    @Override
    public OfferedCamel4Functionalities createOfferedCamel4Functionalities(
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
            boolean collectInformation)
    {
        return new OfferedCamel4FunctionalitiesImpl(initiateCallAttempt, splitLeg, moveLeg, disconnectLeg, entityReleased, dfcWithArgument, playTone,
                dtmfMidCall, chargingIndicator, alertingDP, locationAtAlerting, changeOfPositionDP, orInteractions, warningToneEnhancements, cfEnhancements,
                subscribedEnhancedDialledServices, servingNetworkEnhancedDialledServices, criteriaForChangeOfPositionDP, serviceChangeDP, collectInformation);
    }
}

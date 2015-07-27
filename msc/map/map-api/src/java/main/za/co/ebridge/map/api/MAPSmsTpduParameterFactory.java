package za.co.ebridge.map.api;

import java.nio.charset.Charset;

import za.co.ebridge.map.api.datacoding.NationalLanguageIdentifier;
import za.co.ebridge.map.api.smstpdu.AbsoluteTimeStamp;
import za.co.ebridge.map.api.smstpdu.AddressField;
import za.co.ebridge.map.api.smstpdu.CharacterSet;
import za.co.ebridge.map.api.smstpdu.CommandData;
import za.co.ebridge.map.api.smstpdu.CommandType;
import za.co.ebridge.map.api.smstpdu.CommandTypeValue;
import za.co.ebridge.map.api.smstpdu.ConcatenatedShortMessagesIdentifier;
import za.co.ebridge.map.api.smstpdu.DataCodingGroup;
import za.co.ebridge.map.api.smstpdu.DataCodingSchemaIndicationType;
import za.co.ebridge.map.api.smstpdu.DataCodingSchemaMessageClass;
import za.co.ebridge.map.api.smstpdu.DataCodingScheme;
import za.co.ebridge.map.api.smstpdu.FailureCause;
import za.co.ebridge.map.api.smstpdu.NationalLanguageLockingShiftIdentifier;
import za.co.ebridge.map.api.smstpdu.NationalLanguageSingleShiftIdentifier;
import za.co.ebridge.map.api.smstpdu.NumberingPlanIdentification;
import za.co.ebridge.map.api.smstpdu.ParameterIndicator;
import za.co.ebridge.map.api.smstpdu.ProtocolIdentifier;
import za.co.ebridge.map.api.smstpdu.SmsCommandTpdu;
import za.co.ebridge.map.api.smstpdu.SmsDeliverReportTpdu;
import za.co.ebridge.map.api.smstpdu.SmsDeliverTpdu;
import za.co.ebridge.map.api.smstpdu.SmsStatusReportTpdu;
import za.co.ebridge.map.api.smstpdu.SmsSubmitReportTpdu;
import za.co.ebridge.map.api.smstpdu.SmsSubmitTpdu;
import za.co.ebridge.map.api.smstpdu.Status;
import za.co.ebridge.map.api.smstpdu.StatusReportQualifier;
import za.co.ebridge.map.api.smstpdu.TypeOfNumber;
import za.co.ebridge.map.api.smstpdu.UserData;
import za.co.ebridge.map.api.smstpdu.UserDataHeader;
import za.co.ebridge.map.api.smstpdu.ValidityEnhancedFormatData;
import za.co.ebridge.map.api.smstpdu.ValidityPeriod;

public interface MAPSmsTpduParameterFactory
{

    SmsCommandTpdu createSmsCommandTpdu(
            boolean statusReportRequest,
            int messageReference,
            ProtocolIdentifier protocolIdentifier,
            CommandType commandType,
            int messageNumber,
            AddressField destinationAddress,
            CommandData commandData);

    SmsDeliverReportTpdu createSmsDeliverReportTpdu(
            FailureCause failureCause, ProtocolIdentifier protocolIdentifier,
            UserData userData);

    SmsDeliverTpdu createSmsDeliverTpdu(
            boolean moreMessagesToSend, boolean forwardedOrSpawned, boolean replyPathExists,
            boolean statusReportIndication, AddressField originatingAddress, ProtocolIdentifier protocolIdentifier,
            AbsoluteTimeStamp serviceCentreTimeStamp, UserData userData);

    SmsStatusReportTpdu createSmsStatusReportTpdu(
            boolean moreMessagesToSend, boolean forwardedOrSpawned,
            StatusReportQualifier statusReportQualifier, int messageReference, AddressField recipientAddress,
            AbsoluteTimeStamp serviceCentreTimeStamp, AbsoluteTimeStamp dischargeTime, Status status,
            ProtocolIdentifier protocolIdentifier, UserData userData);

    SmsSubmitReportTpdu createSmsSubmitReportTpdu(
            FailureCause failureCause, AbsoluteTimeStamp serviceCentreTimeStamp,
            ProtocolIdentifier protocolIdentifier, UserData userData);

    SmsSubmitTpdu createSmsSubmitTpdu(
            boolean rejectDuplicates, boolean replyPathExists, boolean statusReportRequest,
            int messageReference, AddressField destinationAddress, ProtocolIdentifier protocolIdentifier,
            ValidityPeriod validityPeriod, UserData userData);

    AbsoluteTimeStamp createAbsoluteTimeStamp(
            int year, int month, int day, int hour, int minute, int second,
            int timeZone);

    AddressField createAddressField(
            TypeOfNumber typeOfNumber, NumberingPlanIdentification numberingPlanIdentification,
            String addressValue);

    CommandType createCommandType(int code);

    CommandType createCommandType(CommandTypeValue value);

    DataCodingScheme createDataCodingScheme(int code);

    DataCodingScheme createDataCodingScheme(
            DataCodingGroup dataCodingGroup, DataCodingSchemaMessageClass messageClass,
            DataCodingSchemaIndicationType dataCodingSchemaIndicationType, Boolean setIndicationActive,
            CharacterSet characterSet, boolean isCompressed);

    FailureCause createFailureCause(int code);

    ParameterIndicator createParameterIndicator(
            boolean TP_UDLPresence, boolean getTP_DCSPresence,
            boolean getTP_PIDPresence);

    ProtocolIdentifier createProtocolIdentifier(int code);

    Status createStatus(int code);

    ValidityEnhancedFormatData createValidityEnhancedFormatData(byte[] data);

    ValidityPeriod createValidityPeriod(int relativeFormatValue);

    ValidityPeriod createValidityPeriod(AbsoluteTimeStamp absoluteFormatValue);

    ValidityPeriod createValidityPeriod(ValidityEnhancedFormatData enhancedFormatValue);

    UserDataHeader createUserDataHeader();

    UserData createUserData(
            byte[] encodedData, DataCodingScheme dataCodingScheme, int encodedUserDataLength,
            boolean encodedUserDataHeaderIndicator, Charset gsm8Charset);

    UserData createUserData(
            String decodedMessage, DataCodingScheme dataCodingScheme,
            UserDataHeader decodedUserDataHeader, Charset gsm8Charset);

    CommandData createCommandData(byte[] data);

    CommandData createCommandData(String decodedMessage);

    ConcatenatedShortMessagesIdentifier createConcatenatedShortMessagesIdentifier(
            boolean referenceIs16bit,
            int reference, int mesageSegmentCount, int mesageSegmentNumber);

    NationalLanguageLockingShiftIdentifier createNationalLanguageLockingShiftIdentifier(
            NationalLanguageIdentifier nationalLanguageCode);

    NationalLanguageSingleShiftIdentifier createNationalLanguageSingleShiftIdentifier(
            NationalLanguageIdentifier nationalLanguageCode);
}

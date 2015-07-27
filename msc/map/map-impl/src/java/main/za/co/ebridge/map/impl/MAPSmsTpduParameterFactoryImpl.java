package za.co.ebridge.map.impl;

import java.nio.charset.Charset;

import za.co.ebridge.map.api.MAPSmsTpduParameterFactory;
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
import za.co.ebridge.map.impl.smstpdu.AbsoluteTimeStampImpl;
import za.co.ebridge.map.impl.smstpdu.AddressFieldImpl;
import za.co.ebridge.map.impl.smstpdu.CommandDataImpl;
import za.co.ebridge.map.impl.smstpdu.CommandTypeImpl;
import za.co.ebridge.map.impl.smstpdu.ConcatenatedShortMessagesIdentifierImpl;
import za.co.ebridge.map.impl.smstpdu.DataCodingSchemeImpl;
import za.co.ebridge.map.impl.smstpdu.FailureCauseImpl;
import za.co.ebridge.map.impl.smstpdu.NationalLanguageLockingShiftIdentifierImpl;
import za.co.ebridge.map.impl.smstpdu.NationalLanguageSingleShiftIdentifierImpl;
import za.co.ebridge.map.impl.smstpdu.ParameterIndicatorImpl;
import za.co.ebridge.map.impl.smstpdu.ProtocolIdentifierImpl;
import za.co.ebridge.map.impl.smstpdu.SmsCommandTpduImpl;
import za.co.ebridge.map.impl.smstpdu.SmsDeliverReportTpduImpl;
import za.co.ebridge.map.impl.smstpdu.SmsDeliverTpduImpl;
import za.co.ebridge.map.impl.smstpdu.SmsStatusReportTpduImpl;
import za.co.ebridge.map.impl.smstpdu.SmsSubmitReportTpduImpl;
import za.co.ebridge.map.impl.smstpdu.SmsSubmitTpduImpl;
import za.co.ebridge.map.impl.smstpdu.StatusImpl;
import za.co.ebridge.map.impl.smstpdu.UserDataHeaderImpl;
import za.co.ebridge.map.impl.smstpdu.UserDataImpl;
import za.co.ebridge.map.impl.smstpdu.ValidityEnhancedFormatDataImpl;
import za.co.ebridge.map.impl.smstpdu.ValidityPeriodImpl;

public class MAPSmsTpduParameterFactoryImpl
        implements MAPSmsTpduParameterFactory
{

    public SmsCommandTpdu createSmsCommandTpdu(
            boolean statusReportRequest,
            int messageReference,
            ProtocolIdentifier protocolIdentifier,
            CommandType commandType,
            int messageNumber,
            AddressField destinationAddress,
            CommandData commandData)
    {
        return new SmsCommandTpduImpl(statusReportRequest, messageReference, protocolIdentifier, commandType,
                messageNumber,
                destinationAddress, commandData);
    }

    public SmsDeliverReportTpdu createSmsDeliverReportTpdu(
            FailureCause failureCause, ProtocolIdentifier protocolIdentifier,
            UserData userData)
    {
        return new SmsDeliverReportTpduImpl(failureCause, protocolIdentifier, userData);
    }

    public SmsDeliverTpdu createSmsDeliverTpdu(
            boolean moreMessagesToSend, boolean forwardedOrSpawned, boolean replyPathExists,
            boolean statusReportIndication, AddressField originatingAddress, ProtocolIdentifier protocolIdentifier,
            AbsoluteTimeStamp serviceCentreTimeStamp, UserData userData)
    {
        return new SmsDeliverTpduImpl(moreMessagesToSend, forwardedOrSpawned, replyPathExists, statusReportIndication,
                originatingAddress, protocolIdentifier, serviceCentreTimeStamp, userData);
    }

    public SmsStatusReportTpdu createSmsStatusReportTpdu(
            boolean moreMessagesToSend, boolean forwardedOrSpawned,
            StatusReportQualifier statusReportQualifier, int messageReference, AddressField recipientAddress,
            AbsoluteTimeStamp serviceCentreTimeStamp, AbsoluteTimeStamp dischargeTime, Status status,
            ProtocolIdentifier protocolIdentifier, UserData userData)
    {
        return new SmsStatusReportTpduImpl(moreMessagesToSend, forwardedOrSpawned, statusReportQualifier,
                messageReference,
                recipientAddress, serviceCentreTimeStamp, dischargeTime, status, protocolIdentifier, userData);
    }

    public SmsSubmitReportTpdu createSmsSubmitReportTpdu(
            FailureCause failureCause, AbsoluteTimeStamp serviceCentreTimeStamp,
            ProtocolIdentifier protocolIdentifier, UserData userData)
    {
        return new SmsSubmitReportTpduImpl(failureCause, serviceCentreTimeStamp, protocolIdentifier, userData);
    }

    public SmsSubmitTpdu createSmsSubmitTpdu(
            boolean rejectDuplicates, boolean replyPathExists, boolean statusReportRequest,
            int messageReference, AddressField destinationAddress, ProtocolIdentifier protocolIdentifier,
            ValidityPeriod validityPeriod, UserData userData)
    {
        return new SmsSubmitTpduImpl(rejectDuplicates, replyPathExists, statusReportRequest, messageReference,
                destinationAddress, protocolIdentifier, validityPeriod, userData);
    }

    public AbsoluteTimeStamp createAbsoluteTimeStamp(
            int year, int month, int day, int hour, int minute, int second,
            int timeZone)
    {
        return new AbsoluteTimeStampImpl(year, month, day, hour, minute, second, timeZone);
    }

    public AddressField createAddressField(
            TypeOfNumber typeOfNumber, NumberingPlanIdentification numberingPlanIdentification,
            String addressValue)
    {
        return new AddressFieldImpl(typeOfNumber, numberingPlanIdentification, addressValue);
    }

    public CommandType createCommandType(int code)
    {
        return new CommandTypeImpl(code);
    }

    public CommandType createCommandType(CommandTypeValue value)
    {
        return new CommandTypeImpl(value);
    }

    public DataCodingScheme createDataCodingScheme(int code)
    {
        return new DataCodingSchemeImpl(code);
    }

    public DataCodingScheme createDataCodingScheme(
            DataCodingGroup dataCodingGroup, DataCodingSchemaMessageClass messageClass,
            DataCodingSchemaIndicationType dataCodingSchemaIndicationType, Boolean setIndicationActive,
            CharacterSet characterSet, boolean isCompressed)
    {
        return new DataCodingSchemeImpl(dataCodingGroup, messageClass, dataCodingSchemaIndicationType,
                setIndicationActive,
                characterSet, isCompressed);
    }

    public FailureCause createFailureCause(int code)
    {
        return new FailureCauseImpl(code);
    }

    public ParameterIndicator createParameterIndicator(
            boolean TP_UDLPresence, boolean getTP_DCSPresence,
            boolean getTP_PIDPresence)
    {
        return new ParameterIndicatorImpl(TP_UDLPresence, getTP_DCSPresence, getTP_PIDPresence);
    }

    public ProtocolIdentifier createProtocolIdentifier(int code)
    {
        return new ProtocolIdentifierImpl(code);
    }

    public Status createStatus(int code)
    {
        return new StatusImpl(code);
    }

    public ValidityEnhancedFormatData createValidityEnhancedFormatData(byte[] data)
    {
        return new ValidityEnhancedFormatDataImpl(data);
    }

    public ValidityPeriod createValidityPeriod(int relativeFormatValue)
    {
        return new ValidityPeriodImpl(relativeFormatValue);
    }

    public ValidityPeriod createValidityPeriod(AbsoluteTimeStamp absoluteFormatValue)
    {
        return new ValidityPeriodImpl(absoluteFormatValue);
    }

    public ValidityPeriod createValidityPeriod(ValidityEnhancedFormatData enhancedFormatValue)
    {
        return new ValidityPeriodImpl(enhancedFormatValue);
    }

    public UserDataHeader createUserDataHeader()
    {
        return new UserDataHeaderImpl();
    }

    public UserData createUserData(
            byte[] encodedData, DataCodingScheme dataCodingScheme, int encodedUserDataLength,
            boolean encodedUserDataHeaderIndicator, Charset gsm8Charset)
    {
        return new UserDataImpl(encodedData, dataCodingScheme, encodedUserDataLength, encodedUserDataHeaderIndicator,
                gsm8Charset);
    }

    public UserData createUserData(
            String decodedMessage, DataCodingScheme dataCodingScheme,
            UserDataHeader decodedUserDataHeader, Charset gsm8Charset)
    {
        return new UserDataImpl(decodedMessage, dataCodingScheme, decodedUserDataHeader, gsm8Charset);
    }

    public CommandData createCommandData(byte[] data)
    {
        return new CommandDataImpl(data);
    }

    public CommandData createCommandData(String decodedMessage)
    {
        return new CommandDataImpl(decodedMessage);
    }

    public ConcatenatedShortMessagesIdentifier createConcatenatedShortMessagesIdentifier(
            boolean referenceIs16bit,
            int reference, int mesageSegmentCount, int mesageSegmentNumber)
    {
        return new ConcatenatedShortMessagesIdentifierImpl(referenceIs16bit, reference, mesageSegmentCount,
                mesageSegmentNumber);
    }

    public NationalLanguageLockingShiftIdentifier createNationalLanguageLockingShiftIdentifier(
            NationalLanguageIdentifier nationalLanguageCode)
    {
        return new NationalLanguageLockingShiftIdentifierImpl(nationalLanguageCode);
    }

    public NationalLanguageSingleShiftIdentifier createNationalLanguageSingleShiftIdentifier(
            NationalLanguageIdentifier nationalLanguageCode)
    {
        return new NationalLanguageSingleShiftIdentifierImpl(nationalLanguageCode);
    }
}

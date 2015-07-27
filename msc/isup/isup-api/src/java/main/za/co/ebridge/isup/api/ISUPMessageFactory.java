package za.co.ebridge.isup.api;

import za.co.ebridge.isup.api.message.AddressCompleteMessage;
import za.co.ebridge.isup.api.message.AnswerMessage;
import za.co.ebridge.isup.api.message.ApplicationTransportMessage;
import za.co.ebridge.isup.api.message.BlockingAckMessage;
import za.co.ebridge.isup.api.message.BlockingMessage;
import za.co.ebridge.isup.api.message.CallProgressMessage;
import za.co.ebridge.isup.api.message.ChargeInformationMessage;
import za.co.ebridge.isup.api.message.CircuitGroupBlockingAckMessage;
import za.co.ebridge.isup.api.message.CircuitGroupBlockingMessage;
import za.co.ebridge.isup.api.message.CircuitGroupQueryMessage;
import za.co.ebridge.isup.api.message.CircuitGroupQueryResponseMessage;
import za.co.ebridge.isup.api.message.CircuitGroupResetAckMessage;
import za.co.ebridge.isup.api.message.CircuitGroupResetMessage;
import za.co.ebridge.isup.api.message.CircuitGroupUnblockingAckMessage;
import za.co.ebridge.isup.api.message.CircuitGroupUnblockingMessage;
import za.co.ebridge.isup.api.message.ConfusionMessage;
import za.co.ebridge.isup.api.message.ConnectMessage;
import za.co.ebridge.isup.api.message.ContinuityCheckRequestMessage;
import za.co.ebridge.isup.api.message.ContinuityMessage;
import za.co.ebridge.isup.api.message.FacilityAcceptedMessage;
import za.co.ebridge.isup.api.message.FacilityMessage;
import za.co.ebridge.isup.api.message.FacilityRejectedMessage;
import za.co.ebridge.isup.api.message.FacilityRequestMessage;
import za.co.ebridge.isup.api.message.ForwardTransferMessage;
import za.co.ebridge.isup.api.message.ISUPMessage;
import za.co.ebridge.isup.api.message.IdentificationRequestMessage;
import za.co.ebridge.isup.api.message.IdentificationResponseMessage;
import za.co.ebridge.isup.api.message.InformationMessage;
import za.co.ebridge.isup.api.message.InformationRequestMessage;
import za.co.ebridge.isup.api.message.InitialAddressMessage;
import za.co.ebridge.isup.api.message.LoopPreventionMessage;
import za.co.ebridge.isup.api.message.LoopbackAckMessage;
import za.co.ebridge.isup.api.message.NetworkResourceManagementMessage;
import za.co.ebridge.isup.api.message.OverloadMessage;
import za.co.ebridge.isup.api.message.PassAlongMessage;
import za.co.ebridge.isup.api.message.PreReleaseInformationMessage;
import za.co.ebridge.isup.api.message.ReleaseCompleteMessage;
import za.co.ebridge.isup.api.message.ReleaseMessage;
import za.co.ebridge.isup.api.message.ResetCircuitMessage;
import za.co.ebridge.isup.api.message.ResumeMessage;
import za.co.ebridge.isup.api.message.SegmentationMessage;
import za.co.ebridge.isup.api.message.SubsequentAddressMessage;
import za.co.ebridge.isup.api.message.SubsequentDirectoryNumberMessage;
import za.co.ebridge.isup.api.message.SuspendMessage;
import za.co.ebridge.isup.api.message.UnblockingAckMessage;
import za.co.ebridge.isup.api.message.UnblockingMessage;
import za.co.ebridge.isup.api.message.UnequippedCICMessage;
import za.co.ebridge.isup.api.message.UserToUserInformationMessage;
import za.co.ebridge.isup.api.message.UserPartAvailableMessage;
import za.co.ebridge.isup.api.message.UserPartTestMessage;

public interface ISUPMessageFactory
{

    AddressCompleteMessage createACM();

    AddressCompleteMessage createACM(int cic);

    AnswerMessage createANM();

    AnswerMessage createANM(int cic);

    ApplicationTransportMessage createAPT();

    ApplicationTransportMessage createAPT(int cic);

    BlockingAckMessage createBLA();

    BlockingAckMessage createBLA(int cic);

    BlockingMessage createBLO();

    BlockingMessage createBLO(int cic);

    ContinuityCheckRequestMessage createCCR();

    ContinuityCheckRequestMessage createCCR(int cic);

    CircuitGroupBlockingMessage createCGB();

    CircuitGroupBlockingMessage createCGB(int cic);

    CircuitGroupBlockingAckMessage createCGBA();

    CircuitGroupBlockingAckMessage createCGBA(int cic);

    CircuitGroupUnblockingMessage createCGU();

    CircuitGroupUnblockingMessage createCGU(int cic);

    CircuitGroupUnblockingAckMessage createCGUA();

    CircuitGroupUnblockingAckMessage createCGUA(int cic);

    ChargeInformationMessage createCIM();

    ChargeInformationMessage createCIM(int cic);

    ConfusionMessage createCNF();

    ConfusionMessage createCNF(int cic);

    ISUPMessage createCommand(int commandCode);

    ISUPMessage createCommand(int commandCode, int cic);

    ConnectMessage createCON();

    ConnectMessage createCON(int cic);

    ContinuityMessage createCOT();

    ContinuityMessage createCOT(int cic);

    CallProgressMessage createCPG();

    CallProgressMessage createCPG(int cic);

    CircuitGroupQueryMessage createCQM();

    CircuitGroupQueryMessage createCQM(int cic);

    CircuitGroupQueryResponseMessage createCQR();

    CircuitGroupQueryResponseMessage createCQR(int cic);

    FacilityAcceptedMessage createFAA();

    FacilityAcceptedMessage createFAA(int cic);

    FacilityMessage createFAC();

    FacilityMessage createFAC(int cic);

    FacilityRequestMessage createFAR();

    FacilityRequestMessage createFAR(int cic);

    ForwardTransferMessage createFOT();

    ForwardTransferMessage createFOT(int cic);

    FacilityRejectedMessage createFRJ();

    FacilityRejectedMessage createFRJ(int cic);

    CircuitGroupResetAckMessage createGRA();

    CircuitGroupResetAckMessage createGRA(int cic);

    CircuitGroupResetMessage createGRS();

    CircuitGroupResetMessage createGRS(int cic);

    InitialAddressMessage createIAM();

    InitialAddressMessage createIAM(int cic);

    IdentificationRequestMessage createIDR();

    IdentificationRequestMessage createIDR(int cic);

    InformationMessage createINF();

    InformationMessage createINF(int cic);

    InformationRequestMessage createINR();

    InformationRequestMessage createINR(int cic);

    IdentificationResponseMessage createIRS();

    IdentificationResponseMessage createIRS(int cic);

    LoopbackAckMessage createLPA();

    LoopbackAckMessage createLPA(int cic);

    LoopPreventionMessage createLPP();

    LoopPreventionMessage createLPP(int cic);

    NetworkResourceManagementMessage createNRM();

    NetworkResourceManagementMessage createNRM(int cic);

    OverloadMessage createOLM();

    OverloadMessage createOLM(int cic);

    PassAlongMessage createPAM();

    PassAlongMessage createPAM(int cic);

    PreReleaseInformationMessage createPRI();

    PreReleaseInformationMessage createPRI(int cic);

    ReleaseMessage createREL();

    ReleaseMessage createREL(int cic);

    ResumeMessage createRES();

    ResumeMessage createRES(int cic);

    ReleaseCompleteMessage createRLC();

    ReleaseCompleteMessage createRLC(int cic);

    ResetCircuitMessage createRSC();

    ResetCircuitMessage createRSC(int cic);

    SubsequentAddressMessage createSAM();

    SubsequentAddressMessage createSAM(int cic);

    SubsequentDirectoryNumberMessage createSDN();

    SubsequentDirectoryNumberMessage createSDN(int cic);

    SegmentationMessage createSGM();

    SegmentationMessage createSGM(int cic);

    SuspendMessage createSUS();

    SuspendMessage createSUS(int cic);

    UnblockingAckMessage createUBA();

    UnblockingAckMessage createUBA(int cic);

    UnblockingMessage createUBL();

    UnblockingMessage createUBL(int cic);

    UnequippedCICMessage createUCIC();

    UnequippedCICMessage createUCIC(int cic);

    UserPartAvailableMessage createUPA();

    UserPartAvailableMessage createUPA(int cic);

    UserPartTestMessage createUPT();

    UserPartTestMessage createUPT(int cic);

    UserToUserInformationMessage createUSR();

    UserToUserInformationMessage createUSR(int cic);

}

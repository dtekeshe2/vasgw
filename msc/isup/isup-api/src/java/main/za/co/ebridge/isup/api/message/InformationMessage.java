package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CallReference;
import za.co.ebridge.isup.api.message.parameter.CallingPartyCategory;
import za.co.ebridge.isup.api.message.parameter.CallingPartyNumber;
import za.co.ebridge.isup.api.message.parameter.ConnectionRequest;
import za.co.ebridge.isup.api.message.parameter.InformationIndicators;
import za.co.ebridge.isup.api.message.parameter.NetworkSpecificFacility;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;

/**
 * Start time:09:54:07 2009-07-23<br>
 * Project: mobicents-isup-stack<br>
 * <TABLE id="Table13" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table45" style="WIDTH: 575px; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575" border="0">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * Information Message (INF)</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; COLOR: navy" colSpan="3">
 * <p/>
 * INF is sent to convey information in association with a call, which may have been requested in an information request
 * message.
 * </P>
 * </TD>
 * </TR>
 * </TABLE>
 * </TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 283px; HEIGHT: 30px; TEXT-ALIGN: center">
 * Parameter</TD>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 145px; HEIGHT: 30px">Type</TD>
 * <TD style="FONT-WEIGHT: bold; HEIGHT: 30px">Length (octet)</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message type</TD>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Information&nbsp;Indicators</TD>
 * <p/>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>2</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Calling Party's Category</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Calling Party Number</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>5-12</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Call Reference</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>7</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Connection Request</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>7-9</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Parameter Compatibility Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4-?</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Network Specific Facility</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>6-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * </TABLE>
 */
public interface InformationMessage
        extends ISUPMessage
{
    /**
     * Information Message, Q.763 reference table 30 <br>
     * {@link InformationMessage}
     */
    int MESSAGE_CODE = 0x04;

    InformationIndicators getInformationIndicators();

    void setInformationIndicators(InformationIndicators v);

    CallingPartyCategory getCallingPartyCategory();

    void setCallingPartyCategory(CallingPartyCategory v);

    CallingPartyNumber getCallingPartyNumber();

    void setCallingPartyNumber(CallingPartyNumber v);

    CallReference getCallReference();

    void setCallReference(CallReference v);

    ParameterCompatibilityInformation getParameterCompatibilityInformation();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation v);

    ConnectionRequest getConnectionRequest();

    void setConnectionRequest(ConnectionRequest v);

    NetworkSpecificFacility getNetworkSpecificFacility();

    void setNetworkSpecificFacility(NetworkSpecificFacility v);

}

package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CauseIndicators;
import za.co.ebridge.isup.api.message.parameter.FacilityIndicator;
import za.co.ebridge.isup.api.message.parameter.UserToUserIndicators;

/**
 * <TABLE id="Table12" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <p/>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table44" style="WIDTH: 575px; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575" border="0">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * Facility Reject Message (FRJ)</TD>
 * </TR>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; COLOR: navy" colSpan="3">
 * <p/>
 * FRJ is sent in response to a facility request message to indicate that the facility request has been rejected.
 * </P>
 * <p/>
 * </TD>
 * </TR>
 * </TABLE>
 * </TD>
 * </TR>
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 283px; HEIGHT: 30px; TEXT-ALIGN: center">
 * Parameter</TD>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 145px; HEIGHT: 30px">Type</TD>
 * <p/>
 * <TD style="FONT-WEIGHT: bold; HEIGHT: 30px">Length (octet)</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message type</TD>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Facility&nbsp;Indicators</TD>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Cause Indicators</TD>
 * <p/>
 * <TD style="WIDTH: 145px">V</TD>
 * <TD>4</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">User to User Indicators</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * </TABLE>
 */
public interface FacilityRejectedMessage
        extends ISUPMessage
{
    /**
     * Facility Rejected Message, Q.763 reference table 29 <br>
     * {@link FacilityRejectedMessage}
     */
    int MESSAGE_CODE = 0x21;

    void setFacilityIndicator(FacilityIndicator fi);

    FacilityIndicator getFacilityIndicator();

    void setCauseIndicators(CauseIndicators ci);

    CauseIndicators getCauseIndicators();

    void setUserToUserIndicators(UserToUserIndicators u2ui);

    UserToUserIndicators getUserToUserIndicators();
}

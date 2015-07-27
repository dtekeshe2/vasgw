package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.GenericDigits;
import za.co.ebridge.isup.api.message.parameter.GenericNotificationIndicator;
import za.co.ebridge.isup.api.message.parameter.GenericNumber;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.UserToUserInformation;
import za.co.ebridge.isup.api.message.parameter.accessTransport.AccessTransport;

/**
 * Start time:09:54:07 2009-07-23<br>
 * Project: mobicents-isup-stack<br>
 * <TABLE id="Table32" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table61" style="WIDTH: 575px; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575" border="0">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * Segmentation&nbsp;(SGM) Message</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; COLOR: navy" colSpan="3">Segmentation (SGM) message sent in either direction to convey an
 * additional segment of an overlength message.</TD>
 * </TR>
 * </TABLE>
 * </TD>
 * </TR>
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 283px; HEIGHT: 30px; TEXT-ALIGN: center">
 * Parameter</TD>
 * <p/>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 145px; HEIGHT: 30px">Type</TD>
 * <TD style="FONT-WEIGHT: bold; HEIGHT: 30px">Length (octet)</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message type</TD>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">User to User Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-131</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message&nbsp;Compatibility Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4-5</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Generic Digit</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Generic Notification</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Access Transport</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-?</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Generic Number</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>5-13</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>1</TD>
 * </TR>
 * </TABLE>
 */
public interface SegmentationMessage
        extends ISUPMessage
{

    /**
     * Segmentation Message, Q.763 reference table 49 <br>
     * {@link SegmentationMessage}
     */
    int MESSAGE_CODE = 0x38;

    void setAccessTransport(AccessTransport at);

    AccessTransport getAccessTransport();

    void setUserToUserInformation(UserToUserInformation u2ui);

    UserToUserInformation getUserToUserInformation();

    void setMessageCompatibilityInformation(MessageCompatibilityInformation at);

    MessageCompatibilityInformation getMessageCompatibilityInformation();

    void setGenericDigits(GenericDigits gd);

    GenericDigits getGenericDigits();

    void setGenericNotificationIndicator(GenericNotificationIndicator gni);

    GenericNotificationIndicator getGenericNotificationIndicator();

    void setGenericNumber(GenericNumber gn);

    GenericNumber getGenericNumber();

}

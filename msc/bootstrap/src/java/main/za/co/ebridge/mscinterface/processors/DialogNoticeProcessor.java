package za.co.ebridge.mscinterface.processors;


import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.dialog.MAPNoticeProblemDiagnostic;
import org.apache.log4j.Logger;

public class DialogNoticeProcessor
{

    private static Logger log = Logger.getLogger("DialogNoticeProcessor.class");

    public static void process(MAPDialog mapDialog, MAPNoticeProblemDiagnostic noticeProblemDiagnostic)
    {

        log.error(
                String.format(
                        "onDialogNotice for DialogId=%d MAPNoticeProblemDiagnostic=%s ",
                        mapDialog.getLocalDialogId(), noticeProblemDiagnostic));
    }
}

package za.co.ebridge.tcap.api.api;

import za.co.ebridge.tcap.api.api.tc.component.InvokeClass;
import za.co.ebridge.tcap.api.asn.comp.ErrorCode;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.Problem;
import za.co.ebridge.tcap.api.asn.comp.ProblemType;
import za.co.ebridge.tcap.api.asn.comp.Reject;
import za.co.ebridge.tcap.api.asn.comp.ReturnError;
import za.co.ebridge.tcap.api.asn.comp.ReturnResult;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;

public interface ComponentPrimitiveFactory
{

    /**
     * Create a new Invoke. Class of this Invoke will be 1
     *
     * @return return new instance of ({@link Invoke}
     */
    Invoke createTCInvokeRequest();

    /**
     * <p>
     * Create a new {@link Invoke}. Set the {@link InvokeClass} as per bellow consideration
     * </p>
     * <ul>
     * <li>Class 1 – Both success and failure are reported.</li>
     * <li>Class 2 – Only failure is reported.</li>
     * <li>Class 3 – Only success is reported.</li>
     * <li>Class 4 – Neither success, nor failure is reported.</li>
     * </ul>
     *
     * @param invokeClass The Class of Operation
     * @return new instance of ({@link Invoke}
     */
    Invoke createTCInvokeRequest(InvokeClass invokeClass);

    Reject createTCRejectRequest();

    ReturnResultLast createTCResultLastRequest();

    ReturnResult createTCResultRequest();

    ReturnError createTCReturnErrorRequest();

    OperationCode createOperationCode();

    ErrorCode createErrorCode();

    Parameter createParameter();

    Parameter createParameter(int tag, int tagClass, boolean isPrimitive);

    Problem createProblem(ProblemType pt);
}

package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.PAbortCauseType;

/**
 * Thrown to indicate problems at parse time.
 */
public class ParseException
        extends Exception
{

    private GeneralProblemType problem;
    private PAbortCauseType pAbortCauseType;
    private Long invokeId;

    public ParseException(PAbortCauseType pAbortCauseType, GeneralProblemType problem)
    {
        this.problem = problem;
        this.pAbortCauseType = pAbortCauseType;
    }

    public ParseException(PAbortCauseType pAbortCauseType, GeneralProblemType problem, String message)
    {
        super(message);
        this.problem = problem;
        this.pAbortCauseType = pAbortCauseType;
    }

    public ParseException(PAbortCauseType pAbortCauseType, GeneralProblemType problem, Throwable cause)
    {
        super(cause);
        this.problem = problem;
        this.pAbortCauseType = pAbortCauseType;
    }

    public ParseException(PAbortCauseType pAbortCauseType, GeneralProblemType problem, String message, Throwable cause)
    {
        super(message, cause);
        this.problem = problem;
        this.pAbortCauseType = pAbortCauseType;
    }

    public GeneralProblemType getProblem()
    {
        return problem;
    }

    public PAbortCauseType getPAbortCauseType()
    {
        return pAbortCauseType;
    }

    public Long getInvokeId()
    {
        return invokeId;
    }

    public void setInvokeId(Long val)
    {
        invokeId = val;
    }

}

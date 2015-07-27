package za.co.ebridge.tcap.api.asn.comp;

import za.co.ebridge.tcap.api.asn.ParseException;

public enum InvokeProblemType
{

    /**
     * The invoke ID is that of a previously invoked operation which has not been completed. This code is generated
     * by the TCAP
     * layer now. If TC-user processes an incoming Invoke without answering with a result or error message it should
     * invoke
     * Dailog.processInvokeWithoutAnswer(Invoke invoke) method
     */
    DuplicateInvokeID(0),

    /**
     * The operation code is not one of those agreed by the two TC-User. This code is generated by the TC-User (not
     * by TCAP
     * layer).
     */
    UnrecognizedOperation(1),

    /**
     * Signifies that the type of parameter in an invoke component is not that agreed by the two TC-Users. This code is
     * generated by the TC-User (not by TCAP layer).
     */
    MistypedParameter(2),

    /**
     * Sufficient resources are not available to perform the requested operation. This code is generated by the
     * TC-User (not by
     * TCAP layer).
     */
    ResourceLimitation(3),

    /**
     * The requested operation cannot be invoked because the dialogue is about to be released. This code is generated
     * by the
     * TC-User (not by TCAP layer).
     */
    InitiatingRelease(4),

    /**
     * The linked ID does not correspond to an active invoke operation. This code is generated by the TCAP layer.
     */
    UnrechognizedLinkedID(5),

    /**
     * The operation referred to by the linked ID is not an operation for which linked invokes are allowed. This code is
     * generated by the TC-User (not by TCAP layer).
     */
    LinkedResponseUnexpected(6),

    /**
     * The operation referred to by the linked ID does not allow this linked operation. This code is generated by the
     * TC-User
     * (not by TCAP layer).
     */
    UnexpectedLinkedOperation(7);

    private long type;

    InvokeProblemType(long l)
    {
        this.type = l;
    }

    /**
     * @return the type
     */
    public long getType()
    {
        return type;
    }

    public static InvokeProblemType getFromInt(long t)
            throws
            ParseException
    {
        if (t == 0)
        {
            return DuplicateInvokeID;
        } else if (t == 1)
        {
            return UnrecognizedOperation;
        } else if (t == 2)
        {
            return MistypedParameter;
        } else if (t == 3)
        {
            return ResourceLimitation;
        } else if (t == 4)
        {
            return InitiatingRelease;
        } else if (t == 5)
        {
            return UnrechognizedLinkedID;
        } else if (t == 6)
        {
            return LinkedResponseUnexpected;
        } else if (t == 7)
        {
            return UnexpectedLinkedOperation;
        }

        throw new ParseException(null, GeneralProblemType.MistypedComponent, "Wrong value of type: " + t);
    }

}
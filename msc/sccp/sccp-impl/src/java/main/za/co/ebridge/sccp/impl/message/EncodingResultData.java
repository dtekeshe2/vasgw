package za.co.ebridge.sccp.impl.message;

import java.util.ArrayList;

import za.co.ebridge.sccp.api.parameter.ReturnCauseValue;

public class EncodingResultData
{

    private EncodingResult encodingResult;
    private byte[] solidData;
    private ArrayList<byte[]> segementedData;
    private ReturnCauseValue returnCause;

    public EncodingResultData(
            EncodingResult encodingResult, byte[] solidData, ArrayList<byte[]> segementedData,
            ReturnCauseValue returnCause)
    {
        this.encodingResult = encodingResult;
        this.solidData = solidData;
        this.segementedData = segementedData;
        this.returnCause = returnCause;
    }

    public EncodingResult getEncodingResult()
    {
        return encodingResult;
    }

    public byte[] getSolidData()
    {
        return solidData;
    }

    public ArrayList<byte[]> getSegementedData()
    {
        return segementedData;
    }

    public ReturnCauseValue getReturnCause()
    {
        return returnCause;
    }

}

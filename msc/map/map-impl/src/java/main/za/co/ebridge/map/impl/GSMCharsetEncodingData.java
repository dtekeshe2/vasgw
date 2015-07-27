package za.co.ebridge.map.impl;

public class GSMCharsetEncodingData
{

    protected int totalSeptetCount;
    protected byte[] leadingBuffer;
    protected boolean ussdStyleEncoding;

    /**
     * SMS case constructor
     *
     * @param leadingBuffer Encoded UserDataHeader (if does not exist == null)
     */
    public GSMCharsetEncodingData(byte[] leadingBuffer)
    {
        this.leadingBuffer = leadingBuffer;
        this.ussdStyleEncoding = false;
    }

    /**
     * USSD case constructor
     */
    public GSMCharsetEncodingData()
    {
        this.ussdStyleEncoding = true;
    }

    public int getTotalSeptetCount()
    {
        return totalSeptetCount;
    }
}

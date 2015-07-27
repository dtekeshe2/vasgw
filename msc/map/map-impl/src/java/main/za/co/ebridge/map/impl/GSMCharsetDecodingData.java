package za.co.ebridge.map.impl;

public class GSMCharsetDecodingData
{

    protected int totalSeptetCount;
    protected int leadingSeptetSkipCount;
    protected boolean ussdStyleEncoding;

    /**
     * SMS case constructor
     *
     * @param totalSeptetCount       Length of a decoded message in characters (for SMS case)
     * @param leadingSeptetSkipCount Count of leading septets to skip
     */
    public GSMCharsetDecodingData(int totalSeptetCount, int leadingSeptetSkipCount)
    {
        this.totalSeptetCount = totalSeptetCount;
        this.leadingSeptetSkipCount = leadingSeptetSkipCount;
        this.ussdStyleEncoding = false;
    }

    /**
     * USSD case constructor
     */
    public GSMCharsetDecodingData()
    {
        this.totalSeptetCount = Integer.MAX_VALUE;
        this.leadingSeptetSkipCount = 0;
        this.ussdStyleEncoding = true;
    }
}

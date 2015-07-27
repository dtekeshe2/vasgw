package za.co.ebridge.sccp.api.parameter;

import javolution.xml.XMLSerializable;

import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;
import za.co.ebridge.sccp.api.indicator.NatureOfAddress;
import za.co.ebridge.sccp.api.indicator.NumberingPlan;

public abstract class GlobalTitle
        implements XMLSerializable
{

    public static final String GLOBALTITLE_INDICATOR = "gti";
    public static final String DIGITS = "digits";
    public static final String TRANSLATION_TYPE = "tt";
    public static final String NUMBERING_PLAN = "np";
    public static final String NATURE_OF_ADDRESS_INDICATOR = "nai";
    public static final String ENCODING_SCHEME = "es";

    /**
     * Defines fields included into the global title.
     *
     * @return
     */
    public abstract GlobalTitleIndicator getIndicator();

    /**
     * Address string.
     *
     * @return
     */
    public abstract String getDigits();

    /**
     * Global tite contains nature of address indicator only.
     *
     * @param noa    nature of address indicator.
     * @param digits the address string
     * @return Global title instance.
     */
    public static GlobalTitle getInstance(NatureOfAddress noa, String digits)
    {
        return new GT0001(noa, digits);
    }

    /**
     * Global title contains translation type only.
     *
     * @param tt     translation type.
     * @param digits the address string
     * @return Global title instance
     */
    public static GlobalTitle getInstance(int tt, String digits)
    {
        return new GT0010(tt, digits);
    }

    /**
     * Global title contains translation type, numbering plan and encoding scheme.
     *
     * @param tt     translation type
     * @param np     numbering plan
     * @param digits the address string, if number of digits even the BCD even encoding scheme is used and BCD odd otherwise.
     * @return Global title instance.
     */
    public static GlobalTitle getInstance(int tt, NumberingPlan np, String digits)
    {
        return new GT0011(tt, np, digits);
    }

    /**
     * Global title contains translation type, numbering plan, encoding scheme and nature of address indicator.
     *
     * @param tt     translation type.
     * @param np     numbering plan
     * @param noa    nature of address indicator.
     * @param digits the address string, if number of digits even the BCD even encoding scheme is used and BCD odd otherwise.
     * @return Global title instance.
     */
    public static GlobalTitle getInstance(int tt, NumberingPlan np, NatureOfAddress noa, String digits)
    {
        // FIXME: this construction is wrong
        return new GT0100(tt, np, noa, digits);
    }

    public static GlobalTitle getInstance(String digits)
    {
        return new NoGlobalTitle(digits);
    }

    public String toString()
    {
        return getIndicator() + " " + getDigits();
    }
}

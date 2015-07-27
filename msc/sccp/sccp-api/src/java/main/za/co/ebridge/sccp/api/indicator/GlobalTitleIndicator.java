package za.co.ebridge.sccp.api.indicator;

public enum GlobalTitleIndicator
{
    NO_GLOBAL_TITLE_INCLUDED(0), GLOBAL_TITLE_INCLUDES_NATURE_OF_ADDRESS_INDICATOR_ONLY(1), GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_ONLY(
        2), GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_AND_ENCODING_SCHEME(3), GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_ENCODING_SCHEME_AND_NATURE_OF_ADDRESS(
        4);

    private int value;

    private GlobalTitleIndicator(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public static GlobalTitleIndicator valueOf(int v)
    {
        switch (v)
        {
            case 0:
                return NO_GLOBAL_TITLE_INCLUDED;
            case 1:
                return GLOBAL_TITLE_INCLUDES_NATURE_OF_ADDRESS_INDICATOR_ONLY;
            case 2:
                return GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_ONLY;
            case 3:
                return GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_AND_ENCODING_SCHEME;
            case 4:
                return GLOBAL_TITLE_INCLUDES_TRANSLATION_TYPE_NUMBERING_PLAN_ENCODING_SCHEME_AND_NATURE_OF_ADDRESS;
            default:
                return null;
        }
    }
}

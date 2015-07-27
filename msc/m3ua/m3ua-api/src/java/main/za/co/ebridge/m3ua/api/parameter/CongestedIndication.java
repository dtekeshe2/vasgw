package za.co.ebridge.m3ua.api.parameter;

/**
 * The optional Congestion Indications parameter contains a Congestion Level field.
 * This optional parameter is used to communicate congestion levels in national MTP networks with multiple congestion
 * thresholds
 */
public interface CongestedIndication
        extends Parameter
{

    CongestionLevel getCongestionLevel();

    /**
     * The Congestion Level field, associated with all of the Affected DPC(s) in the Affected Destinations parameter,
     * contains one of the following values:
     * - 0 No Congestion or Undefined
     * - 1 Congestion Level 1
     * - 2 Congestion Level 2
     * - 3 Congestion Level 3
     */
    public enum CongestionLevel
    {

        UNDEFINED(0), LEVEL1(1), LEVEL2(2), LEVEL3(3);

        int level;

        private CongestionLevel(int level)
        {
            this.level = level;
        }

        public int getLevel()
        {
            return this.level;
        }

        public static CongestionLevel getCongestionLevel(int level)
        {
            switch (level)
            {
                case 0:
                    return UNDEFINED;
                case 1:
                    return LEVEL1;
                case 2:
                    return LEVEL2;
                case 3:
                    return LEVEL3;
                default:
                    return null;
            }
        }
    }
}

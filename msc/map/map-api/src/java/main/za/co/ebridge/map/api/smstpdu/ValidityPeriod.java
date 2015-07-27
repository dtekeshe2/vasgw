/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

import java.io.Serializable;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface ValidityPeriod extends Serializable {

    ValidityPeriodFormat getValidityPeriodFormat();

    Integer getRelativeFormatValue();

    /**
     * @return Return the relative format period in hours
     */
    Double getRelativeFormatHours();

    AbsoluteTimeStamp getAbsoluteFormatValue();

    ValidityEnhancedFormatData getEnhancedFormatValue();

}

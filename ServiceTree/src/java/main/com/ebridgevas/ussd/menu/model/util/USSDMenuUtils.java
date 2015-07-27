package com.ebridgevas.ussd.menu.model.util;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;

public class USSDMenuUtils
{
    private static final Splitter PAYLOAD_SPLITTER;

    static {
        PAYLOAD_SPLITTER = Splitter.on(CharMatcher.anyOf("*#")).trimResults().omitEmptyStrings();
    }

    public static String[] parse(String input)
    {
        return Iterables.toArray(PAYLOAD_SPLITTER.split(input), String.class);
    }

    private static final String UNIT_DAYS = "day";

    /**
     * Date 'duration' units from now
     *
     * @param duration e.g. number of days from now
     * @param unit e.g. days, hours, seconds
     * @return
     */
    public static DateTime dateFromNow(BigDecimal duration, String unit)
    {
        if (UNIT_DAYS.equalsIgnoreCase(unit))
        {
            return new DateTime(new Date()).plusDays(duration.intValue());
        }
        else
        {
            return null;
        }
    }
}

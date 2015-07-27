package com.ebridgevas.in.util;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 8/8/13
 * Time: 2:59 AM
 * To change this template use File | Settings | File Templates.
 */

import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: David
 * Date: 9/30/12
 * Time: 8:32 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccountTransferUtils {

    private static final Map<BigDecimal, Integer> WINDOW_PERIODS;
    private static final Map<String, Integer> WINDOW_PERIODS_BY_TYPE;
    private static final Map<String, Integer> TEST_WINDOW_PERIODS_BY_TYPE;

    static {

        // TODO Load window periods from database
        WINDOW_PERIODS = new HashMap<BigDecimal, Integer>();
        WINDOW_PERIODS.put(new BigDecimal("0.50"), new Integer(30) );
        WINDOW_PERIODS.put(new BigDecimal("1.00"), new Integer(30) );
        WINDOW_PERIODS.put(new BigDecimal("3.00"), new Integer(30) );
        WINDOW_PERIODS.put(new BigDecimal("5.00"), new Integer(30) );
        WINDOW_PERIODS.put(new BigDecimal("10.00"), new Integer(30) );
        WINDOW_PERIODS.put(new BigDecimal("20.00"), new Integer(60) );
        WINDOW_PERIODS.put(new BigDecimal("45.00"), new Integer(90) );
        WINDOW_PERIODS.put(new BigDecimal("75.00"), new Integer(120) );


                        /*
        0.5   10mb 30
1.00  30mb 30
5.00  200 mb 90
15.00 700 mb 90
30.00 1500 mb 120
         */

        /*
        WINDOW_PERIODS = new HashMap<BigDecimal, Integer>();
        WINDOW_PERIODS.put(new BigDecimal("0.50"), new Integer(30) );
        WINDOW_PERIODS.put(new BigDecimal("1.00"), new Integer(30) );
        WINDOW_PERIODS.put(new BigDecimal("5.00"), new Integer(90) );
        WINDOW_PERIODS.put(new BigDecimal("15.00"), new Integer(90) );
        WINDOW_PERIODS.put(new BigDecimal("30.00"), new Integer(120) );

        */
    }

    static {
        WINDOW_PERIODS_BY_TYPE = new HashMap<String, Integer>();
        WINDOW_PERIODS_BY_TYPE.put("1", new Integer(30) );
        WINDOW_PERIODS_BY_TYPE.put("2", new Integer(30) );
        WINDOW_PERIODS_BY_TYPE.put("3", new Integer(30) );
        WINDOW_PERIODS_BY_TYPE.put("4", new Integer(30) );
        WINDOW_PERIODS_BY_TYPE.put("5", new Integer(30) );
        WINDOW_PERIODS_BY_TYPE.put("6", new Integer(60) );
        WINDOW_PERIODS_BY_TYPE.put("7", new Integer(90) );
        WINDOW_PERIODS_BY_TYPE.put("8", new Integer(120) );
    }


    static {
        TEST_WINDOW_PERIODS_BY_TYPE = new HashMap<String, Integer>();
        TEST_WINDOW_PERIODS_BY_TYPE.put("1", new Integer(1) );
        TEST_WINDOW_PERIODS_BY_TYPE.put("2", new Integer(1) );
        TEST_WINDOW_PERIODS_BY_TYPE.put("3", new Integer(1) );
        TEST_WINDOW_PERIODS_BY_TYPE.put("4", new Integer(1) );
        TEST_WINDOW_PERIODS_BY_TYPE.put("5", new Integer(1) );
        TEST_WINDOW_PERIODS_BY_TYPE.put("6", new Integer(2) );
        TEST_WINDOW_PERIODS_BY_TYPE.put("7", new Integer(3) );
        TEST_WINDOW_PERIODS_BY_TYPE.put("8", new Integer(4) );
    }

    public static Integer getWindowPeriod(BigDecimal amount) {
        return WINDOW_PERIODS.get(amount);
    }

    public static Integer getWindowPeriodByType(String bundleType, Boolean isTest) {
        return isTest ?
                    TEST_WINDOW_PERIODS_BY_TYPE.get(bundleType) :
                        WINDOW_PERIODS_BY_TYPE.get(bundleType);
    }

    public static Date getExpiryDate(BigDecimal amount) {
        DateTime expiry = new DateTime();
        expiry = expiry.plusDays(getWindowPeriod(amount));
        expiry = expiry.withHourOfDay(23);
        expiry = expiry.withMinuteOfHour(59);
        expiry = expiry.withSecondOfMinute(59);
        expiry = expiry.withMillisOfSecond(999);
        return expiry.toDate();
    }

    public static Date getExpiryDateByType(String bundleType) {
        return getExpiryDateByType(bundleType, Boolean.FALSE);
    }

    public static Date getExpiryDateByType(String bundleType, Boolean isTest) {
        DateTime expiry = new DateTime();
        expiry = expiry.plusDays(getWindowPeriodByType(bundleType, isTest));
        expiry = expiry.withHourOfDay(23);
        expiry = expiry.withMinuteOfHour(59);
        expiry = expiry.withSecondOfMinute(59);
        expiry = expiry.withMillisOfSecond(999);
        return expiry.toDate();
    }
}


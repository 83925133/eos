package com.whale.eos.basic.util.time;


import org.apache.commons.lang3.math.NumberUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: swen
 * Date: 13-4-22
 * Time: 下午3:38
 *  // Joda-time 各种操作.....
 dateTime = dateTime.plusDays(1) // 增加天
 .plusYears(1)// 增加年
 .plusMonths(1)// 增加月
 .plusWeeks(1)// 增加星期
 .minusMillis(1)// 减分钟
 .minusHours(1)// 减小时
 .minusSeconds(1);// 减秒数
 http://ylq365.iteye.com/blog/1769680
 */
public class TimeUtil {


    /**
     * 返回当前时间的yyyyMMddHHmmss格式
     */
    public static long toLongOfyyyyMMddHHmmss() {
        return toLongOfyyyyMMddHHmmss(Calendar.getInstance());
    }

    public static long toLongOfyyyyMMdd() {
        return toLongOfyyyyMMdd(Calendar.getInstance());
    }

    public static long toLongOfyyyyMMddHHmmss(Calendar cal) {
        return toNumber(cal, "yyyyMMddHHmmss");
    }

    public static long toLongOfyyyyMMddHHmmss(Date cal) {
        return toNumber(cal, "yyyyMMddHHmmss");
    }

    public static long toLongOfyyyyMMdd(Calendar cal) {
        return toNumber(cal, "yyyyMMdd");
    }

    public static long toLongOfHHmmss() {
        return NumberUtils.toLong(toString(Calendar.getInstance(), "HHmmss"));
    }

    public static String toStringOfyyyyMMddHHmmss() {
        DateTime dateTime = new DateTime(Calendar.getInstance());
        return dateTime.toString("yyyyMMddHHmmss");
    }

    public static String toStringOfyyyyMMddHHmmss(Date date) {
        DateTime dateTime = new DateTime(date);
        return dateTime.toString("yyyyMMddHHmmss");
    }

    public static long toLongOfyyyyMMdd(Date cal) {
        return toNumber(cal, "yyyyMMdd");
    }

    /**
     * 将时间对象转化为数字
     * @param format 格式，例如"yyyyMMddHH"
     */
    public static long toNumber(Calendar cal, String format) {
        DateTime dateTime = new DateTime(cal);

        String time = dateTime.toString(format);
        return Long.parseLong(time);
    }

    public static String toString(Date date, String format) {
        DateTime dateTime = new DateTime(date);

        return dateTime.toString(format);
    }

    /**
     * 将时间对象转化为数字
     * @param format 格式，例如"yyyyMMddHH"
     */
    public static long toNumber(Date cal, String format) {
        DateTime dateTime = new DateTime(cal);

        String time = dateTime.toString(format);
        return Long.parseLong(time);
    }

    public static String toString(Calendar cal, String format) {
        if (null == cal)
            return "";
        DateTime dateTime = new DateTime(cal);
        return dateTime.toString(format);
    }

    public static String toString(String format) {
        DateTime dateTime = new DateTime();
        return dateTime.toString(format);
    }

    public static Date toDate(String time, String format) {
        try {
            return DateTimeFormat.forPattern(format).parseDateTime(time).toDate();
        } catch (Exception e) {

        }
        return null;
    }

    public static long minusMinutes(int time, String format) {
        DateTime dateTime = new DateTime();
        dateTime = dateTime.minusMinutes(time);
        return NumberUtils.toLong(dateTime.toString(format));
    }

    public static Date minusMinutes(int time) {
        DateTime dateTime = new DateTime();
        dateTime = dateTime.minusMinutes(time);
        return dateTime.toDate();
    }

    public static long plusMinutes(int time, String format) {
        DateTime dateTime = new DateTime();
        dateTime = dateTime.plusMinutes(time);
        return NumberUtils.toLong(dateTime.toString(format));
    }

    public static long plusSeconds(Date cal ,int time, String format) {
        DateTime dateTime = new DateTime(cal);
        dateTime = dateTime.plusSeconds(time);
        return NumberUtils.toLong(dateTime.toString(format));
    }

    public static long plusDay(int time, String format) {
        DateTime dateTime = new DateTime();
        dateTime = dateTime.plusDays(time);
        return NumberUtils.toLong(dateTime.toString(format));
    }
}

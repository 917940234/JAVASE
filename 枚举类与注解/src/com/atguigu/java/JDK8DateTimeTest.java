package com.atguigu.java;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-02 18:13
 * @version: v1.0
 */
public class JDK8DateTimeTest {

    @Test
    public void testDate() {
        Date date1 = new Date(2020, 9, 8);
        System.out.println(date1);//Fri Oct 08 00:00:00 CST 3920
    }

    /**
     * LocalDate,LocalTime,LocalDateTime的使用
     * 说明：
     * 1.LocalDateTime相较于LocalDate,LocalTime，使用频率更高
     * 2.类似于Calendar
     */
    @Test
    public void test1() {
        //now():获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //of():设置指定的年、月、日、时、分、秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2021,10,3,9,8,20);
        System.out.println(localDateTime1);

        //getXxx():获取相关的属性
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        //withXxx():设置相关的属性
        //体现不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);

        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);

        //不可变性
        LocalDateTime localDateTime3 = localDateTime.plusMonths(2);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);

        LocalDateTime localDateTime4 = localDateTime.minusDays(2);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
    }

    /**
     * Instant的使用
     * 类似于java.util.Date类
     */
    @Test
    public void test2(){
        //now():获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);//2021-10-03T01:45:53.800Z

        //atOffset():添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//2021-10-03T09:45:53.800+08:00

        //toEpochMilli():获取自1970年1月1日0时0分0秒(UTC)开始的毫秒数——>Date类的getTime()
        long Milli = instant.toEpochMilli();
        System.out.println(Milli);

        //ofEpochMilli():通过给定的毫秒数，获取Instant实例——>Date(long millis)
        Instant instant1 = Instant.ofEpochMilli(1633225786592L);
        System.out.println(instant1);
    }

    /**
     * DateTimeFormatter:格式化或解析日期、时间，类似于SimpleDateFormat
     */
    @Test
    public void Test3(){
        //方式一：预定义的标准格式，如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期——>字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);//2021-10-03T10:01:50.022
        //解析：字符串——>日期
        TemporalAccessor parse = formatter.parse("2021-10-03T10:01:50.022");
        System.out.println(parse);

        //方式二：本地化相关的格式，如：ofLocalizedDateTime(FormatStyle.LONG/MEDIUM/SHORT))、
        //                           ofLocalizedDate(FormatStyle.FULL/LONG/MEDIUM/SHORT))
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        //格式化
        String str2 = formatter1.format(localDateTime);
        String str3 = formatter2.format(localDateTime);
        System.out.println(str2);//21-10-3 上午10:07、2021年10月3日 上午10时08分14秒
        System.out.println(str3);//2021年10月3日 星期日

        //重点：方式三：自定义的格式，如：ofPattern("yyyy-MM-dd hh:mm:ss E")
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss E");
        //格式化
        String str4 = formatter3.format(localDateTime);
        System.out.println(str4);
        //解析
        TemporalAccessor accessor = formatter3.parse("2021-10-03 10:13:02 星期日");
        System.out.println(accessor);
    }
}

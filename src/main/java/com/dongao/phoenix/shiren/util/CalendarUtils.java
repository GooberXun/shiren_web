package com.dongao.phoenix.shiren.util;

import java.util.Calendar;

/**
 * @Author xunxiaobo
 * @Date 2018/6/4.
 */
public class CalendarUtils {

    public static void main(String[] args) {
        Calendar cl = setCalendar(2016,06,01);

        getAfterDay(cl);
        int year = cl.get(Calendar.YEAR);
        int month = cl.get(Calendar.MONTH)+1;
        int day = cl.get(Calendar.DATE);
        System.out.println(year+""+month+""+day);
    }

    /**
     * 设置时间
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static Calendar setCalendar(int year,int month,int date){
        Calendar cl = Calendar.getInstance();
        cl.set(year, month-1, date);
        return cl;
    }

    /**
     * 获取当前时间的后一天时间
     * @param cl
     * @return
     */
    private static Calendar getAfterDay(Calendar cl){
        //使用roll方法进行回滚到后一天的时间
        //cl.roll(Calendar.DATE, 1);
        //使用set方法直接设置时间值
        int day = cl.get(Calendar.DATE);
        cl.set(Calendar.DATE, day+1);
        return cl;
    }
}

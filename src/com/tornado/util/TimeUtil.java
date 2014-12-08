/*  1:   */package com.tornado.util;
/*  2:   */
/*  3:   */import java.text.ParseException;
/*  4:   */import java.text.SimpleDateFormat;
/*  5:   */import java.util.Date;
/*  6:   */import java.util.TimeZone;
/*  7:   */import java.util.Vector;
/*  8:   */
/* 12:   */public class TimeUtil
/* 13:   */{
/* 14:14 */  private static Vector<String> formatStrVector = new Vector();
/* 15:   */  
/* 16:   */  public static void init() {}
/* 17:   */  
/* 18:   */  public static Date toDate(String str, String formatStr)
/* 19:   */    throws ParseException
/* 20:   */  {
/* 21:21 */    SimpleDateFormat dateformat = new SimpleDateFormat(formatStr);
/* 22:22 */    return dateformat.parse(str);
/* 23:   */  }
/* 24:   */  
/* 25:   */  public static String toString(Date date, String formatStr)
/* 26:   */  {
/* 27:27 */    return toString(date, formatStr, "Asia/Shanghai");
/* 28:   */  }
/* 29:   */  
/* 30:   */  public static String toString(Date date, String formatStr, String timezone)
/* 31:   */  {
/* 32:32 */    TimeZone timeZoneSH = TimeZone.getTimeZone(timezone);
/* 33:33 */    SimpleDateFormat dateformat = new SimpleDateFormat(formatStr);
/* 34:34 */    dateformat.setTimeZone(timeZoneSH);
/* 35:35 */    return dateformat.format(date);
/* 36:   */  }
/* 37:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.util.TimeUtil
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
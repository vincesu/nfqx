/*  1:   */package com.tornado.util;
/*  2:   */
/*  3:   */public class TextUtil
/*  4:   */{
/*  5:   */  public static String[] toHtmlString(String value)
/*  6:   */  {
/*  7: 7 */    String[] values = value.split(System.getProperty("line.separator"));
/*  8: 8 */    return values;
/*  9:   */  }
/* 10:   */  
/* 11:   */  public static String formatHtmlString(String value)
/* 12:   */  {
/* 13:13 */    String result = value.replaceAll(" ", "&nbsp;");
/* 14:14 */    return result;
/* 15:   */  }
/* 16:   */  
/* 17:   */  public static String formatSeparator(String value)
/* 18:   */  {
/* 19:19 */    value = value.replaceAll("\n", System.getProperty("line.separator"));
/* 20:20 */    value = value.replaceAll("\r\n", System.getProperty("line.separator"));
/* 21:21 */    return value;
/* 22:   */  }
/* 23:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.util.TextUtil
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
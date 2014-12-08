/*  1:   */package com.tornado.util;
/*  2:   */
/*  3:   */import com.tornado.core.control.Content;
/*  4:   */
/*  5:   */public class ControllerUtil
/*  6:   */{
/*  7:   */  private static final String lan_en = "en";
/*  8:   */  private static final String lan_cn = "cn";
/*  9:   */  
/* 10:   */  public static String DetermineLanguage(Content content)
/* 11:   */  {
/* 12:12 */    if ((content.getParameter("lan") == null) || (content.getParameter("lan").equals(""))) {
/* 13:13 */      return "en";
/* 14:   */    }
/* 15:15 */    return content.getParameter("lan");
/* 16:   */  }
/* 17:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.util.ControllerUtil
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
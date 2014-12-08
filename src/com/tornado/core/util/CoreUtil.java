/* 1:  */package com.tornado.core.util;
/* 2:  */
/* 3:  */public abstract class CoreUtil
/* 4:  */{
/* 5:  */  public static String dealActionPath(String path)
/* 6:  */  {
/* 7:7 */    return path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
/* 8:  */  }
/* 9:  */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.core.util.CoreUtil
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
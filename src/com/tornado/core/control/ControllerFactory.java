/*  1:   */package com.tornado.core.control;
/*  2:   */
/*  3:   */import com.tornado.core.util.CoreUtil;
/*  4:   */import javax.servlet.http.HttpServletRequest;
/*  5:   */
/* 10:   */public class ControllerFactory
/* 11:   */{
/* 12:12 */  private static String packagePath = "com.tornado.controller.";
/* 13:   */  
/* 14:   */  public static void setPackagePath(String value)
/* 15:   */  {
/* 16:16 */    if (value.endsWith(".")) {
/* 17:17 */      packagePath = value;
/* 18:   */    } else {
/* 19:19 */      packagePath = value + ".";
/* 20:   */    }
/* 21:   */  }
/* 22:   */  
/* 23:   */  public static String getPackagePath() {
/* 24:24 */    return packagePath;
/* 25:   */  }
/* 26:   */  
/* 27:   */  public static Controller createController(String controllerName) throws InstantiationException, IllegalAccessException, ClassNotFoundException
/* 28:   */  {
/* 29:29 */    String classFullName = packagePath + controllerName;
/* 30:30 */    return (Controller)Class.forName(classFullName.trim()).newInstance();
/* 31:   */  }
/* 32:   */  
/* 33:   */  public static Controller createController(String packagepath, String controllerName) throws InstantiationException, IllegalAccessException, ClassNotFoundException
/* 34:   */  {
/* 35:35 */    String classFullName = null;
/* 36:   */    
/* 37:37 */    if (packagepath.endsWith(".")) {
/* 38:38 */      classFullName = packagepath + controllerName;
/* 39:   */    } else {
/* 40:40 */      classFullName = packagepath + "." + controllerName;
/* 41:   */    }
/* 42:42 */    return (Controller)Class.forName(classFullName.trim()).newInstance();
/* 43:   */  }
/* 44:   */  
/* 45:   */  public static Controller createController(HttpServletRequest req) throws InstantiationException, IllegalAccessException, ClassNotFoundException
/* 46:   */  {
/* 47:47 */    return createController(CoreUtil.dealActionPath(req.getServletPath().trim()));
/* 48:   */  }
/* 49:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.core.control.ControllerFactory
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
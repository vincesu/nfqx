/*  1:   */package com.tornado.core.control;
/*  2:   */
/*  3:   */import com.tornado.core.view.View;
/*  4:   */import java.lang.reflect.InvocationTargetException;
/*  5:   */import java.lang.reflect.Method;
/*  6:   */import javax.servlet.http.HttpServletRequest;
/*  7:   */import javax.servlet.http.HttpSession;
/*  8:   */
/*  9:   */public class Controller
/* 10:   */{
/* 11:   */  public static final String language = "lan";
/* 12:   */  
/* 13:   */  public View execute(String methodName, Content data)
/* 14:   */    throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException
/* 15:   */  {
/* 16:16 */    Method method = getClass().getMethod(methodName, new Class[] { Content.class });
/* 17:17 */    return (View)method.invoke(this, new Object[] { data });
/* 18:   */  }
/* 19:   */  
/* 20:   */  public String getLanguage(Content data)
/* 21:   */  {
/* 22:22 */    if (data.getRequest().getSession().getAttribute("lan") == null) {
/* 23:23 */      return "en";
/* 24:   */    }
/* 25:25 */    return data.getRequest().getSession().getAttribute("lan").toString();
/* 26:   */  }
/* 27:   */  
/* 29:   */  protected void switchLanguage(Content content, String lan)
/* 30:   */  {
/* 31:31 */    content.getRequest().getSession().setAttribute("lan", lan);
/* 32:   */  }
/* 33:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.core.control.Controller
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
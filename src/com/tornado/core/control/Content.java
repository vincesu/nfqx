/*  1:   */package com.tornado.core.control;
/*  2:   */
/*  3:   */import javax.servlet.ServletContext;
/*  4:   */import javax.servlet.http.HttpServletRequest;
/*  5:   */import javax.servlet.http.HttpServletResponse;
/*  6:   */
/*  9:   */public class Content
/* 10:   */{
/* 11:   */  private HttpServletRequest request;
/* 12:   */  private HttpServletResponse response;
/* 13:   */  private ServletContext servletContext;
/* 14:   */  
/* 15:   */  public Content(ServletContext servletContext, HttpServletRequest request, HttpServletResponse response)
/* 16:   */  {
/* 17:17 */    this.servletContext = servletContext;
/* 18:18 */    this.request = request;
/* 19:19 */    this.response = response;
/* 20:   */  }
/* 21:   */  
/* 22:   */  public String getParameter(String name)
/* 23:   */  {
/* 24:24 */    String str = this.request.getParameter(name);
/* 25:25 */    if (str != null)
/* 26:   */    {
/* 27:27 */      str = str.trim();
/* 28:   */    }
/* 29:29 */    return str;
/* 30:   */  }
/* 31:   */  
/* 32:   */  public HttpServletRequest getRequest()
/* 33:   */  {
/* 34:34 */    return this.request;
/* 35:   */  }
/* 36:   */  
/* 37:   */  public void setRequest(HttpServletRequest request)
/* 38:   */  {
/* 39:39 */    this.request = request;
/* 40:   */  }
/* 41:   */  
/* 42:   */  public HttpServletResponse getResponse()
/* 43:   */  {
/* 44:44 */    return this.response;
/* 45:   */  }
/* 46:   */  
/* 47:   */  public void setResponse(HttpServletResponse response)
/* 48:   */  {
/* 49:49 */    this.response = response;
/* 50:   */  }
/* 51:   */  
/* 52:   */  public ServletContext getServletContext()
/* 53:   */  {
/* 54:54 */    return this.servletContext;
/* 55:   */  }
/* 56:   */  
/* 57:   */  public void setServletContext(ServletContext servletContext)
/* 58:   */  {
/* 59:59 */    this.servletContext = servletContext;
/* 60:   */  }
/* 61:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.core.control.Content
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
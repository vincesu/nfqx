/*  1:   */package com.tornado.core.control;
/*  2:   */
/*  3:   */import com.tornado.core.view.View;
/*  4:   */import java.io.IOException;
/*  5:   */import javax.servlet.RequestDispatcher;
/*  6:   */import javax.servlet.ServletException;
/*  7:   */import javax.servlet.http.HttpServlet;
/*  8:   */import javax.servlet.http.HttpServletRequest;
/*  9:   */import javax.servlet.http.HttpServletResponse;
/* 10:   */
/* 11:   */public class ControlServlet
/* 12:   */  extends HttpServlet
/* 13:   */{
/* 14:   */  public void init()
/* 15:   */    throws ServletException
/* 16:   */  {
/* 17:17 */    super.init();
/* 18:   */  }
/* 19:   */  
/* 20:   */  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
/* 21:   */  {
/* 22:22 */    doPost(req, resp);
/* 23:   */  }
/* 24:   */  
/* 25:   */  public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
/* 26:   */  {
/* 27:27 */    Content content = new Content(getServletContext(), req, resp);
/* 28:28 */    String method = req.getParameter("action");
/* 29:29 */    Controller controller = null;
/* 30:30 */    View view = null;
/* 31:   */    
/* 32:   */    try
/* 33:   */    {
/* 34:34 */      controller = ControllerFactory.createController(req);
/* 35:   */    }
/* 36:   */    catch (Exception e)
/* 37:   */    {
/* 38:38 */      e.printStackTrace();
/* 39:   */    }
/* 40:   */    
/* 41:   */    try
/* 42:   */    {
/* 43:43 */      view = controller.execute(method, content);
/* 44:   */    }
/* 45:   */    catch (Exception e)
/* 46:   */    {
/* 47:47 */      e.printStackTrace();
/* 48:   */    }
/* 49:   */    
/* 50:50 */    req.getRequestDispatcher(view.getUrl()).forward(content.getRequest(), content.getResponse());
/* 51:   */  }
/* 52:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.core.control.ControlServlet
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
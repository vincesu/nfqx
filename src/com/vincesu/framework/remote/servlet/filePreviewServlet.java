/*  1:   */package com.vincesu.framework.remote.servlet;
/*  2:   */
/*  3:   */import com.vincesu.framework.remote.RemoteService;
/*  4:   */import com.vincesu.framework.remote.RequestEntity;
/*  5:   */import com.vincesu.framework.remote.ResponseEntity;
/*  6:   */import java.io.IOException;
/*  7:   */import java.io.OutputStream;
/*  8:   */import java.util.ArrayList;
/*  9:   */import java.util.HashMap;
/* 10:   */import java.util.List;
/* 11:   */import java.util.Map;
/* 12:   */import javax.servlet.ServletException;
/* 13:   */import javax.servlet.http.HttpServlet;
/* 14:   */import javax.servlet.http.HttpServletRequest;
/* 15:   */import javax.servlet.http.HttpServletResponse;
/* 16:   */
/* 24:   */public class filePreviewServlet
/* 25:   */  extends HttpServlet
/* 26:   */{
/* 27:   */  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
/* 28:   */    throws ServletException, IOException
/* 29:   */  {
/* 30:30 */    String serviceid = req.getParameter("serviceid");
/* 31:31 */    String params = req.getParameter("params");
/* 32:   */    
/* 38:38 */    OutputStream outStream = resp.getOutputStream();
/* 39:   */    try
/* 40:   */    {
/* 41:41 */      RequestEntity reqEntity = new RequestEntity(req.getSession());
/* 42:42 */      List<Map> data = new ArrayList();
/* 43:43 */      Map m = new HashMap();
/* 44:44 */      m.put("filestream", outStream);
/* 45:45 */      m.put("params", params);
/* 46:46 */      data.add(m);
/* 47:47 */      reqEntity.setData(data);
/* 48:48 */      ResponseEntity respEntity = RemoteService.execute(serviceid, reqEntity);
/* 49:   */    } catch (Exception e) {
/* 50:   */      ResponseEntity respEntity;
/* 51:51 */      e.printStackTrace();
/* 52:   */    }
/* 53:   */    finally
/* 54:   */    {
/* 55:55 */      if (outStream != null) {
/* 56:56 */        outStream.close();
/* 57:   */      }
/* 58:   */    }
/* 59:   */  }
/* 60:   */  
/* 61:   */  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
/* 62:   */  {
/* 63:63 */    doPost(req, resp);
/* 64:   */  }
/* 65:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.vincesu.framework.remote.servlet.filePreviewServlet
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
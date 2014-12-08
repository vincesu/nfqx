/*  1:   */package com.tornado.controller;
/*  2:   */
/*  3:   */import com.tornado.core.control.Content;
/*  4:   */import com.tornado.core.control.Controller;
/*  5:   */import com.tornado.core.view.View;
/*  6:   */import com.tornado.entity.Message;
/*  7:   */import com.tornado.persistence.PMF;
/*  8:   */import java.util.Date;
/*  9:   */
/* 10:   */public class MessageController
/* 11:   */  extends Controller
/* 12:   */{
/* 13:   */  public View leaveSuggestionMessage(Content content)
/* 14:   */    throws Exception
/* 15:   */  {
/* 16:16 */    return leaveMessage(content, 1);
/* 17:   */  }
/* 18:   */  
/* 19:   */  public View leavePraiseMessage(Content content) throws Exception
/* 20:   */  {
/* 21:21 */    return leaveMessage(content, 2);
/* 22:   */  }
/* 23:   */  
/* 24:   */  public View leaveMessage(Content content, int type)
/* 25:   */    throws Exception
/* 26:   */  {
/* 27:27 */    String author = null;String email = null;String contentStr = null;
/* 28:   */    
/* 29:29 */    if (content.getParameter("author") != null)
/* 30:30 */      author = new String(content.getParameter("author").getBytes("ISO-8859-1"), "utf8");
/* 31:31 */    if (content.getParameter("email") != null)
/* 32:32 */      email = new String(content.getParameter("email").getBytes("ISO-8859-1"), "utf8");
/* 33:33 */    if (content.getParameter("content") != null) {
/* 34:34 */      contentStr = new String(content.getParameter("content").getBytes("ISO-8859-1"), "utf8");
/* 35:   */    }
/* 36:36 */    Message message = new Message();
/* 37:37 */    message.setAuthor(author);
/* 38:38 */    message.setContent(contentStr);
/* 39:39 */    message.setDate(new Date());
/* 40:40 */    message.setType(Integer.valueOf(type));
/* 41:41 */    PMF.save(message);
/* 42:42 */    View view = new View("");
/* 43:43 */    return view;
/* 44:   */  }
/* 45:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.controller.MessageController
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
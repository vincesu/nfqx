/*  1:   */package com.tornado.service;
/*  2:   */
/*  3:   */import com.tornado.entity.BookingService;
/*  4:   */import com.tornado.persistence.PMF;
/*  5:   */import com.vincesu.framework.remote.RequestEntity;
/*  6:   */import com.vincesu.framework.remote.ResponseEntity;
/*  7:   */import com.vincesu.framework.util.BeanUtil;
/*  8:   */import com.vincesu.framework.util.QueryUtil;
/*  9:   */import java.util.Date;
/* 10:   */import java.util.List;
/* 11:   */import java.util.Map;
/* 12:   */
/* 13:   */public class ReservationService
/* 14:   */{
/* 15:   */  public ResponseEntity getReservationItem(RequestEntity req)
/* 16:   */  {
/* 17:17 */    ResponseEntity resp = null;
/* 18:   */    try
/* 19:   */    {
/* 20:20 */      return QueryUtil.queryBySQL(req, "select * from reservation_item where fid=:id", 
/* 21:21 */        new String[] { "id", "fid", "name", "description", "status", "type" }, 
/* 22:22 */        null, 
/* 23:23 */        null);
/* 24:   */    }
/* 25:   */    catch (Exception e)
/* 26:   */    {
/* 27:27 */      resp = new ResponseEntity();
/* 28:28 */      resp.setType(0);
/* 29:29 */      resp.setMessage(e.toString());
/* 30:   */    }
/* 31:31 */    return resp;
/* 32:   */  }
/* 33:   */  
/* 35:   */  public ResponseEntity queryBookingService(RequestEntity req)
/* 36:   */  {
/* 37:37 */    ResponseEntity resp = null;
/* 38:38 */    if ((((Map)req.getData().get(0)).get("username") == null) || 
/* 39:39 */      (((Map)req.getData().get(0)).get("username").equals("")) || 
/* 40:40 */      (((Map)req.getData().get(0)).get("contact") == null) || 
/* 41:41 */      (((Map)req.getData().get(0)).get("contact").equals(""))) {
/* 42:42 */      return new ResponseEntity();
/* 43:   */    }
/* 44:   */    try {
/* 45:45 */      return QueryUtil.queryBySQL(req, "select a.id,a.username,a.contact,a.brand,b.name diagnosis,a.displacement,a.model,a.year,a.status,a.remark,a.date from booking_service a,reservation_item b where a.diagnosis=b.id and a.username=':username' and contact=':contact' order by a.date desc ", 
/* 46:46 */        new String[] { "id", "username", "contact", "brand", "diagnosis", "displacement", "model", "year", "status", "remark", "date" }, 
/* 47:47 */        new String[] { "date" }, 
/* 48:48 */        new String[] { "yyyy-MM-dd" });
/* 49:   */    }
/* 50:   */    catch (Exception e)
/* 51:   */    {
/* 52:52 */      resp = new ResponseEntity();
/* 53:53 */      resp.setType(0);
/* 54:54 */      resp.setMessage(e.toString());
/* 55:   */    }
/* 56:56 */    return resp;
/* 57:   */  }
/* 58:   */  
/* 60:   */  public ResponseEntity addReservation(RequestEntity req)
/* 61:   */  {
/* 62:62 */    ResponseEntity resp = new ResponseEntity();
/* 63:   */    try
/* 64:   */    {
/* 65:65 */      Map map = (Map)req.getData().get(0);
/* 66:66 */      BookingService bs = new BookingService();
/* 67:67 */      BeanUtil.copyProperty(map, bs);
/* 68:68 */      bs.setStatus("1");
/* 69:69 */      bs.setDate(new Date());
/* 70:70 */      PMF.save(bs);
/* 71:   */    }
/* 72:   */    catch (Exception e)
/* 73:   */    {
/* 74:74 */      resp.setType(0);
/* 75:75 */      resp.setMessage(e.toString());
/* 76:   */    }
/* 77:77 */    return resp;
/* 78:   */  }
/* 79:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.service.ReservationService
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
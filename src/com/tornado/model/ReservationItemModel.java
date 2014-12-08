/*  1:   */package com.tornado.model;
/*  2:   */
/*  3:   */import com.tornado.entity.ReservationItem;
/*  4:   */import java.util.List;
/*  5:   */
/*  6:   */public class ReservationItemModel
/*  7:   */  extends AbstractModel<ReservationItem>
/*  8:   */{
/*  9:   */  public List<ReservationItem> getItem1()
/* 10:   */  {
/* 11:11 */    return list("from ReservationItem where type='1'");
/* 12:   */  }
/* 13:   */  
/* 14:   */  public List<ReservationItem> getItem2()
/* 15:   */  {
/* 16:16 */    return list("from ReservationItem where type='2'");
/* 17:   */  }
/* 18:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.model.ReservationItemModel
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
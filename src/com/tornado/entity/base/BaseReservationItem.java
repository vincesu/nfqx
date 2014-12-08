/*   1:    */package com.tornado.entity.base;
/*   2:    */
/*   3:    */import com.tornado.entity.ReservationItem;
/*   4:    */import java.io.Serializable;
/*   5:    */
/*  14:    */public abstract class BaseReservationItem
/*  15:    */  implements Serializable
/*  16:    */{
/*  17: 17 */  public static String REF = "ReservationItem";
/*  18: 18 */  public static String PROP_NAME = "Name";
/*  19: 19 */  public static String PROP_STATUS = "Status";
/*  20: 20 */  public static String PROP_DESCRIPTION = "Description";
/*  21: 21 */  public static String PROP_TYPE = "Type";
/*  22: 22 */  public static String PROP_FID = "Fid";
/*  23: 23 */  public static String PROP_ID = "Id";
/*  24:    */  
/*  26:    */  public BaseReservationItem()
/*  27:    */  {
/*  28: 28 */    initialize();
/*  29:    */  }
/*  30:    */  
/*  33:    */  public BaseReservationItem(Long id)
/*  34:    */  {
/*  35: 35 */    setId(id);
/*  36: 36 */    initialize();
/*  37:    */  }
/*  38:    */  
/*  43: 43 */  private int hashCode = -2147483648;
/*  44:    */  
/*  46:    */  private Long id;
/*  47:    */  
/*  48:    */  private Long fid;
/*  49:    */  
/*  50:    */  private String name;
/*  51:    */  
/*  52:    */  private String description;
/*  53:    */  
/*  54:    */  private String status;
/*  55:    */  
/*  56:    */  private String type;
/*  57:    */  
/*  59:    */  protected void initialize() {}
/*  60:    */  
/*  62:    */  public Long getId()
/*  63:    */  {
/*  64: 64 */    return this.id;
/*  65:    */  }
/*  66:    */  
/*  70:    */  public void setId(Long id)
/*  71:    */  {
/*  72: 72 */    this.id = id;
/*  73: 73 */    this.hashCode = -2147483648;
/*  74:    */  }
/*  75:    */  
/*  81:    */  public Long getFid()
/*  82:    */  {
/*  83: 83 */    return this.fid;
/*  84:    */  }
/*  85:    */  
/*  89:    */  public void setFid(Long fid)
/*  90:    */  {
/*  91: 91 */    this.fid = fid;
/*  92:    */  }
/*  93:    */  
/*  98:    */  public String getName()
/*  99:    */  {
/* 100:100 */    return this.name;
/* 101:    */  }
/* 102:    */  
/* 106:    */  public void setName(String name)
/* 107:    */  {
/* 108:108 */    this.name = name;
/* 109:    */  }
/* 110:    */  
/* 115:    */  public String getDescription()
/* 116:    */  {
/* 117:117 */    return this.description;
/* 118:    */  }
/* 119:    */  
/* 123:    */  public void setDescription(String description)
/* 124:    */  {
/* 125:125 */    this.description = description;
/* 126:    */  }
/* 127:    */  
/* 132:    */  public String getStatus()
/* 133:    */  {
/* 134:134 */    return this.status;
/* 135:    */  }
/* 136:    */  
/* 140:    */  public void setStatus(String status)
/* 141:    */  {
/* 142:142 */    this.status = status;
/* 143:    */  }
/* 144:    */  
/* 149:    */  public String getType()
/* 150:    */  {
/* 151:151 */    return this.type;
/* 152:    */  }
/* 153:    */  
/* 157:    */  public void setType(String type)
/* 158:    */  {
/* 159:159 */    this.type = type;
/* 160:    */  }
/* 161:    */  
/* 164:    */  public boolean equals(Object obj)
/* 165:    */  {
/* 166:166 */    if (obj == null) return false;
/* 167:167 */    if (!(obj instanceof ReservationItem)) { return false;
/* 168:    */    }
/* 169:169 */    ReservationItem reservationItem = (ReservationItem)obj;
/* 170:170 */    if ((getId() == null) || (reservationItem.getId() == null)) return false;
/* 171:171 */    return getId().equals(reservationItem.getId());
/* 172:    */  }
/* 173:    */  
/* 174:    */  public int hashCode()
/* 175:    */  {
/* 176:176 */    if (-2147483648 == this.hashCode) {
/* 177:177 */      if (getId() == null) { return super.hashCode();
/* 178:    */      }
/* 179:179 */      String hashStr = getClass().getName() + ":" + getId().hashCode();
/* 180:180 */      this.hashCode = hashStr.hashCode();
/* 181:    */    }
/* 182:    */    
/* 183:183 */    return this.hashCode;
/* 184:    */  }
/* 185:    */  
/* 186:    */  public String toString()
/* 187:    */  {
/* 188:188 */    return super.toString();
/* 189:    */  }
/* 190:    */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.entity.base.BaseReservationItem
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
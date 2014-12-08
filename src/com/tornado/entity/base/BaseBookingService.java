/*   1:    */package com.tornado.entity.base;
/*   2:    */
/*   3:    */import com.tornado.entity.BookingService;
/*   4:    */import java.io.Serializable;
/*   5:    */import java.util.Date;
/*   6:    */
/*  14:    */public abstract class BaseBookingService
/*  15:    */  implements Serializable
/*  16:    */{
/*  17: 17 */  public static String REF = "BookingService";
/*  18: 18 */  public static String PROP_STATUS = "Status";
/*  19: 19 */  public static String PROP_YEAR = "Year";
/*  20: 20 */  public static String PROP_DISPLACEMENT = "Displacement";
/*  21: 21 */  public static String PROP_BRAND = "Brand";
/*  22: 22 */  public static String PROP_MODEL = "Model";
/*  23: 23 */  public static String PROP_DIAGNOSIS = "Diagnosis";
/*  24: 24 */  public static String PROP_DATE = "Date";
/*  25: 25 */  public static String PROP_CONTACT = "Contact";
/*  26: 26 */  public static String PROP_USERNAME = "Username";
/*  27: 27 */  public static String PROP_RESERVED = "Reserved";
/*  28: 28 */  public static String PROP_ID = "Id";
/*  29: 29 */  public static String PROP_REMARK = "Remark";
/*  30:    */  
/*  32:    */  public BaseBookingService()
/*  33:    */  {
/*  34: 34 */    initialize();
/*  35:    */  }
/*  36:    */  
/*  39:    */  public BaseBookingService(Long id)
/*  40:    */  {
/*  41: 41 */    setId(id);
/*  42: 42 */    initialize();
/*  43:    */  }
/*  44:    */  
/*  49: 49 */  private int hashCode = -2147483648;
/*  50:    */  
/*  51:    */  private Long id;
/*  52:    */  
/*  53:    */  private String brand;
/*  54:    */  
/*  55:    */  private String contact;
/*  56:    */  
/*  57:    */  private Date date;
/*  58:    */  
/*  59:    */  private Long diagnosis;
/*  60:    */  
/*  61:    */  private String displacement;
/*  62:    */  
/*  63:    */  private String model;
/*  64:    */  
/*  65:    */  private String remark;
/*  66:    */  
/*  67:    */  private String reserved;
/*  68:    */  private String status;
/*  69:    */  private String username;
/*  70:    */  private String year;
/*  71:    */  
/*  72:    */  protected void initialize() {}
/*  73:    */  
/*  74:    */  public Long getId()
/*  75:    */  {
/*  76: 76 */    return this.id;
/*  77:    */  }
/*  78:    */  
/*  82:    */  public void setId(Long id)
/*  83:    */  {
/*  84: 84 */    this.id = id;
/*  85: 85 */    this.hashCode = -2147483648;
/*  86:    */  }
/*  87:    */  
/*  93:    */  public String getBrand()
/*  94:    */  {
/*  95: 95 */    return this.brand;
/*  96:    */  }
/*  97:    */  
/* 101:    */  public void setBrand(String brand)
/* 102:    */  {
/* 103:103 */    this.brand = brand;
/* 104:    */  }
/* 105:    */  
/* 110:    */  public String getContact()
/* 111:    */  {
/* 112:112 */    return this.contact;
/* 113:    */  }
/* 114:    */  
/* 118:    */  public void setContact(String contact)
/* 119:    */  {
/* 120:120 */    this.contact = contact;
/* 121:    */  }
/* 122:    */  
/* 127:    */  public Date getDate()
/* 128:    */  {
/* 129:129 */    return this.date;
/* 130:    */  }
/* 131:    */  
/* 135:    */  public void setDate(Date date)
/* 136:    */  {
/* 137:137 */    this.date = date;
/* 138:    */  }
/* 139:    */  
/* 144:    */  public Long getDiagnosis()
/* 145:    */  {
/* 146:146 */    return this.diagnosis;
/* 147:    */  }
/* 148:    */  
/* 152:    */  public void setDiagnosis(Long diagnosis)
/* 153:    */  {
/* 154:154 */    this.diagnosis = diagnosis;
/* 155:    */  }
/* 156:    */  
/* 161:    */  public String getDisplacement()
/* 162:    */  {
/* 163:163 */    return this.displacement;
/* 164:    */  }
/* 165:    */  
/* 169:    */  public void setDisplacement(String displacement)
/* 170:    */  {
/* 171:171 */    this.displacement = displacement;
/* 172:    */  }
/* 173:    */  
/* 178:    */  public String getModel()
/* 179:    */  {
/* 180:180 */    return this.model;
/* 181:    */  }
/* 182:    */  
/* 186:    */  public void setModel(String model)
/* 187:    */  {
/* 188:188 */    this.model = model;
/* 189:    */  }
/* 190:    */  
/* 195:    */  public String getRemark()
/* 196:    */  {
/* 197:197 */    return this.remark;
/* 198:    */  }
/* 199:    */  
/* 203:    */  public void setRemark(String remark)
/* 204:    */  {
/* 205:205 */    this.remark = remark;
/* 206:    */  }
/* 207:    */  
/* 212:    */  public String getReserved()
/* 213:    */  {
/* 214:214 */    return this.reserved;
/* 215:    */  }
/* 216:    */  
/* 220:    */  public void setReserved(String reserved)
/* 221:    */  {
/* 222:222 */    this.reserved = reserved;
/* 223:    */  }
/* 224:    */  
/* 229:    */  public String getStatus()
/* 230:    */  {
/* 231:231 */    return this.status;
/* 232:    */  }
/* 233:    */  
/* 237:    */  public void setStatus(String status)
/* 238:    */  {
/* 239:239 */    this.status = status;
/* 240:    */  }
/* 241:    */  
/* 246:    */  public String getUsername()
/* 247:    */  {
/* 248:248 */    return this.username;
/* 249:    */  }
/* 250:    */  
/* 254:    */  public void setUsername(String username)
/* 255:    */  {
/* 256:256 */    this.username = username;
/* 257:    */  }
/* 258:    */  
/* 263:    */  public String getYear()
/* 264:    */  {
/* 265:265 */    return this.year;
/* 266:    */  }
/* 267:    */  
/* 271:    */  public void setYear(String year)
/* 272:    */  {
/* 273:273 */    this.year = year;
/* 274:    */  }
/* 275:    */  
/* 278:    */  public boolean equals(Object obj)
/* 279:    */  {
/* 280:280 */    if (obj == null) return false;
/* 281:281 */    if (!(obj instanceof BookingService)) { return false;
/* 282:    */    }
/* 283:283 */    BookingService bookingService = (BookingService)obj;
/* 284:284 */    if ((getId() == null) || (bookingService.getId() == null)) return false;
/* 285:285 */    return getId().equals(bookingService.getId());
/* 286:    */  }
/* 287:    */  
/* 288:    */  public int hashCode()
/* 289:    */  {
/* 290:290 */    if (-2147483648 == this.hashCode) {
/* 291:291 */      if (getId() == null) { return super.hashCode();
/* 292:    */      }
/* 293:293 */      String hashStr = getClass().getName() + ":" + getId().hashCode();
/* 294:294 */      this.hashCode = hashStr.hashCode();
/* 295:    */    }
/* 296:    */    
/* 297:297 */    return this.hashCode;
/* 298:    */  }
/* 299:    */  
/* 300:    */  public String toString()
/* 301:    */  {
/* 302:302 */    return super.toString();
/* 303:    */  }
/* 304:    */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.entity.base.BaseBookingService
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
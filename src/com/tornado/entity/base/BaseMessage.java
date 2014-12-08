/*   1:    */package com.tornado.entity.base;
/*   2:    */
/*   3:    */import com.tornado.entity.Message;
/*   4:    */import java.io.Serializable;
/*   5:    */import java.util.Date;
/*   6:    */
/*  14:    */public abstract class BaseMessage
/*  15:    */  implements Serializable
/*  16:    */{
/*  17: 17 */  public static String REF = "Message";
/*  18: 18 */  public static String PROP_THE_ORDER = "TheOrder";
/*  19: 19 */  public static String PROP_DATE = "Date";
/*  20: 20 */  public static String PROP_TYPE = "Type";
/*  21: 21 */  public static String PROP_AUTHOR = "Author";
/*  22: 22 */  public static String PROP_RESERVED = "Reserved";
/*  23: 23 */  public static String PROP_ID = "Id";
/*  24: 24 */  public static String PROP_CONTENT = "Content";
/*  25: 25 */  public static String PROP_PERMISSIONS = "Permissions";
/*  26: 26 */  public static String PROP_TITLE = "Title";
/*  27: 27 */  public static String PROP_REPLYID = "Replyid";
/*  28:    */  
/*  30:    */  public BaseMessage()
/*  31:    */  {
/*  32: 32 */    initialize();
/*  33:    */  }
/*  34:    */  
/*  37:    */  public BaseMessage(Long id)
/*  38:    */  {
/*  39: 39 */    setId(id);
/*  40: 40 */    initialize();
/*  41:    */  }
/*  42:    */  
/*  47: 47 */  private int hashCode = -2147483648;
/*  48:    */  
/*  49:    */  private Long id;
/*  50:    */  
/*  51:    */  private String author;
/*  52:    */  
/*  53:    */  private String content;
/*  54:    */  
/*  55:    */  private Date date;
/*  56:    */  
/*  57:    */  private String permissions;
/*  58:    */  
/*  59:    */  private Long replyid;
/*  60:    */  
/*  61:    */  private String reserved;
/*  62:    */  
/*  63:    */  private Long theOrder;
/*  64:    */  
/*  65:    */  private String title;
/*  66:    */  private Integer type;
/*  67:    */  
/*  68:    */  protected void initialize() {}
/*  69:    */  
/*  70:    */  public Long getId()
/*  71:    */  {
/*  72: 72 */    return this.id;
/*  73:    */  }
/*  74:    */  
/*  78:    */  public void setId(Long id)
/*  79:    */  {
/*  80: 80 */    this.id = id;
/*  81: 81 */    this.hashCode = -2147483648;
/*  82:    */  }
/*  83:    */  
/*  89:    */  public String getAuthor()
/*  90:    */  {
/*  91: 91 */    return this.author;
/*  92:    */  }
/*  93:    */  
/*  97:    */  public void setAuthor(String author)
/*  98:    */  {
/*  99: 99 */    this.author = author;
/* 100:    */  }
/* 101:    */  
/* 106:    */  public String getContent()
/* 107:    */  {
/* 108:108 */    return this.content;
/* 109:    */  }
/* 110:    */  
/* 114:    */  public void setContent(String content)
/* 115:    */  {
/* 116:116 */    this.content = content;
/* 117:    */  }
/* 118:    */  
/* 123:    */  public Date getDate()
/* 124:    */  {
/* 125:125 */    return this.date;
/* 126:    */  }
/* 127:    */  
/* 131:    */  public void setDate(Date date)
/* 132:    */  {
/* 133:133 */    this.date = date;
/* 134:    */  }
/* 135:    */  
/* 140:    */  public String getPermissions()
/* 141:    */  {
/* 142:142 */    return this.permissions;
/* 143:    */  }
/* 144:    */  
/* 148:    */  public void setPermissions(String permissions)
/* 149:    */  {
/* 150:150 */    this.permissions = permissions;
/* 151:    */  }
/* 152:    */  
/* 157:    */  public Long getReplyid()
/* 158:    */  {
/* 159:159 */    return this.replyid;
/* 160:    */  }
/* 161:    */  
/* 165:    */  public void setReplyid(Long replyid)
/* 166:    */  {
/* 167:167 */    this.replyid = replyid;
/* 168:    */  }
/* 169:    */  
/* 174:    */  public String getReserved()
/* 175:    */  {
/* 176:176 */    return this.reserved;
/* 177:    */  }
/* 178:    */  
/* 182:    */  public void setReserved(String reserved)
/* 183:    */  {
/* 184:184 */    this.reserved = reserved;
/* 185:    */  }
/* 186:    */  
/* 191:    */  public Long getTheOrder()
/* 192:    */  {
/* 193:193 */    return this.theOrder;
/* 194:    */  }
/* 195:    */  
/* 199:    */  public void setTheOrder(Long theOrder)
/* 200:    */  {
/* 201:201 */    this.theOrder = theOrder;
/* 202:    */  }
/* 203:    */  
/* 208:    */  public String getTitle()
/* 209:    */  {
/* 210:210 */    return this.title;
/* 211:    */  }
/* 212:    */  
/* 216:    */  public void setTitle(String title)
/* 217:    */  {
/* 218:218 */    this.title = title;
/* 219:    */  }
/* 220:    */  
/* 225:    */  public Integer getType()
/* 226:    */  {
/* 227:227 */    return this.type;
/* 228:    */  }
/* 229:    */  
/* 233:    */  public void setType(Integer type)
/* 234:    */  {
/* 235:235 */    this.type = type;
/* 236:    */  }
/* 237:    */  
/* 240:    */  public boolean equals(Object obj)
/* 241:    */  {
/* 242:242 */    if (obj == null) return false;
/* 243:243 */    if (!(obj instanceof Message)) { return false;
/* 244:    */    }
/* 245:245 */    Message message = (Message)obj;
/* 246:246 */    if ((getId() == null) || (message.getId() == null)) return false;
/* 247:247 */    return getId().equals(message.getId());
/* 248:    */  }
/* 249:    */  
/* 250:    */  public int hashCode()
/* 251:    */  {
/* 252:252 */    if (-2147483648 == this.hashCode) {
/* 253:253 */      if (getId() == null) { return super.hashCode();
/* 254:    */      }
/* 255:255 */      String hashStr = getClass().getName() + ":" + getId().hashCode();
/* 256:256 */      this.hashCode = hashStr.hashCode();
/* 257:    */    }
/* 258:    */    
/* 259:259 */    return this.hashCode;
/* 260:    */  }
/* 261:    */  
/* 262:    */  public String toString()
/* 263:    */  {
/* 264:264 */    return super.toString();
/* 265:    */  }
/* 266:    */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.entity.base.BaseMessage
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
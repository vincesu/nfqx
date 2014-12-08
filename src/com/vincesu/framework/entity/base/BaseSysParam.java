/*   1:    */package com.vincesu.framework.entity.base;
/*   2:    */
/*   3:    */import com.vincesu.framework.entity.SysParam;
/*   4:    */import java.io.Serializable;
/*   5:    */
/*  14:    */public abstract class BaseSysParam
/*  15:    */  implements Serializable
/*  16:    */{
/*  17: 17 */  public static String REF = "SysParam";
/*  18: 18 */  public static String PROP_AVAILABLE = "Available";
/*  19: 19 */  public static String PROP_DESCRIPTION = "Description";
/*  20: 20 */  public static String PROP_VALUE = "Value";
/*  21: 21 */  public static String PROP_ID = "Id";
/*  22: 22 */  public static String PROP_CODE = "Code";
/*  23:    */  
/*  25:    */  public BaseSysParam()
/*  26:    */  {
/*  27: 27 */    initialize();
/*  28:    */  }
/*  29:    */  
/*  32:    */  public BaseSysParam(Long id)
/*  33:    */  {
/*  34: 34 */    setId(id);
/*  35: 35 */    initialize();
/*  36:    */  }
/*  37:    */  
/*  42: 42 */  private int hashCode = -2147483648;
/*  43:    */  
/*  45:    */  private Long id;
/*  46:    */  
/*  48:    */  private String code;
/*  49:    */  
/*  50:    */  private String value;
/*  51:    */  
/*  52:    */  private Integer available;
/*  53:    */  
/*  54:    */  private String description;
/*  55:    */  
/*  57:    */  protected void initialize() {}
/*  58:    */  
/*  60:    */  public Long getId()
/*  61:    */  {
/*  62: 62 */    return this.id;
/*  63:    */  }
/*  64:    */  
/*  68:    */  public void setId(Long id)
/*  69:    */  {
/*  70: 70 */    this.id = id;
/*  71: 71 */    this.hashCode = -2147483648;
/*  72:    */  }
/*  73:    */  
/*  79:    */  public String getCode()
/*  80:    */  {
/*  81: 81 */    return this.code;
/*  82:    */  }
/*  83:    */  
/*  87:    */  public void setCode(String code)
/*  88:    */  {
/*  89: 89 */    this.code = code;
/*  90:    */  }
/*  91:    */  
/*  96:    */  public String getValue()
/*  97:    */  {
/*  98: 98 */    return this.value;
/*  99:    */  }
/* 100:    */  
/* 104:    */  public void setValue(String value)
/* 105:    */  {
/* 106:106 */    this.value = value;
/* 107:    */  }
/* 108:    */  
/* 113:    */  public Integer getAvailable()
/* 114:    */  {
/* 115:115 */    return this.available;
/* 116:    */  }
/* 117:    */  
/* 121:    */  public void setAvailable(Integer available)
/* 122:    */  {
/* 123:123 */    this.available = available;
/* 124:    */  }
/* 125:    */  
/* 130:    */  public String getDescription()
/* 131:    */  {
/* 132:132 */    return this.description;
/* 133:    */  }
/* 134:    */  
/* 138:    */  public void setDescription(String description)
/* 139:    */  {
/* 140:140 */    this.description = description;
/* 141:    */  }
/* 142:    */  
/* 145:    */  public boolean equals(Object obj)
/* 146:    */  {
/* 147:147 */    if (obj == null) return false;
/* 148:148 */    if (!(obj instanceof SysParam)) { return false;
/* 149:    */    }
/* 150:150 */    SysParam sysParam = (SysParam)obj;
/* 151:151 */    if ((getId() == null) || (sysParam.getId() == null)) return false;
/* 152:152 */    return getId().equals(sysParam.getId());
/* 153:    */  }
/* 154:    */  
/* 155:    */  public int hashCode()
/* 156:    */  {
/* 157:157 */    if (-2147483648 == this.hashCode) {
/* 158:158 */      if (getId() == null) { return super.hashCode();
/* 159:    */      }
/* 160:160 */      String hashStr = getClass().getName() + ":" + getId().hashCode();
/* 161:161 */      this.hashCode = hashStr.hashCode();
/* 162:    */    }
/* 163:    */    
/* 164:164 */    return this.hashCode;
/* 165:    */  }
/* 166:    */  
/* 167:    */  public String toString()
/* 168:    */  {
/* 169:169 */    return super.toString();
/* 170:    */  }
/* 171:    */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.vincesu.framework.entity.base.BaseSysParam
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
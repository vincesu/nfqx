/*   1:    */package com.tornado.model;
/*   2:    */
/*   3:    */import com.tornado.persistence.PMF;
/*   4:    */import com.tornado.persistence.SessionFactoryHelper;
/*   5:    */import java.util.List;
/*   6:    */import java.util.Map;
/*   7:    */import org.hibernate.Query;
/*   8:    */import org.hibernate.Session;
/*   9:    */
/*  19:    */public abstract class AbstractModel<T>
/*  20:    */{
/*  21: 21 */  protected Class<T> entityClass = null;
/*  22:    */  
/*  23: 23 */  protected T entity = null;
/*  24:    */  
/*  26:    */  public AbstractModel()
/*  27:    */  {
/*  28: 28 */    this.entityClass = ((Class)((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
/*  29:    */  }
/*  30:    */  
/*  34:    */  public void save()
/*  35:    */  {
/*  36: 36 */    if (this.entity != null) {
/*  37: 37 */      PMF.save(this.entity);
/*  38:    */    }
/*  39:    */  }
/*  40:    */  
/*  43:    */  public void restore()
/*  44:    */  {
/*  45: 45 */    if (this.entity != null) {
/*  46: 46 */      PMF.restore(this.entity);
/*  47:    */    }
/*  48:    */  }
/*  49:    */  
/*  52:    */  public void modify()
/*  53:    */  {
/*  54: 54 */    if (this.entity != null) {
/*  55: 55 */      PMF.update(this.entity);
/*  56:    */    }
/*  57:    */  }
/*  58:    */  
/*  61:    */  public void remove()
/*  62:    */  {
/*  63: 63 */    if (this.entity != null) {
/*  64: 64 */      PMF.remove(this.entity);
/*  65:    */    }
/*  66:    */  }
/*  67:    */  
/*  71:    */  public void save(T entity)
/*  72:    */  {
/*  73: 73 */    PMF.save(entity);
/*  74:    */  }
/*  75:    */  
/*  80:    */  public void restore(T entity)
/*  81:    */  {
/*  82: 82 */    PMF.restore(entity);
/*  83:    */  }
/*  84:    */  
/*  89:    */  public void modify(T entity)
/*  90:    */  {
/*  91: 91 */    PMF.update(entity);
/*  92:    */  }
/*  93:    */  
/*  98:    */  public void remove(T entity)
/*  99:    */  {
/* 100:100 */    PMF.remove(entity);
/* 101:    */  }
/* 102:    */  
/* 107:    */  public Long count()
/* 108:    */  {
/* 109:109 */    String hql = "select count(*) from " + this.entityClass.getName();
/* 110:110 */    Query query = SessionFactoryHelper.getSession().createQuery(hql);
/* 111:111 */    List d = query.list();
/* 112:112 */    return (Long)d.get(0);
/* 113:    */  }
/* 114:    */  
/* 119:    */  public List<T> list()
/* 120:    */  {
/* 121:121 */    String hql = "from " + this.entityClass.getName();
/* 122:122 */    Query query = SessionFactoryHelper.getSession().createQuery(hql);
/* 123:123 */    return query.list();
/* 124:    */  }
/* 125:    */  
/* 132:    */  public List<T> listOrderBy(String[] fields, Boolean[] isAsc)
/* 133:    */  {
/* 134:134 */    if ((fields == null) || (fields.length == 0) || (fields.length != isAsc.length)) {
/* 135:135 */      return list();
/* 136:    */    }
/* 137:137 */    StringBuffer hql = new StringBuffer();
/* 138:138 */    hql.append("from ").append(this.entityClass.getName()).append(" order by ");
/* 139:139 */    for (int i = 0; i < fields.length; i++)
/* 140:    */    {
/* 141:141 */      hql.append(fields[i]).append(" ");
/* 142:142 */      if (isAsc[i].booleanValue()) {
/* 143:143 */        hql.append("asc");
/* 144:    */      } else
/* 145:145 */        hql.append("desc");
/* 146:146 */      hql.append(",");
/* 147:    */    }
/* 148:148 */    hql.deleteCharAt(hql.length() - 1);
/* 149:    */    
/* 150:150 */    Query query = SessionFactoryHelper.getSession().createQuery(hql.toString());
/* 151:    */    
/* 152:152 */    return query.list();
/* 153:    */  }
/* 154:    */  
/* 161:    */  public List<T> list(int start, int count)
/* 162:    */  {
/* 163:163 */    String hql = "from " + this.entityClass.getName();
/* 164:164 */    Query query = SessionFactoryHelper.getSession().createQuery(hql).setFirstResult(start).setMaxResults(count);
/* 165:165 */    return query.list();
/* 166:    */  }
/* 167:    */  
/* 173:    */  public List<T> list(String hql)
/* 174:    */  {
/* 175:175 */    return PMF.list(hql);
/* 176:    */  }
/* 177:    */  
/* 184:    */  public List<T> list(String hql, Map map)
/* 185:    */  {
/* 186:186 */    return PMF.list(hql, map);
/* 187:    */  }
/* 188:    */  
/* 197:    */  public List<T> list(String hql, Map map, int s, int c)
/* 198:    */  {
/* 199:199 */    return PMF.list(hql, map, s, c);
/* 200:    */  }
/* 201:    */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.model.AbstractModel
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
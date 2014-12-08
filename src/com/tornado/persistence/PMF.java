/*   1:    */package com.tornado.persistence;
/*   2:    */
/*   3:    */import java.io.PrintStream;
/*   4:    */import java.io.Serializable;
/*   5:    */import java.math.BigInteger;
/*   6:    */import java.util.Iterator;
/*   7:    */import java.util.List;
/*   8:    */import java.util.Map;
/*   9:    */import java.util.Set;
/*  10:    */import org.hibernate.Query;
/*  11:    */import org.hibernate.SQLQuery;
/*  12:    */import org.hibernate.Session;
/*  13:    */import org.hibernate.Transaction;
/*  14:    */import org.hibernate.jdbc.Work;
/*  15:    */
/*  20:    */public class PMF
/*  21:    */{
/*  22:    */  public static List get(String sql, Class[] entityClasses)
/*  23:    */  {
/*  24: 24 */    Session session = SessionFactoryHelper.getSession();
/*  25: 25 */    Transaction trans = null;
/*  26: 26 */    List result = null;
/*  27: 27 */    SQLQuery query = null;
/*  28:    */    try
/*  29:    */    {
/*  30: 30 */      trans = session.beginTransaction();
/*  31: 31 */      query = session.createSQLQuery(sql);
/*  32: 32 */      if (entityClasses != null)
/*  33:    */      {
/*  34: 34 */        query = session.createSQLQuery(sql);
/*  35: 35 */        for (Class c : entityClasses)
/*  36:    */        {
/*  37: 37 */          query.addEntity(c);
/*  38:    */        }
/*  39:    */      }
/*  40:    */      
/*  41: 41 */      result = query.list();
/*  42: 42 */      trans.commit();
/*  43:    */    }
/*  44:    */    catch (Exception e)
/*  45:    */    {
/*  46: 46 */      e.printStackTrace();
/*  47: 47 */      trans.rollback();
/*  49:    */    }
/*  50:    */    finally
/*  51:    */    {
/*  52: 52 */      session.close();
/*  53:    */    }
/*  54: 54 */    return result;
/*  55:    */  }
/*  56:    */  
/*  60:    */  public static List get(String sql, Class[] entityClasses, String[] alias)
/*  61:    */  {
/*  62: 62 */    Session session = SessionFactoryHelper.getSession();
/*  63: 63 */    Transaction trans = null;
/*  64: 64 */    List result = null;
/*  65: 65 */    SQLQuery query = null;
/*  66:    */    try
/*  67:    */    {
/*  68: 68 */      trans = session.beginTransaction();
/*  69: 69 */      query = session.createSQLQuery(sql);
/*  70: 70 */      if (entityClasses != null)
/*  71:    */      {
/*  72: 72 */        query = session.createSQLQuery(sql);
/*  73: 73 */        for (int i = 0; i < entityClasses.length; i++)
/*  74:    */        {
/*  75: 75 */          query.addEntity(alias[i], entityClasses[i]);
/*  76:    */        }
/*  77:    */      }
/*  78:    */      
/*  79: 79 */      result = query.list();
/*  80: 80 */      trans.commit();
/*  81:    */    }
/*  82:    */    catch (Exception e)
/*  83:    */    {
/*  84: 84 */      e.printStackTrace();
/*  85: 85 */      trans.rollback();
/*  87:    */    }
/*  88:    */    finally
/*  89:    */    {
/*  90: 90 */      session.close();
/*  91:    */    }
/*  92: 92 */    return result;
/*  93:    */  }
/*  94:    */  
/*  98:    */  public static List get(String sql)
/*  99:    */  {
/* 100:100 */    return get(sql, null);
/* 101:    */  }
/* 102:    */  
/* 103:    */  public static Object get(Class c, Object primaryKey)
/* 104:    */  {
/* 105:105 */    Session session = SessionFactoryHelper.getSession();
/* 106:106 */    Object result = null;
/* 107:    */    try
/* 108:    */    {
/* 109:109 */      return session.get(c, (Serializable)primaryKey);
/* 110:    */    }
/* 111:    */    catch (Exception e)
/* 112:    */    {
/* 113:113 */      return null;
/* 114:    */    }
/* 115:    */    finally
/* 116:    */    {
/* 117:117 */      session.close();
/* 118:    */    }
/* 119:    */  }
/* 120:    */  
/* 124:    */  public static <T> void save(T entity)
/* 125:    */  {
/* 126:126 */    Session session = SessionFactoryHelper.getSession();
/* 127:127 */    Transaction trans = null;
/* 128:    */    try
/* 129:    */    {
/* 130:130 */      trans = session.beginTransaction();
/* 131:131 */      session.save(entity);
/* 132:132 */      trans.commit();
/* 133:    */    }
/* 134:    */    catch (Exception e)
/* 135:    */    {
/* 136:136 */      e.printStackTrace();
/* 137:137 */      trans.rollback();
/* 139:    */    }
/* 140:    */    finally
/* 141:    */    {
/* 142:142 */      session.close();
/* 143:    */    }
/* 144:    */  }
/* 145:    */  
/* 149:    */  public static <T> void update(T entity)
/* 150:    */  {
/* 151:151 */    Session session = SessionFactoryHelper.getSession();
/* 152:152 */    Transaction trans = null;
/* 153:    */    try
/* 154:    */    {
/* 155:155 */      trans = session.beginTransaction();
/* 156:156 */      session.update(entity);
/* 157:157 */      trans.commit();
/* 158:    */    }
/* 159:    */    catch (Exception e)
/* 160:    */    {
/* 161:161 */      e.printStackTrace();
/* 162:162 */      trans.rollback();
/* 164:    */    }
/* 165:    */    finally
/* 166:    */    {
/* 167:167 */      session.close();
/* 168:    */    }
/* 169:    */  }
/* 170:    */  
/* 174:    */  public static <T> void restore(T entity)
/* 175:    */  {
/* 176:176 */    Session session = SessionFactoryHelper.getSession();
/* 177:177 */    Transaction trans = null;
/* 178:    */    try
/* 179:    */    {
/* 180:180 */      trans = session.beginTransaction();
/* 181:181 */      session.saveOrUpdate(entity);
/* 182:182 */      trans.commit();
/* 183:    */    }
/* 184:    */    catch (Exception e)
/* 185:    */    {
/* 186:186 */      e.printStackTrace();
/* 187:187 */      trans.rollback();
/* 189:    */    }
/* 190:    */    finally
/* 191:    */    {
/* 192:192 */      session.close();
/* 193:    */    }
/* 194:    */  }
/* 195:    */  
/* 199:    */  public static <T> void remove(T entity)
/* 200:    */  {
/* 201:201 */    Session session = SessionFactoryHelper.getSession();
/* 202:202 */    Transaction trans = null;
/* 203:    */    try
/* 204:    */    {
/* 205:205 */      trans = session.beginTransaction();
/* 206:    */      
/* 208:208 */      session.clear();
/* 209:209 */      session.delete(entity);
/* 210:210 */      trans.commit();
/* 211:    */    }
/* 212:    */    catch (Exception e)
/* 213:    */    {
/* 214:214 */      e.printStackTrace();
/* 215:215 */      trans.rollback();
/* 216:    */    }
/* 217:    */    finally
/* 218:    */    {
/* 219:219 */      session.close();
/* 220:    */    }
/* 221:    */  }
/* 222:    */  
/* 223:    */  public static <T> List<T> list(String hql)
/* 224:    */  {
/* 225:225 */    Query query = SessionFactoryHelper.getSession().createQuery(hql);
/* 226:226 */    return query.list();
/* 227:    */  }
/* 228:    */  
/* 229:    */  public static <T> List<T> list(String hql, Map<Object, Object> map)
/* 230:    */  {
/* 231:231 */    Query query = SessionFactoryHelper.getSession().createQuery(hql);
/* 232:232 */    Set<Object> key = map.keySet();
/* 233:233 */    for (Iterator it = key.iterator(); it.hasNext();)
/* 234:    */    {
/* 235:235 */      String s = (String)it.next();
/* 236:236 */      query.setParameter(s, map.get(s));
/* 237:    */    }
/* 238:238 */    return query.list();
/* 239:    */  }
/* 240:    */  
/* 241:    */  public static <T> List<T> list(String hql, Map<String, Object> map, int start, int count)
/* 242:    */  {
/* 243:243 */    Query query = SessionFactoryHelper.getSession().createQuery(hql);
/* 244:244 */    if (map != null)
/* 245:    */    {
/* 246:246 */      Set<String> key = map.keySet();
/* 247:247 */      for (Iterator it = key.iterator(); it.hasNext();)
/* 248:    */      {
/* 249:249 */        String s = (String)it.next();
/* 250:250 */        query.setParameter(s, map.get(s));
/* 251:    */      }
/* 252:    */    }
/* 253:253 */    query.setFirstResult(start).setMaxResults(count);
/* 254:254 */    return query.list();
/* 255:    */  }
/* 256:    */  
/* 257:    */  public static long count(String sql)
/* 258:    */  {
/* 259:259 */    StringBuffer queryStr = new StringBuffer();
/* 260:260 */    queryStr.append("select count(*) from (").append(sql).append(") t");
/* 261:261 */    Query query = SessionFactoryHelper.getSession().createSQLQuery(new String(queryStr));
/* 262:262 */    List d = query.list();
/* 263:263 */    return ((BigInteger)d.get(0)).longValue();
/* 264:    */  }
/* 265:    */  
/* 266:    */  public static void doWorkWithConnection(Work work)
/* 267:    */  {
/* 268:    */    try
/* 269:    */    {
/* 270:270 */      SessionFactoryHelper.getSession().doWork(work);
/* 271:    */    }
/* 272:    */    catch (Exception es)
/* 273:    */    {
/* 274:274 */      System.out.println(es.getMessage());
/* 275:    */    }
/* 276:    */  }
/* 277:    */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.persistence.PMF
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
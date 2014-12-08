/*  1:   */package com.tornado.persistence;
/*  2:   */
/*  3:   */import com.tornado.util.TimeUtil;
/*  4:   */import java.io.PrintStream;
/*  5:   */import org.hibernate.HibernateException;
/*  6:   */import org.hibernate.Session;
/*  7:   */import org.hibernate.SessionFactory;
/*  8:   */import org.hibernate.cfg.Configuration;
/*  9:   */import org.hibernate.service.ServiceRegistry;
/* 10:   */import org.hibernate.service.ServiceRegistryBuilder;
/* 11:   */
/* 12:   */public class SessionFactoryHelper
/* 13:   */{
/* 14:   */  private static final SessionFactory sessionFactory;
/* 15:   */  private static final ServiceRegistry serviceRegistry;
/* 16:16 */  private static final ThreadLocal session = new ThreadLocal();
/* 17:   */  
/* 24:   */  static
/* 25:   */  {
/* 26:   */    try
/* 27:   */    {
/* 28:28 */      Configuration configuration = new Configuration();
/* 29:29 */      configuration.configure();
/* 30:30 */      serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
/* 31:31 */      sessionFactory = configuration.buildSessionFactory(serviceRegistry);
/* 32:   */      
/* 33:33 */      TimeUtil.init();
/* 34:   */    }
/* 35:   */    catch (Throwable e) {
/* 36:36 */      System.err.println("Error in creating SessionFactory object." + 
/* 37:37 */        e.getMessage());
/* 38:38 */      throw new ExceptionInInitializerError(e);
/* 39:   */    }
/* 40:   */  }
/* 41:   */  
/* 45:   */  public static SessionFactory getSessionFactory()
/* 46:   */  {
/* 47:47 */    return sessionFactory;
/* 48:   */  }
/* 49:   */  
/* 50:   */  public static Session getSession()
/* 51:   */    throws HibernateException
/* 52:   */  {
/* 53:53 */    Session s = (Session)session.get();
/* 54:54 */    if ((s == null) || (!s.isOpen()))
/* 55:   */    {
/* 56:56 */      s = getSessionFactory().openSession();
/* 57:57 */      session.set(s);
/* 58:   */    }
/* 59:59 */    return s;
/* 60:   */  }
/* 61:   */  
/* 62:   */  public static void closeSession() throws HibernateException
/* 63:   */  {
/* 64:64 */    Session s = (Session)session.get();
/* 65:65 */    session.set(null);
/* 66:66 */    if (s != null)
/* 67:   */    {
/* 68:68 */      s.close();
/* 69:   */    }
/* 70:   */  }
/* 71:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.tornado.persistence.SessionFactoryHelper
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
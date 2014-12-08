/*  1:   */package com.vincesu.framework.util;
/*  2:   */
/*  3:   */import java.io.File;
/*  4:   */import java.io.FileInputStream;
/*  5:   */import java.io.FileOutputStream;
/*  6:   */import java.io.IOException;
/*  7:   */import java.io.InputStream;
/*  8:   */import java.io.OutputStream;
/*  9:   */
/* 12:   */public class PathUtil
/* 13:   */{
/* 14:   */  public static void write(InputStream is, OutputStream os)
/* 15:   */    throws IOException
/* 16:   */  {
/* 17:17 */    if ((is == null) || (os == null)) {
/* 18:18 */      return;
/* 19:   */    }
/* 20:20 */    byte[] bytes = new byte[1024];
/* 21:21 */    int index = is.read(bytes);
/* 22:22 */    while (-1 != index)
/* 23:   */    {
/* 24:24 */      os.write(bytes);
/* 25:25 */      index = is.read(bytes);
/* 26:   */    }
/* 27:   */  }
/* 28:   */  
/* 32:   */  public static void saveFile(FileInputStream fis, File file)
/* 33:   */    throws IOException
/* 34:   */  {
/* 35:35 */    FileOutputStream fos = null;
/* 36:   */    try
/* 37:   */    {
/* 38:38 */      if (fis == null) {
/* 39:39 */        return;
/* 40:   */      }
/* 41:41 */      fos = new FileOutputStream(file);
/* 42:42 */      byte[] bytes = new byte[1024];
/* 43:   */      
/* 44:   */      int len;
/* 45:45 */      while ((len = fis.read(bytes)) > 0) { 
/* 46:46 */        fos.write(bytes, 0, len);
/* 47:   */      }
/* 48:   */    }
/* 49:   */    finally
/* 50:   */    {
/* 51:51 */      if (fos != null)
/* 52:   */      {
/* 53:53 */        fos.flush();
/* 54:54 */        fos.close();
/* 55:   */      }
/* 56:   */    }
/* 57:51 */    if (fos != null)
/* 58:   */    {
/* 59:53 */      fos.flush();
/* 60:54 */      fos.close();
/* 61:   */    }
/* 62:   */  }
/* 63:   */  
/* 64:   */  public static void saveFile(FileInputStream fis, String path)
/* 65:   */    throws IOException
/* 66:   */  {
/* 67:61 */    File file = new File(path);
/* 68:62 */    saveFile(fis, file);
/* 69:   */  }
/* 70:   */  
/* 74:   */  public static String getExtensionName(String filename)
/* 75:   */  {
/* 76:70 */    if ((filename != null) && (filename.length() > 0))
/* 77:   */    {
/* 78:72 */      int dot = filename.lastIndexOf('.');
/* 79:73 */      if ((dot > -1) && (dot < filename.length() - 1))
/* 80:   */      {
/* 81:75 */        return filename.substring(dot + 1);
/* 82:   */      }
/* 83:   */    }
/* 84:78 */    return filename;
/* 85:   */  }
/* 86:   */  
/* 90:   */  public static String getFileNameNoEx(String filename)
/* 91:   */  {
/* 92:86 */    if ((filename != null) && (filename.length() > 0))
/* 93:   */    {
/* 94:88 */      int dot = filename.lastIndexOf('.');
/* 95:89 */      if ((dot > -1) && (dot < filename.length()))
/* 96:   */      {
/* 97:91 */        return filename.substring(0, dot);
/* 98:   */      }
/* 99:   */    }
/* 100:94 */    return filename;
/* 101:   */  }
/* 102:   */}


/* Location:           E:\MyDocument\classes\
 * Qualified Name:     com.vincesu.framework.util.PathUtil
 * JD-Core Version:    0.7.0-SNAPSHOT-20130630
 */
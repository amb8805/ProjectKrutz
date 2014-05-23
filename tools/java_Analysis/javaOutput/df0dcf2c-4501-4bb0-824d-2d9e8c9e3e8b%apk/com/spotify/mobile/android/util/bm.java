package com.spotify.mobile.android.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.Locale;

public final class bm
{
  private static final DateFormat a = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
  private static final Date b = new Date();
  private static Deque<bn> c = new ArrayDeque(50);

  public bm()
  {
  }

  public static String a()
  {
    StringBuilder localStringBuilder;
    try
    {
      localStringBuilder = new StringBuilder(1024);
      Iterator localIterator = c.iterator();
      while (localIterator.hasNext())
      {
        ((bn)localIterator.next()).a(localStringBuilder);
        localStringBuilder.append((char)'\n');
      }
    }
    finally
    {
    }
    String str = localStringBuilder.toString();
    return str;
  }

  private static void a(char paramChar, String paramString1, String paramString2, Throwable paramThrowable)
  {
    l = System.currentTimeMillis();
    try
    {
      if (c.size() == 50);
      for (bn localbn = (bn)c.removeFirst(); ; localbn = new bn((byte)0))
      {
        localbn.a(paramChar, paramString1, paramString2, paramThrowable, l);
        c.addLast(localbn);
        return;
      }
    }
    finally
    {
    }
  }

  public static void a(String paramString1, String paramString2)
  {
    a((char)'D', paramString1, paramString2, null);
  }

  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a((char)'D', paramString1, paramString2, paramThrowable);
  }

  public static void b(String paramString1, String paramString2)
  {
    a((char)'V', paramString1, paramString2, null);
  }

  public static void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a((char)'V', paramString1, paramString2, paramThrowable);
  }

  public static void c(String paramString1, String paramString2)
  {
    a((char)'I', paramString1, paramString2, null);
  }

  public static void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a((char)'I', paramString1, paramString2, paramThrowable);
  }

  public static void d(String paramString1, String paramString2)
  {
    a((char)'W', paramString1, paramString2, null);
  }

  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a((char)'W', paramString1, paramString2, paramThrowable);
  }

  public static void e(String paramString1, String paramString2)
  {
    a((char)'E', paramString1, paramString2, null);
  }

  public static void e(String paramString1, String paramString2, Throwable paramThrowable)
  {
    a((char)'E', paramString1, paramString2, paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

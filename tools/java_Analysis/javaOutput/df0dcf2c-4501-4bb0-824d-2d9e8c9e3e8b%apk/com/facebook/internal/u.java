package com.facebook.internal;

import com.facebook.LoggingBehavior;
import com.facebook.aa;
import java.util.HashMap;

public final class u
{
  private static final HashMap<String, String> a = new HashMap();
  private final LoggingBehavior b;
  private final String c;
  private StringBuilder d;
  private int e = 3;

  public u(LoggingBehavior paramLoggingBehavior, String paramString)
  {
    af.a(paramString, "tag");
    this.b = paramLoggingBehavior;
    this.c = ("FacebookSDK." + paramString);
    this.d = new StringBuilder();
  }

  public static void a()
  {
    aa.a();
  }

  public static void a(String paramString)
  {
    try
    {
      aa.a();
      a(paramString, "ACCESS_TOKEN_REMOVED");
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static void a(String paramString1, String paramString2)
  {
    try
    {
      a.put(paramString1, paramString2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void b()
  {
    aa.a();
  }

  public static void c()
  {
    aa.a();
  }

  private boolean e()
  {
    return aa.a();
  }

  public final void a(String paramString, Object paramObject)
  {
    Object[] arrayOfObject = { paramString, paramObject };
    if (e())
      this.d.append(String.format("  %s:\t%s\n", arrayOfObject));
  }

  public final void b(String paramString)
  {
    if (e())
      this.d.append(paramString);
  }

  public final void d()
  {
    aa.a();
    this.d = new StringBuilder();
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

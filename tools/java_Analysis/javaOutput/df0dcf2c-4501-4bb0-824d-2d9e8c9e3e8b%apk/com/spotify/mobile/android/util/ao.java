package com.spotify.mobile.android.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public final class ao
{
  private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
  private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss-SSS", Locale.US);

  public static String a()
  {
    try
    {
      String str = a(Calendar.getInstance());
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String a(Calendar paramCalendar)
  {
    try
    {
      cc.a(paramCalendar);
      String str = a.format(paramCalendar.getTime());
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String b()
  {
    try
    {
      String str = b(Calendar.getInstance());
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static String b(Calendar paramCalendar)
  {
    try
    {
      cc.a(paramCalendar);
      String str = b.format(paramCalendar.getTime());
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

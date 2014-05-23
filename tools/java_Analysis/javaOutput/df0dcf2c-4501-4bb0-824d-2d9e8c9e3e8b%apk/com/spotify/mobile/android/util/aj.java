package com.spotify.mobile.android.util;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.Log;
import com.spotify.mobile.android.c.a;
import com.spotify.mobile.android.c.c;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class aj
  implements a
{
  private String a = "";
  private long b = 0L;
  private long c = 0L;
  private String d = "java";
  private String e = "";
  private String f = "";
  private String g = "android";
  private String h = "";
  private long i = 0L;
  private String j = "";
  private String k = "spotify-android";
  private String l = "";
  private String m = "";
  private String n = "";
  private String o = "";
  private String p = "";

  public aj()
  {
  }

  private static String a(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    char[] arrayOfChar = paramString.toCharArray();
    int i1 = 0;
    if (i1 < arrayOfChar.length)
    {
      if ((i1 != 0) || (arrayOfChar[i1] != 'm'))
      {
        if ((i1 != 1) || (!Character.isUpperCase(arrayOfChar[i1])))
          break label64;
        localStringBuilder.append(Character.toLowerCase(arrayOfChar[i1]));
      }
      while (true)
      {
        i1++;
        break;
        label64: if (Character.isUpperCase(arrayOfChar[i1]))
        {
          localStringBuilder.append((char)'_');
          localStringBuilder.append(Character.toLowerCase(arrayOfChar[i1]));
        }
        else
        {
          localStringBuilder.append(arrayOfChar[i1]);
        }
      }
    }
    return localStringBuilder.toString();
  }

  private Map<String, String> a()
  {
    localHashMap = new HashMap();
    Field[] arrayOfField = getClass().getDeclaredFields();
    int i1 = arrayOfField.length;
    int i2 = 0;
    while (true)
      if (i2 < i1)
      {
        Field localField = arrayOfField[i2];
        try
        {
          localHashMap.put(a(localField.getName()), String.valueOf(localField.get(this)));
          label56: i2++;
          continue;
          return localHashMap;
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          break label56;
        }
      }
  }

  public final Map<String, String> a(cw paramcw, Throwable paramThrowable)
  {
    this.j = "1.0.1.981";
    this.i = 134742997L;
    long l1 = SystemClock.elapsedRealtime();
    long l2 = paramcw.a(ak.a, -1L);
    long l3;
    if (l2 != -1L)
    {
      cx localcx = paramcw.a();
      localcx.a(ak.a, -1L);
      localcx.a();
      l3 = l1 - l2;
      if (l3 <= 0L);
    }
    while (true)
    {
      this.c = l3;
      this.e = Locale.getDefault().getCountry();
      this.f = ((ap)c.a(ap.class)).e();
      this.h = UUID.randomUUID().toString();
      this.m = Build.MANUFACTURER;
      this.l = Build.MODEL;
      this.n = Build.VERSION.RELEASE;
      this.p = Log.getStackTraceString(paramThrowable);
      this.a = paramcw.a(ak.b, "no_user_info");
      this.b = System.currentTimeMillis();
      return a();
      l3 = -1L;
      continue;
      l3 = -1L;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

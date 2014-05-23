package com.spotify.mobile.android.util;

import android.os.Build.VERSION;
import com.spotify.mobile.android.c.c;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class bj
{
  public static void a(ViewUri.Verified paramVerified, ViewUri.SubView paramSubView, ClientEvent paramClientEvent)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Locale localLocale = Locale.US;
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = "ClientEvent";
    arrayOfObject[1] = Integer.valueOf(2);
    arrayOfObject[2] = paramVerified.toString();
    arrayOfObject[3] = paramSubView.toString();
    arrayOfObject[4] = paramClientEvent.a();
    arrayOfObject[5] = paramClientEvent.b();
    arrayOfObject[6] = paramClientEvent.d();
    localStringBuilder.append(String.format(localLocale, "%s\t%d\t%s\t%s\t%s\t%s\t%s\t\t\t", arrayOfObject));
    Iterator localIterator = paramClientEvent.c().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localStringBuilder.append((String)localEntry.getKey()).append(":").append((String)localEntry.getValue()).append(",");
    }
    a(localStringBuilder.toString());
  }

  public static void a(dw paramdw, long paramLong)
  {
    ap localap = (ap)c.a(ap.class);
    aq localaq = ap.j();
    Locale localLocale1 = Locale.US;
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = Build.VERSION.RELEASE;
    arrayOfObject1[1] = Integer.valueOf(ap.a());
    arrayOfObject1[2] = localaq.d;
    arrayOfObject1[3] = localaq.b;
    arrayOfObject1[4] = Double.valueOf(localap.d());
    String str1 = String.format(localLocale1, "Android OS %s API %d (%s, %s, %.1f)", arrayOfObject1);
    if (localap.f());
    for (String str2 = localap.g(); ; str2 = "00000000000000000000000000000000")
    {
      Locale localLocale2 = Locale.US;
      Object[] arrayOfObject2 = new Object[8];
      arrayOfObject2[0] = "ViewExternal";
      arrayOfObject2[1] = Integer.valueOf(1);
      arrayOfObject2[2] = paramdw.c();
      arrayOfObject2[3] = Long.valueOf(paramLong);
      arrayOfObject2[4] = paramdw.d();
      arrayOfObject2[5] = str1;
      c.a(ClientInfo.class);
      arrayOfObject2[6] = Integer.valueOf(0);
      arrayOfObject2[7] = str2;
      a(String.format(localLocale2, "%s\t%d\t%s\t%d\t%s\t%s\t%s\t%s\t", arrayOfObject2));
      return;
    }
  }

  private static void a(String paramString)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("m", paramString);
    cc.a("https://log.spotify.com".startsWith("https://"), "Doing insecure logging over HTTP and not HTTPS");
    m.a("https://log.spotify.com").a("", localHashMap, new bj.1());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

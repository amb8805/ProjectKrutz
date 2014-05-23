package com.mixpanel.android.mpmetrics;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

public final class l
{
  private static final Map<String, Map<Context, l>> k = new HashMap();
  private static final t l = new t();
  private static Future<SharedPreferences> m;
  private final Context a;
  private final a b;
  private final String c;
  private final p d;
  private final r e;
  private final Object f = new Object();
  private int g = -1;
  private Bitmap h;
  private int i;
  private final m j = new m((byte)0);

  private l(Context paramContext, Future<SharedPreferences> paramFuture, String paramString)
  {
    this.a = paramContext;
    this.c = paramString;
    this.d = new p(this, (byte)0);
    this.b = a.a(this.a);
    l.1 local1 = new l.1(this);
    this.e = new r(paramFuture, l.a(paramContext, "com.mixpanel.android.mpmetrics.MixpanelAPI_" + paramString, local1));
    if ((Build.VERSION.SDK_INT >= 14) && (j.a(this.a).k()) && ((this.a.getApplicationContext() instanceof Application)))
      ((Application)this.a.getApplicationContext()).registerActivityLifecycleCallbacks(new q(this));
  }

  public static l a(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramContext == null))
      return null;
    while (true)
    {
      Map localMap2;
      synchronized (k)
      {
        Context localContext = paramContext.getApplicationContext();
        if (m == null)
          m = l.a(paramContext, "com.mixpanel.android.mpmetrics.ReferralInfo", null);
        localMap2 = (Map)k.get(paramString);
        if (localMap2 == null)
        {
          HashMap localHashMap = new HashMap();
          k.put(paramString, localHashMap);
          localObject2 = localHashMap;
          l locall = (l)((Map)localObject2).get(localContext);
          if (locall == null)
          {
            locall = new l(localContext, m, paramString);
            ((Map)localObject2).put(localContext, locall);
          }
          return locall;
        }
      }
      Object localObject2 = localMap2;
    }
  }

  static void a(n paramn)
  {
    synchronized (k)
    {
      Iterator localIterator1 = k.values().iterator();
      while (localIterator1.hasNext())
      {
        Iterator localIterator2 = ((Map)localIterator1.next()).values().iterator();
        if (localIterator2.hasNext())
          paramn.a((l)localIterator2.next());
      }
    }
  }

  public final void a()
  {
    this.b.a();
  }

  public final void a(String paramString)
  {
    this.e.a(paramString);
  }

  public final void a(String paramString, JSONObject paramJSONObject)
  {
    JSONObject localJSONObject1;
    try
    {
      localJSONObject1 = new JSONObject();
      Iterator localIterator1 = this.e.b().entrySet().iterator();
      while (localIterator1.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator1.next();
        localJSONObject1.put((String)localEntry.getKey(), (String)localEntry.getValue());
      }
    }
    catch (JSONException localJSONException)
    {
      Log.e("MixpanelAPI", "Exception tracking event " + paramString, localJSONException);
      return;
    }
    JSONObject localJSONObject2 = this.e.a();
    Iterator localIterator2 = localJSONObject2.keys();
    while (localIterator2.hasNext())
    {
      String str2 = (String)localIterator2.next();
      localJSONObject1.put(str2, localJSONObject2.get(str2));
    }
    localJSONObject1.put("time", System.currentTimeMillis() / 1000L);
    localJSONObject1.put("distinct_id", this.e.c());
    Iterator localIterator3 = paramJSONObject.keys();
    while (localIterator3.hasNext())
    {
      String str1 = (String)localIterator3.next();
      localJSONObject1.put(str1, paramJSONObject.get(str1));
    }
    b localb = new b(paramString, localJSONObject1, this.c);
    this.b.a(localb);
  }

  public final o b()
  {
    return this.d;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.mpmetrics.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

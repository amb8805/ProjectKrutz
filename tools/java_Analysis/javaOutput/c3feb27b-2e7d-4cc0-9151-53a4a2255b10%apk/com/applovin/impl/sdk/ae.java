package com.applovin.impl.sdk;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.applovin.sdk.AppLovinLogger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class ae
{
  private final AppLovinSdkImpl a;
  private final Map b = new HashMap();

  ae(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    this.a = paramAppLovinSdkImpl;
  }

  void a()
  {
    synchronized (this.b)
    {
      this.b.clear();
      d();
      return;
    }
  }

  void a(String paramString)
  {
    a(paramString, 1L);
  }

  void a(String paramString, long paramLong)
  {
    synchronized (this.b)
    {
      Long localLong1 = (Long)this.b.get(paramString);
      if (localLong1 == null)
        localLong1 = Long.valueOf(0L);
      Long localLong2 = Long.valueOf(paramLong + localLong1.longValue());
      this.b.put(paramString, localLong2);
      d();
      return;
    }
  }

  long b(String paramString)
  {
    synchronized (this.b)
    {
      Long localLong = (Long)this.b.get(paramString);
      if (localLong == null)
        localLong = Long.valueOf(0L);
      long l = localLong.longValue();
      return l;
    }
  }

  JSONObject b()
  {
    JSONObject localJSONObject;
    synchronized (this.b)
    {
      localJSONObject = new JSONObject();
      Iterator localIterator = this.b.entrySet().iterator();
      if (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localJSONObject.put((String)localEntry.getKey(), localEntry.getValue());
      }
    }
    return localJSONObject;
  }

  void b(String paramString, long paramLong)
  {
    synchronized (this.b)
    {
      this.b.put(paramString, Long.valueOf(paramLong));
      d();
      return;
    }
  }

  void c()
  {
    String str1 = this.a.getSettingsManager().a().getString("stats", "{}");
    try
    {
      JSONObject localJSONObject = new JSONObject(str1);
      synchronized (this.b)
      {
        Iterator localIterator = localJSONObject.keys();
        while (true)
        {
          boolean bool = localIterator.hasNext();
          if (!bool)
            break;
          try
          {
            String str2 = (String)localIterator.next();
            long l = localJSONObject.getLong(str2);
            this.b.put(str2, Long.valueOf(l));
          }
          catch (JSONException localJSONException)
          {
          }
        }
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      this.a.getLogger().e("StatsManager", "Unable to load stats", localThrowable);
    }
  }

  void c(String paramString)
  {
    synchronized (this.b)
    {
      this.b.remove(paramString);
      d();
      return;
    }
  }

  void d()
  {
    try
    {
      SharedPreferences.Editor localEditor = this.a.getSettingsManager().a().edit();
      localEditor.putString("stats", b().toString());
      localEditor.commit();
      return;
    }
    catch (JSONException localJSONException)
    {
      this.a.getLogger().e("StatsManager", "Unable to save stats", localJSONException);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

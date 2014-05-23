package com.applovin.impl.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class ac
{
  private final AppLovinSdkImpl a;
  private final AppLovinLogger b;
  private final Context c;
  private final Object[] d = new Object[z.b()];

  ac(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this.a = paramAppLovinSdkImpl;
    this.b = paramAppLovinSdkImpl.getLogger();
    this.c = paramAppLovinSdkImpl.getApplicationContext();
  }

  private static ab a(String paramString)
  {
    Iterator localIterator = z.a().iterator();
    while (localIterator.hasNext())
    {
      ab localab = (ab)localIterator.next();
      if (localab.b().equals(paramString))
        return localab;
    }
    return null;
  }

  private static Object a(String paramString, JSONObject paramJSONObject, Object paramObject)
  {
    if ((paramObject instanceof Boolean))
      return Boolean.valueOf(paramJSONObject.getBoolean(paramString));
    if ((paramObject instanceof Float))
      return Float.valueOf((float)paramJSONObject.getDouble(paramString));
    if ((paramObject instanceof Integer))
      return Integer.valueOf(paramJSONObject.getInt(paramString));
    if ((paramObject instanceof Long))
      return Long.valueOf(paramJSONObject.getLong(paramString));
    if ((paramObject instanceof String))
      return paramJSONObject.getString(paramString);
    throw new RuntimeException("SDK Error: unknown value type: " + paramObject.getClass());
  }

  private String e()
  {
    return "com.applovin.sdk." + bg.a(this.a.getSdkKey()) + ".";
  }

  public SharedPreferences a()
  {
    if (this.c == null)
      throw new IllegalArgumentException("No context specified");
    return this.c.getSharedPreferences("com.applovin.sdk.1", 0);
  }

  public Object a(ab paramab)
  {
    if (paramab == null)
      throw new IllegalArgumentException("No setting type specified");
    synchronized (this.d)
    {
      Object localObject2 = this.d[paramab.a()];
      if (localObject2 != null)
      {
        localObject3 = paramab.a(localObject2);
        return localObject3;
      }
      Object localObject3 = paramab.c();
    }
  }

  public void a(ab paramab, Object paramObject)
  {
    if (paramab == null)
      throw new IllegalArgumentException("No setting type specified");
    if (paramObject == null)
      throw new IllegalArgumentException("No new value specified");
    synchronized (this.d)
    {
      this.d[paramab.a()] = paramObject;
      this.b.d("SettingsManager", "Setting update: " + paramab.b() + " set to \"" + paramObject + "\"");
      return;
    }
  }

  void a(AppLovinSdkSettings paramAppLovinSdkSettings)
  {
    long l1 = 0L;
    this.b.i("SettingsManager", "Loading user-defined settings...");
    if (paramAppLovinSdkSettings == null)
      return;
    while (true)
    {
      long l2;
      synchronized (this.d)
      {
        this.d[z.l.a()] = Boolean.valueOf(paramAppLovinSdkSettings.isVerboseLoggingEnabled());
        l2 = paramAppLovinSdkSettings.getBannerAdRefreshSeconds();
        if (l2 >= l1)
        {
          if (l2 > l1)
            l1 = Math.max(30L, l2);
          this.d[z.E.a()] = Long.valueOf(l1);
          this.d[z.D.a()] = Boolean.valueOf(true);
          this.d[z.N.a()] = paramAppLovinSdkSettings.getAutoPreloadSizes();
          if (!(paramAppLovinSdkSettings instanceof x))
            break;
          Iterator localIterator = ((x)paramAppLovinSdkSettings).b().entrySet().iterator();
          if (!localIterator.hasNext())
            break;
          Map.Entry localEntry = (Map.Entry)localIterator.next();
          this.d[((ab)localEntry.getKey()).a()] = localEntry.getValue();
        }
      }
      if (l2 == -1L)
        this.d[z.D.a()] = Boolean.valueOf(false);
    }
  }

  void a(JSONObject paramJSONObject)
  {
    this.b.d("SettingsManager", "Loading settings from JSON array...");
    String str;
    while (true)
      synchronized (this.d)
      {
        Iterator localIterator = paramJSONObject.keys();
        if (!localIterator.hasNext())
          break;
        str = (String)localIterator.next();
        if (str != null)
        {
          int i = str.length();
          if (i > 0)
            try
            {
              ab localab = a(str);
              if (localab != null)
              {
                Object localObject2 = a(str, paramJSONObject, localab.c());
                this.d[localab.a()] = localObject2;
                this.b.d("SettingsManager", "Setting update: " + localab.b() + " set to \"" + localObject2 + "\"");
              }
            }
            catch (JSONException localJSONException)
            {
              this.b.e("SettingsManager", "Unable to parse JSON settings array", localJSONException);
              continue;
              localObject1 = finally;
              throw localObject1;
              this.b.w("SettingsManager", "Unknown setting recieved: " + str);
            }
            catch (Throwable localThrowable)
            {
              this.b.e("SettingsManager", "Unable to convert setting object ", localThrowable);
            }
        }
      }
  }

  void b()
  {
    if (this.c == null)
      throw new IllegalArgumentException("No context specified");
    this.b.i("SettingsManager", "Saving settings with the application...");
    String str1 = e();
    SharedPreferences.Editor localEditor = a().edit();
    while (true)
    {
      Object localObject2;
      String str2;
      synchronized (this.d)
      {
        Iterator localIterator = z.a().iterator();
        if (!localIterator.hasNext())
          break;
        ab localab = (ab)localIterator.next();
        localObject2 = this.d[localab.a()];
        if (localObject2 == null)
          continue;
        str2 = str1 + localab.b();
        if ((localObject2 instanceof Boolean))
          localEditor.putBoolean(str2, ((Boolean)localObject2).booleanValue());
      }
      if ((localObject2 instanceof Float))
        localEditor.putFloat(str2, ((Float)localObject2).floatValue());
      else if ((localObject2 instanceof Integer))
        localEditor.putInt(str2, ((Integer)localObject2).intValue());
      else if ((localObject2 instanceof Long))
        localEditor.putLong(str2, ((Long)localObject2).longValue());
      else if ((localObject2 instanceof String))
        localEditor.putString(str2, (String)localObject2);
      else
        throw new RuntimeException("SDK Error: unknown value: " + localObject2.getClass());
    }
    localEditor.commit();
    this.b.d("SettingsManager", "Settings saved with the application.");
  }

  void c()
  {
    if (this.c == null)
      throw new IllegalArgumentException("No context specified");
    this.b.i("SettingsManager", "Loading settings saved with the application...");
    String str1 = e();
    SharedPreferences localSharedPreferences = a();
    while (true)
    {
      ab localab;
      String str2;
      Object localObject2;
      Object localObject3;
      synchronized (this.d)
      {
        Iterator localIterator = z.a().iterator();
        if (!localIterator.hasNext())
          break;
        localab = (ab)localIterator.next();
        try
        {
          str2 = str1 + localab.b();
          localObject2 = localab.c();
          if ((localObject2 instanceof Boolean))
          {
            localObject3 = Boolean.valueOf(localSharedPreferences.getBoolean(str2, ((Boolean)localObject2).booleanValue()));
            this.d[localab.a()] = localObject3;
          }
        }
        catch (Exception localException)
        {
          this.b.e("SettingsManager", "Unable to load \"" + localab.b() + "\"", localException);
        }
      }
      if ((localObject2 instanceof Float))
        localObject3 = Float.valueOf(localSharedPreferences.getFloat(str2, ((Float)localObject2).floatValue()));
      else if ((localObject2 instanceof Integer))
        localObject3 = Integer.valueOf(localSharedPreferences.getInt(str2, ((Integer)localObject2).intValue()));
      else if ((localObject2 instanceof Long))
        localObject3 = Long.valueOf(localSharedPreferences.getLong(str2, ((Long)localObject2).longValue()));
      else if ((localObject2 instanceof String))
        localObject3 = localSharedPreferences.getString(str2, (String)localObject2);
      else
        throw new RuntimeException("SDK Error: unknown value: " + localObject2.getClass());
    }
  }

  void d()
  {
    synchronized (this.d)
    {
      Arrays.fill(this.d, null);
      SharedPreferences.Editor localEditor = a().edit();
      localEditor.clear();
      localEditor.commit();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

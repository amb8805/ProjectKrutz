package com.applovin.impl.sdk;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.applovin.sdk.AppLovinLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.Map;;

class a
{
  private static final Map a = new HashMap();

  static Map a(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    return a("ad_data_cache", paramAppLovinSdkImpl);
  }

  private static Map a(String paramString, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    Map localMap2;
    SharedPreferences localSharedPreferences;
    Object localObject2;
    synchronized (a)
    {
      localMap2 = (Map)a.get(paramString);
      if (localMap2 == null)
      {
        localSharedPreferences = paramAppLovinSdkImpl.getSettingsManager().a();
        String str = localSharedPreferences.getString(paramString, "");
        if ((str != null) && (str.length() > 0))
          try
          {
            localObject2 = new HashMap();
            try
            {
              arrayOfString = str.split("&");
              i = arrayOfString.length;
              j = 0;
              while (j < i)
              {
                a(arrayOfString[j], (Map)localObject2);
                j++;
                continue;
                localObject1 = finally;
                throw localObject1;
              }
              synchronized (a)
              {
                a.put(paramString, localObject2);
                paramAppLovinSdkImpl.getLogger().d("AdDataCache", ((Map)localObject2).size() + " " + paramString + " entries loaded from cache");
                if (localObject2 == null)
                  break label254;
                return new HashMap((Map)localObject2);
              }
            }
            catch (Exception localException1)
            {
            }
            while (true)
            {
              paramAppLovinSdkImpl.getLogger().e("AdDataCache", "Unable to load ad data", localException1);
              localEditor = localSharedPreferences.edit();
              localEditor.putString(paramString, "");
              localEditor.commit();
            }
            return new HashMap();
          }
          catch (Exception localException2)
          {
            while (true)
            {
              localObject2 = localMap2;
              localObject3 = localException2;
            }
          }
      }
    }
    while (true)
    {
      String[] arrayOfString;
      int i;
      int j;
      SharedPreferences.Editor localEditor;
      label254: Object localObject3;
      localObject2 = localMap2;
    }
  }

  private static void a(String paramString, Map paramMap)
  {
    String[] arrayOfString = paramString.split("=");
    if (arrayOfString.length == 2)
      paramMap.put(arrayOfString[0], arrayOfString[1]);
  }

  static void a(Map paramMap, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    a(paramMap, "ad_data_cache", paramAppLovinSdkImpl);
  }

  private static void a(Map paramMap, String paramString, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramMap == null)
      throw new IllegalArgumentException("No ad aata specified");
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    try
    {
      synchronized (a)
      {
        Object localObject2 = (Map)a.get(paramString);
        if (localObject2 == null)
          localObject2 = new HashMap();
        ((Map)localObject2).clear();
        ((Map)localObject2).putAll(paramMap);
        a.put(paramString, localObject2);
        SharedPreferences.Editor localEditor = paramAppLovinSdkImpl.getSettingsManager().a().edit();
        localEditor.putString(paramString, bg.a(paramMap));
        localEditor.commit();
        paramAppLovinSdkImpl.getLogger().d("AdDataCache", paramMap.size() + " " + paramString + " entries saved in cache");
        return;
      }
    }
    catch (Exception localException)
    {
      paramAppLovinSdkImpl.getLogger().e("AdDataCache", "Unable to save ad data entries", localException);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

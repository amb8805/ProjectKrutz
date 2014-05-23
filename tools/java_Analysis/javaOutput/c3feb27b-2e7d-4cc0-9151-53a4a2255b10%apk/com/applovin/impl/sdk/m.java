package com.applovin.impl.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.applovin.sdk.AppLovinLogger;
import java.io.InputStream;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class m
{
  private static final int[] a = { 7, 4, 2, 1, 11 };
  private static final int[] b = { 5, 6, 10, 3, 9, 8, 14 };
  private static final int[] c = { 15, 12, 13 };
  private static final String d = m.class.getSimpleName();

  public m()
  {
  }

  private static NetworkInfo a(Context paramContext)
  {
    if (n.a("android.permission.ACCESS_NETWORK_STATE", paramContext))
    {
      ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (localConnectivityManager != null)
        return localConnectivityManager.getActiveNetworkInfo();
    }
    return null;
  }

  static String a(AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    NetworkInfo localNetworkInfo = a(paramAppLovinSdkImpl.getApplicationContext());
    if (localNetworkInfo != null)
    {
      int i;
      int j;
      label30: String str;
      if (localNetworkInfo != null)
      {
        i = localNetworkInfo.getType();
        if (localNetworkInfo == null)
          break label98;
        j = localNetworkInfo.getSubtype();
        if (i != 1)
          break label103;
        str = "wifi";
      }
      while (true)
      {
        paramAppLovinSdkImpl.getLogger().d(d, "Network " + i + "/" + j + " resolved to " + str);
        return str;
        i = 2147483647;
        break;
        label98: j = 0;
        break label30;
        label103: if (i == 0)
        {
          if (a(j, a))
            str = "2g";
          else if (a(j, b))
            str = "3g";
          else if (a(j, c))
            str = "4g";
          else
            str = "mobile";
        }
        else
          str = "unknown";
      }
    }
    return "unknown";
  }

  static String a(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      return null;
    Scanner localScanner = new Scanner(paramInputStream);
    StringBuffer localStringBuffer = new StringBuffer();
    while (localScanner.hasNextLine())
      localStringBuffer.append(localScanner.nextLine());
    return localStringBuffer.toString();
  }

  static String a(String paramString, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramString == null)
      throw new IllegalArgumentException("No endpoint specified");
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    String str = (String)paramAppLovinSdkImpl.a(z.f);
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append((String)paramAppLovinSdkImpl.a(z.m));
    localStringBuffer.append(paramString);
    if ((str != null) && (str.length() > 0))
    {
      localStringBuffer.append("?device_token=");
      localStringBuffer.append(str);
    }
    while (true)
    {
      return localStringBuffer.toString();
      localStringBuffer.append("?api_key=");
      localStringBuffer.append(paramAppLovinSdkImpl.getSdkKey());
    }
  }

  static JSONObject a(JSONObject paramJSONObject)
  {
    return (JSONObject)paramJSONObject.getJSONArray("results").get(0);
  }

  static void a(int paramInt, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    ac localac = paramAppLovinSdkImpl.getSettingsManager();
    if (paramInt == 401)
    {
      localac.a(z.c, "");
      localac.a(z.f, "");
      localac.a(z.o, Long.valueOf(0L));
      localac.b();
    }
    do
    {
      return;
      if (paramInt == 418)
      {
        localac.a(z.a, Boolean.valueOf(true));
        localac.b();
        return;
      }
      if ((paramInt >= 400) && (paramInt < 500))
      {
        paramAppLovinSdkImpl.f();
        return;
      }
    }
    while (paramInt != 0);
    paramAppLovinSdkImpl.f();
  }

  static void a(JSONObject paramJSONObject, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramJSONObject == null)
      throw new IllegalArgumentException("No response specified");
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    try
    {
      if (paramJSONObject.has("settings"))
      {
        ac localac = paramAppLovinSdkImpl.getSettingsManager();
        localac.a(paramJSONObject.getJSONObject("settings"));
        localac.b();
        paramAppLovinSdkImpl.getLogger().d(d, "New settings processed");
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      paramAppLovinSdkImpl.getLogger().e(d, "Unable to parse settings out of API response", localJSONException);
    }
  }

  private static boolean a(int paramInt, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt.length;
    for (int j = 0; ; j++)
    {
      boolean bool = false;
      if (j < i)
      {
        if (paramArrayOfInt[j] == paramInt)
          bool = true;
      }
      else
        return bool;
    }
  }

  static String b(String paramString, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramString == null)
      throw new IllegalArgumentException("No endpoint specified");
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append((String)paramAppLovinSdkImpl.a(z.n));
    localStringBuffer.append(paramString);
    return localStringBuffer.toString();
  }

  static void b(int paramInt, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramInt == 418)
    {
      ac localac = paramAppLovinSdkImpl.getSettingsManager();
      localac.a(z.a, Boolean.valueOf(true));
      localac.b();
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

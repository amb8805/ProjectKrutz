package com.applovin.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;

public class AppLovinSdkUtils
{
  public AppLovinSdkUtils()
  {
  }

  public static long getAdRefreshSeconds(Context paramContext)
  {
    Bundle localBundle = retrieveMetadata(paramContext);
    if (localBundle != null)
      return localBundle.getInt("applovin.sdk.ad_refresh_seconds", -100);
    return -100L;
  }

  public static String getAutoPreloadSizes(Context paramContext)
  {
    Bundle localBundle = retrieveMetadata(paramContext);
    if (localBundle != null)
    {
      String str = localBundle.getString("applovin.sdk.auto_preload_ad_sizes");
      if (str != null)
        return str;
    }
    return "BANNER,INTER";
  }

  public static boolean isVerboseLoggingEnabled(Context paramContext)
  {
    Bundle localBundle = retrieveMetadata(paramContext);
    boolean bool = false;
    if (localBundle != null)
      bool = localBundle.getBoolean("applovin.sdk.verbose_logging", false);
    return bool;
  }

  protected static Bundle retrieveMetadata(Context paramContext)
  {
    try
    {
      Bundle localBundle = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128).metaData;
      return localBundle;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      Log.e("AppLovinSdk", "Unable to retrieve application metadata", localNameNotFoundException);
    }
    return null;
  }

  public static String retrieveSdkKey(Context paramContext)
  {
    Bundle localBundle = retrieveMetadata(paramContext);
    if (localBundle != null)
    {
      String str = localBundle.getString("applovin.sdk.key");
      if (str != null)
        return str;
      return "";
    }
    return null;
  }

  public static AppLovinSdkSettings retrieveUserSettings(Context paramContext)
  {
    AppLovinSdkSettings localAppLovinSdkSettings = new AppLovinSdkSettings();
    localAppLovinSdkSettings.setVerboseLogging(isVerboseLoggingEnabled(paramContext));
    localAppLovinSdkSettings.setBannerAdRefreshSeconds(getAdRefreshSeconds(paramContext));
    localAppLovinSdkSettings.setAutoPreloadSizes(getAutoPreloadSizes(paramContext));
    return localAppLovinSdkSettings;
  }
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinSdkUtils
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

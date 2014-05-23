package com.applovin.sdk;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.AppLovinSdkImpl;

public abstract class AppLovinSdk
{
  public static final String URI_HOST = "com.applovin.sdk";
  public static final String URI_SCHEME = "applovin";
  public static final String VERSION = "5.2.2";
  private static AppLovinSdk[] a = new AppLovinSdk[0];
  private static final Object b = new Object();

  public AppLovinSdk()
  {
  }

  public static AppLovinSdk getInstance(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("No context specified");
    return getInstance(AppLovinSdkUtils.retrieveSdkKey(paramContext), AppLovinSdkUtils.retrieveUserSettings(paramContext), paramContext);
  }

  public static AppLovinSdk getInstance(AppLovinSdkSettings paramAppLovinSdkSettings, Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("No context specified");
    return getInstance(AppLovinSdkUtils.retrieveSdkKey(paramContext), paramAppLovinSdkSettings, paramContext);
  }

  public static AppLovinSdk getInstance(String paramString, AppLovinSdkSettings paramAppLovinSdkSettings, Context paramContext)
  {
    while (true)
    {
      int j;
      synchronized (b)
      {
        if ((a.length == 1) && (a[0].getSdkKey().equals(paramString)))
        {
          AppLovinSdk localAppLovinSdk2 = a[0];
          return localAppLovinSdk2;
        }
        AppLovinSdk[] arrayOfAppLovinSdk1 = a;
        int i = arrayOfAppLovinSdk1.length;
        j = 0;
        if (j >= i)
          break;
        AppLovinSdk localAppLovinSdk1 = arrayOfAppLovinSdk1[j];
        if (localAppLovinSdk1.getSdkKey().equals(paramString))
          return localAppLovinSdk1;
      }
      j++;
    }
    try
    {
      AppLovinSdkImpl localAppLovinSdkImpl = new AppLovinSdkImpl();
      localAppLovinSdkImpl.initialize(paramString, paramAppLovinSdkSettings, paramContext.getApplicationContext());
      AppLovinSdk[] arrayOfAppLovinSdk2 = new AppLovinSdk[1 + a.length];
      System.arraycopy(a, 0, arrayOfAppLovinSdk2, 0, a.length);
      arrayOfAppLovinSdk2[a.length] = localAppLovinSdkImpl;
      a = arrayOfAppLovinSdk2;
      return localAppLovinSdkImpl;
    }
    catch (Throwable localThrowable)
    {
      Log.e("AppLovinSdk", "Failed to create AppLovin SDK. Try cleaning application data and starting the applion again.", localThrowable);
    }
    throw new RuntimeException("Unable to create AppLovin SDK");
  }

  public static void initializeSdk(Context paramContext)
  {
    if (paramContext == null)
      throw new IllegalArgumentException("No context specified");
    AppLovinSdk localAppLovinSdk = getInstance(paramContext);
    if (localAppLovinSdk != null)
    {
      localAppLovinSdk.initializeSdk();
      return;
    }
    Log.e("AppLovinSdk", "Unable to initialize AppLovin SDK: SDK object not created");
  }

  public abstract AppLovinAdService getAdService();

  public abstract Context getApplicationContext();

  public abstract AppLovinEventService getEventService();

  public abstract AppLovinLogger getLogger();

  public abstract String getSdkKey();

  public abstract AppLovinSdkSettings getSettings();

  public abstract AppLovinTargetingData getTargetingData();

  public abstract boolean hasCriticalErrors();

  protected abstract void initialize(String paramString, AppLovinSdkSettings paramAppLovinSdkSettings, Context paramContext);

  public abstract void initializeSdk();

  public abstract boolean isEnabled();

  public abstract void setPluginVersion(String paramString);
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinSdk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

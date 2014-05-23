package com.applovin.sdk;

public abstract interface AppLovinLogger
{
  public static final String SDK_TAG = "AppLovinSdk";

  public abstract void d(String paramString1, String paramString2);

  public abstract void e(String paramString1, String paramString2);

  public abstract void e(String paramString1, String paramString2, Throwable paramThrowable);

  public abstract void i(String paramString1, String paramString2);

  public abstract void userError(String paramString1, String paramString2);

  public abstract void userError(String paramString1, String paramString2, Throwable paramThrowable);

  public abstract void w(String paramString1, String paramString2);

  public abstract void w(String paramString1, String paramString2, Throwable paramThrowable);
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinLogger
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

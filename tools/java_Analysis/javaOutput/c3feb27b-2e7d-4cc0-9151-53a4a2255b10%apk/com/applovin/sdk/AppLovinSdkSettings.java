package com.applovin.sdk;

public class AppLovinSdkSettings
{
  private boolean a;
  private long b = -1L;
  private String c;

  public AppLovinSdkSettings()
  {
  }

  public String getAutoPreloadSizes()
  {
    return this.c;
  }

  public long getBannerAdRefreshSeconds()
  {
    return this.b;
  }

  public boolean isVerboseLoggingEnabled()
  {
    return this.a;
  }

  public void setAutoPreloadSizes(String paramString)
  {
    this.c = paramString;
  }

  public void setBannerAdRefreshSeconds(long paramLong)
  {
    this.b = paramLong;
  }

  public void setVerboseLogging(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinSdkSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

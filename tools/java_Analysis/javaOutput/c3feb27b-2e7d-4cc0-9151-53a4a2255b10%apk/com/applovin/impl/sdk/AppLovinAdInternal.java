package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.List;

public class AppLovinAdInternal extends AppLovinAd
{
  private final AppLovinAdInternal.AdTarget a;

  @Deprecated
  private AppLovinAdInternal.ApiCompatibilityLevel b;
  private final String c;

  public AppLovinAdInternal(String paramString1, AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType, List paramList, String paramString2, AppLovinAdInternal.AdTarget paramAdTarget, String paramString3)
  {
    super(paramString1, paramAppLovinAdSize, paramAppLovinAdType, paramList, paramString2);
    this.a = paramAdTarget;
    if (paramString3 != null)
    {
      this.c = paramString3;
      return;
    }
    this.c = "Unknown";
  }

  @Deprecated
  public AppLovinAdInternal.ApiCompatibilityLevel getCompatibilityLevel()
  {
    return this.b;
  }

  public String getCurrentAdIdNumber()
  {
    return this.c;
  }

  public AppLovinAdInternal.AdTarget getTarget()
  {
    return this.a;
  }

  @Deprecated
  public void setCompatibilityLevel(AppLovinAdInternal.ApiCompatibilityLevel paramApiCompatibilityLevel)
  {
    this.b = paramApiCompatibilityLevel;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.AppLovinAdInternal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

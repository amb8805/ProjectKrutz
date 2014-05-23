package com.applovin.sdk;

import java.util.List;

public class AppLovinAd
{
  private final String a;
  private final AppLovinAdSize b;
  private final AppLovinAdType c;
  private final List d;
  private final String e;

  @Deprecated
  private String f;

  public AppLovinAd(String paramString1, AppLovinAdSize paramAppLovinAdSize, AppLovinAdType paramAppLovinAdType, List paramList, String paramString2)
  {
    if (paramString1 == null)
      throw new IllegalArgumentException("No html specified");
    if (paramAppLovinAdSize == null)
      throw new IllegalArgumentException("No size specified");
    if (paramAppLovinAdType == null)
      throw new IllegalArgumentException("No type specified");
    this.a = paramString1;
    this.b = paramAppLovinAdSize;
    this.c = paramAppLovinAdType;
    this.d = paramList;
    this.e = paramString2;
  }

  public AppLovinAd(String paramString, AppLovinAdSize paramAppLovinAdSize, List paramList)
  {
    this(paramString, paramAppLovinAdSize, paramList, null);
  }

  public AppLovinAd(String paramString1, AppLovinAdSize paramAppLovinAdSize, List paramList, String paramString2)
  {
    this(paramString1, paramAppLovinAdSize, AppLovinAdType.REGULAR, paramList, paramString2);
  }

  @Deprecated
  public String getClickTrackerUrl()
  {
    return this.f;
  }

  public List getDestinationUrls()
  {
    return this.d;
  }

  public String getHtml()
  {
    return this.a;
  }

  public AppLovinAdSize getSize()
  {
    return this.b;
  }

  public AppLovinAdType getType()
  {
    return this.c;
  }

  public String getVideoFilename()
  {
    return this.e;
  }

  @Deprecated
  public void setClickTrackerUrl(String paramString)
  {
    this.f = paramString;
  }
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinAd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

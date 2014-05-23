package com.applovin.sdk;

public abstract interface AppLovinAdService
{
  public static final String URI_AD_SERVICE = "/adservice";
  public static final String URI_API_SERVICE = "/api";
  public static final String URI_CLOSE_AD = "/adservice/close_ad";
  public static final String URI_LAUNCH_APP = "/launch";
  public static final String URI_NATIVE_FUNCTION = "/function";
  public static final String URI_NEXT_AD = "/adservice/next_ad";
  public static final String URI_OPEN_EXTERNALLY = "/openurl";
  public static final String URI_TRACK_CLICK = "/adservice/track_click";

  public abstract void addAdUpdateListener(AppLovinAdUpdateListener paramAppLovinAdUpdateListener);

  public abstract void addAdUpdateListener(AppLovinAdUpdateListener paramAppLovinAdUpdateListener, AppLovinAdSize paramAppLovinAdSize);

  public abstract boolean hasPreloadedAd(AppLovinAdSize paramAppLovinAdSize);

  public abstract void loadNextAd(AppLovinAdSize paramAppLovinAdSize, AppLovinAdLoadListener paramAppLovinAdLoadListener);

  public abstract void loadNextAd(String paramString, AppLovinAdLoadListener paramAppLovinAdLoadListener);

  public abstract void preloadAd(AppLovinAdSize paramAppLovinAdSize);

  public abstract void removeAdUpdateListener(AppLovinAdUpdateListener paramAppLovinAdUpdateListener, AppLovinAdSize paramAppLovinAdSize);

  @Deprecated
  public abstract void trackAdClick(AppLovinAd paramAppLovinAd);
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinAdService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

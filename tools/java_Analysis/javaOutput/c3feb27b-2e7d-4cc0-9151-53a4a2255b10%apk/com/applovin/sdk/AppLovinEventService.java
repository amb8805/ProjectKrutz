package com.applovin.sdk;

public abstract interface AppLovinEventService
{
  public abstract void trackRevenueEvent(String paramString1, double paramDouble, String paramString2);

  public abstract void trackSessionEnd();

  public abstract void trackSessionPause();

  public abstract void trackSessionStart();

  public abstract void uploadEvents();
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinEventService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

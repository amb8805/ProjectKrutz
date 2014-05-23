package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import org.json.JSONObject;

@Deprecated
class ay extends aw
{
  private final AppLovinAd a;

  ay(AppLovinAd paramAppLovinAd, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super("TrackClick", z.k, paramAppLovinSdkImpl);
    if (paramAppLovinAd == null)
      throw new IllegalArgumentException("No clicked ad specified");
    this.a = paramAppLovinAd;
    paramAppLovinSdkImpl.b().a("clk_req");
  }

  public void a(int paramInt)
  {
    m.b(paramInt, this.e);
  }

  protected void a(k paramk, l paraml)
  {
    paramk.a(this.a.getClickTrackerUrl(), paraml);
  }

  public void a(JSONObject paramJSONObject, int paramInt)
  {
    this.e.b().a("clk_trk");
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

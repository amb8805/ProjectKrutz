package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinLogger;
import org.json.JSONObject;

class ba extends aw
{
  ba(az paramaz, String paramString1, ab paramab, AppLovinSdkImpl paramAppLovinSdkImpl, String paramString2)
  {
    super(paramString1, paramab, paramAppLovinSdkImpl);
  }

  public void a(int paramInt)
  {
    if (paramInt > 400)
      this.b.c();
    this.f.e(this.d, "Unable to track conversion: server responded with " + paramInt);
  }

  protected void a(k paramk, l paraml)
  {
    paramk.a(az.a(this.b, this.a), paraml);
  }

  public void a(JSONObject paramJSONObject, int paramInt)
  {
    this.b.c();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ba
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

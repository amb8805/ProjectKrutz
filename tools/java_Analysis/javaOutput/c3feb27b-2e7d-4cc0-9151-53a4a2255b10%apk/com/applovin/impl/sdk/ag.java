package com.applovin.impl.sdk;

import java.util.Collection;
import org.json.JSONObject;

class ag extends aw
{
  ag(af paramaf, String paramString, ab paramab, AppLovinSdkImpl paramAppLovinSdkImpl, JSONObject paramJSONObject, Collection paramCollection)
  {
    super(paramString, paramab, paramAppLovinSdkImpl);
  }

  public void a(int paramInt)
  {
    m.a(paramInt, this.e);
  }

  protected void a(k paramk, l paraml)
  {
    paramk.b(m.a("device", this.e), this.a, paraml);
  }

  public void a(JSONObject paramJSONObject, int paramInt)
  {
    this.c.a(paramJSONObject, this.b);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

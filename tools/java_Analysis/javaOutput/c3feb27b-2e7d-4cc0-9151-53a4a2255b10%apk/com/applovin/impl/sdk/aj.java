package com.applovin.impl.sdk;

import org.json.JSONObject;

class aj extends aw
{
  aj(ai paramai, String paramString, ab paramab, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super(paramString, paramab, paramAppLovinSdkImpl);
  }

  public void a(int paramInt)
  {
    this.a.a(paramInt);
  }

  protected void a(k paramk, l paraml)
  {
    paramk.a(this.a.b().toString(), paraml);
  }

  public void a(JSONObject paramJSONObject, int paramInt)
  {
    if (paramInt == 200)
    {
      this.a.a(paramJSONObject);
      return;
    }
    this.a.a(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.aj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

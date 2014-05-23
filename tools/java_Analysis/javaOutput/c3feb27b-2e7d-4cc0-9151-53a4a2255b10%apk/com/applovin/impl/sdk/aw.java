package com.applovin.impl.sdk;

import org.json.JSONObject;

abstract class aw extends ar
  implements l
{
  private int a;
  private final l b;
  private ab c = null;

  private aw(String paramString, int paramInt, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super(paramString, paramAppLovinSdkImpl);
    this.a = paramInt;
    this.b = new ax(this, paramAppLovinSdkImpl, paramString);
  }

  aw(String paramString, ab paramab, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    this(paramString, ((Integer)paramAppLovinSdkImpl.a(paramab)).intValue(), paramAppLovinSdkImpl);
  }

  private void b()
  {
    if (this.c != null)
    {
      ac localac = this.e.getSettingsManager();
      localac.a(this.c, this.c.c());
      localac.b();
    }
  }

  public void a(int paramInt)
  {
  }

  public void a(ab paramab)
  {
    this.c = paramab;
  }

  protected abstract void a(k paramk, l paraml);

  public void a(JSONObject paramJSONObject, int paramInt)
  {
  }

  public void run()
  {
    a(this.e.getConnectionManager(), this.b);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.aw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

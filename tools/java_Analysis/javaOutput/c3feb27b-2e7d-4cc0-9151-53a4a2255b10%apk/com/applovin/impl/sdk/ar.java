package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.sdk.AppLovinLogger;

abstract class ar
  implements Runnable
{
  protected final String d;
  protected final AppLovinSdkImpl e;
  protected final AppLovinLogger f;
  protected final Context g;

  ar(String paramString, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    if (paramAppLovinSdkImpl == null)
      throw new IllegalArgumentException("No sdk specified");
    this.e = paramAppLovinSdkImpl;
    if (paramString != null);
    while (true)
    {
      this.d = paramString;
      this.f = paramAppLovinSdkImpl.getLogger();
      this.g = paramAppLovinSdkImpl.getApplicationContext();
      return;
      paramString = getClass().getSimpleName();
    }
  }

  void a()
  {
  }

  protected void a(ar paramar, aq paramaq)
  {
    this.e.a().a(paramar, paramaq);
  }

  String e()
  {
    return this.d;
  }

  protected n f()
  {
    return new n(this.e);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ar
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

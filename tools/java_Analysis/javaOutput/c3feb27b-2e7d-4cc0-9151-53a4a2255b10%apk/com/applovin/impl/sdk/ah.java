package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import java.util.Map;

public class ah extends ai
{
  private final String a;

  ah(String paramString, AppLovinAdLoadListener paramAppLovinAdLoadListener, AppLovinSdkImpl paramAppLovinSdkImpl)
  {
    super(AppLovinAdSize.BANNER, paramAppLovinAdLoadListener, paramAppLovinSdkImpl);
    this.a = paramString;
  }

  protected void a(Map paramMap)
  {
    paramMap.put("inter_id", String.valueOf(this.a));
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.ah
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

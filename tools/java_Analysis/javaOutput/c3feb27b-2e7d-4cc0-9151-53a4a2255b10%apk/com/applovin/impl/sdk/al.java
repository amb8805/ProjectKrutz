package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import java.util.List;
import java.util.Map;

class al extends ai
{
  al(ak paramak, AppLovinAdSize paramAppLovinAdSize, AppLovinAdLoadListener paramAppLovinAdLoadListener, AppLovinSdkImpl paramAppLovinSdkImpl, List paramList)
  {
    super(paramAppLovinAdSize, paramAppLovinAdLoadListener, paramAppLovinSdkImpl);
  }

  protected void a(Map paramMap)
  {
    super.a(paramMap);
    paramMap.put("p", ak.a("p", this.a));
    paramMap.put("app_id", ak.a("app_id", this.a));
    paramMap.put("api_key", "");
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

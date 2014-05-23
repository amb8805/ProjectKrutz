package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.List;

class am
  implements AppLovinAdLoadListener
{
  private final List b;

  am(ak paramak, List paramList)
  {
    this.b = paramList;
  }

  public void adReceived(AppLovinAd paramAppLovinAd)
  {
    String str1 = ak.a("format", this.b);
    String str2;
    if ((str1 != null) && (str1.equals("json")))
      str2 = ak.a(paramAppLovinAd);
    for (String str3 = "application/json"; ; str3 = "text/html")
    {
      this.a.a(new an(200, str2, str3, this.a.e, ak.a(this.a)), aq.a);
      return;
      str2 = ak.b(paramAppLovinAd);
    }
  }

  public void failedToReceiveAd(int paramInt)
  {
    this.a.a(new an(paramInt, this.a.e, ak.a(this.a)), aq.a);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.sdk.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

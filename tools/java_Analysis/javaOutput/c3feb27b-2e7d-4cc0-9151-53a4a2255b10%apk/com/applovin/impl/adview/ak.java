package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;

class ak
  implements AppLovinAdLoadListener
{
  ak(aj paramaj)
  {
  }

  public void adReceived(AppLovinAd paramAppLovinAd)
  {
    aj.a(this.a, paramAppLovinAd);
    this.a.showAndRender(paramAppLovinAd);
  }

  public void failedToReceiveAd(int paramInt)
  {
    aj.a(this.a, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.ak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;

class l
  implements Runnable
{
  l(AdViewControllerImpl paramAdViewControllerImpl)
  {
  }

  public void run()
  {
    if (AdViewControllerImpl.e(this.a) != null)
    {
      AdViewControllerImpl.a(AdViewControllerImpl.d(this.a), AdViewControllerImpl.e(this.a).getSize());
      AdViewControllerImpl.d(this.a).a(AdViewControllerImpl.e(this.a));
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

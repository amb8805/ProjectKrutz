package com.applovin.impl.adview;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdUpdateListener;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

class m
  implements AppLovinAdLoadListener, AppLovinAdUpdateListener
{
  private final WeakReference a;
  private final AppLovinAdService b;
  private final AppLovinLogger c;

  m(AdViewControllerImpl paramAdViewControllerImpl, AppLovinSdk paramAppLovinSdk)
  {
    if (paramAdViewControllerImpl == null)
      throw new IllegalArgumentException("No view specified");
    if (paramAppLovinSdk == null)
      throw new IllegalArgumentException("No sdk specified");
    this.a = new WeakReference(paramAdViewControllerImpl);
    this.c = paramAppLovinSdk.getLogger();
    this.b = paramAppLovinSdk.getAdService();
  }

  public void adReceived(AppLovinAd paramAppLovinAd)
  {
    AdViewControllerImpl localAdViewControllerImpl = (AdViewControllerImpl)this.a.get();
    if (localAdViewControllerImpl != null)
    {
      localAdViewControllerImpl.onAdReceived(paramAppLovinAd);
      return;
    }
    this.c.userError("AppLovinAdView", "Ad view has been garbage collected by the time an ad was recieved");
  }

  public void adUpdated(AppLovinAd paramAppLovinAd)
  {
    AdViewControllerImpl localAdViewControllerImpl = (AdViewControllerImpl)this.a.get();
    if (localAdViewControllerImpl != null)
    {
      localAdViewControllerImpl.onAdReceived(paramAppLovinAd);
      return;
    }
    this.b.removeAdUpdateListener(this, paramAppLovinAd.getSize());
    this.c.userError("AppLovinAdView", "Ad view has been garbage collected by the time an ad was updated");
  }

  public void failedToReceiveAd(int paramInt)
  {
    AdViewControllerImpl localAdViewControllerImpl = (AdViewControllerImpl)this.a.get();
    if (localAdViewControllerImpl != null)
      localAdViewControllerImpl.onFailedToReceiveAd(paramInt);
  }

  public String toString()
  {
    return "[AdViewController listener: " + hashCode() + "]";
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

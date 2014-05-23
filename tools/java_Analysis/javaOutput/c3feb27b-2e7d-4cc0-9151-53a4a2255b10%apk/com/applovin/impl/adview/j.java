package com.applovin.impl.adview;

import com.applovin.adview.AppLovinInterstitialAdDialog;

class j
  implements Runnable
{
  j(AdViewControllerImpl paramAdViewControllerImpl)
  {
  }

  public void run()
  {
    if (AdViewControllerImpl.e(this.a) != null);
    try
    {
      AppLovinInterstitialAdDialog localAppLovinInterstitialAdDialog = new InterstitialAdDialogCreatorImpl().createInterstitialAdDialog(AdViewControllerImpl.f(this.a), AdViewControllerImpl.g(this.a));
      localAppLovinInterstitialAdDialog.setAdDisplayListener(new e(this.a));
      localAppLovinInterstitialAdDialog.setAdVideoPlaybackListener(new f(this.a));
      localAppLovinInterstitialAdDialog.setAdClickListener(new d(this.a));
      localAppLovinInterstitialAdDialog.showAndRender(AdViewControllerImpl.e(this.a));
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

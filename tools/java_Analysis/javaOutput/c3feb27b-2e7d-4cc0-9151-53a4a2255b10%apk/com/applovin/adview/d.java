package com.applovin.adview;

import android.app.Activity;
import com.applovin.impl.adview.InterstitialAdDialogCreatorImpl;
import com.applovin.sdk.AppLovinSdk;

final class d
  implements Runnable
{
  d(AppLovinSdk paramAppLovinSdk, Activity paramActivity)
  {
  }

  public void run()
  {
    new InterstitialAdDialogCreatorImpl().createInterstitialAdDialog(this.a, this.b).show();
  }
}

/* Location:
 * Qualified Name:     com.applovin.adview.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

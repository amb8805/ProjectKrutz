package com.applovin.impl.adview;

import android.app.Activity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.adview.InterstitialAdDialogCreator;
import com.applovin.sdk.AppLovinLogger;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

public class InterstitialAdDialogCreatorImpl
  implements InterstitialAdDialogCreator
{
  private static final Object a = new Object();
  private static WeakReference b = new WeakReference(null);
  private static WeakReference c = new WeakReference(null);

  public InterstitialAdDialogCreatorImpl()
  {
  }

  public AppLovinInterstitialAdDialog createInterstitialAdDialog(AppLovinSdk paramAppLovinSdk, Activity paramActivity)
  {
    if (paramAppLovinSdk == null)
      paramAppLovinSdk = AppLovinSdk.getInstance(paramActivity);
    synchronized (a)
    {
      aj localaj = (aj)b.get();
      if ((localaj == null) || (!localaj.isShowing()) || (c.get() != paramActivity))
      {
        localaj = new aj(paramAppLovinSdk, paramActivity);
        b = new WeakReference(localaj);
        c = new WeakReference(paramActivity);
        return localaj;
      }
      paramAppLovinSdk.getLogger().w("InterstitialAdDialogCreator", "An interstitial dialog is already showing, returning it");
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.InterstitialAdDialogCreatorImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

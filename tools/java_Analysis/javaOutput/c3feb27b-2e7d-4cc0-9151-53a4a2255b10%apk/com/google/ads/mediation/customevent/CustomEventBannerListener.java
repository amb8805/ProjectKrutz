package com.google.ads.mediation.customevent;

import android.view.View;

public abstract interface CustomEventBannerListener extends CustomEventListener
{
  public abstract void onClick();

  public abstract void onReceivedAd(View paramView);
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventBannerListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

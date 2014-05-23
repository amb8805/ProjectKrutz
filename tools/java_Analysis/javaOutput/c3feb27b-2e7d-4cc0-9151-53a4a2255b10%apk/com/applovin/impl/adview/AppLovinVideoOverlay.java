package com.applovin.impl.adview;

import android.widget.RelativeLayout;

public abstract interface AppLovinVideoOverlay
{
  public abstract int getDuration();

  public abstract int getPercentViewed();

  public abstract AppLovinVideoPlaybackState getPlaybackState();

  public abstract int getPlaybackTime();

  public abstract RelativeLayout getVideoLayout();

  public abstract void requestPause();

  public abstract void requestPlay();

  public abstract void setPercentViewed(int paramInt);

  public abstract void setPlaybackTime(int paramInt);

  public abstract void stopUnderlyingMediaPlayer();
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.AppLovinVideoOverlay
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

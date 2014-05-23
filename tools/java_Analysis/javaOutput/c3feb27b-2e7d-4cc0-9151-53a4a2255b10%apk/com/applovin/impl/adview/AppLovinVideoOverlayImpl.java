package com.applovin.impl.adview;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.applovin.sdk.AppLovinLogger;
import java.util.concurrent.atomic.AtomicReference;

public class AppLovinVideoOverlayImpl
  implements AppLovinVideoOverlay
{
  private static String a = "AppLovinVideoOverlayImpl";
  private final AppLovinLogger b;
  private final AppLovinVideoCallback c;
  private AppLovinVideoView d;
  private RelativeLayout e;
  private MediaPlayer f;
  private AtomicReference g = new AtomicReference();
  private AtomicReference h = new AtomicReference();

  public AppLovinVideoOverlayImpl(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Activity paramActivity, Uri paramUri, AppLovinLogger paramAppLovinLogger, AppLovinVideoCallback paramAppLovinVideoCallback)
  {
    this.b = paramAppLovinLogger;
    this.c = paramAppLovinVideoCallback;
    this.g.set(Boolean.valueOf(false));
    this.h.set(Boolean.valueOf(false));
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(paramInt3, paramInt4);
    localLayoutParams.leftMargin = paramInt1;
    localLayoutParams.topMargin = paramInt2;
    this.e = new RelativeLayout(paramActivity);
    this.e.setLayoutParams(localLayoutParams);
    this.e.setBackgroundColor(-16777216);
    this.e.setGravity(17);
    this.d = new AppLovinVideoView(paramActivity);
    this.d.setVideoURI(paramUri);
    this.d.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    this.d.setOnErrorListener(new z(this, paramAppLovinLogger, paramAppLovinVideoCallback));
    this.d.setOnPreparedListener(new aa(this, paramAppLovinVideoCallback));
    this.e.addView(this.d);
  }

  private int a(int paramInt)
  {
    return paramInt / 1000;
  }

  private int b(int paramInt)
  {
    return paramInt * 1000;
  }

  public int getDuration()
  {
    return a(this.d.getDuration());
  }

  public int getPercentViewed()
  {
    int i = (int)Math.ceil(100.0D * (this.d.getCurrentPosition() / this.d.getDuration()));
    if (i > 100)
      return 100;
    return i;
  }

  public AppLovinVideoPlaybackState getPlaybackState()
  {
    if (this.d.isPlaying())
      return AppLovinVideoPlaybackState.PLAYING;
    if (getPercentViewed() > 98)
      return AppLovinVideoPlaybackState.STOPPED;
    return AppLovinVideoPlaybackState.PAUSED;
  }

  public int getPlaybackTime()
  {
    return a(this.d.getCurrentPosition());
  }

  public RelativeLayout getVideoLayout()
  {
    return this.e;
  }

  public void requestPause()
  {
    if (this.d.canPause())
    {
      this.d.pause();
      this.c.onPlaybackStateChanged(AppLovinVideoPlaybackState.PAUSED);
    }
  }

  public void requestPlay()
  {
    if (((Boolean)this.g.get()).booleanValue())
    {
      if (!this.d.isPlaying())
      {
        this.d.start();
        this.c.onPlaybackStateChanged(AppLovinVideoPlaybackState.PLAYING);
      }
      return;
    }
    this.h.set(Boolean.valueOf(true));
  }

  public void setPercentViewed(int paramInt)
  {
    int i = paramInt / 100 * this.d.getDuration();
    this.d.seekTo(i);
  }

  public void setPlaybackTime(int paramInt)
  {
    this.d.seekTo(b(paramInt));
  }

  public void stopUnderlyingMediaPlayer()
  {
    if (this.f != null)
      this.f.stop();
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.AppLovinVideoOverlayImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

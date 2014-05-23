package com.applovin.impl.adview;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.applovin.sdk.AppLovinLogger;

class z
  implements MediaPlayer.OnErrorListener
{
  z(AppLovinVideoOverlayImpl paramAppLovinVideoOverlayImpl, AppLovinLogger paramAppLovinLogger, AppLovinVideoCallback paramAppLovinVideoCallback)
  {
  }

  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    this.a.e(AppLovinVideoOverlayImpl.a(), "AppLovinVideoView playback failed with error (" + paramInt1 + "," + paramInt2 + ")");
    this.b.onPlaybackStateChanged(AppLovinVideoPlaybackState.FAILED);
    return true;
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

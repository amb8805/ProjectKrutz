package com.applovin.impl.adview;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import java.util.concurrent.atomic.AtomicReference;

class aa
  implements MediaPlayer.OnPreparedListener
{
  aa(AppLovinVideoOverlayImpl paramAppLovinVideoOverlayImpl, AppLovinVideoCallback paramAppLovinVideoCallback)
  {
  }

  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    AppLovinVideoOverlayImpl.a(this.b, paramMediaPlayer);
    paramMediaPlayer.setOnCompletionListener(new ab(this));
    int i = paramMediaPlayer.getVideoWidth();
    int j = paramMediaPlayer.getVideoHeight();
    AppLovinVideoOverlayImpl.a(this.b).setVideoSize(i, j);
    paramMediaPlayer.setDisplay(AppLovinVideoOverlayImpl.a(this.b).getHolder());
    AppLovinVideoOverlayImpl.b(this.b).set(Boolean.valueOf(true));
    if (((Boolean)AppLovinVideoOverlayImpl.c(this.b).get()).booleanValue())
    {
      paramMediaPlayer.start();
      this.a.onPlaybackStateChanged(AppLovinVideoPlaybackState.PLAYING);
    }
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.applovin.impl.adview;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

class ab
  implements MediaPlayer.OnCompletionListener
{
  ab(aa paramaa)
  {
  }

  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    this.a.a.onPlaybackStateChanged(AppLovinVideoPlaybackState.STOPPED);
  }
}

/* Location:
 * Qualified Name:     com.applovin.impl.adview.ab
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

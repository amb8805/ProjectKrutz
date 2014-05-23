package com.spotify.mobile.android.core.internal;

import android.media.MediaPlayer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class LocalFilePlayer
{
  private static ArrayList<LocalFilePlayer.LocalFilePlayerListener> sLocalFilePlayerListeners = new ArrayList();
  MediaPlayer mMediaPlayer;
  private int nThis;

  public LocalFilePlayer()
  {
  }

  public static void addListener(LocalFilePlayer.LocalFilePlayerListener paramLocalFilePlayerListener)
  {
    sLocalFilePlayerListeners.add(paramLocalFilePlayerListener);
  }

  private native void onPlaybackComplete();

  public static void removeListener(LocalFilePlayer.LocalFilePlayerListener paramLocalFilePlayerListener)
  {
    sLocalFilePlayerListeners.remove(paramLocalFilePlayerListener);
  }

  public void close()
  {
    if (this.mMediaPlayer != null)
    {
      Iterator localIterator = sLocalFilePlayerListeners.iterator();
      while (localIterator.hasNext())
        ((LocalFilePlayer.LocalFilePlayerListener)localIterator.next()).onMediaPlayerDestroyed(this.mMediaPlayer.getAudioSessionId());
      this.mMediaPlayer.release();
      this.mMediaPlayer = null;
    }
  }

  public int getDuration()
  {
    if (this.mMediaPlayer != null)
      return this.mMediaPlayer.getDuration();
    return 0;
  }

  public int getPosition()
  {
    if (this.mMediaPlayer != null)
      return this.mMediaPlayer.getCurrentPosition();
    return 0;
  }

  public boolean open(String paramString)
  {
    this.mMediaPlayer = new MediaPlayer();
    try
    {
      this.mMediaPlayer.setDataSource(paramString);
      this.mMediaPlayer.prepare();
      this.mMediaPlayer.setOnCompletionListener(new LocalFilePlayer.1(this));
      Iterator localIterator = sLocalFilePlayerListeners.iterator();
      while (localIterator.hasNext())
        ((LocalFilePlayer.LocalFilePlayerListener)localIterator.next()).onMediaPlayerCreated(this.mMediaPlayer.getAudioSessionId());
    }
    catch (IOException localIOException)
    {
      close();
      return false;
    }
    return true;
  }

  public void pause()
  {
    if (this.mMediaPlayer != null)
      this.mMediaPlayer.pause();
  }

  public void play()
  {
    if (this.mMediaPlayer != null)
      this.mMediaPlayer.start();
  }

  public void seek(int paramInt)
  {
    if (this.mMediaPlayer != null)
      this.mMediaPlayer.seekTo(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.core.internal.LocalFilePlayer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

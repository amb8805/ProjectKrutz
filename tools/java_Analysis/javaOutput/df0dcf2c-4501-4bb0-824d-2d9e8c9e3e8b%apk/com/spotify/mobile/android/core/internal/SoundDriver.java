package com.spotify.mobile.android.core.internal;

import android.media.AudioTrack;
import android.media.AudioTrack.OnPlaybackPositionUpdateListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.util.SparseArray;
import com.spotify.mobile.android.util.ah;
import java.util.ArrayList;
import java.util.Iterator;

public class SoundDriver
  implements AudioTrack.OnPlaybackPositionUpdateListener
{
  private static final int BYTES_PER_SAMPLE = 2;
  private static final int DELAY_IN_WRITES_BEFORE_ENABLING_EQUALIZER = 32;
  private static final boolean LOGGING_ENABLED = false;
  private static final int SPOTIFY_MAX_VOLUME = 65535;
  private static SparseArray<AudioTrack> sSessionToAudioTrackMap = new SparseArray();
  private static ArrayList<SoundDriver.SoundDriverListener> sSoundDriverListeners = new ArrayList();
  private AudioTrack mAudioTrack = null;
  private int mBufferSizeInBytes = 0;
  private int mBytesPerFrame;
  private int mChannelConfig = 0;
  private ah mEqualizerEnableCountdown = new ah(this.mEqualizerEnableNotifier);
  private Runnable mEqualizerEnableNotifier = new SoundDriver.1(this);
  private int mFramesBufferedBeforePlay = 0;
  private Handler mNotificationHandler;
  private HandlerThread mNotificationHandlerThread;
  private boolean mOpen = false;
  private boolean mPaused = false;
  private boolean mPlaying = false;
  private final Object mPositionMutex = new Object();
  private int mSampleRate = 0;
  private int nThis;

  public SoundDriver()
  {
  }

  public static void addListener(SoundDriver.SoundDriverListener paramSoundDriverListener)
  {
    sSoundDriverListeners.add(paramSoundDriverListener);
  }

  private void createAudioTrack()
  {
    if (!this.mOpen)
      return;
    this.mAudioTrack = new AudioTrack(3, this.mSampleRate, this.mChannelConfig, 2, this.mBufferSizeInBytes, 1);
    this.mAudioTrack.setPlaybackPositionUpdateListener(this, this.mNotificationHandler);
    float f = AudioTrack.getMaxVolume();
    this.mAudioTrack.setStereoVolume(f, f);
    sSessionToAudioTrackMap.put(this.mAudioTrack.getAudioSessionId(), this.mAudioTrack);
    Iterator localIterator = sSoundDriverListeners.iterator();
    while (localIterator.hasNext())
      ((SoundDriver.SoundDriverListener)localIterator.next()).onAudioTrackCreated(this.mAudioTrack.getAudioSessionId());
    this.mEqualizerEnableCountdown.b();
  }

  private void destroyAudioTrack()
  {
    if (this.mAudioTrack == null)
      return;
    Iterator localIterator = sSoundDriverListeners.iterator();
    while (localIterator.hasNext())
      ((SoundDriver.SoundDriverListener)localIterator.next()).onAudioTrackDestroyed(this.mAudioTrack.getAudioSessionId());
    sSessionToAudioTrackMap.delete(this.mAudioTrack.getAudioSessionId());
    this.mPlaying = false;
    this.mAudioTrack.setPlaybackPositionUpdateListener(null, this.mNotificationHandler);
    this.mAudioTrack.flush();
    this.mAudioTrack.stop();
    this.mAudioTrack.release();
    this.mAudioTrack = null;
  }

  private native void onBufferUnderrun();

  private native void onDestroy();

  private native void onFlush();

  public static void removeListener(SoundDriver.SoundDriverListener paramSoundDriverListener)
  {
    sSoundDriverListeners.remove(paramSoundDriverListener);
  }

  public static void startDuckingAudio(int paramInt)
  {
    AudioTrack localAudioTrack = (AudioTrack)sSessionToAudioTrackMap.get(paramInt);
    if (localAudioTrack != null)
    {
      float f = AudioTrack.getMaxVolume() / 4.0F;
      localAudioTrack.setStereoVolume(f, f);
    }
  }

  public static void stopDuckingAudio(int paramInt)
  {
    AudioTrack localAudioTrack = (AudioTrack)sSessionToAudioTrackMap.get(paramInt);
    if (localAudioTrack != null)
    {
      float f = AudioTrack.getMaxVolume();
      localAudioTrack.setStereoVolume(f, f);
    }
  }

  public void destroy()
  {
    if (this.mAudioTrack == null)
      return;
    this.mPlaying = false;
    this.mPaused = true;
    this.mOpen = false;
    destroyAudioTrack();
    onDestroy();
    try
    {
      this.mNotificationHandlerThread.quit();
      this.mNotificationHandlerThread.join(1000L);
      this.mNotificationHandlerThread = null;
      this.mNotificationHandler = null;
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
        localInterruptedException.printStackTrace();
    }
  }

  public void flush()
  {
    this.mPlaying = false;
    this.mFramesBufferedBeforePlay = 0;
    if (this.mAudioTrack == null)
      return;
    this.mAudioTrack.pause();
    destroyAudioTrack();
    createAudioTrack();
    onFlush();
  }

  public int getFreeSize()
  {
    if (this.mAudioTrack == null)
      return 0;
    return this.mBufferSizeInBytes - this.mBytesPerFrame * getQueuedSize();
  }

  public int getPosition()
  {
    if (this.mAudioTrack == null)
      return 0;
    return Math.max(0, this.mAudioTrack.getPlaybackHeadPosition());
  }

  public int getQueuedSize()
  {
    if (this.mAudioTrack == null)
      return 0;
    synchronized (this.mPositionMutex)
    {
      if (this.mPlaying)
      {
        int j = this.mAudioTrack.getNotificationMarkerPosition() - this.mAudioTrack.getPlaybackHeadPosition();
        return j;
      }
    }
    int i = this.mFramesBufferedBeforePlay;
    return i;
  }

  public int getVolume()
  {
    return 65535;
  }

  public boolean isPlaying()
  {
    if (this.mAudioTrack == null);
    while ((!this.mPlaying) || (getQueuedSize() <= 0))
      return false;
    return true;
  }

  public void onMarkerReached(AudioTrack paramAudioTrack)
  {
    if (!this.mOpen)
      return;
    synchronized (this.mPositionMutex)
    {
      if (!this.mOpen)
        return;
    }
    if (paramAudioTrack.getPlaybackHeadPosition() >= paramAudioTrack.getNotificationMarkerPosition())
      onBufferUnderrun();
  }

  public void onPeriodicNotification(AudioTrack paramAudioTrack)
  {
  }

  public void open(int paramInt1, int paramInt2)
  {
    Process.setThreadPriority(-16);
    this.mSampleRate = paramInt1;
    int i;
    if (paramInt2 == 1)
      i = 4;
    while (true)
    {
      this.mChannelConfig = i;
      this.mBytesPerFrame = (paramInt2 * 2);
      this.mBufferSizeInBytes = (1 * (paramInt1 * this.mBytesPerFrame));
      this.mBufferSizeInBytes = Math.max(this.mBufferSizeInBytes, AudioTrack.getMinBufferSize(paramInt1, this.mChannelConfig, 2));
      this.mNotificationHandlerThread = new HandlerThread("SoundDriverNotificationThread");
      this.mNotificationHandlerThread.start();
      this.mNotificationHandler = new Handler(this.mNotificationHandlerThread.getLooper());
      this.mOpen = true;
      createAudioTrack();
      synchronized (this.mPositionMutex)
      {
        this.mAudioTrack.setNotificationMarkerPosition(0);
        return;
        i = 12;
      }
    }
  }

  public void setPaused(boolean paramBoolean)
  {
    this.mPaused = paramBoolean;
    if (this.mAudioTrack == null);
    do
    {
      return;
      if (this.mPaused)
      {
        this.mAudioTrack.pause();
        return;
      }
    }
    while (!this.mPlaying);
    this.mAudioTrack.play();
  }

  public void setVolume(int paramInt)
  {
  }

  public void startPlayback()
  {
    boolean bool = this.mPlaying;
    this.mPlaying = true;
    if (this.mAudioTrack == null);
    while (this.mPaused)
      return;
    synchronized (this.mPositionMutex)
    {
      this.mAudioTrack.play();
      if (!bool)
      {
        this.mAudioTrack.setNotificationMarkerPosition(this.mFramesBufferedBeforePlay);
        this.mFramesBufferedBeforePlay = 0;
      }
      return;
    }
  }

  public void stopPlayback()
  {
    if (this.mAudioTrack == null)
      return;
    this.mAudioTrack.pause();
  }

  public int write(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.mAudioTrack == null);
    int i;
    do
    {
      return 0;
      i = this.mAudioTrack.write(paramArrayOfByte, 0, paramInt);
    }
    while (i <= 0);
    this.mEqualizerEnableCountdown.a();
    synchronized (this.mPositionMutex)
    {
      this.mAudioTrack.setNotificationMarkerPosition(this.mAudioTrack.getNotificationMarkerPosition() + i / this.mBytesPerFrame);
      if (!this.mPlaying)
        this.mFramesBufferedBeforePlay += i / this.mBytesPerFrame;
      return i;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.core.internal.SoundDriver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

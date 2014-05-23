package com.spotify.mobile.android.ui.activity;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.spotify.mobile.android.util.bp;
import java.io.IOException;

public class VideoPlayerActivity extends Activity
  implements MediaPlayer.OnPreparedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl
{
  private SurfaceView a;
  private MediaController b;
  private MediaPlayer c;

  public VideoPlayerActivity()
  {
  }

  private void a()
  {
    int i = this.c.getVideoWidth();
    int j = this.c.getVideoHeight();
    float f1 = i / j;
    Display localDisplay = getWindowManager().getDefaultDisplay();
    Point localPoint = new Point();
    FrameLayout.LayoutParams localLayoutParams;
    if (Build.VERSION.SDK_INT < 13)
    {
      localPoint.set(localDisplay.getWidth(), localDisplay.getHeight());
      float f2 = localPoint.x / localPoint.y;
      localLayoutParams = (FrameLayout.LayoutParams)this.a.getLayoutParams();
      if (f1 <= f2)
        break label150;
      localLayoutParams.width = localPoint.x;
    }
    for (localLayoutParams.height = (int)(localPoint.x / f1); ; localLayoutParams.height = localPoint.y)
    {
      localLayoutParams.gravity = 17;
      this.a.setLayoutParams(localLayoutParams);
      return;
      localDisplay.getSize(localPoint);
      break;
      label150: localLayoutParams.width = (int)(f1 * localPoint.y);
    }
  }

  public boolean canPause()
  {
    return true;
  }

  public boolean canSeekBackward()
  {
    return true;
  }

  public boolean canSeekForward()
  {
    return true;
  }

  public int getAudioSessionId()
  {
    return 0;
  }

  public int getBufferPercentage()
  {
    return 0;
  }

  public int getCurrentPosition()
  {
    return this.c.getCurrentPosition();
  }

  public int getDuration()
  {
    return this.c.getDuration();
  }

  public boolean isPlaying()
  {
    return this.c.isPlaying();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    a();
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903077);
    this.a = ((SurfaceView)findViewById(2131362276));
    this.a.getHolder().addCallback(this);
    this.c = new MediaPlayer();
    this.b = new MediaController(this);
    localUri = Uri.parse("http://www.quirksmode.org/html5/videos/big_buck_bunny.mp4");
    try
    {
      this.c.setDataSource(this, localUri);
      this.c.setOnPreparedListener(this);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = ("Unable to open content: " + localUri);
        arrayOfObject[1] = localIOException;
        bp.d("VideoPlayerActivity", arrayOfObject);
      }
    }
  }

  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    this.b.setMediaPlayer(this);
    this.b.setAnchorView(findViewById(2131362275));
    a();
    if (!this.c.isPlaying())
      this.c.start();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  public void pause()
  {
    this.c.pause();
  }

  public void seekTo(int paramInt)
  {
    this.c.seekTo(paramInt);
  }

  public void start()
  {
    this.c.start();
  }

  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
  }

  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.c.setDisplay(paramSurfaceHolder);
    this.c.prepareAsync();
  }

  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.VideoPlayerActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

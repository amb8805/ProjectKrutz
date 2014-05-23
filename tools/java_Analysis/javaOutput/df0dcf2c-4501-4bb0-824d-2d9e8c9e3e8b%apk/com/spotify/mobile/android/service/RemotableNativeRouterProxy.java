package com.spotify.mobile.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import com.spotify.cosmos.android.router.RemotableNativeRouter;
import com.spotify.mobile.android.util.cc;

public class RemotableNativeRouterProxy extends Service
{
  private final Object a = new Object();
  private aa b = new aa(this, (byte)0);
  private aj c;
  private z d = new z(this);
  private Handler e;

  public RemotableNativeRouterProxy()
  {
  }

  protected final void a()
  {
    cc.a();
    Object localObject1 = this.a;
    for (int i = 0; ; i++)
    {
      try
      {
        if (this.c != null)
        {
          boolean bool = SpotifyService.k(this.c.a);
          if (bool)
            break;
        }
        if (i >= 600)
          try
          {
            throw new RuntimeException("Unable to bind to SpotifyService!");
          }
          catch (InterruptedException localInterruptedException)
          {
            throw new RuntimeException(localInterruptedException);
          }
      }
      finally
      {
      }
      this.a.wait(100L);
    }
    RemotableNativeRouter localRemotableNativeRouter = SpotifyService.g(this.c.a);
    cc.a(localRemotableNativeRouter);
    this.d.a(localRemotableNativeRouter);
  }

  public IBinder onBind(Intent paramIntent)
  {
    return this.d;
  }

  public void onCreate()
  {
    super.onCreate();
    HandlerThread localHandlerThread = new HandlerThread("RemotableNativeRouterProxy");
    localHandlerThread.start();
    this.e = new Handler(localHandlerThread.getLooper());
    if (this.c == null)
      SpotifyService.a(this, this.b);
  }

  public void onDestroy()
  {
    if (this.b != null)
    {
      unbindService(this.b);
      this.b = null;
    }
    this.e.getLooper().quit();
    super.onDestroy();
  }

  public boolean onUnbind(Intent paramIntent)
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.RemotableNativeRouterProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

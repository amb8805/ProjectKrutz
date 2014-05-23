package com.spotify.mobile.android.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;

public abstract class AbstractProxyService<T extends Binder> extends Service
{
  protected aj a;
  protected T b;
  protected IBinder c;
  private final Object d = new Object();
  private AbstractProxyService<T>.a e = new a(this, (byte)0);

  public AbstractProxyService()
  {
  }

  protected final void a()
  {
    int i = 0;
    cc.a();
    while (true)
    {
      synchronized (this.d)
      {
        Binder localBinder = this.b;
        if (localBinder != null)
          break;
        if (i >= 600)
          try
          {
            bp.e("Failed to connect after " + i + " attempts.", new Object[0]);
            throw new RuntimeException("Unable to bind to SpotifyService!");
          }
          catch (InterruptedException localInterruptedException)
          {
            bp.e("Failed to connect after an unexpected InterruptedException.", new Object[0]);
            throw new RuntimeException(localInterruptedException);
          }
      }
      this.d.wait(100L);
      i++;
      if ((this.b == null) && (this.a != null) && (SpotifyService.k(this.a.a)))
      {
        this.b = b();
        if (this.b != null)
          bp.c("Successfully connected to proxied binder.", new Object[0]);
      }
    }
  }

  public abstract T b();

  public IBinder onBind(Intent paramIntent)
  {
    if (this.a == null)
      SpotifyService.a(this, this.e);
    return this.c;
  }

  public boolean onUnbind(Intent paramIntent)
  {
    unbindService(this.e);
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.AbstractProxyService
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

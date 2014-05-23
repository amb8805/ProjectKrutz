package com.spotify.mobile.android.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.util.bp;

final class a
  implements ServiceConnection
{
  private a(AbstractProxyService paramAbstractProxyService)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (AbstractProxyService.a(this.a))
    {
      this.a.a = ((aj)paramIBinder);
      if ((this.a.a != null) && (SpotifyService.k(this.a.a.a)))
      {
        this.a.b = this.a.b();
        if (this.a.b != null)
          bp.c("Successfully connected to proxied binder.", new Object[0]);
      }
      AbstractProxyService.a(this.a).notifyAll();
      return;
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (AbstractProxyService.a(this.a))
    {
      this.a.a = null;
      this.a.b = null;
      AbstractProxyService.a(this.a).notifyAll();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

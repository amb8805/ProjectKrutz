package com.spotify.mobile.android.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class aa
  implements ServiceConnection
{
  private aa(RemotableNativeRouterProxy paramRemotableNativeRouterProxy)
  {
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    synchronized (RemotableNativeRouterProxy.a(this.a))
    {
      RemotableNativeRouterProxy.a(this.a, (aj)paramIBinder);
      RemotableNativeRouterProxy.a(this.a).notifyAll();
      return;
    }
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    synchronized (RemotableNativeRouterProxy.a(this.a))
    {
      RemotableNativeRouterProxy.a(this.a, null);
      RemotableNativeRouterProxy.a(this.a).notifyAll();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

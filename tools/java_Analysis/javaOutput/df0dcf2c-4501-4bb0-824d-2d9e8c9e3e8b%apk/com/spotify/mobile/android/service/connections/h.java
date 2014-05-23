package com.spotify.mobile.android.service.connections;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.spotify.mobile.android.service.SessionManagerProxy;
import com.spotify.mobile.android.service.r;
import com.spotify.mobile.android.service.s;

public final class h extends a
{
  private i b;
  private r c;

  public h(Context paramContext, i parami)
  {
    super(paramContext);
    this.b = parami;
  }

  public final boolean c()
  {
    return this.c != null;
  }

  public final void d()
  {
    SessionManagerProxy.a(this.a, this);
  }

  public final void e()
  {
    this.a.unbindService(this);
    this.c = null;
  }

  public final void f()
  {
    if (this.b != null)
      this.b.a(this.c);
  }

  public final void g()
  {
    if (this.b != null)
      this.b.c_();
  }

  public final r h()
  {
    return this.c;
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    this.c = s.a(paramIBinder);
    super.onServiceConnected(paramComponentName, paramIBinder);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.connections.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

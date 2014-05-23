package com.spotify.mobile.android.ui.activity;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.service.MonitorService;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.SubView;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cw;
import com.spotify.mobile.android.util.cx;
import java.util.concurrent.atomic.AtomicInteger;

public final class i
  implements ServiceConnection
{
  private static final Object i = new Object();
  private static i j = null;
  private final ClientEvent a;
  private final ClientEvent b;
  private final a c = (a)c.a(a.class);
  private final Context d;
  private final Handler e;
  private boolean f;
  private boolean g = false;
  private AtomicInteger h;
  private Runnable k = new i.1(this);

  private i(Context paramContext)
  {
    bp.b("Creating the ServiceProcessMonitor", new Object[0]);
    this.d = paramContext;
    this.e = new Handler(this.d.getMainLooper());
    this.h = new AtomicInteger(0);
    this.a = new ClientEvent(ClientEvent.Event.ac, ClientEvent.SubEvent.aR);
    this.b = new ClientEvent(ClientEvent.Event.ac, ClientEvent.SubEvent.aS);
  }

  public static i a(Context paramContext)
  {
    synchronized (i)
    {
      if (j == null)
      {
        cw.a(paramContext.getApplicationContext()).a().a(SpotifyService.b, 0).a();
        j = new i(paramContext.getApplicationContext());
      }
      return j;
    }
  }

  public final void a()
  {
    int m = this.h.incrementAndGet();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(m);
    bp.b("ServiceProcessMonitor started with %d references.", arrayOfObject);
    if (m == 1)
    {
      bp.b("First start() on ServiceProcessMonitor - binding to MonitorService.", new Object[0]);
      MonitorService.a(this.d, this);
    }
  }

  public final void b()
  {
    int m = this.h.decrementAndGet();
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(m);
    bp.b("ServiceProcessMonitor ref count decreased to %d.", arrayOfObject);
    if (m == 0)
    {
      this.g = false;
      if (this.f)
        this.d.unbindService(this);
    }
  }

  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    bp.b("Connected to MonitorService!", new Object[0]);
    if (this.g)
    {
      bp.b("Reconnected to MonitorService!", new Object[0]);
      a.a(ViewUri.b, ViewUri.SubView.a, this.b);
    }
    this.f = true;
    this.g = true;
  }

  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    bp.b("Disconnected from MonitorService!", new Object[0]);
    if (this.g)
    {
      bp.b("Unexpected disconnect from MonitorService - possible crash.", new Object[0]);
      this.e.removeCallbacks(this.k);
      a.a(ViewUri.b, ViewUri.SubView.a, this.a);
      int m = 1 + cw.a(this.d).a(SpotifyService.b, 0);
      cw.a(this.d).a().a(SpotifyService.b, m).a();
      this.e.postDelayed(this.k, 30000L);
      MonitorService.a(this.d, this);
    }
    this.f = false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

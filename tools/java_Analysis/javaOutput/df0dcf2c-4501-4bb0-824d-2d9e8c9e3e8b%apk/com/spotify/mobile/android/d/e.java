package com.spotify.mobile.android.d;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiManager.WifiLock;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.service.af;
import com.spotify.mobile.android.service.ag;
import com.spotify.mobile.android.service.managers.ConnectManager;
import com.spotify.mobile.android.service.v;
import com.spotify.mobile.android.service.w;
import com.spotify.mobile.android.ui.actions.a;

public class e
{
  private static final String a = e.class.getSimpleName();
  private SpotifyService b;
  private BroadcastReceiver c;
  private com.spotify.mobile.android.service.managers.c d;
  private h e;
  private boolean f;
  private boolean g;
  private BroadcastReceiver h;
  private AudioManager i;
  private WifiManager.WifiLock j;
  private f k = new f(this);
  private v l;
  private PowerManager.WakeLock m;
  private ag n;
  private af o;
  private ConnectManager p;
  private a q = (a)com.spotify.mobile.android.c.c.a(a.class);
  private boolean r = false;
  private w s = new e.5(this);

  public e(SpotifyService paramSpotifyService, com.spotify.mobile.android.service.managers.c paramc, h paramh, ag paramag, af paramaf, ConnectManager paramConnectManager)
  {
    this.b = paramSpotifyService;
    this.d = paramc;
    this.e = paramh;
    this.n = paramag;
    this.o = paramaf;
    this.p = paramConnectManager;
    this.i = ((AudioManager)this.b.getSystemService("audio"));
    this.l = new v(this.b, this.s);
    this.c = new e.1(this);
    this.h = new e.6(this);
    this.b.registerReceiver(this.h, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    e.7 local7 = new e.7(this, this.e);
    e.8 local8 = new e.8(this, this.e);
    e.9 local9 = new e.9(this, this.e, paramh);
    e.10 local10 = new e.10(this, this.e);
    e.11 local11 = new e.11(this, this.e);
    e.12 local12 = new e.12(this, this.e);
    e.13 local13 = new e.13(this, this.e);
    e.2 local2 = new e.2(this, this.e);
    e.3 local3 = new e.3(this, this.e);
    e.4 local4 = new e.4(this, this.e);
    this.e.a().a(local7);
    this.e.b().a(local8);
    this.e.c().a(local9);
    this.e.d().a(local10);
    this.e.e().a(local11);
    this.e.f().a(local12);
    this.e.g().a(local13);
    this.e.i().a(local2);
    this.e.j().a(local3);
    this.e.h().a(local4);
  }

  public final void a()
  {
    this.l.d();
    this.b.unregisterReceiver(this.h);
    this.e.d().e();
  }

  public final void b()
  {
    if (this.m != null)
      return;
    this.m = ((PowerManager)this.b.getSystemService("power")).newWakeLock(1, a);
    this.m.acquire();
  }

  public final void c()
  {
    if (this.m == null)
      return;
    this.m.release();
    this.m = null;
  }

  public final void d()
  {
    this.g = false;
    this.b.d();
  }

  public final void e()
  {
    if (this.j != null)
      return;
    this.j = ((WifiManager)this.b.getSystemService("wifi")).createWifiLock("Spotify Wifi Lock");
    this.j.acquire();
  }

  public final void f()
  {
    if (this.j == null)
      return;
    this.j.release();
    this.j = null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.d.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

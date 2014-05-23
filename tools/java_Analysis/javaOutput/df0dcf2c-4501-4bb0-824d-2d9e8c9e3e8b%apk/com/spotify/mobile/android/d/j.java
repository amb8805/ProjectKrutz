package com.spotify.mobile.android.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public final class j extends d
{
  private BroadcastReceiver a;
  private Context b;
  private ConnectivityManager c;

  public j(Context paramContext)
  {
    super("Wifi");
    this.b = paramContext;
    this.c = ((ConnectivityManager)this.b.getSystemService("connectivity"));
    this.a = new j.1(this);
    if (f())
      a();
    paramContext.registerReceiver(this.a, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }

  private boolean f()
  {
    int i = 1;
    NetworkInfo localNetworkInfo = this.c.getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
      i = 0;
    while (localNetworkInfo.getType() == i)
      return i;
    return false;
  }

  public final void e()
  {
    this.b.unregisterReceiver(this.a);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.d.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

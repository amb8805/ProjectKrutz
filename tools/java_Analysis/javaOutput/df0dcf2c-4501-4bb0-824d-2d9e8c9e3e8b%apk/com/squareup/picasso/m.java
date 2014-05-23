package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;

final class m extends BroadcastReceiver
{
  private final ConnectivityManager b;

  m(j paramj, Context paramContext)
  {
    this.b = ((ConnectivityManager)paramContext.getSystemService("connectivity"));
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    String str;
    do
    {
      return;
      str = paramIntent.getAction();
      Bundle localBundle = paramIntent.getExtras();
      if ("android.intent.action.AIRPLANE_MODE".equals(str))
      {
        j localj2 = this.a;
        boolean bool = localBundle.getBoolean("state", false);
        Handler localHandler1 = localj2.f;
        Handler localHandler2 = localj2.f;
        if (bool);
        for (int i = 1; ; i = 0)
        {
          localHandler1.sendMessage(localHandler2.obtainMessage(10, i, 0));
          return;
        }
      }
    }
    while (!"android.net.conn.CONNECTIVITY_CHANGE".equals(str));
    j localj1 = this.a;
    NetworkInfo localNetworkInfo = this.b.getActiveNetworkInfo();
    localj1.f.sendMessage(localj1.f.obtainMessage(9, localNetworkInfo));
  }
}

/* Location:
 * Qualified Name:     com.squareup.picasso.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.spotify.mobile.android.service.managers.d;

public class SpotifyBatteryReceiver extends BroadcastReceiver
{
  private d a;
  private long b = 0L;
  private int c = -1;

  public SpotifyBatteryReceiver(d paramd)
  {
    this.a = paramd;
  }

  public static IntentFilter a()
  {
    return new IntentFilter("android.intent.action.BATTERY_CHANGED");
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i = -1;
    int j = paramIntent.getIntExtra("status", 1);
    String str1;
    String str2;
    switch (j)
    {
    default:
      str1 = "unknown";
      switch (paramIntent.getIntExtra("plugged", i))
      {
      default:
        str2 = "other";
      case 0:
      case 1:
      case 2:
      }
      break;
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      if ((SystemClock.elapsedRealtime() >= 120000L + this.b) || (j != this.c))
        break label158;
      return;
      str1 = "charging";
      break;
      str1 = "discharging";
      break;
      str1 = "not_charging";
      break;
      str1 = "full";
      break;
      str2 = "battery";
      continue;
      str2 = "ac";
      continue;
      str2 = "usb";
    }
    label158: this.c = j;
    this.b = SystemClock.elapsedRealtime();
    int k = paramIntent.getIntExtra("level", i);
    int m = paramIntent.getIntExtra("scale", i);
    d locald = this.a;
    if ((k >= 0) && (m > 0))
      i = k * 100 / m;
    locald.a(str1, str2, i);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.SpotifyBatteryReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

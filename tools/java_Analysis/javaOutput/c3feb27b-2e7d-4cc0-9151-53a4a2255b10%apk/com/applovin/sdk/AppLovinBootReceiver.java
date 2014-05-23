package com.applovin.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AppLovinBootReceiver extends BroadcastReceiver
{
  public AppLovinBootReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("android.intent.action.BOOT_COMPLETED".equals(paramIntent.getAction()))
      paramContext.startService(new Intent(paramContext, AppLovinService.class));
  }
}

/* Location:
 * Qualified Name:     com.applovin.sdk.AppLovinBootReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

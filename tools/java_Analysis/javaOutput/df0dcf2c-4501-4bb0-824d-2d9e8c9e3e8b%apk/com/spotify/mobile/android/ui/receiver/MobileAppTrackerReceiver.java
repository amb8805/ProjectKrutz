package com.spotify.mobile.android.ui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.mobileapptracker.MobileAppTrackerIntentService;

public class MobileAppTrackerReceiver extends BroadcastReceiver
{
  public MobileAppTrackerReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intent localIntent = MobileAppTrackerIntentService.a(paramContext, "com.spotify.mobile.android.service.mat.install.referrer");
    Bundle localBundle = paramIntent.getExtras();
    if (localBundle != null)
      localIntent.putExtras(localBundle);
    paramContext.startService(localIntent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.receiver.MobileAppTrackerReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

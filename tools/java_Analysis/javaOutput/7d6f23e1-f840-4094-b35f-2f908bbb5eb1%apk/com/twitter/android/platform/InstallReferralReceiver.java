package com.twitter.android.platform;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class InstallReferralReceiver extends BroadcastReceiver
{
  public InstallReferralReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    p localp = new p(paramContext);
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramIntent.getStringExtra("referrer");
    localp.execute(arrayOfString);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.InstallReferralReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

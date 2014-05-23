package com.twitter.android.platform;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class C2DMReceiver extends BroadcastReceiver
{
  public C2DMReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    C2DMService.a(paramContext, paramIntent);
    setResult(-1, null, null);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.C2DMReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

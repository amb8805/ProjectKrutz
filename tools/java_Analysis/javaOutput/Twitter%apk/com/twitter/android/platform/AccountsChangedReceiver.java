package com.twitter.android.platform;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AccountsChangedReceiver extends BroadcastReceiver
{
  public AccountsChangedReceiver()
  {
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    new l(paramContext).execute(new Void[0]);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.platform.AccountsChangedReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

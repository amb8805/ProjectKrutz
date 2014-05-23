package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.Session;

final class aa extends BroadcastReceiver
{
  private aa(z paramz)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(paramIntent.getAction()))
    {
      Session localSession = Session.h();
      if (localSession != null)
        localSession.a(z.a(this.a));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ae extends BroadcastReceiver
{
  private ae(ad paramad)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(paramIntent.getAction()))
    {
      Session localSession2 = Session.h();
      if ((localSession2 != null) && (ad.a(this.a) != null))
        localSession2.a(ad.a(this.a));
    }
    Session localSession1;
    do
    {
      do
        return;
      while (!"com.facebook.sdk.ACTIVE_SESSION_UNSET".equals(paramIntent.getAction()));
      localSession1 = Session.h();
    }
    while ((localSession1 == null) || (ad.a(this.a) == null));
    localSession1.b(ad.a(this.a));
  }
}

/* Location:
 * Qualified Name:     com.facebook.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

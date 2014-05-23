package com.spotify.mobile.android.ui.activity;

import android.os.Handler;
import android.os.Message;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.bp;
import java.lang.ref.WeakReference;

final class g extends Handler
{
  private WeakReference<MainActivity> a;

  public g(MainActivity paramMainActivity)
  {
    this.a = new WeakReference(paramMainActivity);
  }

  public final void handleMessage(Message paramMessage)
  {
    MainActivity localMainActivity = (MainActivity)this.a.get();
    if ((localMainActivity == null) || (!MainActivity.a(localMainActivity)));
    do
    {
      return;
      switch (paramMessage.what)
      {
      default:
        Assertion.a("Sending ourselves messages we do not know how to handle..");
        return;
      case 0:
        MainActivity.b(localMainActivity);
      case 1:
      case 2:
      }
    }
    while (!MainActivity.c(localMainActivity));
    bp.b("Login done, dispatching queued Intents", new Object[0]);
    MainActivity.d(localMainActivity);
    return;
    MainActivity.e(localMainActivity);
    return;
    MainActivity.f(localMainActivity);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.ui.fragments;

import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.ui.actions.d;
import com.spotify.mobile.android.ui.view.DisableableViewPager;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri;

final class r
  implements Runnable
{
  private boolean b = false;

  r(q paramq)
  {
  }

  public final void run()
  {
    if (this.b)
      return;
    this.b = true;
    q.e(this.a).setEnabled(false);
    int i = q.e(this.a).b();
    int j = i - this.a.c;
    String str;
    if (j > 0)
    {
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.ah, ClientEvent.SubEvent.ak);
      if (q.f(this.a))
      {
        str = "true";
        localClientEvent.a("suggested_track", str);
        q.g(this.a);
        a.a(this.a.i(), ViewUri.t, localClientEvent);
      }
    }
    while (true)
    {
      if ((!q.h(this.a)) || (j <= 0))
        break label213;
      q.e(this.a).a(i - 1);
      q.i(this.a);
      d.d(this.a.i());
      q.e(this.a).setEnabled(true);
      return;
      str = "false";
      break;
      if (j < 0)
      {
        q.g(this.a);
        a.a(this.a.i(), ViewUri.t, new ClientEvent(ClientEvent.Event.ah, ClientEvent.SubEvent.al));
      }
    }
    label213: if (j < 0)
    {
      q.i(this.a);
      d.b(this.a.i(), Math.abs(j));
      return;
    }
    if (j > 0)
    {
      q.a(this.a, q.j(this.a));
      q.i(this.a);
      d.c(this.a.i(), j);
      return;
    }
    q.e(this.a).setEnabled(true);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.util.tracking;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ViewUri;
import com.spotify.mobile.android.util.ViewUri.Verified;
import com.spotify.mobile.android.util.bp;
import java.util.HashSet;

final class a
  implements b
{
  private Context a;
  private HashSet<String> b = new HashSet();
  private long c;
  private boolean d;
  private boolean e;

  a(Context paramContext)
  {
    this.a = paramContext;
    this.b.add(ViewUri.aG.toString());
    this.b.add(ViewUri.aC.toString());
    this.b.add(ViewUri.aA.toString());
    this.b.add(ViewUri.aF.toString());
    this.b.add(ViewUri.aB.toString());
    this.b.add(ViewUri.az.toString());
    this.b.add(ViewUri.k.toString());
  }

  public final void a()
  {
    if (this.d)
      bp.d("Cold start processor aborted while waiting for the first view", new Object[0]);
  }

  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if ((!TextUtils.equals(paramString1, "TYPE_COLD_START")) && (!TextUtils.equals(paramString1, "TYPE_COLD_START_CANCEL")) && (!TextUtils.equals(paramString1, "TYPE_VIEW_LOADING")));
    do
    {
      return;
      if (TextUtils.equals(paramString1, "TYPE_COLD_START"))
      {
        if (this.d)
        {
          bp.d("Already received a cold start event.", new Object[0]);
          return;
        }
        if (!paramBundle.containsKey("ARG_TIMESTAMP"))
        {
          bp.e("Missing timestamp argument: %s", new Object[] { paramBundle });
          return;
        }
        this.d = true;
        this.c = paramBundle.getLong("ARG_TIMESTAMP");
        return;
      }
      if (TextUtils.equals(paramString1, "TYPE_COLD_START_CANCEL"))
      {
        this.e = true;
        this.d = false;
        bp.b("Cancelled cold start tracking.", new Object[0]);
        return;
      }
    }
    while ((!"EVENT_COMPLETE".equals(paramString2)) || (this.e) || (!this.d) || (!paramBundle.containsKey("ARG_URI")) || (!paramBundle.containsKey("ARG_TIMESTAMP")));
    long l1 = paramBundle.getLong("ARG_TIMESTAMP");
    String str = paramBundle.getString("ARG_URI");
    if (!this.b.contains(str))
    {
      bp.d("Received complete event for uri %s that is not in cold start list", new Object[] { str });
      return;
    }
    long l2 = l1 - this.c;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Long.valueOf(l2);
    bp.b("Cold start took: %d", arrayOfObject);
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.ae);
    localClientEvent.a("time-taken", String.valueOf(l2 / 1000.0D));
    c.a(com.spotify.mobile.android.ui.actions.a.class);
    com.spotify.mobile.android.ui.actions.a.a(this.a, ViewUri.a, localClientEvent);
    this.d = false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.tracking.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

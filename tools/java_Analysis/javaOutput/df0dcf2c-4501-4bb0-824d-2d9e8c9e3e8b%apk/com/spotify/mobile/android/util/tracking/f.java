package com.spotify.mobile.android.util.tracking;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.c.e;
import android.text.TextUtils;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.ui.actions.a;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.bp;

final class f
  implements b
{
  private Context a;
  private e<g> b = new e();

  f(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a()
  {
    int i = this.b.a();
    for (int j = 0; j < i; j++)
    {
      g localg = (g)this.b.b(j);
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = localg.a;
      bp.d("Aborted waiting for view. Uri: %s", arrayOfObject);
    }
  }

  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    if (!TextUtils.equals(paramString1, "TYPE_VIEW_LOADING"))
      return;
    if ("EVENT_START".equals(paramString2))
    {
      if ((!paramBundle.containsKey("ARG_ID")) || (!paramBundle.containsKey("ARG_URI")) || (!paramBundle.containsKey("ARG_TIMESTAMP")))
      {
        bp.e("Invalid arguments: %s", new Object[] { paramBundle });
        return;
      }
      long l5 = paramBundle.getLong("ARG_TIMESTAMP");
      long l6 = paramBundle.getLong("ARG_ID");
      String str3 = paramBundle.getString("ARG_URI");
      if (this.b.a(l6) != null)
      {
        g localg2 = (g)this.b.a(l6);
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = localg2.a;
        arrayOfObject3[1] = Long.valueOf(l6);
        bp.d("Already started view %s with id %d", arrayOfObject3);
      }
      this.b.a(l6, new g(str3, l5));
      return;
    }
    if ("EVENT_COMPLETE".equals(paramString2))
    {
      if ((!paramBundle.containsKey("ARG_ID")) || (!paramBundle.containsKey("ARG_URI")) || (!paramBundle.containsKey("ARG_TIMESTAMP")))
      {
        bp.e("Invalid arguments: %s", new Object[] { paramBundle });
        return;
      }
      long l2 = paramBundle.getLong("ARG_TIMESTAMP");
      long l3 = paramBundle.getLong("ARG_ID");
      String str2 = paramBundle.getString("ARG_URI");
      g localg1 = (g)this.b.a(l3);
      if (localg1 == null)
      {
        bp.e("Could not find matching start event for view %s", new Object[] { str2 });
        return;
      }
      this.b.c(l3);
      if (!TextUtils.equals(str2, localg1.a))
      {
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = Long.valueOf(l3);
        arrayOfObject2[1] = localg1.a;
        arrayOfObject2[2] = str2;
        bp.e("Uri mismatch for view with id %d. Expected: %s, found %s", arrayOfObject2);
        return;
      }
      long l4 = l2 - localg1.b;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = str2;
      arrayOfObject1[1] = Long.valueOf(l4);
      bp.b("view %s took %dms. to load", arrayOfObject1);
      ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.aj);
      localClientEvent.a("time-taken", String.valueOf(l4 / 1000.0D));
      Context localContext = this.a;
      c.a(a.class);
      localContext.startService(a.a(this.a, str2, "", localClientEvent));
      return;
    }
    if ("EVENT_CANCEL".equals(paramString2))
    {
      if ((!paramBundle.containsKey("ARG_ID")) || (!paramBundle.containsKey("ARG_URI")))
      {
        bp.e("Invalid arguments: %s", new Object[] { paramBundle });
        return;
      }
      long l1 = paramBundle.getLong("ARG_ID");
      String str1 = paramBundle.getString("ARG_URI");
      if (this.b.a(l1) == null)
      {
        bp.d("Could not find matching start event for view %s", new Object[] { str1 });
        return;
      }
      bp.b("Cancelling %s", new Object[] { str1 });
      this.b.c(l1);
      return;
    }
    bp.e("Unknown event type %s", new Object[] { paramString2 });
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.tracking.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

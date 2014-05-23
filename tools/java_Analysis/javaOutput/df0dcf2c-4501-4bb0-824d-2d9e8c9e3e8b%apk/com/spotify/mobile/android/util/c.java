package com.spotify.mobile.android.util;

import android.content.Context;
import com.spotify.mobile.android.ui.actions.a;

public final class c
{
  private a a = (a)com.spotify.mobile.android.c.c.a(a.class);

  public c()
  {
  }

  public final void a(Context paramContext, ViewUri.Verified paramVerified, String paramString)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, ClientEvent.SubEvent.aI);
    localClientEvent.a("adId", paramString);
    a.a(paramContext, paramVerified, localClientEvent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

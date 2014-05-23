package com.spotify.mobile.android.spotlets.browse.b;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.cc;

public final class a
{
  private final e a;
  private com.spotify.mobile.android.ui.actions.a b = (com.spotify.mobile.android.ui.actions.a)c.a(com.spotify.mobile.android.ui.actions.a.class);

  public a(e parame)
  {
    cc.a(parame, "Don't create ClickLogger with null logInfo");
    this.a = parame;
  }

  public final ClientEvent a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.U, this.a.a());
    localClientEvent.a("index", String.valueOf(paramInt));
    localClientEvent.a("name", (String)cc.a(paramString1));
    localClientEvent.a("target_uri", (String)cc.a(paramString2));
    if (!TextUtils.isEmpty(paramString3))
      localClientEvent.a("section", paramString3);
    if (!TextUtils.isEmpty(paramString4))
      localClientEvent.a("action", paramString4);
    return localClientEvent;
  }

  public final void a(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    ClientEvent localClientEvent = a(paramInt, paramString1, paramString2, paramString3, null);
    com.spotify.mobile.android.ui.actions.a.a(paramContext, this.a.b(), this.a.c(), localClientEvent);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

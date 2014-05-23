package com.spotify.mobile.android.spotlets.search.c;

import com.google.common.base.i;
import com.spotify.cosmos.android.router.PlayerState;
import com.spotify.mobile.android.spotlets.search.e.d;
import com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import com.spotify.mobile.android.spotlets.search.model.g;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEvent.Event;
import com.spotify.mobile.android.util.ClientEvent.SubEvent;
import com.spotify.mobile.android.util.ViewUri.SubView;

public final class c
  implements b
{
  private final com.spotify.mobile.android.spotlets.search.a a;
  private final com.spotify.mobile.android.ui.actions.a b;
  private final a c;
  private boolean d;

  public c(com.spotify.mobile.android.spotlets.search.a parama)
  {
    this.a = parama;
    this.b = ((com.spotify.mobile.android.ui.actions.a)com.spotify.mobile.android.c.c.a(com.spotify.mobile.android.ui.actions.a.class));
    this.c = new a(this);
  }

  public static ViewUri.SubView a(SearchLoader.SearchType paramSearchType)
  {
    switch (c.1.a[paramSearchType.ordinal()])
    {
    default:
      return ViewUri.SubView.a;
    case 1:
      return ViewUri.SubView.y;
    case 2:
      return ViewUri.SubView.w;
    case 3:
      return ViewUri.SubView.v;
    case 4:
      return ViewUri.SubView.x;
    case 5:
    }
    return ViewUri.SubView.u;
  }

  private void a(ClientEvent paramClientEvent)
  {
    if (this.d)
      com.spotify.mobile.android.ui.actions.a.a(this.a.d(), this.a.f_(), this.a.i_(), paramClientEvent);
  }

  public final void a()
  {
    a(ClientEvent.a(ViewUri.SubView.s.toString(), ClientEvent.SubEvent.aL, null, null));
  }

  public final void a(SearchLoader.SearchType paramSearchType, int paramInt)
  {
    ViewUri.SubView localSubView = a(paramSearchType);
    if (localSubView != ViewUri.SubView.a);
    for (boolean bool = true; ; bool = false)
    {
      i.a(bool, "unrecognized section!");
      ClientEvent localClientEvent = ClientEvent.a(localSubView.toString(), ClientEvent.SubEvent.aA, null, Long.valueOf(paramInt));
      localClientEvent.a("query", this.a.k());
      a(localClientEvent);
      return;
    }
  }

  public final void a(String paramString, int paramInt)
  {
    ClientEvent localClientEvent = ClientEvent.a(ViewUri.SubView.s.toString(), ClientEvent.SubEvent.aK, null, Long.valueOf(paramInt));
    localClientEvent.a("name", paramString);
    a(localClientEvent);
  }

  public final void a(String paramString, int paramInt1, int paramInt2, g paramg)
  {
    ClientEvent localClientEvent = ClientEvent.a(paramString, ClientEvent.SubEvent.K, paramg.getUri(), Long.valueOf(paramInt2));
    localClientEvent.a("row", String.valueOf(paramInt1));
    localClientEvent.a("query", this.a.k());
    localClientEvent.a("name", paramg.getName());
    if ((paramg instanceof SearchResults.Track))
      localClientEvent.a("is_playing", String.valueOf(this.a.n().a().playing));
    a(localClientEvent);
  }

  public final void b()
  {
    ClientEvent localClientEvent = new ClientEvent(ClientEvent.Event.X, ClientEvent.SubEvent.L);
    localClientEvent.a("query", this.a.f().b());
    a(localClientEvent);
  }

  public final void c()
  {
    this.d = true;
    this.a.f().a(this.c);
  }

  public final void d()
  {
    this.d = false;
    this.a.f().b(this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.c.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

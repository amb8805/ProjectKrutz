package com.spotify.mobile.android.spotlets.search.a.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.SpotifyIconView;
import com.spotify.android.paste.widget.h;
import com.spotify.mobile.android.spotlets.common.adapter.f;
import com.spotify.mobile.android.spotlets.search.a.b.c;

public abstract class a<D extends com.spotify.mobile.android.spotlets.search.model.g>
  implements f<ListItemView, D>
{
  final com.spotify.mobile.android.spotlets.search.a a;
  private final Class<D> b;

  public a(com.spotify.mobile.android.spotlets.search.a parama, Class<D> paramClass)
  {
    this.a = parama;
    this.b = paramClass;
  }

  public final Class<ListItemView> a()
  {
    return ListItemView.class;
  }

  protected final String a(int paramInt, Number paramNumber)
  {
    return c.a(paramInt, paramNumber, this.a.d());
  }

  public void a(int paramInt, ListItemView paramListItemView, D paramD, ViewGroup paramViewGroup)
  {
    paramListItemView.b(true);
    paramListItemView.setTag(2131362209, paramD);
  }

  public ListItemView b(int paramInt, ViewGroup paramViewGroup)
  {
    Context localContext = this.a.d();
    ListItemView localListItemView;
    if (c())
    {
      localListItemView = h.h(localContext, paramViewGroup);
      if (!this.a.h_())
        break label72;
      localSpotifyIconView = h.g(localContext, localListItemView);
      localSpotifyIconView.a(SpotifyIcon.cQ);
      localListItemView.b(localSpotifyIconView);
    }
    label72: 
    while (!d())
    {
      SpotifyIconView localSpotifyIconView;
      return localListItemView;
      localListItemView = h.i(localContext, paramViewGroup);
      break;
    }
    localListItemView.b(com.spotify.mobile.android.ui.stuff.g.a(localContext));
    return localListItemView;
  }

  public final Class<D> b()
  {
    return this.b;
  }

  protected boolean c()
  {
    return true;
  }

  protected boolean d()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

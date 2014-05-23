package com.spotify.mobile.android.spotlets.search.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.widget.LinearLayout;
import com.spotify.mobile.android.spotlets.search.a;
import com.spotify.mobile.android.spotlets.search.a.b.b;
import com.spotify.mobile.android.spotlets.search.b.e;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Playlist;
import java.util.WeakHashMap;

public final class f
  implements View.OnCreateContextMenuListener, com.spotify.mobile.android.spotlets.common.adapter.f<LinearLayout, b>
{
  private final LayoutInflater a;
  private final a b;
  private final WeakHashMap<View, SearchResults.Playlist> c = new WeakHashMap();
  private final WeakHashMap<SearchResults.Playlist, Integer> d = new WeakHashMap();
  private final g e;
  private final View.OnClickListener f = new f.1(this);
  private final Drawable g;
  private final int h;

  public f(a parama, g paramg)
  {
    this.e = ((g)com.google.common.base.i.a(paramg));
    this.b = ((a)com.google.common.base.i.a(parama));
    this.a = LayoutInflater.from(this.b.d());
    this.h = parama.d().getResources().getDimensionPixelSize(2131427362);
    this.g = com.spotify.mobile.android.ui.stuff.i.f(parama.d());
  }

  public final Class<LinearLayout> a()
  {
    return LinearLayout.class;
  }

  public final Class<b> b()
  {
    return b.class;
  }

  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    this.b.o().a(paramContextMenu, paramView);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

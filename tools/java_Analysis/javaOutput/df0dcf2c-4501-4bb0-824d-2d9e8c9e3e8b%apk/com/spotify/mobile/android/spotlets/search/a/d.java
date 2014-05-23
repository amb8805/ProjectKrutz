package com.spotify.mobile.android.spotlets.search.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable;;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.f;
import com.spotify.mobile.android.spotlets.search.a.b.c;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Album;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.ResultList;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.ResultType;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import com.spotify.mobile.android.spotlets.search.model.g;
import com.spotify.mobile.android.spotlets.search.model.h;
import java.util.List;

public final class d extends BaseAdapter
  implements com.spotify.mobile.android.spotlets.common.adapter.d<g>
{
  private final Drawable a;
  private final Drawable b;
  private final boolean c;
  private final com.spotify.mobile.android.spotlets.common.adapter.a<g> d;
  private final com.spotify.mobile.android.spotlets.search.a e;
  private SearchResults f;

  public d(com.spotify.mobile.android.spotlets.common.adapter.a<g> parama, com.spotify.mobile.android.spotlets.search.a parama1)
  {
    this.d = ((com.spotify.mobile.android.spotlets.common.adapter.a)com.google.common.base.i.a(parama));
    this.e = ((com.spotify.mobile.android.spotlets.search.a)com.google.common.base.i.a(parama1));
    Context localContext = parama1.d();
    if (!f.a(localContext));
    for (boolean bool = true; ; bool = false)
    {
      this.c = bool;
      this.d.a(this);
      if (!this.c)
        break;
      this.a = localContext.getResources().getDrawable(2130837635);
      this.b = localContext.getResources().getDrawable(2130837634);
      return;
    }
    this.a = com.spotify.mobile.android.ui.stuff.i.e(localContext);
    this.b = com.spotify.mobile.android.ui.stuff.i.a(localContext, SpotifyIcon.b);
  }

  private SearchResults.ResultType a()
  {
    if ((this.f != null) && (this.f.hasResults()))
      return this.f.topHit;
    return SearchResults.ResultType.a;
  }

  private g a(int paramInt)
  {
    switch (d.1.a[a().ordinal()])
    {
    default:
      throw new IllegalStateException("Unrecognized top hit type");
    case 3:
      return (g)this.f.artists.results.get(0);
    case 4:
      return (g)this.f.albums.results.get(0);
    case 2:
      return b(paramInt);
    case 5:
      return (g)this.f.playlists.results.get(0);
    case 6:
    }
    return (g)this.f.profiles.results.get(0);
  }

  private g b(int paramInt)
  {
    Object localObject = (SearchResults.Track)this.f.tracks.results.get(0);
    switch (paramInt)
    {
    default:
      throw new AssertionError("Invalid position " + paramInt);
    case 1:
      localObject = (g)((SearchResults.Track)localObject).artists.get(0);
    case 0:
      return localObject;
    case 2:
    }
    return ((SearchResults.Track)localObject).album;
  }

  public final void a(SearchResults paramSearchResults)
  {
    this.f = paramSearchResults;
    notifyDataSetChanged();
  }

  public final boolean areAllItemsEnabled()
  {
    return true;
  }

  public final int getCount()
  {
    int i = d.1.a[a().ordinal()];
    int j = 0;
    switch (i)
    {
    default:
    case 1:
    case 2:
    }
    do
    {
      j = 1;
      return j;
    }
    while (!this.e.g_());
    if (((SearchResults.Track)this.f.tracks.results.get(0)).album != null)
      return 3;
    return 2;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final int getItemViewType(int paramInt)
  {
    if (paramInt == 0)
    {
      if (isEnabled(paramInt))
        return 0;
      return 1;
    }
    return 2;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    boolean bool1 = false;
    if (paramInt == 0)
      return this.d.getView(paramInt, paramView, paramViewGroup);
    h localh = (h)b(paramInt);
    ListItemView localListItemView;
    if (paramView != null)
    {
      localListItemView = (ListItemView)paramView;
      localListItemView.d();
    }
    Object localObject;
    int i;
    while ((localh instanceof SearchResults.Album))
    {
      localObject = this.b;
      i = 2131689830;
      c.a(localListItemView, localh.getImageUri(), (Drawable)localObject, bool1);
      localListItemView.a(this.e.d().getString(i));
      localListItemView.b(localh.getName());
      return localListItemView;
      localListItemView = (ListItemView)LayoutInflater.from(this.e.d()).inflate(2130903118, paramViewGroup, false);
    }
    Drawable localDrawable = this.a;
    if (!this.c);
    for (boolean bool2 = true; ; bool2 = false)
    {
      bool1 = bool2;
      i = 2131689831;
      localObject = localDrawable;
      break;
    }
  }

  public final int getViewTypeCount()
  {
    return 3;
  }

  public final boolean isEmpty()
  {
    return a() == SearchResults.ResultType.a;
  }

  public final boolean isEnabled(int paramInt)
  {
    return (!this.e.g_()) || (!(a(paramInt) instanceof SearchResults.Track));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

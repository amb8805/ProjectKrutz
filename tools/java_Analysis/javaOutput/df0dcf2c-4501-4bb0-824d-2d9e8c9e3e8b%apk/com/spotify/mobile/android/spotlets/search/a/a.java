package com.spotify.mobile.android.spotlets.search.a;

import android.content.Context;
import android.content.res.Resources;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.mobile.android.spotlets.common.adapter.SimpleHeaderViewListAdapter;
import com.spotify.mobile.android.spotlets.search.a.a.e;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Album;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Artist;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Profile;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;

public final class a
{
  public static final Object a = new Object();
  final b b;
  private final com.spotify.mobile.android.spotlets.search.a c;
  private final com.spotify.mobile.android.spotlets.search.a.a.g d;

  public a(com.spotify.mobile.android.spotlets.search.a parama, com.spotify.mobile.android.spotlets.search.a.a.g paramg, b paramb)
  {
    this.d = ((com.spotify.mobile.android.spotlets.search.a.a.g)com.google.common.base.i.a(paramg, "null playlist click listener"));
    this.c = ((com.spotify.mobile.android.spotlets.search.a)com.google.common.base.i.a(parama, "null search context"));
    this.b = ((b)com.google.common.base.i.a(paramb, "null footer listener"));
  }

  private <T> SimpleHeaderViewListAdapter a(ListView paramListView, int paramInt1, int paramInt2, com.spotify.mobile.android.spotlets.common.adapter.d<T> paramd, com.spotify.mobile.android.spotlets.common.adapter.f<?, ? extends T>[] paramArrayOff)
  {
    com.spotify.mobile.android.spotlets.common.adapter.c localc = new com.spotify.mobile.android.spotlets.common.adapter.c().a(paramd);
    int i = paramArrayOff.length;
    for (int j = 0; j < i; j++)
      localc.a(paramArrayOff[j]);
    return a(paramListView, localc.a(), paramInt1, paramInt2, a);
  }

  private com.spotify.mobile.android.spotlets.search.a.a.d b()
  {
    return new com.spotify.mobile.android.spotlets.search.a.a.d(this.c);
  }

  private com.spotify.mobile.android.spotlets.search.a.a.c c()
  {
    return new com.spotify.mobile.android.spotlets.search.a.a.c(this.c);
  }

  private com.spotify.mobile.android.spotlets.search.a.a.i d()
  {
    return new com.spotify.mobile.android.spotlets.search.a.a.i(this.c);
  }

  private com.spotify.mobile.android.spotlets.search.a.a.h e()
  {
    return new com.spotify.mobile.android.spotlets.search.a.a.h(this.c);
  }

  private e f()
  {
    return new e(this.c);
  }

  public final ListAdapter a(ListView paramListView, com.spotify.mobile.android.spotlets.common.adapter.d<SearchResults.Artist> paramd)
  {
    com.spotify.mobile.android.spotlets.common.adapter.f[] arrayOff = new com.spotify.mobile.android.spotlets.common.adapter.f[1];
    arrayOff[0] = b();
    return a(paramListView, 2131690192, 2131689820, paramd, arrayOff);
  }

  public final SimpleHeaderViewListAdapter a(ListView paramListView, ListAdapter paramListAdapter, int paramInt1, int paramInt2, Object paramObject)
  {
    com.spotify.mobile.android.spotlets.common.adapter.g localg = new com.spotify.mobile.android.spotlets.common.adapter.g(paramListView).a(paramListAdapter).a();
    Context localContext = this.c.d();
    if (paramInt1 != 0)
    {
      SectionHeaderView localSectionHeaderView = new SectionHeaderView(localContext);
      localSectionHeaderView.a(localSectionHeaderView.getResources().getString(paramInt1));
      localg.a(localSectionHeaderView, paramObject);
    }
    if (paramInt2 != 0)
    {
      ListItemView localListItemView = com.spotify.android.paste.widget.h.j(localContext, paramListView);
      localListItemView.a(localContext.getString(paramInt2));
      localg.b(localListItemView, paramObject);
    }
    SimpleHeaderViewListAdapter localSimpleHeaderViewListAdapter = localg.b();
    if ((paramInt2 != 0) && ((paramListAdapter instanceof BaseAdapter)))
      paramListAdapter.registerDataSetObserver(new a.1(this, localSimpleHeaderViewListAdapter));
    return localSimpleHeaderViewListAdapter;
  }

  public final d a()
  {
    return new d(new com.spotify.mobile.android.spotlets.common.adapter.c().a(b()).a(c()).a(d()).a(f()).a(e()).a(), this.c);
  }

  public final ListAdapter b(ListView paramListView, com.spotify.mobile.android.spotlets.common.adapter.d<SearchResults.Album> paramd)
  {
    com.spotify.mobile.android.spotlets.common.adapter.f[] arrayOff = new com.spotify.mobile.android.spotlets.common.adapter.f[1];
    arrayOff[0] = c();
    return a(paramListView, 2131690191, 2131689818, paramd, arrayOff);
  }

  public final ListAdapter c(ListView paramListView, com.spotify.mobile.android.spotlets.common.adapter.d<SearchResults.Track> paramd)
  {
    com.spotify.mobile.android.spotlets.common.adapter.f[] arrayOff = new com.spotify.mobile.android.spotlets.common.adapter.f[1];
    arrayOff[0] = d();
    return a(paramListView, 2131690193, 2131689826, paramd, arrayOff);
  }

  public final ListAdapter d(ListView paramListView, com.spotify.mobile.android.spotlets.common.adapter.d<Object> paramd)
  {
    com.spotify.mobile.android.spotlets.common.adapter.f[] arrayOff = new com.spotify.mobile.android.spotlets.common.adapter.f[2];
    arrayOff[0] = f();
    arrayOff[1] = new com.spotify.mobile.android.spotlets.search.a.a.f(this.c, this.d);
    return a(paramListView, 2131689815, 2131689822, paramd, arrayOff);
  }

  public final ListAdapter e(ListView paramListView, com.spotify.mobile.android.spotlets.common.adapter.d<SearchResults.Profile> paramd)
  {
    com.spotify.mobile.android.spotlets.common.adapter.f[] arrayOff = new com.spotify.mobile.android.spotlets.common.adapter.f[1];
    arrayOff[0] = e();
    return a(paramListView, 2131689816, 2131689824, paramd, arrayOff);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

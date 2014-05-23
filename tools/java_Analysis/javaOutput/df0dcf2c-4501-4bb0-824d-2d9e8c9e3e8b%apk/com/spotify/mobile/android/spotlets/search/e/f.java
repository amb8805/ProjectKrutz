package com.spotify.mobile.android.spotlets.search.e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.text.style.StyleSpan;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.spotlets.search.a.d;
import com.spotify.mobile.android.spotlets.search.loader.SearchLoader.SearchType;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Album;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Artist;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Profile;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.ResultList;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import com.spotify.mobile.android.ui.adapter.q;
import com.spotify.mobile.android.ui.adapter.w;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;
import com.spotify.mobile.android.util.ui.ScrollPosition;
import java.util.List;

public final class f
{
  private static final ScrollPosition u = new ScrollPosition(0, 0);
  private Runnable A = new f.1(this);
  private Runnable B = new f.4(this);
  private AdapterView.OnItemClickListener C = new f.5(this);
  private View.OnCreateContextMenuListener D = new f.6(this);
  final com.spotify.mobile.android.spotlets.search.a a;
  final g b;
  final com.spotify.mobile.android.spotlets.search.a.c c;
  final q d;
  final d e;
  final com.spotify.mobile.android.spotlets.search.d.f f;
  final com.spotify.mobile.android.spotlets.common.adapter.e<SearchResults.Artist> g;
  final com.spotify.mobile.android.spotlets.common.adapter.e<SearchResults.Album> h;
  final com.spotify.mobile.android.spotlets.common.adapter.e<SearchResults.Track> i;
  final com.spotify.mobile.android.spotlets.common.adapter.e<Object> j;
  final com.spotify.mobile.android.spotlets.common.adapter.e<SearchResults.Profile> k;
  EmptyView l;
  LoadingView m;
  ListView n;
  ViewGroup o;
  SearchLoader.SearchType p;
  String q;
  SearchResults r;
  boolean s;
  boolean t;
  private final int v;
  private final int w;
  private final int x;
  private final Handler y = new Handler(Looper.getMainLooper());
  private final com.spotify.mobile.android.spotlets.search.a.a z;

  public f(com.spotify.mobile.android.spotlets.search.a parama, g paramg)
  {
    this.a = ((com.spotify.mobile.android.spotlets.search.a)cc.a(parama, "Null searchContext"));
    Context localContext = parama.d();
    this.b = ((g)cc.a(paramg, "Null callbacks!"));
    this.v = localContext.getResources().getInteger(2131558407);
    this.w = (int)TypedValue.applyDimension(1, 60.0F, localContext.getResources().getDisplayMetrics());
    this.x = (localContext.getResources().getDisplayMetrics().widthPixels / this.v);
    this.z = new com.spotify.mobile.android.spotlets.search.a.a(this.a, new f.7(this), new f.8(this));
    this.d = new q(this.a.d());
    this.e = this.z.a();
    this.c = new com.spotify.mobile.android.spotlets.search.a.c(localContext);
    this.f = new com.spotify.mobile.android.spotlets.search.d.f(new StyleSpan(1));
    this.g = new com.spotify.mobile.android.spotlets.common.adapter.e();
    this.h = new com.spotify.mobile.android.spotlets.common.adapter.e();
    this.j = new f.9(this);
    this.k = new com.spotify.mobile.android.spotlets.common.adapter.e();
    this.i = new f.10(this);
    this.p = SearchLoader.SearchType.a;
  }

  private void v()
  {
    if (!l())
      throw new IllegalStateException("Root view not inflated");
  }

  public final int a(SearchLoader.SearchType paramSearchType)
  {
    if (paramSearchType == SearchLoader.SearchType.d)
      return this.x;
    return this.w;
  }

  public final View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup)
  {
    this.o = ((ViewGroup)paramLayoutInflater.inflate(2130903250, paramViewGroup, false));
    this.n = ((ListView)this.o.findViewById(16908298));
    this.d.a(this.z.a(this.n, this.e, 2131689817, 0, null), null, 0);
    this.d.a(this.z.c(this.n, this.i), null, 3);
    this.d.a(this.z.a(this.n, this.g), null, 1);
    this.d.a(this.z.b(this.n, this.h), null, 2);
    this.d.a(this.z.d(this.n, this.j), null, 4);
    this.d.a(this.z.e(this.n, this.k), null, 5);
    b localb = new b(this.a.d());
    this.l = new c(localb).a(SpotifyIcon.D).b(Integer.valueOf(2131689813)).a();
    this.d.a(new w(paramLayoutInflater.inflate(2130903119, this.n, false), (byte)0), null, 11);
    this.d.a(new w(this.l, (byte)0), null, 6);
    q localq = this.d;
    f.11 local11 = new f.11(this);
    localq.a(new w(new c(localb).a(SpotifyIcon.cm).a(Integer.valueOf(2131689810)).a(local11).a(), (byte)0), null, 10);
    this.d.a(new w(new c(localb).a(SpotifyIcon.al).a(Integer.valueOf(2131689828)).b(Integer.valueOf(2131689829)).a(), (byte)0), null, 8);
    this.d.a(new w(new c(localb).a(SpotifyIcon.cO).a(Integer.valueOf(2131689945)).b(Integer.valueOf(2131689814)).a(), (byte)0), null, 9);
    this.d.a(this.c, null, 7);
    this.n.setAdapter(this.d);
    this.n.setOnCreateContextMenuListener(this.D);
    this.n.setOnItemClickListener(this.C);
    this.n.setOnTouchListener(new f.2(this));
    t();
    return this.o;
  }

  public final void a()
  {
    v();
    this.d.notifyDataSetChanged();
  }

  public final void a(AbsListView.OnScrollListener paramOnScrollListener)
  {
    v();
    this.n.setOnScrollListener(paramOnScrollListener);
  }

  public final void a(SearchResults paramSearchResults, SearchLoader.SearchType paramSearchType, String paramString)
  {
    v();
    this.r = ((SearchResults)cc.a(paramSearchResults, "Don't call setResults with null results"));
    this.f.a(paramString);
    this.p = paramSearchType;
    this.q = paramString;
    this.e.a(this.r);
    this.g.a(this.r.artists.results);
    this.h.a(this.r.albums.results);
    this.i.a(this.r.tracks.results);
    com.spotify.mobile.android.spotlets.common.adapter.e locale = this.j;
    if (this.p == SearchLoader.SearchType.d);
    int[] arrayOfInt;
    for (List localList = com.spotify.mobile.android.spotlets.search.a.b.b.a(this.r.playlists.results, this.v); ; localList = this.r.playlists.results)
    {
      locale.a(localList);
      this.k.a(this.r.profiles.results);
      arrayOfInt = new int[this.r.sortedCategory.length];
      for (int i1 = 0; i1 < arrayOfInt.length; i1++)
        arrayOfInt[i1] = com.spotify.mobile.android.spotlets.search.d.e.a(this.r.sortedCategory[i1]);
    }
    this.d.a(arrayOfInt);
    this.d.d(0);
    this.d.d(1);
    this.d.d(2);
    this.d.d(3);
    this.d.d(4);
    this.d.d(5);
  }

  public final void a(ScrollPosition paramScrollPosition)
  {
    v();
    if (paramScrollPosition.a < this.d.getCount())
    {
      ListView localListView = this.n;
      if ((localListView instanceof ListView))
      {
        ((ListView)localListView).setSelectionFromTop(paramScrollPosition.a, paramScrollPosition.b);
        return;
      }
      localListView.setSelection(paramScrollPosition.a);
      return;
    }
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramScrollPosition.a);
    bp.d("Invalid scroll position %d", arrayOfObject);
  }

  public final void a(String paramString)
  {
    this.c.a(paramString);
  }

  public final void a(boolean paramBoolean)
  {
    v();
    if (paramBoolean)
    {
      this.d.d(new int[] { 11 });
      return;
    }
    this.d.b(new int[] { 11 });
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    v();
    if (paramBoolean1)
      if (paramBoolean2)
        this.y.postDelayed(this.B, 800L);
    do
    {
      return;
      this.B.run();
      return;
      this.y.removeCallbacks(this.B);
    }
    while (this.m == null);
    this.m.b();
  }

  public final void a(String[] paramArrayOfString)
  {
    this.c.a((String[])cc.a(paramArrayOfString, "null search queries!"));
  }

  public final void b(boolean paramBoolean)
  {
    a(paramBoolean, true);
  }

  public final boolean b()
  {
    return (this.r != null) && (this.r.hasResults());
  }

  public final boolean c()
  {
    return !this.c.isEmpty();
  }

  public final String[] d()
  {
    return this.c.a();
  }

  public final SearchResults.ResultList<?> e()
  {
    v();
    if (this.r == null)
      throw new IllegalStateException("Cannot call with no results!");
    if (!k())
      throw new IllegalStateException("Cannot call if not in drill down");
    switch (f.3.a[this.p.ordinal()])
    {
    default:
      throw new AssertionError("Cannot call getCurrentResultList with type " + this.p);
    case 1:
      return this.r.artists;
    case 2:
      return this.r.albums;
    case 3:
      return this.r.tracks;
    case 4:
      return this.r.profiles;
    case 5:
    }
    return this.r.playlists;
  }

  public final void f()
  {
    a(u);
  }

  public final com.spotify.mobile.android.spotlets.search.d.f g()
  {
    return this.f;
  }

  public final ScrollPosition h()
  {
    v();
    return new ScrollPosition(this.n);
  }

  public final int i()
  {
    v();
    return this.n.getLastVisiblePosition() - this.n.getFirstVisiblePosition();
  }

  public final boolean j()
  {
    return this.p == SearchLoader.SearchType.a;
  }

  public final boolean k()
  {
    return !j();
  }

  public final boolean l()
  {
    return this.o != null;
  }

  public final boolean m()
  {
    v();
    return (this.m != null) && (this.m.d());
  }

  public final void n()
  {
    v();
    this.c.b();
  }

  public final void o()
  {
    v();
    this.d.c(new int[] { 10 });
  }

  public final void p()
  {
    v();
    this.d.c(new int[] { 9 });
  }

  public final void q()
  {
    v();
    this.d.b(new int[] { 6, 8, 7, 9, 10 });
  }

  public final void r()
  {
    v();
    this.y.post(this.A);
    this.d.c(new int[] { 6 });
  }

  public final void s()
  {
    v();
    this.d.c(new int[] { 7 });
  }

  public final void t()
  {
    v();
    this.d.c(new int[] { 8 });
  }

  public final void u()
  {
    this.y.removeCallbacksAndMessages(null);
    this.o = null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.e.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.spotlets.search.loader;

import android.os.Handler;
import com.google.common.base.Optional;
import com.google.common.base.i;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.search.a;
import com.spotify.mobile.android.spotlets.search.model.SearchResults;
import com.spotify.mobile.android.util.bp;
import com.spotify.mobile.android.util.cc;

public final class SearchLoader
{
  Optional<d> a = Optional.d();
  com.spotify.mobile.android.spotlets.common.b.a.d b;
  private final c c;
  private e d;
  private final Handler e;
  private final a f;
  private boolean g;

  public SearchLoader(a parama, c paramc)
  {
    cc.b();
    this.f = ((a)i.a(parama, "null search context!"));
    this.c = ((c)i.a(paramc));
    this.d = new e();
    this.e = new Handler();
    parama.h().a(new SearchLoader.1(this));
    i.a(this.b, "null session!");
  }

  private static void a(d paramd, boolean paramBoolean)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramd;
    if (paramBoolean);
    for (String str = "completed"; ; str = "failed")
    {
      arrayOfObject[1] = str;
      arrayOfObject[2] = Long.valueOf(paramd.e());
      bp.c("%s %s in %d ms.", arrayOfObject);
      return;
    }
  }

  private Optional<d> b(d paramd)
  {
    Optional localOptional = this.a;
    this.a = Optional.c(paramd);
    return localOptional;
  }

  public final int a(SearchLoader.SearchType paramSearchType, String paramString, int paramInt1, int paramInt2)
  {
    int i = 4;
    if (paramSearchType != SearchLoader.SearchType.a)
      i = Math.max(paramInt1, i);
    d locald1 = e.a(paramString, paramSearchType, paramInt2, i, this.f.g_(), this.f.h_());
    Optional localOptional = b(locald1);
    if ((locald1 == e.a) || (!localOptional.a()) || ((((d)localOptional.b()).b()) && (((d)localOptional.b()).e() > 500L)))
      a(locald1, (d)localOptional.c());
    while (true)
    {
      return locald1.hashCode();
      d locald2 = (d)localOptional.b();
      this.e.postDelayed(new SearchLoader.2(this, locald1, locald2), 500L);
    }
  }

  public final void a()
  {
    this.g = true;
    this.e.removeCallbacksAndMessages(null);
    b(null);
  }

  final void a(d paramd)
  {
    if (this.g)
      return;
    a(paramd, false);
    this.c.a(paramd.hashCode(), paramd.a, paramd.b);
  }

  final void a(d paramd1, d paramd2)
  {
    a(paramd1, paramd2, paramd1.f());
  }

  final void a(d paramd1, d paramd2, int paramInt)
  {
    if (this.g);
    do
    {
      return;
      if (paramd1 == e.a)
      {
        a(paramd1, paramd2, SearchResults.NO_RESULTS);
        b(null);
        return;
      }
      this.e.postDelayed(new SearchLoader.3(this, paramd1, paramInt, paramd2), paramInt);
      paramd1.a();
    }
    while (!this.b.d());
    SearchLoader.4 local4 = new SearchLoader.4(this, this.e, SearchResults.class, paramd1, paramd2);
    this.f.j_().resolve(paramd1.a(this.b), local4);
  }

  final void a(d paramd1, d paramd2, SearchResults paramSearchResults)
  {
    if (this.g)
      return;
    if (paramd2 != null)
      paramd2.c();
    if (paramd1 != e.a)
      a(paramd1, true);
    this.c.a(paramd1.hashCode(), paramd1.a, paramd1.b, paramSearchResults);
  }

  final void b(d paramd1, d paramd2)
  {
    Optional localOptional = b(null);
    if ((localOptional.a()) && (!((d)localOptional.b()).equals(paramd1)))
      a((d)localOptional.b(), paramd2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.loader.SearchLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

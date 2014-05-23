package com.spotify.mobile.android.spotlets.search.a.b;

import com.google.common.collect.Lists;
import com.google.common.collect.g;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Playlist;
import java.util.Iterator;
import java.util.List;

public final class b
{
  public final int a;
  public final List<SearchResults.Playlist> b;

  private b(List<SearchResults.Playlist> paramList, int paramInt)
  {
    this.a = paramInt;
    this.b = paramList;
  }

  public static List<b> a(List<SearchResults.Playlist> paramList, int paramInt)
  {
    g localg = new g();
    Iterator localIterator = Lists.a(paramList, paramInt).iterator();
    while (localIterator.hasNext())
      localg.b(new b((List)localIterator.next(), paramInt));
    return localg.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

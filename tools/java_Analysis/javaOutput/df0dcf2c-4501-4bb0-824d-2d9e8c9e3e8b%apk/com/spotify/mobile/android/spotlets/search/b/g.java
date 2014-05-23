package com.spotify.mobile.android.spotlets.search.b;

import com.spotify.mobile.android.spotlets.search.model.SearchResults.Album;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Artist;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Playlist;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;

public final class g extends e
{
  private final com.spotify.mobile.android.spotlets.search.loader.a a;
  private final com.spotify.mobile.android.spotlets.search.a b;

  public g(com.spotify.mobile.android.spotlets.search.a parama)
  {
    this.b = ((com.spotify.mobile.android.spotlets.search.a)com.google.common.base.i.a(parama));
    this.a = new com.spotify.mobile.android.spotlets.search.loader.a(parama.d(), parama.t());
    a(SearchResults.Album.class, new a(this.b, this.a));
    a(SearchResults.Artist.class, new b(this.b, this.a));
    a(SearchResults.Playlist.class, new h(this.b, this.a));
    a(SearchResults.Track.class, new i(this.b, this.a));
  }

  public final void a()
  {
    this.a.a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

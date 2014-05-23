package com.spotify.mobile.android.spotlets.search.b;

import com.spotify.mobile.android.spotlets.search.model.SearchResults.Artist;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate;
import com.spotify.mobile.android.ui.menus.ArtistMenuDelegate.CanDownload;

public final class b extends c<SearchResults.Artist, com.spotify.mobile.android.model.b>
{
  private final ArtistMenuDelegate d = new ArtistMenuDelegate(ArtistMenuDelegate.CanDownload.b, new b.1(this));

  public b(com.spotify.mobile.android.spotlets.search.a parama, com.spotify.mobile.android.spotlets.search.loader.a parama1)
  {
    super(parama, parama1);
  }

  protected final String[] a()
  {
    return com.spotify.mobile.android.spotlets.search.model.b.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

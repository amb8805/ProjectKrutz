package com.spotify.mobile.android.spotlets.search.b;

import com.spotify.mobile.android.spotlets.search.model.SearchResults.Album;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.AlbumMenuDelegate.CanRemoveFromCollection;

public final class a extends c<SearchResults.Album, com.spotify.mobile.android.model.a>
{
  private final AlbumMenuDelegate d = new AlbumMenuDelegate(AlbumMenuDelegate.CanBrowseArtist.a, AlbumMenuDelegate.CanRemoveFromCollection.a, AlbumMenuDelegate.CanDownload.b, new a.1(this));

  public a(com.spotify.mobile.android.spotlets.search.a parama, com.spotify.mobile.android.spotlets.search.loader.a parama1)
  {
    super(parama, parama1);
  }

  protected final String[] a()
  {
    return com.spotify.mobile.android.spotlets.search.model.a.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

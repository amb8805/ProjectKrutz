package com.spotify.mobile.android.spotlets.search.a.a;

import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Album;

public final class c extends b<SearchResults.Album>
{
  private final com.spotify.mobile.android.spotlets.search.a.b.a b = new com.spotify.mobile.android.spotlets.search.a.b.a(this.a, true, false);

  public c(com.spotify.mobile.android.spotlets.search.a parama)
  {
    super(parama, SearchResults.Album.class, SpotifyIcon.b, false);
  }

  private void a(int paramInt, ListItemView paramListItemView, SearchResults.Album paramAlbum, ViewGroup paramViewGroup)
  {
    super.a(paramInt, paramListItemView, paramAlbum, paramViewGroup);
    this.b.a(paramListItemView, paramAlbum.name, paramAlbum.artists(), paramAlbum);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

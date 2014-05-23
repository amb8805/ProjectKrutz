package com.spotify.mobile.android.spotlets.search.a.a;

import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Playlist;

public final class e extends b<SearchResults.Playlist>
{
  private final com.spotify.mobile.android.spotlets.search.a.b.a b = new com.spotify.mobile.android.spotlets.search.a.b.a(this.a, false, true);

  public e(com.spotify.mobile.android.spotlets.search.a parama)
  {
    super(parama, SearchResults.Playlist.class, SpotifyIcon.Z, false);
  }

  private void a(int paramInt, ListItemView paramListItemView, SearchResults.Playlist paramPlaylist, ViewGroup paramViewGroup)
  {
    super.a(paramInt, paramListItemView, paramPlaylist, paramViewGroup);
    this.b.a(paramListItemView, paramPlaylist.name, a(2131623938, paramPlaylist.followersCount), paramPlaylist);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

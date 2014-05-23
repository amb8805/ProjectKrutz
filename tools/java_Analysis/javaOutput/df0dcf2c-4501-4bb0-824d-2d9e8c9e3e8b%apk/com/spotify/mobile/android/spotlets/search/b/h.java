package com.spotify.mobile.android.spotlets.search.b;

import com.spotify.mobile.android.model.j;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Playlist;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanDownload;
import com.spotify.mobile.android.ui.menus.PlaylistMenuDelegate.CanRemovePlaylist;

public final class h extends c<SearchResults.Playlist, j>
{
  private final PlaylistMenuDelegate d = new PlaylistMenuDelegate(PlaylistMenuDelegate.CanDownload.a, PlaylistMenuDelegate.CanRemovePlaylist.b, new h.1(this));

  protected h(com.spotify.mobile.android.spotlets.search.a parama, com.spotify.mobile.android.spotlets.search.loader.a parama1)
  {
    super(parama, parama1);
  }

  protected final String[] a()
  {
    return com.spotify.mobile.android.spotlets.search.model.c.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

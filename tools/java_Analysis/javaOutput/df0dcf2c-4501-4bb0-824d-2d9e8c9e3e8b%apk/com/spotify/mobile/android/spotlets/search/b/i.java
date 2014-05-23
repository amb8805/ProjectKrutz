package com.spotify.mobile.android.spotlets.search.b;

import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import com.spotify.mobile.android.spotlets.search.model.f;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseAlbum;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanBrowseArtist;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveFromCollection;
import com.spotify.mobile.android.ui.menus.TrackMenuDelegate.CanRemoveTrack;

public final class i extends c<SearchResults.Track, m>
{
  private final TrackMenuDelegate d = new TrackMenuDelegate(TrackMenuDelegate.CanBrowseAlbum.a, TrackMenuDelegate.CanBrowseArtist.a, TrackMenuDelegate.CanRemoveFromCollection.a, TrackMenuDelegate.CanRemoveTrack.b, new i.1(this));

  protected i(com.spotify.mobile.android.spotlets.search.a parama, com.spotify.mobile.android.spotlets.search.loader.a parama1)
  {
    super(parama, parama1);
  }

  protected final String[] a()
  {
    return f.a;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.b.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

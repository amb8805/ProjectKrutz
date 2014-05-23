package com.spotify.mobile.android.spotlets.search.a.a;

import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Artist;

public final class d extends b<SearchResults.Artist>
{
  private final com.spotify.mobile.android.spotlets.search.a.b.a b = new com.spotify.mobile.android.spotlets.search.a.b.a(this.a, false, false);

  public d(com.spotify.mobile.android.spotlets.search.a parama)
  {
    super(parama, SearchResults.Artist.class, SpotifyIcon.d, true);
  }

  private void a(int paramInt, ListItemView paramListItemView, SearchResults.Artist paramArtist, ViewGroup paramViewGroup)
  {
    super.a(paramInt, paramListItemView, paramArtist, paramViewGroup);
    this.b.a(paramListItemView, paramArtist.name, null, paramArtist);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

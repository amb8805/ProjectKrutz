package com.spotify.mobile.android.spotlets.search.a.a;

import android.view.ViewGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Profile;

public final class h extends b<SearchResults.Profile>
{
  private final com.spotify.mobile.android.spotlets.search.a.b.a b = new com.spotify.mobile.android.spotlets.search.a.b.a(this.a, false, true);

  public h(com.spotify.mobile.android.spotlets.search.a parama)
  {
    super(parama, SearchResults.Profile.class, SpotifyIcon.aL, true);
  }

  private void a(int paramInt, ListItemView paramListItemView, SearchResults.Profile paramProfile, ViewGroup paramViewGroup)
  {
    super.a(paramInt, paramListItemView, paramProfile, paramViewGroup);
    this.b.a(paramListItemView, paramProfile.name, a(2131623957, paramProfile.followersCount), paramProfile);
  }

  protected final boolean d()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

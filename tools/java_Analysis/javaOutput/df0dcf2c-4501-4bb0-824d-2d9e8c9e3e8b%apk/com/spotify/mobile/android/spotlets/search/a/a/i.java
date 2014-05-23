package com.spotify.mobile.android.spotlets.search.a.a;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.android.paste.widget.ListItemView;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Album;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;

public final class i extends a<SearchResults.Track>
{
  private final com.spotify.mobile.android.spotlets.search.a.b.a b = new com.spotify.mobile.android.spotlets.search.a.b.a(this.a, true, false);

  public i(com.spotify.mobile.android.spotlets.search.a parama)
  {
    super(parama, SearchResults.Track.class);
  }

  private void a(int paramInt, ListItemView paramListItemView, SearchResults.Track paramTrack, ViewGroup paramViewGroup)
  {
    super.a(paramInt, paramListItemView, paramTrack, paramViewGroup);
    paramListItemView.a().setVisibility(8);
    String str = paramTrack.artists();
    if (paramTrack.album != null)
      str = str + " • " + paramTrack.album.name;
    this.b.a(paramListItemView, paramTrack.name, str, paramTrack);
  }

  public final ListItemView b(int paramInt, ViewGroup paramViewGroup)
  {
    ListItemView localListItemView = super.b(paramInt, paramViewGroup);
    localListItemView.a(c());
    return localListItemView;
  }

  protected final boolean c()
  {
    return (this.a.h_()) || (!this.a.g_());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.a.a.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.spotlets.search.player;

import android.database.Observable;
import com.spotify.cosmos.android.router.PlayerState;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import java.util.List;

public abstract interface a
{
  public static final PlayerState a = new PlayerState();

  public abstract PlayerState a();

  public abstract void a(List<SearchResults.Track> paramList, SearchResults.Track paramTrack, String paramString);

  public abstract Observable<b> b();

  public abstract void c();
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.player.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.spotlets.search.player;

import android.database.Observable;
import android.os.Handler;
import com.google.common.base.i;
import com.spotify.cosmos.android.router.Player;
import com.spotify.cosmos.android.router.PlayerState;
import com.spotify.cosmos.android.router.PlayerState.Action;
import com.spotify.cosmos.android.router.PlayerStateBuilder;
import com.spotify.mobile.android.spotlets.search.model.SearchResults.Track;
import com.spotify.mobile.android.util.Assertion;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements a
{
  PlayerState b;
  d c = new d();
  private final Player d;

  public c(com.spotify.mobile.android.spotlets.search.a parama, Handler paramHandler)
  {
    this.d = new Player(parama.j_());
    this.d.subscribe(new SearchPlayerImpl.1(this, (Handler)i.a(paramHandler), PlayerState.class));
  }

  public final PlayerState a()
  {
    if (this.b != null)
      return this.b;
    return a;
  }

  public final void a(List<SearchResults.Track> paramList, SearchResults.Track paramTrack, String paramString)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    int i = -1;
    for (int j = 0; j < paramList.size(); j++)
    {
      SearchResults.Track localTrack = (SearchResults.Track)paramList.get(j);
      localArrayList.add(localTrack.uri);
      if (localTrack == paramTrack)
        i = j;
    }
    if (i < 0)
      Assertion.a("Could not find track to play!");
    this.d.play(PlayerStateBuilder.create(PlayerState.Action.PLAY).contextUri(paramString).index(i).tracks(localArrayList).viewUri(paramString).build());
  }

  public final Observable<b> b()
  {
    return this.c;
  }

  public final void c()
  {
    this.c.unregisterAll();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.player.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

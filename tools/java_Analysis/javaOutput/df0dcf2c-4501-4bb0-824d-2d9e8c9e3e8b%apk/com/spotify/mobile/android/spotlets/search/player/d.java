package com.spotify.mobile.android.spotlets.search.player;

import android.database.Observable;
import com.spotify.cosmos.android.router.PlayerState;
import java.util.ArrayList;
import java.util.Iterator;

final class d extends Observable<b>
{
  d()
  {
  }

  final void a(PlayerState paramPlayerState1, PlayerState paramPlayerState2)
  {
    synchronized (this.mObservers)
    {
      Iterator localIterator = this.mObservers.iterator();
      if (localIterator.hasNext())
        ((b)localIterator.next()).a(paramPlayerState1, paramPlayerState2);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.search.player.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

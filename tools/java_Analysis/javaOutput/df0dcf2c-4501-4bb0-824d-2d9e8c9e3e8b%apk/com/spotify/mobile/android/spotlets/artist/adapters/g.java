package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Release;
import java.util.List;

public final class g extends f
{
  g(Context paramContext, List<ArtistModel.Release> paramList)
  {
    super(paramContext, paramList);
  }

  public final int getCount()
  {
    return this.c.size();
  }

  public final Object getItem(int paramInt)
  {
    return this.c.get(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

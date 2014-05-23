package com.spotify.mobile.android.spotlets.artist.adapters;

import android.content.Context;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseList;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.Track;
import java.util.List;

public final class a
{
  private final Context a;

  public a(Context paramContext)
  {
    this.a = paramContext;
  }

  public final f a(ArtistModel.ReleaseList paramReleaseList)
  {
    if (paramReleaseList.hasAllReleases())
      return new g(this.a, paramReleaseList.releases);
    return new ReleasesAdapterWithViewAll(this.a, paramReleaseList);
  }

  public final h a(List<ArtistModel.Track> paramList)
  {
    return new h(this.a, paramList);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.adapters.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

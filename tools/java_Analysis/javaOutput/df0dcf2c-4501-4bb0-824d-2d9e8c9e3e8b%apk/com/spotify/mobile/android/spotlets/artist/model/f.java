package com.spotify.mobile.android.spotlets.artist.model;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import com.spotify.mobile.android.provider.b;
import java.util.List;

abstract class f extends AsyncQueryHandler
{
  protected ArtistModel b;

  public f(a parama, ContentResolver paramContentResolver)
  {
    super(paramContentResolver);
  }

  public final void a(ArtistModel paramArtistModel)
  {
    if (!paramArtistModel.topTracks.isEmpty());
    for (boolean bool = true; ; bool = false)
    {
      com.google.common.base.i.a(bool);
      this.b = paramArtistModel;
      startQuery(0, new Object(), b.b(paramArtistModel.uri), i.c, "limit=5", null, null);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.model.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

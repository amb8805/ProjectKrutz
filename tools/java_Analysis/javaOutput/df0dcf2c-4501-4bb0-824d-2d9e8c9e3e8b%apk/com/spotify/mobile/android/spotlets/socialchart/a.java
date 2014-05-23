package com.spotify.mobile.android.spotlets.socialchart;

import com.spotify.mobile.android.model.m;
import com.spotify.mobile.android.spotlets.socialchart.model.AlbumModel;
import com.spotify.mobile.android.spotlets.socialchart.model.ArtistModel;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;

public final class a
  implements m
{
  private final TrackModel a;

  public a(TrackModel paramTrackModel)
  {
    this.a = paramTrackModel;
  }

  public final boolean a()
  {
    return false;
  }

  public final String b()
  {
    return null;
  }

  public final boolean c()
  {
    return false;
  }

  public final boolean d()
  {
    return true;
  }

  public final boolean e()
  {
    return false;
  }

  public final long f()
  {
    return 0L;
  }

  public final boolean g()
  {
    return this.a.getInCollection();
  }

  public final String h()
  {
    return this.a.getTrackUri();
  }

  public final int i()
  {
    return 0;
  }

  public final boolean j()
  {
    return true;
  }

  public final boolean k()
  {
    return true;
  }

  public final String l()
  {
    if ((this.a.getArtists() != null) && (this.a.getArtists().length > 0))
      return this.a.getArtists()[0].getUri();
    return null;
  }

  public final String m()
  {
    if ((this.a.getArtists() != null) && (this.a.getArtists().length > 0))
      return this.a.getArtists()[0].getName();
    return null;
  }

  public final String n()
  {
    return this.a.getAlbum().getUri();
  }

  public final String o()
  {
    return this.a.getAlbum().getName();
  }

  public final String p()
  {
    return this.a.getTrackName();
  }

  public final boolean q()
  {
    return false;
  }

  public final String r()
  {
    return null;
  }

  public final boolean s()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.socialchart.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

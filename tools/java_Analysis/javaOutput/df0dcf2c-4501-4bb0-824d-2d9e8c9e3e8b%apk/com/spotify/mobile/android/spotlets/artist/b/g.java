package com.spotify.mobile.android.spotlets.artist.b;

import com.spotify.mobile.android.spotlets.artist.model.ArtistModel.ReleaseType;
import java.util.Locale;
import java.util.regex.Pattern;

public final class g extends b
{
  static final Pattern a = Pattern.compile("spotify:artist:([a-zA-Z0-9]+):(albums|singles|appears_on|compilations)");
  private final ArtistModel.ReleaseType b;

  g(String paramString, ArtistModel.ReleaseType paramReleaseType)
  {
    super(paramString);
    this.b = paramReleaseType;
  }

  public final String a()
  {
    return this.b.name().toLowerCase(Locale.US);
  }

  public final ArtistModel.ReleaseType b()
  {
    return this.b;
  }

  public final String g()
  {
    return "hm://artist/v1/" + e() + "/" + this.b.name().toLowerCase(Locale.US) + "/android?format=json";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.b.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

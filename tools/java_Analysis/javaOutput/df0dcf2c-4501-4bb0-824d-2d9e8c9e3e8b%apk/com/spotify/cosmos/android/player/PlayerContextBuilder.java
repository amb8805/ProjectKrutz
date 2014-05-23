package com.spotify.cosmos.android.player;

import com.spotify.cosmos.android.player.models.PlayerContext;
import com.spotify.cosmos.android.player.models.PlayerContextPage;
import com.spotify.cosmos.android.player.models.PlayerRestrictions;
import com.spotify.cosmos.android.player.models.PlayerTrack;
import java.util.ArrayList;

public class PlayerContextBuilder
{
  private static final String TRACK_RESOLVER_URI = "hm://track-resolver/v1?uri=";
  private final PlayerContext mPlayerContext;

  private PlayerContextBuilder(ArrayList<PlayerContextPage> paramArrayList)
  {
    this.mPlayerContext = new PlayerContext(paramArrayList);
  }

  public static PlayerContextBuilder create(ArrayList<PlayerContextPage> paramArrayList)
  {
    return new PlayerContextBuilder(paramArrayList);
  }

  public static PlayerContextBuilder createFromAlbumUri(String paramString)
  {
    if (!paramString.matches("^spotify:album:[A-Za-z0-9]+$"))
      throw new IllegalArgumentException("Invalid album uri");
    return createFromUri(paramString, "hm://track-resolver/v1?uri=" + paramString);
  }

  public static PlayerContextBuilder createFromArtistUri(String paramString)
  {
    if (!paramString.matches("^spotify:artist:[A-Za-z0-9]+$"))
      throw new IllegalArgumentException("Invalid artist uri");
    return createFromUri(paramString, "hm://track-resolver/v1?uri=" + paramString);
  }

  public static PlayerContextBuilder createFromPlaylistUri(String paramString)
  {
    if (!paramString.matches("^spotify:user:[^:]+:(playlist:[A-Za-z0-9]+|starred)$"))
      throw new IllegalArgumentException("Invalid playlist uri");
    return createFromUri(paramString, paramString);
  }

  public static PlayerContextBuilder createFromTrackList(ArrayList<PlayerTrack> paramArrayList)
  {
    if (paramArrayList == null)
      throw new IllegalArgumentException("Can't create PlayerContext from null trackList");
    PlayerContextPage localPlayerContextPage = new PlayerContextPage();
    localPlayerContextPage.tracks = paramArrayList;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localPlayerContextPage);
    return create(localArrayList);
  }

  private static PlayerContextBuilder createFromUri(String paramString1, String paramString2)
  {
    PlayerContextPage localPlayerContextPage = new PlayerContextPage();
    localPlayerContextPage.pageUrl = paramString2;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localPlayerContextPage);
    return create(localArrayList).withEntityUri(paramString1);
  }

  public PlayerContext build()
  {
    return this.mPlayerContext;
  }

  public PlayerContextBuilder withEntityUri(String paramString)
  {
    this.mPlayerContext.entityUri = paramString;
    return this;
  }

  public PlayerContextBuilder withFallbackPages(ArrayList<PlayerContextPage> paramArrayList)
  {
    this.mPlayerContext.fallbackPages = paramArrayList;
    return this;
  }

  public PlayerContextBuilder withRestrictions(PlayerRestrictions paramPlayerRestrictions)
  {
    this.mPlayerContext.restrictions = paramPlayerRestrictions;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.PlayerContextBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

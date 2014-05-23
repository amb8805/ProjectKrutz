package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

public class PlaylistListModel
  implements JacksonModel
{
  private final PlaylistModel[] mPlaylists;

  public PlaylistListModel(@JsonProperty("playlists") PlaylistModel[] paramArrayOfPlaylistModel)
  {
    this.mPlaylists = paramArrayOfPlaylistModel;
  }

  public PlaylistModel[] getPlaylists()
  {
    return this.mPlaylists;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.PlaylistListModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

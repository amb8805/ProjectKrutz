package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;
import java.util.Map;

public class PlayerTrack
  implements JacksonModel
{

  @JsonProperty("album_uri")
  public String albumUri;

  @JsonProperty("artist_uri")
  public String artistUri;

  @JsonProperty("custom")
  public Map<String, String> custom;

  @JsonProperty("source_uri")
  public String sourceUri;

  @JsonProperty("uri")
  public String uri;

  private PlayerTrack()
  {
  }

  public PlayerTrack(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    this.uri = paramString1;
    this.albumUri = paramString2;
    this.artistUri = paramString3;
    this.sourceUri = paramString4;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.PlayerTrack
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

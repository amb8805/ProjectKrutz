package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;
import java.util.ArrayList;

public class PlayerContextPage
  implements JacksonModel
{

  @JsonProperty("next_page_url")
  public String nextPageUrl;

  @JsonProperty("page_url")
  public String pageUrl;

  @JsonProperty("tracks")
  public ArrayList<PlayerTrack> tracks;

  public PlayerContextPage()
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.PlayerContextPage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

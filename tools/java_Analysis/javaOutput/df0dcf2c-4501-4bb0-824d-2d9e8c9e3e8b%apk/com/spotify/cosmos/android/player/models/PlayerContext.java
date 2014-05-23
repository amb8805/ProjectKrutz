package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;
import java.util.ArrayList;

public class PlayerContext
  implements JacksonModel
{

  @JsonProperty("entity_uri")
  public String entityUri;

  @JsonProperty("fallback_pages")
  public ArrayList<PlayerContextPage> fallbackPages;

  @JsonProperty("pages")
  public ArrayList<PlayerContextPage> pages;

  @JsonProperty("restrictions")
  public PlayerRestrictions restrictions;

  private PlayerContext()
  {
  }

  public PlayerContext(ArrayList<PlayerContextPage> paramArrayList)
  {
    this.pages = paramArrayList;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.PlayerContext
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

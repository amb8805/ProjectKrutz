package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

public class PlayerOptions
  implements JacksonModel
{

  @JsonProperty("repeating_context")
  public boolean repeatingContext;

  @JsonProperty("repeating_track")
  public boolean repeatingTrack;

  @JsonProperty("shuffling_context")
  public boolean shufflingContext;

  public PlayerOptions()
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.PlayerOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

public class PlayOptions
  implements JacksonModel
{

  @JsonProperty("initially_paused")
  public boolean initiallyPaused;

  @JsonProperty("player_options_override")
  public PlayerOptions playerOptionsOverride;

  @JsonProperty("seek_to")
  public int seekTo;

  @JsonProperty("skip_to_index")
  public IndexPath skipToIndex;

  public PlayOptions()
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.PlayOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

public class PlayerRestrictions
  implements JacksonModel
{

  @JsonProperty("disallow_muting")
  public boolean disallowMuting;

  @JsonProperty("disallow_pausing")
  public boolean disallowPausing;

  @JsonProperty("disallow_peeking_next")
  public boolean disallowPeekingAtNextTrack;

  @JsonProperty("disallow_peeking_prev")
  public boolean disallowPeekingAtPreviousTrack;

  @JsonProperty("disallow_repeating_context")
  public boolean disallowRepeatingContext;

  @JsonProperty("disallow_repeating_track")
  public boolean disallowRepeatingTrack;

  @JsonProperty("disallow_resuming")
  public boolean disallowResuming;

  @JsonProperty("disallow_seeking")
  public boolean disallowSeeking;

  @JsonProperty("disallow_shuffling")
  public boolean disallowShuffling;

  @JsonProperty("disallow_skipping_next")
  public boolean disallowSkippingToNextTrack;

  @JsonProperty("disallow_skipping_prev")
  public boolean disallowSkippingToPreviousTrack;

  public PlayerRestrictions()
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.PlayerRestrictions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

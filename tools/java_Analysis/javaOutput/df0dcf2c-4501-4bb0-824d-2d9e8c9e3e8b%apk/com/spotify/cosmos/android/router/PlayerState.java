package com.spotify.cosmos.android.router;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;
import java.util.List;

public class PlayerState
  implements JacksonModel
{

  @JsonProperty("action")
  public final PlayerState.Action action;

  @JsonProperty("context")
  public String contextUri;

  @JsonProperty("duration")
  public double durationInMs;

  @JsonProperty("index")
  public Integer index;

  @JsonProperty("loading")
  public boolean loading;

  @JsonProperty("next_page_url")
  public String nextPageUrl;

  @JsonProperty("options")
  public PlayerState.PlayOptions options;

  @JsonProperty("play_origin")
  public PlayerState.PlayOrigin origin;

  @JsonProperty("playing")
  public boolean playing;

  @JsonProperty("position")
  public double positionInMs;

  @JsonProperty("track")
  public String trackUri;

  @JsonProperty("tracks")
  public List<String> tracks;

  public PlayerState()
  {
    this(PlayerState.Action.UNKNOWN);
  }

  public PlayerState(PlayerState.Action paramAction)
  {
    this.action = paramAction;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.router.PlayerState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

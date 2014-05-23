package com.spotify.cosmos.android.player.models.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.player.models.PlayOptions;
import com.spotify.cosmos.android.player.models.PlayOrigin;
import com.spotify.cosmos.android.player.models.PlayerContext;
import com.spotify.cosmos.android.util.JacksonModel;

public class PlayerContextRequest
  implements JacksonModel
{

  @JsonProperty("context")
  public PlayerContext context;

  @JsonProperty("options")
  public PlayOptions options;

  @JsonProperty("play_origin")
  public PlayOrigin playOrigin;

  private PlayerContextRequest()
  {
  }

  public PlayerContextRequest(PlayerContext paramPlayerContext, PlayOrigin paramPlayOrigin)
  {
    if (paramPlayerContext == null)
      throw new IllegalArgumentException("Can't create the request with null context");
    if (paramPlayOrigin == null)
      throw new IllegalArgumentException("Can't create the request with null origin");
    this.context = paramPlayerContext;
    this.playOrigin = paramPlayOrigin;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.requests.PlayerContextRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

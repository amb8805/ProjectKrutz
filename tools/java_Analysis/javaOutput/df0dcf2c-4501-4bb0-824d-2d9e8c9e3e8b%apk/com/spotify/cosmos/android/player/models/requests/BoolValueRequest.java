package com.spotify.cosmos.android.player.models.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

public class BoolValueRequest
  implements JacksonModel
{

  @JsonProperty("value")
  public boolean value;

  private BoolValueRequest()
  {
  }

  public BoolValueRequest(boolean paramBoolean)
  {
    this.value = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.requests.BoolValueRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

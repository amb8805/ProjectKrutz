package com.spotify.cosmos.android.player.models.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

public class IntValueRequest
  implements JacksonModel
{

  @JsonProperty("value")
  public int value;

  private IntValueRequest()
  {
  }

  public IntValueRequest(int paramInt)
  {
    this.value = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.requests.IntValueRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

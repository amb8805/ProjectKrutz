package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

public class PlayOrigin
  implements JacksonModel
{

  @JsonProperty("external_referrer")
  public String externalReferrer;

  @JsonProperty("feature_identifier")
  public String featureIdentifier;

  @JsonProperty("feature_version")
  public String featureVersion;

  @JsonProperty("view_uri")
  public String viewUri;

  public PlayOrigin()
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.PlayOrigin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

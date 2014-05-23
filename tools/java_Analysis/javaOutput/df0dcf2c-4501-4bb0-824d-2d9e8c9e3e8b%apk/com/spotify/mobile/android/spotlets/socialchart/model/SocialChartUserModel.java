package com.spotify.mobile.android.spotlets.socialchart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SocialChartUserModel
  implements JacksonModel
{

  @JsonProperty
  public TrackModel[] mTrackModels;

  public SocialChartUserModel(@JsonProperty("tracks") TrackModel[] paramArrayOfTrackModel)
  {
    this.mTrackModels = paramArrayOfTrackModel;
  }

  @JsonIgnore
  public TrackModel[] getTrackModels()
  {
    return this.mTrackModels;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.socialchart.model.SocialChartUserModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

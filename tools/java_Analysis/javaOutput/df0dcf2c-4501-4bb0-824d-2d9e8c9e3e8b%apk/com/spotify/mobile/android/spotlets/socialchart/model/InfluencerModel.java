package com.spotify.mobile.android.spotlets.socialchart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InfluencerModel
  implements JacksonModel
{

  @JsonProperty
  private final String mImageUrl;

  @JsonProperty
  private final String mName;

  @JsonProperty
  private final String mUri;

  public InfluencerModel(@JsonProperty("uri") String paramString1, @JsonProperty("name") String paramString2, @JsonProperty("imageUrl") String paramString3)
  {
    this.mUri = paramString1;
    this.mName = paramString2;
    this.mImageUrl = paramString3;
  }

  @JsonIgnore
  public String getImageUrl()
  {
    return this.mImageUrl;
  }

  @JsonIgnore
  public CharSequence getName()
  {
    return this.mName;
  }

  @JsonIgnore
  public String getUri()
  {
    return this.mUri;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

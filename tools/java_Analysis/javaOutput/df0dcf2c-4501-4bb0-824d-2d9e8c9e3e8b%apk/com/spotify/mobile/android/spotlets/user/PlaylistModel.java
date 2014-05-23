package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

public class PlaylistModel
  implements JacksonModel
{
  private final String mCuratorName;
  private final String mCuratorUri;
  private final int mFollowersCount;
  private final String mImageUrl;
  private final String mName;
  private final String mUri;

  public PlaylistModel(@JsonProperty("uri") String paramString1, @JsonProperty("name") String paramString2, @JsonProperty("followers_count") int paramInt, @JsonProperty("image_url") String paramString3, @JsonProperty("curator_uri") String paramString4, @JsonProperty("curator_name") String paramString5)
  {
    this.mUri = paramString1;
    this.mName = paramString2;
    this.mFollowersCount = paramInt;
    this.mImageUrl = paramString3;
    this.mCuratorUri = paramString4;
    this.mCuratorName = paramString5;
  }

  public String getCuratorName()
  {
    return this.mCuratorName;
  }

  public String getCuratorUri()
  {
    return this.mCuratorUri;
  }

  public int getFollowersCount()
  {
    return this.mFollowersCount;
  }

  public String getImageUrl()
  {
    return this.mImageUrl;
  }

  public String getName()
  {
    return this.mName;
  }

  public String getUri()
  {
    return this.mUri;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.PlaylistModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

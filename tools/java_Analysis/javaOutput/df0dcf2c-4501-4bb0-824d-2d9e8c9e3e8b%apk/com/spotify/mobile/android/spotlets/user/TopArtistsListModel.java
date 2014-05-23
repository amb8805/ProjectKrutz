package com.spotify.mobile.android.spotlets.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TopArtistsListModel
  implements JacksonModel
{
  private final TopArtistModel[] mTopArtists;

  public TopArtistsListModel(@JsonProperty("artists") TopArtistModel[] paramArrayOfTopArtistModel)
  {
    this.mTopArtists = paramArrayOfTopArtistModel;
  }

  public TopArtistModel[] getTopArtists()
  {
    return this.mTopArtists;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.TopArtistsListModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

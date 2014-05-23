package com.spotify.cosmos.android.player.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class IndexPath
{

  @JsonProperty("page")
  public int page;

  @JsonProperty("track")
  public int track;

  private IndexPath()
  {
  }

  public IndexPath(int paramInt1, int paramInt2)
  {
    this.page = paramInt1;
    this.track = paramInt2;
  }
}

/* Location:
 * Qualified Name:     com.spotify.cosmos.android.player.models.IndexPath
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.spotlets.socialchart.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TrackModel
  implements JacksonModel
{

  @JsonProperty
  private final AlbumModel mAlbum;

  @JsonProperty
  private final ArtistModel[] mArtists;

  @JsonProperty
  private final boolean mInCollection;

  @JsonProperty
  private final InfluencerModel[] mInfluencers;

  @JsonProperty
  private final String mName;

  @JsonProperty
  private final String mUri;

  public TrackModel(@JsonProperty("uri") String paramString1, @JsonProperty("name") String paramString2, @JsonProperty("influencers") InfluencerModel[] paramArrayOfInfluencerModel, @JsonProperty("artists") ArtistModel[] paramArrayOfArtistModel, @JsonProperty("album") AlbumModel paramAlbumModel, @JsonProperty("inCollection") boolean paramBoolean)
  {
    this.mUri = paramString1;
    this.mName = paramString2;
    this.mInfluencers = paramArrayOfInfluencerModel;
    this.mArtists = paramArrayOfArtistModel;
    this.mAlbum = paramAlbumModel;
    this.mInCollection = paramBoolean;
  }

  @JsonIgnore
  public AlbumModel getAlbum()
  {
    return this.mAlbum;
  }

  @JsonIgnore
  public ArtistModel[] getArtists()
  {
    return this.mArtists;
  }

  @JsonIgnore
  public boolean getInCollection()
  {
    return this.mInCollection;
  }

  @JsonIgnore
  public InfluencerModel[] getInfluencers()
  {
    return this.mInfluencers;
  }

  @JsonIgnore
  public String getTrackName()
  {
    return this.mName;
  }

  @JsonIgnore
  public String getTrackUri()
  {
    return this.mUri;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.socialchart.model.TrackModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

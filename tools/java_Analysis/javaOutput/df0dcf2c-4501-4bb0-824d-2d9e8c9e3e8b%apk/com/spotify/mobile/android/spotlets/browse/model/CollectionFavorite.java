package com.spotify.mobile.android.spotlets.browse.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CollectionFavorite
  implements JacksonModel
{
  public static final String TYPE_ALBUM = "ALBUM";
  public static final String TYPE_ARTIST = "ARTIST";
  public static final String TYPE_PLAYLIST = "PLAYLIST";
  public static final String TYPE_TRACK = "TRACK";
  final String mImage;
  final String mTitle;
  final String mType;
  final String mUri;

  @JsonCreator
  public CollectionFavorite(@JsonProperty("type") String paramString1, @JsonProperty("uri") String paramString2, @JsonProperty("title") String paramString3, @JsonProperty("image") String paramString4)
  {
    this.mType = paramString1;
    this.mUri = paramString2;
    this.mTitle = paramString3;
    this.mImage = paramString4;
  }

  public String getImage()
  {
    return this.mImage;
  }

  public String getTitle()
  {
    return this.mTitle;
  }

  public String getType()
  {
    return this.mType;
  }

  public String getUri()
  {
    return this.mUri;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.model.CollectionFavorite
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

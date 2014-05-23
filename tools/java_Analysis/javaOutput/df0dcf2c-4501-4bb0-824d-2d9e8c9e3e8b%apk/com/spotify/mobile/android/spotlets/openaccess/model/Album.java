package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

public class Album
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<Album> CREATOR = new Album.1();
  private String mArtistString = "";
  private final SimpleArtist[] mArtists;
  private final String mId;
  private final Images mImages;
  private final String mName;
  private final Track[] mTracks;
  private final String mType;

  protected Album(Parcel paramParcel)
  {
    this.mId = paramParcel.readString();
    this.mName = paramParcel.readString();
    this.mType = paramParcel.readString();
    this.mImages = null;
    this.mTracks = new Track[0];
    paramParcel.readTypedArray(this.mTracks, Track.CREATOR);
    this.mArtists = new SimpleArtist[0];
    paramParcel.readTypedArray(this.mArtists, SimpleArtist.CREATOR);
    buildArtistString();
  }

  @JsonCreator
  private Album(@JsonProperty("id") String paramString1, @JsonProperty("name") String paramString2, @JsonProperty("album_type") String paramString3, @JsonProperty("images") Images paramImages, @JsonProperty("artists") SimpleArtist[] paramArrayOfSimpleArtist, @JsonProperty("tracks") Track[] paramArrayOfTrack)
  {
    this.mId = paramString1;
    this.mName = paramString2;
    this.mType = paramString3;
    this.mImages = paramImages;
    this.mTracks = paramArrayOfTrack;
    this.mArtists = paramArrayOfSimpleArtist;
    buildArtistString();
  }

  private void buildArtistString()
  {
    if ((this.mArtists == null) || (this.mArtists.length == 0))
      return;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.mArtists[0].getName());
    for (int i = 1; i < this.mArtists.length; i++)
    {
      localStringBuilder.append(", ");
      localStringBuilder.append(this.mArtists[i].getName());
    }
    this.mArtistString = localStringBuilder.toString();
  }

  public int describeContents()
  {
    return 0;
  }

  public String getArtistString()
  {
    return this.mArtistString;
  }

  public SimpleArtist[] getArtists()
  {
    return this.mArtists;
  }

  public String getId()
  {
    return this.mId;
  }

  public Images getImages()
  {
    return this.mImages;
  }

  public String getName()
  {
    return this.mName;
  }

  public Track[] getTracks()
  {
    return this.mTracks;
  }

  public String getType()
  {
    return this.mType;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mId);
    paramParcel.writeString(this.mName);
    paramParcel.writeString(this.mType);
    paramParcel.writeArray(this.mTracks);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.model.Album
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

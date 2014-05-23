package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

public class Track
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<Track> CREATOR = new Track.1();
  private String mArtistString = "";
  private final SimpleArtist[] mArtists;
  private final String mId;
  private final String mName;
  private final String mType;

  protected Track(Parcel paramParcel)
  {
    this.mId = paramParcel.readString();
    this.mName = paramParcel.readString();
    this.mType = paramParcel.readString();
    this.mArtists = new SimpleArtist[0];
    paramParcel.readTypedArray(this.mArtists, SimpleArtist.CREATOR);
    buildArtistString();
  }

  @JsonCreator
  private Track(@JsonProperty("id") String paramString1, @JsonProperty("name") String paramString2, @JsonProperty("type") String paramString3, @JsonProperty("artists") SimpleArtist[] paramArrayOfSimpleArtist)
  {
    this.mId = paramString1;
    this.mName = paramString2;
    this.mType = paramString3;
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

  public String getName()
  {
    return this.mName;
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
    paramParcel.writeArray(this.mArtists);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.model.Track
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

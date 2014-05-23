package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

public class Artist
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<Artist> CREATOR = new Artist.1();
  private final String mId;
  private final Images mImages;
  private final String mName;
  private final String mType;

  protected Artist(Parcel paramParcel)
  {
    this.mId = paramParcel.readString();
    this.mName = paramParcel.readString();
    this.mType = paramParcel.readString();
    this.mImages = null;
  }

  @JsonCreator
  private Artist(@JsonProperty("id") String paramString1, @JsonProperty("name") String paramString2, @JsonProperty("type") String paramString3, @JsonProperty("images") Images paramImages)
  {
    this.mId = paramString1;
    this.mName = paramString2;
    this.mType = paramString3;
    this.mImages = paramImages;
  }

  public int describeContents()
  {
    return 0;
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

  public String getType()
  {
    return this.mType;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mId);
    paramParcel.writeString(this.mName);
    paramParcel.writeString(this.mType);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.model.Artist
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

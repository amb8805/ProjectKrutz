package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

public class Image
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<Image> CREATOR = new Image.1();
  private final String mUrl;

  protected Image(Parcel paramParcel)
  {
    this.mUrl = paramParcel.readString();
  }

  @JsonCreator
  public Image(@JsonProperty("url") String paramString)
  {
    this.mUrl = paramString;
  }

  public int describeContents()
  {
    return 0;
  }

  public String getImageUrl()
  {
    return this.mUrl;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mUrl);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.model.Image
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

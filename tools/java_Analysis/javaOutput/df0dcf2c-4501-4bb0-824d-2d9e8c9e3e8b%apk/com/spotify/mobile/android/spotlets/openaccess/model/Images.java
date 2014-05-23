package com.spotify.mobile.android.spotlets.openaccess.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.smash.util.JacksonModel;

public class Images
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<Images> CREATOR = new Images.1();
  private final Image mLarge;
  private final Image mMedium;
  private final Image mSmall;
  private final Image mXLarge;

  protected Images(Parcel paramParcel)
  {
    this.mSmall = ((Image)paramParcel.readValue(Image.class.getClassLoader()));
    this.mMedium = ((Image)paramParcel.readValue(Image.class.getClassLoader()));
    this.mLarge = ((Image)paramParcel.readValue(Image.class.getClassLoader()));
    this.mXLarge = ((Image)paramParcel.readValue(Image.class.getClassLoader()));
  }

  @JsonCreator
  public Images(@JsonProperty("small") Image paramImage1, @JsonProperty("medium") Image paramImage2, @JsonProperty("large") Image paramImage3, @JsonProperty("xlarge") Image paramImage4)
  {
    this.mSmall = paramImage1;
    this.mMedium = paramImage2;
    this.mLarge = paramImage3;
    this.mXLarge = paramImage4;
  }

  public boolean containsImage()
  {
    return (this.mSmall != null) || (this.mMedium != null) || (this.mLarge != null) || (this.mXLarge != null);
  }

  public int describeContents()
  {
    return 0;
  }

  public Image getLargestImage()
  {
    if (this.mXLarge != null)
      return this.mXLarge;
    if (this.mLarge != null)
      return this.mLarge;
    if (this.mMedium != null)
      return this.mMedium;
    return this.mSmall;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeValue(this.mSmall);
    paramParcel.writeValue(this.mMedium);
    paramParcel.writeValue(this.mLarge);
    paramParcel.writeValue(this.mXLarge);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.openaccess.model.Images
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

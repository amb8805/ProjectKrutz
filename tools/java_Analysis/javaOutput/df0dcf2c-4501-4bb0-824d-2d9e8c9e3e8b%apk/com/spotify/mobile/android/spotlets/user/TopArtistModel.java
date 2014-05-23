package com.spotify.mobile.android.spotlets.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.android.util.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TopArtistModel
  implements Parcelable, JacksonModel
{
  public static final Parcelable.Creator<TopArtistModel> CREATOR = new TopArtistModel.1();
  private final int mFollowersCount;
  private final String mImageUrl;
  private final String mName;
  private final String mUri;

  private TopArtistModel(Parcel paramParcel)
  {
    this.mName = paramParcel.readString();
    this.mImageUrl = paramParcel.readString();
    this.mUri = paramParcel.readString();
    this.mFollowersCount = paramParcel.readInt();
  }

  public TopArtistModel(@JsonProperty("name") String paramString1, @JsonProperty("image_url") String paramString2, @JsonProperty("uri") String paramString3, @JsonProperty("followers_count") int paramInt)
  {
    this.mName = paramString1;
    this.mImageUrl = paramString2;
    this.mUri = paramString3;
    this.mFollowersCount = paramInt;
  }

  public int describeContents()
  {
    return 0;
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

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.mName);
    paramParcel.writeString(this.mImageUrl);
    paramParcel.writeString(this.mUri);
    paramParcel.writeInt(this.mFollowersCount);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.user.TopArtistModel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

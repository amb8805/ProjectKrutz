package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Artist extends Playable
  implements Parcelable
{
  public static final Parcelable.Creator<Artist> CREATOR = new Artist.1();
  private String a;
  private String b;

  public Artist(String paramString1, String paramString2, String paramString3)
  {
    super(paramString3);
    this.a = paramString1;
    this.b = paramString2;
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(d());
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.model.Artist
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

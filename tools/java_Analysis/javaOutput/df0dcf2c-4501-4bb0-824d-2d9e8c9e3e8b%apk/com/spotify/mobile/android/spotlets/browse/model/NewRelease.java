package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class NewRelease extends Playable
  implements Parcelable
{
  public static final Parcelable.Creator<NewRelease> CREATOR = new NewRelease.1();
  private String a;
  private String b;
  private String c;

  public NewRelease(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    super(paramString2);
    this.a = paramString1;
    this.b = paramString3;
    this.c = paramString4;
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return "http://o.scdn.co/300/" + this.b;
  }

  public final String c()
  {
    return this.c;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(d());
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.model.NewRelease
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

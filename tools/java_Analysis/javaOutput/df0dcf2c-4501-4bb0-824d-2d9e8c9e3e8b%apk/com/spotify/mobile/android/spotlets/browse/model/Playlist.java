package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Playlist extends Playable
  implements Parcelable
{
  public static final Parcelable.Creator<Playlist> CREATOR = new Playlist.1();
  private String a;
  private String b;
  private String c;
  private int d;

  public Playlist(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    super(paramString3);
    this.a = paramString1;
    this.b = paramString2;
    if ((paramString4 != null) && (paramString4.startsWith("http://o.scdn.co/300/")));
    for (this.c = paramString4.substring(21); ; this.c = paramString4)
    {
      this.d = paramInt;
      return;
    }
  }

  public final String a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final String c()
  {
    return "http://o.scdn.co/300/" + this.c;
  }

  public int describeContents()
  {
    return 0;
  }

  public final int f()
  {
    return this.d;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(d());
    paramParcel.writeString(this.c);
    paramParcel.writeInt(this.d);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.model.Playlist
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

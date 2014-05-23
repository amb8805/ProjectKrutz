package com.spotify.mobile.android.spotlets.browse.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class Genre
  implements Parcelable
{
  public static final Parcelable.Creator<Genre> CREATOR = new Genre.1();
  private String a;
  private String b;
  private String c;
  private String d;
  private int e;
  private int f;
  private String g;
  private String h;
  private String i;
  private String j;

  public Genre(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, String paramString5, String paramString6, String paramString7, String paramString8)
  {
    this.a = paramString1;
    this.b = paramString2;
    this.c = paramString4;
    if (TextUtils.isEmpty(paramString3));
    for (this.d = null; ; this.d = paramString3)
    {
      this.e = paramInt1;
      this.f = paramInt2;
      this.g = paramString5;
      this.h = paramString6;
      this.i = paramString7;
      this.j = paramString8;
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
    return this.d;
  }

  public final String d()
  {
    return this.c;
  }

  public int describeContents()
  {
    return 0;
  }

  public final boolean e()
  {
    return this.d == null;
  }

  public final int f()
  {
    return this.e;
  }

  public final int g()
  {
    return this.f;
  }

  public final String h()
  {
    return this.g;
  }

  public final String i()
  {
    return this.h;
  }

  public final String j()
  {
    return this.i;
  }

  public final String k()
  {
    return this.j;
  }

  public String toString()
  {
    return this.c;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeString(this.h);
    paramParcel.writeString(this.i);
    paramParcel.writeString(this.j);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.model.Genre
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

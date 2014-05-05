package com.twitter.android;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class dp
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR = new et();
  public final String a;
  public final int b;

  public dp(Parcel paramParcel)
  {
    this.a = paramParcel.readString();
    this.b = paramParcel.readInt();
  }

  public dp(String paramString)
  {
    this.a = paramString;
    this.b = 0;
  }

  public dp(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject)
      return true;
    if ((paramObject == null) || (getClass() != paramObject.getClass()))
      return false;
    dp localdp = (dp)paramObject;
    if (this.a != null)
    {
      if (this.a.equals(localdp.a));
    }
    else
      while (localdp.a != null)
        return false;
    return true;
  }

  public final int hashCode()
  {
    if (this.a != null)
      return this.a.hashCode();
    return 0;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeInt(this.b);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.dp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

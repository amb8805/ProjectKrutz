package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class DetectedActivity
  implements SafeParcelable
{
  public static final b a = new b();
  int b = 1;
  int c;
  int d;

  public DetectedActivity()
  {
  }

  public int describeContents()
  {
    return 0;
  }

  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("DetectedActivity [type=");
    int i = this.c;
    if (i > 5)
      i = 4;
    return i + ", confidence=" + this.d + "]";
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    b.a(this, paramParcel);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.DetectedActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class r
  implements Parcelable.Creator<au.b>
{
  public r()
  {
  }

  static void a(au.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramb.b);
    i.a(paramParcel, 2, paramb.c, false);
    i.a(paramParcel, 3, paramb.d, paramInt, false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

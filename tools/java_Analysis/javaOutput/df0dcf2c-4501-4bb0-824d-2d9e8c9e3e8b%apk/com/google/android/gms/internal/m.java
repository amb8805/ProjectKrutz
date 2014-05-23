package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class m
  implements Parcelable.Creator<am>
{
  public m()
  {
  }

  static void a(am paramam, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramam.a());
    i.a(paramParcel, 2, paramam.b(), paramInt, false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

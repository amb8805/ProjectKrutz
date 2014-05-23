package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class s
  implements Parcelable.Creator<au>
{
  public s()
  {
  }

  static void a(au paramau, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramau.a());
    i.a(paramParcel, 2, paramau.b(), false);
    i.a(paramParcel, 3, paramau.c(), false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class k
  implements Parcelable.Creator<ak>
{
  public k()
  {
  }

  static void a(ak paramak, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramak.b());
    i.a(paramParcel, 1000, paramak.a());
    i.a(paramParcel, 2, paramak.c());
    i.a(paramParcel, 3, paramak.d(), false);
    i.a(paramParcel, 4, paramak.e(), false);
    i.a(paramParcel, 5, paramak.f(), false);
    i.a(paramParcel, 6, paramak.g(), false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

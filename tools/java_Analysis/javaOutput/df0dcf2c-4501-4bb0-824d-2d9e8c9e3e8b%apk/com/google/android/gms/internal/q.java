package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class q
  implements Parcelable.Creator<ar.a>
{
  public q()
  {
  }

  static void a(ar.a parama, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, parama.a());
    i.a(paramParcel, 2, parama.b());
    i.a(paramParcel, 3, parama.c());
    i.a(paramParcel, 4, parama.d());
    i.a(paramParcel, 5, parama.e());
    i.a(paramParcel, 6, parama.f(), false);
    i.a(paramParcel, 7, parama.g());
    i.a(paramParcel, 8, parama.i(), false);
    i.a(paramParcel, 9, parama.k(), paramInt, false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

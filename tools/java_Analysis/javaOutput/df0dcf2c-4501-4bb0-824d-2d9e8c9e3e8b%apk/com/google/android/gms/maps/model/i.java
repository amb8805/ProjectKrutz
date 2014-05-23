package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class i
  implements Parcelable.Creator<PolygonOptions>
{
  public i()
  {
  }

  static void a(PolygonOptions paramPolygonOptions, Parcel paramParcel)
  {
    int i = com.google.android.gms.internal.i.a(paramParcel);
    com.google.android.gms.internal.i.a(paramParcel, 1, paramPolygonOptions.a());
    com.google.android.gms.internal.i.a(paramParcel, 2, paramPolygonOptions.c(), false);
    com.google.android.gms.internal.i.b(paramParcel, paramPolygonOptions.b());
    com.google.android.gms.internal.i.a(paramParcel, 4, paramPolygonOptions.d());
    com.google.android.gms.internal.i.a(paramParcel, 5, paramPolygonOptions.e());
    com.google.android.gms.internal.i.a(paramParcel, 6, paramPolygonOptions.f());
    com.google.android.gms.internal.i.a(paramParcel, 7, paramPolygonOptions.g());
    com.google.android.gms.internal.i.a(paramParcel, 8, paramPolygonOptions.h());
    com.google.android.gms.internal.i.a(paramParcel, 9, paramPolygonOptions.i());
    com.google.android.gms.internal.i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

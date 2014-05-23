package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class h
  implements Parcelable.Creator<MarkerOptions>
{
  public h()
  {
  }

  static void a(MarkerOptions paramMarkerOptions, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramMarkerOptions.a());
    i.a(paramParcel, 2, paramMarkerOptions.c(), paramInt, false);
    i.a(paramParcel, 3, paramMarkerOptions.d(), false);
    i.a(paramParcel, 4, paramMarkerOptions.e(), false);
    i.a(paramParcel, 5, paramMarkerOptions.b());
    i.a(paramParcel, 6, paramMarkerOptions.f());
    i.a(paramParcel, 7, paramMarkerOptions.g());
    i.a(paramParcel, 8, paramMarkerOptions.h());
    i.a(paramParcel, 9, paramMarkerOptions.i());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

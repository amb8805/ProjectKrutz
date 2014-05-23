package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class j
  implements Parcelable.Creator<PolylineOptions>
{
  public j()
  {
  }

  static void a(PolylineOptions paramPolylineOptions, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramPolylineOptions.a());
    i.a(paramParcel, 2, paramPolylineOptions.b(), false);
    i.a(paramParcel, 3, paramPolylineOptions.c());
    i.a(paramParcel, 4, paramPolylineOptions.d());
    i.a(paramParcel, 5, paramPolylineOptions.e());
    i.a(paramParcel, 6, paramPolylineOptions.f());
    i.a(paramParcel, 7, paramPolylineOptions.g());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

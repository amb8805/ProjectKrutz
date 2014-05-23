package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class a
  implements Parcelable.Creator<GoogleMapOptions>
{
  public a()
  {
  }

  static void a(GoogleMapOptions paramGoogleMapOptions, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramGoogleMapOptions.a());
    i.a(paramParcel, 2, paramGoogleMapOptions.b());
    i.a(paramParcel, 3, paramGoogleMapOptions.c());
    i.a(paramParcel, 4, paramGoogleMapOptions.j());
    i.a(paramParcel, 5, paramGoogleMapOptions.k(), paramInt, false);
    i.a(paramParcel, 6, paramGoogleMapOptions.d());
    i.a(paramParcel, 7, paramGoogleMapOptions.e());
    i.a(paramParcel, 8, paramGoogleMapOptions.f());
    i.a(paramParcel, 9, paramGoogleMapOptions.g());
    i.a(paramParcel, 10, paramGoogleMapOptions.h());
    i.a(paramParcel, 11, paramGoogleMapOptions.i());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

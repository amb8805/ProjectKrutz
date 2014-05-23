package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class g
  implements Parcelable.Creator<LatLng>
{
  public g()
  {
  }

  static void a(LatLng paramLatLng, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramLatLng.a());
    i.a(paramParcel, 2, paramLatLng.b);
    i.a(paramParcel, 3, paramLatLng.c);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

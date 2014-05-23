package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class f
  implements Parcelable.Creator<LatLngBounds>
{
  public f()
  {
  }

  static void a(LatLngBounds paramLatLngBounds, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramLatLngBounds.a());
    i.a(paramParcel, 2, paramLatLngBounds.b, paramInt, false);
    i.a(paramParcel, 3, paramLatLngBounds.c, paramInt, false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

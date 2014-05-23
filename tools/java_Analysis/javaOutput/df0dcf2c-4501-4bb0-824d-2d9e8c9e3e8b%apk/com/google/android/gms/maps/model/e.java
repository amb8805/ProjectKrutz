package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class e
  implements Parcelable.Creator<GroundOverlayOptions>
{
  public e()
  {
  }

  static void a(GroundOverlayOptions paramGroundOverlayOptions, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramGroundOverlayOptions.b());
    i.a(paramParcel, 2, paramGroundOverlayOptions.a());
    i.a(paramParcel, 3, paramGroundOverlayOptions.c(), paramInt, false);
    i.a(paramParcel, 4, paramGroundOverlayOptions.d());
    i.a(paramParcel, 5, paramGroundOverlayOptions.e());
    i.a(paramParcel, 6, paramGroundOverlayOptions.f(), paramInt, false);
    i.a(paramParcel, 7, paramGroundOverlayOptions.g());
    i.a(paramParcel, 8, paramGroundOverlayOptions.h());
    i.a(paramParcel, 9, paramGroundOverlayOptions.l());
    i.a(paramParcel, 10, paramGroundOverlayOptions.i());
    i.a(paramParcel, 11, paramGroundOverlayOptions.j());
    i.a(paramParcel, 12, paramGroundOverlayOptions.k());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

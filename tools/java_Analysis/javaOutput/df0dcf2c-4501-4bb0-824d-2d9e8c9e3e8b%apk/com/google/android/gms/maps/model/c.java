package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class c
  implements Parcelable.Creator<CameraPosition>
{
  public c()
  {
  }

  static void a(CameraPosition paramCameraPosition, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramCameraPosition.a());
    i.a(paramParcel, 2, paramCameraPosition.b, paramInt, false);
    i.a(paramParcel, 3, paramCameraPosition.c);
    i.a(paramParcel, 4, paramCameraPosition.d);
    i.a(paramParcel, 5, paramCameraPosition.e);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

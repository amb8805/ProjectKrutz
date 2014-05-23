package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class d
  implements Parcelable.Creator<CircleOptions>
{
  public d()
  {
  }

  static void a(CircleOptions paramCircleOptions, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramCircleOptions.a());
    i.a(paramParcel, 2, paramCircleOptions.b(), paramInt, false);
    i.a(paramParcel, 3, paramCircleOptions.c());
    i.a(paramParcel, 4, paramCircleOptions.d());
    i.a(paramParcel, 5, paramCircleOptions.e());
    i.a(paramParcel, 6, paramCircleOptions.f());
    i.a(paramParcel, 7, paramCircleOptions.g());
    i.a(paramParcel, 8, paramCircleOptions.h());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

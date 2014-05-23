package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class c
  implements Parcelable.Creator<LocationRequest>
{
  public c()
  {
  }

  static void a(LocationRequest paramLocationRequest, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramLocationRequest.b);
    i.a(paramParcel, 1000, paramLocationRequest.a);
    i.a(paramParcel, 2, paramLocationRequest.c);
    i.a(paramParcel, 3, paramLocationRequest.d);
    i.a(paramParcel, 4, paramLocationRequest.e);
    i.a(paramParcel, 5, paramLocationRequest.f);
    i.a(paramParcel, 6, paramLocationRequest.g);
    i.a(paramParcel, 7, paramLocationRequest.h);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.location.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

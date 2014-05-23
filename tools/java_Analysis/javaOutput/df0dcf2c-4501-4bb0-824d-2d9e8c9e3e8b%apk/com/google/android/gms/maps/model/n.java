package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.i;

public final class n
  implements Parcelable.Creator<VisibleRegion>
{
  public n()
  {
  }

  static void a(VisibleRegion paramVisibleRegion, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramVisibleRegion.a());
    i.a(paramParcel, 2, paramVisibleRegion.b, paramInt, false);
    i.a(paramParcel, 3, paramVisibleRegion.c, paramInt, false);
    i.a(paramParcel, 4, paramVisibleRegion.d, paramInt, false);
    i.a(paramParcel, 5, paramVisibleRegion.e, paramInt, false);
    i.a(paramParcel, 6, paramVisibleRegion.f, paramInt, false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

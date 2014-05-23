package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bw
  implements Parcelable.Creator<eu.e>
{
  public bw()
  {
  }

  static void a(eu.e parame, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = parame.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, parame.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, parame.g(), true);
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, parame.h(), true);
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, parame.i(), true);
    if (localSet.contains(Integer.valueOf(5)))
      i.a(paramParcel, 5, parame.j(), true);
    if (localSet.contains(Integer.valueOf(6)))
      i.a(paramParcel, 6, parame.k(), true);
    if (localSet.contains(Integer.valueOf(7)))
      i.a(paramParcel, 7, parame.l(), true);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

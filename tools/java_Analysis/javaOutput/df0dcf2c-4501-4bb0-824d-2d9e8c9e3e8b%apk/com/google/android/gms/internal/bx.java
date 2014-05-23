package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bx
  implements Parcelable.Creator<eu.g>
{
  public bx()
  {
  }

  static void a(eu.g paramg, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = paramg.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, paramg.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, paramg.g(), true);
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, paramg.h(), true);
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, paramg.i(), true);
    if (localSet.contains(Integer.valueOf(5)))
      i.a(paramParcel, 5, paramg.j(), true);
    if (localSet.contains(Integer.valueOf(6)))
      i.a(paramParcel, 6, paramg.k(), true);
    if (localSet.contains(Integer.valueOf(7)))
      i.a(paramParcel, 7, paramg.l());
    if (localSet.contains(Integer.valueOf(8)))
      i.a(paramParcel, 8, paramg.m(), true);
    if (localSet.contains(Integer.valueOf(9)))
      i.a(paramParcel, 9, paramg.n(), true);
    if (localSet.contains(Integer.valueOf(10)))
      i.a(paramParcel, 10, paramg.o());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

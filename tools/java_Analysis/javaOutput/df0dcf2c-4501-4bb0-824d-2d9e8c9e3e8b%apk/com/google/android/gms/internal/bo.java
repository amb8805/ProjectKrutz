package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bo
  implements Parcelable.Creator<eu>
{
  public bo()
  {
  }

  static void a(eu parameu, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    Set localSet = parameu.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, parameu.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, parameu.g(), true);
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, parameu.h(), paramInt, true);
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, parameu.i(), true);
    if (localSet.contains(Integer.valueOf(5)))
      i.a(paramParcel, 5, parameu.j(), true);
    if (localSet.contains(Integer.valueOf(6)))
      i.a(paramParcel, 6, parameu.k());
    if (localSet.contains(Integer.valueOf(7)))
      i.a(paramParcel, 7, parameu.l(), paramInt, true);
    if (localSet.contains(Integer.valueOf(8)))
      i.a(paramParcel, 8, parameu.m(), true);
    if (localSet.contains(Integer.valueOf(9)))
      i.a(paramParcel, 9, parameu.n(), true);
    if (localSet.contains(Integer.valueOf(10)))
      i.a(paramParcel, 10, parameu.o(), true);
    if (localSet.contains(Integer.valueOf(12)))
      i.a(paramParcel, 12, parameu.p());
    if (localSet.contains(Integer.valueOf(14)))
      i.a(paramParcel, 14, parameu.q(), true);
    if (localSet.contains(Integer.valueOf(15)))
      i.a(paramParcel, 15, parameu.r(), paramInt, true);
    if (localSet.contains(Integer.valueOf(16)))
      i.a(paramParcel, 16, parameu.s());
    if (localSet.contains(Integer.valueOf(19)))
      i.a(paramParcel, 19, parameu.u(), paramInt, true);
    if (localSet.contains(Integer.valueOf(18)))
      i.a(paramParcel, 18, parameu.t(), true);
    if (localSet.contains(Integer.valueOf(21)))
      i.a(paramParcel, 21, parameu.w());
    if (localSet.contains(Integer.valueOf(20)))
      i.a(paramParcel, 20, parameu.v(), true);
    if (localSet.contains(Integer.valueOf(23)))
      i.a(paramParcel, 23, parameu.y(), true);
    if (localSet.contains(Integer.valueOf(22)))
      i.a(paramParcel, 22, parameu.x(), true);
    if (localSet.contains(Integer.valueOf(25)))
      i.a(paramParcel, 25, parameu.A());
    if (localSet.contains(Integer.valueOf(24)))
      i.a(paramParcel, 24, parameu.z());
    if (localSet.contains(Integer.valueOf(27)))
      i.a(paramParcel, 27, parameu.C(), true);
    if (localSet.contains(Integer.valueOf(26)))
      i.a(paramParcel, 26, parameu.B(), true);
    if (localSet.contains(Integer.valueOf(29)))
      i.a(paramParcel, 29, parameu.E());
    if (localSet.contains(Integer.valueOf(28)))
      i.a(paramParcel, 28, parameu.D(), true);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

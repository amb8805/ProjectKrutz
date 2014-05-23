package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bz
  implements Parcelable.Creator<eu.i>
{
  public bz()
  {
  }

  static void a(eu.i parami, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = parami.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, parami.f());
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, eu.i.h());
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, parami.j(), true);
    if (localSet.contains(Integer.valueOf(5)))
      i.a(paramParcel, 5, parami.g(), true);
    if (localSet.contains(Integer.valueOf(6)))
      i.a(paramParcel, 6, parami.i());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

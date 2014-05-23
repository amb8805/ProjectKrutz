package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bn
  implements Parcelable.Creator<er>
{
  public bn()
  {
  }

  static void a(er paramer, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    Set localSet = paramer.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, paramer.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, paramer.g(), true);
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, paramer.h(), paramInt, true);
    if (localSet.contains(Integer.valueOf(5)))
      i.a(paramParcel, 5, paramer.i(), true);
    if (localSet.contains(Integer.valueOf(6)))
      i.a(paramParcel, 6, paramer.j(), paramInt, true);
    if (localSet.contains(Integer.valueOf(7)))
      i.a(paramParcel, 7, paramer.k(), true);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

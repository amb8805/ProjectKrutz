package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bu
  implements Parcelable.Creator<eu.c>
{
  public bu()
  {
  }

  static void a(eu.c paramc, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = paramc.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, paramc.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, paramc.g());
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, paramc.h());
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, paramc.i(), true);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

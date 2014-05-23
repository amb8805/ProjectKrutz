package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bt
  implements Parcelable.Creator<eu.b.b>
{
  public bt()
  {
  }

  static void a(eu.b.b paramb, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = paramb.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, paramb.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, paramb.g());
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, paramb.h(), true);
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, paramb.i());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

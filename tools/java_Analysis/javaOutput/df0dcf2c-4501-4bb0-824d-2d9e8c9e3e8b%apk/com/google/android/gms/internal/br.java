package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class br
  implements Parcelable.Creator<eu.b>
{
  public br()
  {
  }

  static void a(eu.b paramb, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    Set localSet = paramb.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, paramb.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, paramb.g(), paramInt, true);
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, paramb.h(), paramInt, true);
    if (localSet.contains(Integer.valueOf(4)))
      i.a(paramParcel, 4, paramb.i());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.br
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

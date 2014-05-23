package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bv
  implements Parcelable.Creator<eu.d>
{
  public bv()
  {
  }

  static void a(eu.d paramd, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = paramd.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, paramd.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, paramd.g(), true);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

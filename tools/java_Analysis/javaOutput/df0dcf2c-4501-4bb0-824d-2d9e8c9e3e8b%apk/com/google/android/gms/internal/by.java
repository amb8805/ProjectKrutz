package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class by
  implements Parcelable.Creator<eu.h>
{
  public by()
  {
  }

  static void a(eu.h paramh, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = paramh.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, paramh.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, paramh.g());
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, paramh.h(), true);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.by
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

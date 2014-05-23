package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Set;

public final class bs
  implements Parcelable.Creator<eu.b.a>
{
  public bs()
  {
  }

  static void a(eu.b.a parama, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    Set localSet = parama.e();
    if (localSet.contains(Integer.valueOf(1)))
      i.a(paramParcel, 1, parama.f());
    if (localSet.contains(Integer.valueOf(2)))
      i.a(paramParcel, 2, parama.g());
    if (localSet.contains(Integer.valueOf(3)))
      i.a(paramParcel, 3, parama.h());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

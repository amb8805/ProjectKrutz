package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class o
  implements Parcelable.Creator<ao.a>
{
  public o()
  {
  }

  static void a(ao.a parama, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, parama.b);
    i.a(paramParcel, 2, parama.c, false);
    i.a(paramParcel, 3, parama.d);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

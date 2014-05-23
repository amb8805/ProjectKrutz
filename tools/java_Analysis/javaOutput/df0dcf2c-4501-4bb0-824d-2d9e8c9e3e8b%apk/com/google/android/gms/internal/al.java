package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class al
  implements Parcelable.Creator<cn>
{
  public al()
  {
  }

  static void a(cn paramcn, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramcn.f(), false);
    i.a(paramParcel, 1000, paramcn.a());
    i.a(paramParcel, 2, paramcn.g());
    i.a(paramParcel, paramcn.b());
    i.a(paramParcel, 4, paramcn.c());
    i.a(paramParcel, 5, paramcn.d());
    i.a(paramParcel, 6, paramcn.e());
    i.a(paramParcel, 7, paramcn.h());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.al
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

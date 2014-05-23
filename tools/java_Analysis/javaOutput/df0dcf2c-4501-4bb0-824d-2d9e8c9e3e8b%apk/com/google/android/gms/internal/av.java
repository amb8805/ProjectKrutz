package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class av
  implements Parcelable.Creator<ed>
{
  public av()
  {
  }

  static void a(ed paramed, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramed.b(), false);
    i.a(paramParcel, 1000, paramed.a());
    i.a(paramParcel, 2, paramed.c());
    i.a(paramParcel, 3, paramed.d());
    i.a(paramParcel, 4, paramed.e());
    i.a(paramParcel, 5, paramed.f(), false);
    i.a(paramParcel, 6, paramed.g(), false);
    i.a(paramParcel, 7, paramed.h(), false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.av
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

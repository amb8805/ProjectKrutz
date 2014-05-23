package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class v
  implements Parcelable.Creator<ax>
{
  public v()
  {
  }

  public static ax a(Parcel paramParcel)
  {
    au localau = null;
    int i = ah.a(paramParcel);
    int j = 0;
    Parcel localParcel = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default:
        ah.b(paramParcel, k);
        break;
      case 1:
        j = ah.f(paramParcel, k);
        break;
      case 2:
        localParcel = ah.r(paramParcel, k);
        break;
      case 3:
        localau = (au)ah.a(paramParcel, k, au.a);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    return new ax(j, localParcel, localau);
  }

  static void a(ax paramax, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramax.a());
    i.a(paramParcel, paramax.e());
    i.a(paramParcel, 3, paramax.f(), paramInt, false);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

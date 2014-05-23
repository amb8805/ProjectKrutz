package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ah.a;
import com.google.android.gms.internal.i;

public final class k
  implements Parcelable.Creator<Tile>
{
  public k()
  {
  }

  public static Tile a(Parcel paramParcel)
  {
    int i = 0;
    int j = ah.a(paramParcel);
    byte[] arrayOfByte = null;
    int k = 0;
    int m = 0;
    while (paramParcel.dataPosition() < j)
    {
      int n = paramParcel.readInt();
      switch (0xFFFF & n)
      {
      default:
        ah.b(paramParcel, n);
        break;
      case 1:
        m = ah.f(paramParcel, n);
        break;
      case 2:
        k = ah.f(paramParcel, n);
        break;
      case 3:
        i = ah.f(paramParcel, n);
        break;
      case 4:
        arrayOfByte = ah.o(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new ah.a("Overread allowed size end=" + j, paramParcel);
    return new Tile(m, k, i, arrayOfByte);
  }

  static void a(Tile paramTile, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramTile.a());
    i.a(paramParcel, 2, paramTile.b);
    i.a(paramParcel, 3, paramTile.c);
    i.a(paramParcel, paramTile.d);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.maps.model.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

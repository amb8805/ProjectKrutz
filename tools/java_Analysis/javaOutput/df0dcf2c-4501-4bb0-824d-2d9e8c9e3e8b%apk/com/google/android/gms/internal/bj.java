package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class bj
  implements Parcelable.Creator<en>
{
  public bj()
  {
  }

  public static en a(Parcel paramParcel)
  {
    boolean bool = false;
    ArrayList localArrayList1 = null;
    int i = ah.a(paramParcel);
    ArrayList localArrayList2 = null;
    String str = null;
    int j = 0;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default:
        ah.b(paramParcel, k);
        break;
      case 1:
        str = ah.l(paramParcel, k);
        break;
      case 1000:
        j = ah.f(paramParcel, k);
        break;
      case 2:
        localArrayList2 = ah.b(paramParcel, k, ak.a);
        break;
      case 3:
        localArrayList1 = ah.b(paramParcel, k, ak.a);
        break;
      case 4:
        bool = ah.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    return new en(j, str, localArrayList2, localArrayList1, bool);
  }

  static void a(en paramen, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramen.b(), false);
    i.a(paramParcel, 1000, paramen.a());
    i.a(paramParcel, 2, paramen.c(), false);
    i.a(paramParcel, 3, paramen.d(), false);
    i.a(paramParcel, 4, paramen.e());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.bj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

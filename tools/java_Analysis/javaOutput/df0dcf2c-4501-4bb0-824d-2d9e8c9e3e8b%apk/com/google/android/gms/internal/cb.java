package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class cb
  implements Parcelable.Creator<fj>
{
  public cb()
  {
  }

  public static fj a(Parcel paramParcel)
  {
    Bundle localBundle = null;
    boolean bool1 = false;
    int i = ah.a(paramParcel);
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    boolean bool2 = false;
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
        bool2 = ah.c(paramParcel, k);
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
        localBundle = ah.n(paramParcel, k);
        break;
      case 5:
        bool1 = ah.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    return new fj(j, bool2, localArrayList2, localArrayList1, localBundle, bool1);
  }

  static void a(fj paramfj, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramfj.a());
    i.a(paramParcel, 1000, paramfj.f());
    i.a(paramParcel, 2, paramfj.b(), false);
    i.a(paramParcel, 3, paramfj.c(), false);
    i.a(paramParcel, 4, paramfj.d());
    i.a(paramParcel, 5, paramfj.e());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.cb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

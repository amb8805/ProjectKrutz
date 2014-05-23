package com.google.android.gms.internal;

import android.database.CursorWindow;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class cg
  implements Parcelable.Creator<l>
{
  public cg()
  {
  }

  public static l a(Parcel paramParcel)
  {
    l locall = new l();
    int i = ah.a(paramParcel);
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch (0xFFFF & j)
      {
      default:
        ah.b(paramParcel, j);
        break;
      case 1:
        locall.c = ah.q(paramParcel, j);
        break;
      case 1000:
        locall.b = ah.f(paramParcel, j);
        break;
      case 2:
        Parcelable.Creator localCreator = CursorWindow.CREATOR;
        int k = ah.a(paramParcel, j);
        int m = paramParcel.dataPosition();
        Object[] arrayOfObject;
        if (k == 0)
          arrayOfObject = null;
        while (true)
        {
          locall.e = ((CursorWindow[])arrayOfObject);
          break;
          arrayOfObject = paramParcel.createTypedArray(localCreator);
          paramParcel.setDataPosition(m + k);
        }
      case 3:
        locall.f = ah.f(paramParcel, j);
        break;
      case 4:
        locall.g = ah.n(paramParcel, j);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    locall.a();
    return locall;
  }

  static void a(l paraml, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paraml.c);
    i.a(paramParcel, 1000, paraml.b);
    i.a(paramParcel, paraml.e, paramInt);
    i.a(paramParcel, 3, paraml.f);
    i.a(paramParcel, 4, paraml.g);
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.cg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

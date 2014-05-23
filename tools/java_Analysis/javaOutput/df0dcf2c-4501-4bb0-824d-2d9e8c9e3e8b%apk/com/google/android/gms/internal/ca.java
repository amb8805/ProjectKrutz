package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public final class ca
  implements Parcelable.Creator<fh>
{
  public ca()
  {
  }

  public static fh a(Parcel paramParcel)
  {
    Bundle localBundle1 = null;
    int i = ah.a(paramParcel);
    int j = 0;
    Bundle localBundle2 = null;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    Uri localUri = null;
    ArrayList localArrayList1 = null;
    ArrayList localArrayList2 = null;
    String str4 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default:
        ah.b(paramParcel, k);
        break;
      case 1:
        str4 = ah.l(paramParcel, k);
        break;
      case 1000:
        j = ah.f(paramParcel, k);
        break;
      case 2:
        localArrayList2 = ah.b(paramParcel, k, ak.a);
        break;
      case 3:
        localArrayList1 = ah.b(paramParcel, k, Uri.CREATOR);
        break;
      case 4:
        localUri = (Uri)ah.a(paramParcel, k, Uri.CREATOR);
        break;
      case 5:
        str3 = ah.l(paramParcel, k);
        break;
      case 6:
        str2 = ah.l(paramParcel, k);
        break;
      case 7:
        str1 = ah.l(paramParcel, k);
        break;
      case 8:
        localBundle2 = ah.n(paramParcel, k);
        break;
      case 9:
        localBundle1 = ah.n(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    return new fh(j, str4, localArrayList2, localArrayList1, localUri, str3, str2, str1, localBundle2, localBundle1);
  }

  static void a(fh paramfh, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramfh.g(), false);
    i.a(paramParcel, 1000, paramfh.j());
    i.a(paramParcel, 2, paramfh.a(), false);
    i.a(paramParcel, 3, paramfh.b(), false);
    i.a(paramParcel, 4, paramfh.c(), paramInt, false);
    i.a(paramParcel, 5, paramfh.d(), false);
    i.a(paramParcel, 6, paramfh.e(), false);
    i.a(paramParcel, 7, paramfh.f(), false);
    i.a(paramParcel, 8, paramfh.h());
    i.a(paramParcel, 9, paramfh.i());
    i.a(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.ca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

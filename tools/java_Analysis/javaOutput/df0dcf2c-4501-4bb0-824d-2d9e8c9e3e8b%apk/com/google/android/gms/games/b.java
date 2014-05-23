package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ah.a;
import com.google.android.gms.internal.i;

public class b
  implements Parcelable.Creator<GameEntity>
{
  public b()
  {
  }

  static void a(GameEntity paramGameEntity, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramGameEntity.b(), false);
    i.a(paramParcel, 2, paramGameEntity.c(), false);
    i.a(paramParcel, 3, paramGameEntity.d(), false);
    i.a(paramParcel, 4, paramGameEntity.e(), false);
    i.a(paramParcel, 5, paramGameEntity.f(), false);
    i.a(paramParcel, 6, paramGameEntity.g(), false);
    i.a(paramParcel, 7, paramGameEntity.h(), paramInt, false);
    i.a(paramParcel, 8, paramGameEntity.i(), paramInt, false);
    i.a(paramParcel, 9, paramGameEntity.j(), paramInt, false);
    i.a(paramParcel, 10, paramGameEntity.k());
    i.a(paramParcel, 11, paramGameEntity.l());
    i.a(paramParcel, 12, paramGameEntity.m(), false);
    i.a(paramParcel, 13, paramGameEntity.n());
    i.a(paramParcel, 14, paramGameEntity.o());
    i.a(paramParcel, 15, paramGameEntity.p());
    i.a(paramParcel, 1000, paramGameEntity.q());
    i.a(paramParcel, i);
  }

  public GameEntity a(Parcel paramParcel)
  {
    int i = ah.a(paramParcel);
    int j = 0;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    String str6 = null;
    Uri localUri1 = null;
    Uri localUri2 = null;
    Uri localUri3 = null;
    boolean bool1 = false;
    boolean bool2 = false;
    String str7 = null;
    int k = 0;
    int m = 0;
    int n = 0;
    while (paramParcel.dataPosition() < i)
    {
      int i1 = paramParcel.readInt();
      switch (0xFFFF & i1)
      {
      default:
        ah.b(paramParcel, i1);
        break;
      case 1:
        str1 = ah.l(paramParcel, i1);
        break;
      case 2:
        str2 = ah.l(paramParcel, i1);
        break;
      case 3:
        str3 = ah.l(paramParcel, i1);
        break;
      case 4:
        str4 = ah.l(paramParcel, i1);
        break;
      case 5:
        str5 = ah.l(paramParcel, i1);
        break;
      case 6:
        str6 = ah.l(paramParcel, i1);
        break;
      case 7:
        localUri1 = (Uri)ah.a(paramParcel, i1, Uri.CREATOR);
        break;
      case 8:
        localUri2 = (Uri)ah.a(paramParcel, i1, Uri.CREATOR);
        break;
      case 9:
        localUri3 = (Uri)ah.a(paramParcel, i1, Uri.CREATOR);
        break;
      case 10:
        bool1 = ah.c(paramParcel, i1);
        break;
      case 11:
        bool2 = ah.c(paramParcel, i1);
        break;
      case 12:
        str7 = ah.l(paramParcel, i1);
        break;
      case 13:
        k = ah.f(paramParcel, i1);
        break;
      case 14:
        m = ah.f(paramParcel, i1);
        break;
      case 15:
        n = ah.f(paramParcel, i1);
        break;
      case 1000:
        j = ah.f(paramParcel, i1);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    return new GameEntity(j, str1, str2, str3, str4, str5, str6, localUri1, localUri2, localUri3, bool1, bool2, str7, k, m, n);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

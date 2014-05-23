package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ah.a;
import com.google.android.gms.internal.i;

public class d
  implements Parcelable.Creator<PlayerEntity>
{
  public d()
  {
  }

  static void a(PlayerEntity paramPlayerEntity, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramPlayerEntity.b(), false);
    i.a(paramParcel, 1000, paramPlayerEntity.g());
    i.a(paramParcel, 2, paramPlayerEntity.c(), false);
    i.a(paramParcel, 3, paramPlayerEntity.d(), paramInt, false);
    i.a(paramParcel, 4, paramPlayerEntity.e(), paramInt, false);
    i.a(paramParcel, 5, paramPlayerEntity.f());
    i.a(paramParcel, i);
  }

  public PlayerEntity a(Parcel paramParcel)
  {
    Uri localUri1 = null;
    int i = ah.a(paramParcel);
    int j = 0;
    long l = 0L;
    Uri localUri2 = null;
    String str1 = null;
    String str2 = null;
    while (paramParcel.dataPosition() < i)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default:
        ah.b(paramParcel, k);
        break;
      case 1:
        str2 = ah.l(paramParcel, k);
        break;
      case 1000:
        j = ah.f(paramParcel, k);
        break;
      case 2:
        str1 = ah.l(paramParcel, k);
        break;
      case 3:
        localUri2 = (Uri)ah.a(paramParcel, k, Uri.CREATOR);
        break;
      case 4:
        localUri1 = (Uri)ah.a(paramParcel, k, Uri.CREATOR);
        break;
      case 5:
        l = ah.g(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != i)
      throw new ah.a("Overread allowed size end=" + i, paramParcel);
    return new PlayerEntity(j, str2, str1, localUri2, localUri1, l);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

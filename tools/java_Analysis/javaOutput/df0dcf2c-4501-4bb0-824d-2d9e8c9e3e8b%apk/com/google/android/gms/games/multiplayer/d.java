package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ah.a;
import com.google.android.gms.internal.i;

public class d
  implements Parcelable.Creator<ParticipantEntity>
{
  public d()
  {
  }

  static void a(ParticipantEntity paramParticipantEntity, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramParticipantEntity.i(), false);
    i.a(paramParcel, 1000, paramParticipantEntity.k());
    i.a(paramParcel, 2, paramParticipantEntity.f(), false);
    i.a(paramParcel, 3, paramParticipantEntity.g(), paramInt, false);
    i.a(paramParcel, 4, paramParticipantEntity.h(), paramInt, false);
    i.a(paramParcel, 5, paramParticipantEntity.b());
    i.a(paramParcel, 6, paramParticipantEntity.c(), false);
    i.a(paramParcel, 7, paramParticipantEntity.e());
    i.a(paramParcel, 8, paramParticipantEntity.j(), paramInt, false);
    i.a(paramParcel, 9, paramParticipantEntity.d());
    i.a(paramParcel, i);
  }

  public ParticipantEntity a(Parcel paramParcel)
  {
    int i = 0;
    PlayerEntity localPlayerEntity = null;
    int j = ah.a(paramParcel);
    boolean bool = false;
    String str1 = null;
    int k = 0;
    Uri localUri1 = null;
    Uri localUri2 = null;
    String str2 = null;
    String str3 = null;
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
        str3 = ah.l(paramParcel, n);
        break;
      case 1000:
        m = ah.f(paramParcel, n);
        break;
      case 2:
        str2 = ah.l(paramParcel, n);
        break;
      case 3:
        localUri2 = (Uri)ah.a(paramParcel, n, Uri.CREATOR);
        break;
      case 4:
        localUri1 = (Uri)ah.a(paramParcel, n, Uri.CREATOR);
        break;
      case 5:
        k = ah.f(paramParcel, n);
        break;
      case 6:
        str1 = ah.l(paramParcel, n);
        break;
      case 7:
        bool = ah.c(paramParcel, n);
        break;
      case 8:
        localPlayerEntity = (PlayerEntity)ah.a(paramParcel, n, PlayerEntity.a);
        break;
      case 9:
        i = ah.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new ah.a("Overread allowed size end=" + j, paramParcel);
    return new ParticipantEntity(m, str3, str2, localUri2, localUri1, k, str1, bool, localPlayerEntity, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

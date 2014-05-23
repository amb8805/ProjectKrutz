package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ah.a;
import com.google.android.gms.internal.i;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<InvitationEntity>
{
  public b()
  {
  }

  static void a(InvitationEntity paramInvitationEntity, Parcel paramParcel, int paramInt)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramInvitationEntity.b(), paramInt, false);
    i.a(paramParcel, 1000, paramInvitationEntity.h());
    i.a(paramParcel, 2, paramInvitationEntity.c(), false);
    i.a(paramParcel, 3, paramInvitationEntity.e());
    i.a(paramParcel, 4, paramInvitationEntity.f());
    i.a(paramParcel, 5, paramInvitationEntity.d(), paramInt, false);
    i.a(paramParcel, 6, paramInvitationEntity.i(), false);
    i.a(paramParcel, 7, paramInvitationEntity.g());
    i.a(paramParcel, i);
  }

  public InvitationEntity a(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList = null;
    int j = ah.a(paramParcel);
    long l = 0L;
    ParticipantEntity localParticipantEntity = null;
    int k = 0;
    String str = null;
    GameEntity localGameEntity = null;
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
        localGameEntity = (GameEntity)ah.a(paramParcel, n, GameEntity.a);
        break;
      case 1000:
        m = ah.f(paramParcel, n);
        break;
      case 2:
        str = ah.l(paramParcel, n);
        break;
      case 3:
        l = ah.g(paramParcel, n);
        break;
      case 4:
        k = ah.f(paramParcel, n);
        break;
      case 5:
        localParticipantEntity = (ParticipantEntity)ah.a(paramParcel, n, ParticipantEntity.a);
        break;
      case 6:
        localArrayList = ah.b(paramParcel, n, ParticipantEntity.a);
        break;
      case 7:
        i = ah.f(paramParcel, n);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new ah.a("Overread allowed size end=" + j, paramParcel);
    return new InvitationEntity(m, localGameEntity, str, l, k, localParticipantEntity, localArrayList, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.GameEntity;
import java.util.ArrayList;

final class a extends b
{
  a()
  {
  }

  public final InvitationEntity a(Parcel paramParcel)
  {
    if ((InvitationEntity.a(InvitationEntity.j())) || (InvitationEntity.a(InvitationEntity.class.getCanonicalName())))
      return super.a(paramParcel);
    GameEntity localGameEntity = GameEntity.a.a(paramParcel);
    String str = paramParcel.readString();
    long l = paramParcel.readLong();
    int i = paramParcel.readInt();
    ParticipantEntity localParticipantEntity = ParticipantEntity.a.a(paramParcel);
    int j = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(j);
    for (int k = 0; k < j; k++)
      localArrayList.add(ParticipantEntity.a.a(paramParcel));
    return new InvitationEntity(1, localGameEntity, str, l, i, localParticipantEntity, localArrayList, -1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

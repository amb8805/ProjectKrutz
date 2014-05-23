package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.bq;
import com.google.android.gms.internal.d;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.ArrayList;
import java.util.Arrays;

public final class InvitationEntity extends bq
  implements Invitation
{
  public static final b a = new a();
  private final int b;
  private final GameEntity c;
  private final String d;
  private final long e;
  private final int f;
  private final ParticipantEntity g;
  private final ArrayList<ParticipantEntity> h;
  private final int i;

  InvitationEntity(int paramInt1, GameEntity paramGameEntity, String paramString, long paramLong, int paramInt2, ParticipantEntity paramParticipantEntity, ArrayList<ParticipantEntity> paramArrayList, int paramInt3)
  {
    this.b = paramInt1;
    this.c = paramGameEntity;
    this.d = paramString;
    this.e = paramLong;
    this.f = paramInt2;
    this.g = paramParticipantEntity;
    this.h = paramArrayList;
    this.i = paramInt3;
  }

  public InvitationEntity(Invitation paramInvitation)
  {
    this.b = 1;
    this.c = new GameEntity(paramInvitation.b());
    this.d = paramInvitation.c();
    this.e = paramInvitation.e();
    this.f = paramInvitation.f();
    this.i = paramInvitation.g();
    String str = paramInvitation.d().i();
    Object localObject = null;
    ArrayList localArrayList = paramInvitation.i();
    int j = localArrayList.size();
    this.h = new ArrayList(j);
    for (int k = 0; k < j; k++)
    {
      Participant localParticipant = (Participant)localArrayList.get(k);
      if (localParticipant.i().equals(str))
        localObject = localParticipant;
      this.h.add((ParticipantEntity)localParticipant.a());
    }
    f.a(localObject, "Must have a valid inviter!");
    this.g = ((ParticipantEntity)localObject.a());
  }

  public static int a(Invitation paramInvitation)
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = paramInvitation.b();
    arrayOfObject[1] = paramInvitation.c();
    arrayOfObject[2] = Long.valueOf(paramInvitation.e());
    arrayOfObject[3] = Integer.valueOf(paramInvitation.f());
    arrayOfObject[4] = paramInvitation.d();
    arrayOfObject[5] = paramInvitation.i();
    arrayOfObject[6] = Integer.valueOf(paramInvitation.g());
    return Arrays.hashCode(arrayOfObject);
  }

  public static boolean a(Invitation paramInvitation, Object paramObject)
  {
    if (!(paramObject instanceof Invitation));
    Invitation localInvitation;
    do
    {
      return false;
      if (paramInvitation == paramObject)
        return true;
      localInvitation = (Invitation)paramObject;
    }
    while ((!d.a(localInvitation.b(), paramInvitation.b())) || (!d.a(localInvitation.c(), paramInvitation.c())) || (!d.a(Long.valueOf(localInvitation.e()), Long.valueOf(paramInvitation.e()))) || (!d.a(Integer.valueOf(localInvitation.f()), Integer.valueOf(paramInvitation.f()))) || (!d.a(localInvitation.d(), paramInvitation.d())) || (!d.a(localInvitation.i(), paramInvitation.i())) || (!d.a(Integer.valueOf(localInvitation.g()), Integer.valueOf(paramInvitation.g()))));
    return true;
  }

  public static String b(Invitation paramInvitation)
  {
    return d.a(paramInvitation).a("Game", paramInvitation.b()).a("InvitationId", paramInvitation.c()).a("CreationTimestamp", Long.valueOf(paramInvitation.e())).a("InvitationType", Integer.valueOf(paramInvitation.f())).a("Inviter", paramInvitation.d()).a("Participants", paramInvitation.i()).a("Variant", Integer.valueOf(paramInvitation.g())).toString();
  }

  public final Game b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }

  public final Participant d()
  {
    return this.g;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final long e()
  {
    return this.e;
  }

  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }

  public final int f()
  {
    return this.f;
  }

  public final int g()
  {
    return this.i;
  }

  public final int h()
  {
    return this.b;
  }

  public final int hashCode()
  {
    return a(this);
  }

  public final ArrayList<Participant> i()
  {
    return new ArrayList(this.h);
  }

  public final String toString()
  {
    return b(this);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!t())
      b.a(this, paramParcel, paramInt);
    while (true)
    {
      return;
      this.c.writeToParcel(paramParcel, paramInt);
      paramParcel.writeString(this.d);
      paramParcel.writeLong(this.e);
      paramParcel.writeInt(this.f);
      this.g.writeToParcel(paramParcel, paramInt);
      int j = this.h.size();
      paramParcel.writeInt(j);
      for (int k = 0; k < j; k++)
        ((ParticipantEntity)this.h.get(k)).writeToParcel(paramParcel, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.InvitationEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.bq;
import com.google.android.gms.internal.d;
import com.google.android.gms.internal.e;
import java.util.ArrayList;
import java.util.Arrays;

public final class RoomEntity extends bq
  implements Room
{
  public static final b a = new a();
  private final int b;
  private final String c;
  private final String d;
  private final long e;
  private final int f;
  private final String g;
  private final int h;
  private final Bundle i;
  private final ArrayList<ParticipantEntity> j;

  RoomEntity(int paramInt1, String paramString1, String paramString2, long paramLong, int paramInt2, String paramString3, int paramInt3, Bundle paramBundle, ArrayList<ParticipantEntity> paramArrayList)
  {
    this.b = paramInt1;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramLong;
    this.f = paramInt2;
    this.g = paramString3;
    this.h = paramInt3;
    this.i = paramBundle;
    this.j = paramArrayList;
  }

  public RoomEntity(Room paramRoom)
  {
    this.b = 1;
    this.c = paramRoom.b();
    this.d = paramRoom.c();
    this.e = paramRoom.d();
    this.f = paramRoom.e();
    this.g = paramRoom.f();
    this.h = paramRoom.g();
    this.i = paramRoom.h();
    ArrayList localArrayList = paramRoom.i();
    int k = localArrayList.size();
    this.j = new ArrayList(k);
    for (int m = 0; m < k; m++)
      this.j.add((ParticipantEntity)((Participant)localArrayList.get(m)).a());
  }

  public static int a(Room paramRoom)
  {
    Object[] arrayOfObject = new Object[8];
    arrayOfObject[0] = paramRoom.b();
    arrayOfObject[1] = paramRoom.c();
    arrayOfObject[2] = Long.valueOf(paramRoom.d());
    arrayOfObject[3] = Integer.valueOf(paramRoom.e());
    arrayOfObject[4] = paramRoom.f();
    arrayOfObject[5] = Integer.valueOf(paramRoom.g());
    arrayOfObject[6] = paramRoom.h();
    arrayOfObject[7] = paramRoom.i();
    return Arrays.hashCode(arrayOfObject);
  }

  public static boolean a(Room paramRoom, Object paramObject)
  {
    if (!(paramObject instanceof Room));
    Room localRoom;
    do
    {
      return false;
      if (paramRoom == paramObject)
        return true;
      localRoom = (Room)paramObject;
    }
    while ((!d.a(localRoom.b(), paramRoom.b())) || (!d.a(localRoom.c(), paramRoom.c())) || (!d.a(Long.valueOf(localRoom.d()), Long.valueOf(paramRoom.d()))) || (!d.a(Integer.valueOf(localRoom.e()), Integer.valueOf(paramRoom.e()))) || (!d.a(localRoom.f(), paramRoom.f())) || (!d.a(Integer.valueOf(localRoom.g()), Integer.valueOf(paramRoom.g()))) || (!d.a(localRoom.h(), paramRoom.h())) || (!d.a(localRoom.i(), paramRoom.i())));
    return true;
  }

  public static String b(Room paramRoom)
  {
    return d.a(paramRoom).a("RoomId", paramRoom.b()).a("CreatorId", paramRoom.c()).a("CreationTimestamp", Long.valueOf(paramRoom.d())).a("RoomStatus", Integer.valueOf(paramRoom.e())).a("Description", paramRoom.f()).a("Variant", Integer.valueOf(paramRoom.g())).a("AutoMatchCriteria", paramRoom.h()).a("Participants", paramRoom.i()).toString();
  }

  public final String b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }

  public final long d()
  {
    return this.e;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int e()
  {
    return this.f;
  }

  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }

  public final String f()
  {
    return this.g;
  }

  public final int g()
  {
    return this.h;
  }

  public final Bundle h()
  {
    return this.i;
  }

  public final int hashCode()
  {
    return a(this);
  }

  public final ArrayList<Participant> i()
  {
    return new ArrayList(this.j);
  }

  public final int j()
  {
    return this.b;
  }

  public final String toString()
  {
    return b(this);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!t())
      b.a(this, paramParcel);
    while (true)
    {
      return;
      paramParcel.writeString(this.c);
      paramParcel.writeString(this.d);
      paramParcel.writeLong(this.e);
      paramParcel.writeInt(this.f);
      paramParcel.writeString(this.g);
      paramParcel.writeInt(this.h);
      paramParcel.writeBundle(this.i);
      int k = this.j.size();
      paramParcel.writeInt(k);
      for (int m = 0; m < k; m++)
        ((ParticipantEntity)this.j.get(m)).writeToParcel(paramParcel, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.RoomEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

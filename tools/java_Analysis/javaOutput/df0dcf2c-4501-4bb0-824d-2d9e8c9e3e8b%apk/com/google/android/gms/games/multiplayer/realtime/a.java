package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

final class a extends b
{
  a()
  {
  }

  public final RoomEntity a(Parcel paramParcel)
  {
    if ((RoomEntity.a(RoomEntity.k())) || (RoomEntity.a(RoomEntity.class.getCanonicalName())))
      return super.a(paramParcel);
    String str1 = paramParcel.readString();
    String str2 = paramParcel.readString();
    long l = paramParcel.readLong();
    int i = paramParcel.readInt();
    String str3 = paramParcel.readString();
    int j = paramParcel.readInt();
    Bundle localBundle = paramParcel.readBundle();
    int k = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(k);
    for (int m = 0; m < k; m++)
      localArrayList.add(ParticipantEntity.a.a(paramParcel));
    return new RoomEntity(1, str1, str2, l, i, str3, j, localBundle, localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

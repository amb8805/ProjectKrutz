package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.ah;
import com.google.android.gms.internal.ah.a;
import com.google.android.gms.internal.i;
import java.util.ArrayList;

public class b
  implements Parcelable.Creator<RoomEntity>
{
  public b()
  {
  }

  static void a(RoomEntity paramRoomEntity, Parcel paramParcel)
  {
    int i = i.a(paramParcel);
    i.a(paramParcel, 1, paramRoomEntity.b(), false);
    i.a(paramParcel, 1000, paramRoomEntity.j());
    i.a(paramParcel, 2, paramRoomEntity.c(), false);
    i.a(paramParcel, 3, paramRoomEntity.d());
    i.a(paramParcel, 4, paramRoomEntity.e());
    i.a(paramParcel, 5, paramRoomEntity.f(), false);
    i.a(paramParcel, 6, paramRoomEntity.g());
    i.a(paramParcel, 7, paramRoomEntity.h());
    i.a(paramParcel, 8, paramRoomEntity.i(), false);
    i.a(paramParcel, i);
  }

  public RoomEntity a(Parcel paramParcel)
  {
    int i = 0;
    ArrayList localArrayList = null;
    int j = ah.a(paramParcel);
    long l = 0L;
    Bundle localBundle = null;
    String str1 = null;
    int k = 0;
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
        l = ah.g(paramParcel, n);
        break;
      case 4:
        k = ah.f(paramParcel, n);
        break;
      case 5:
        str1 = ah.l(paramParcel, n);
        break;
      case 6:
        i = ah.f(paramParcel, n);
        break;
      case 7:
        localBundle = ah.n(paramParcel, n);
        break;
      case 8:
        localArrayList = ah.b(paramParcel, n, ParticipantEntity.a);
      }
    }
    if (paramParcel.dataPosition() != j)
      throw new ah.a("Overread allowed size end=" + j, paramParcel);
    return new RoomEntity(m, str3, str2, l, k, str1, i, localBundle, localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

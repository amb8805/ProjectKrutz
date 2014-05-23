package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.bq;
import com.google.android.gms.internal.cq;
import com.google.android.gms.internal.e;
import java.util.Arrays;

public final class PlayerEntity extends bq
  implements Player
{
  public static final d a = new c();
  private final int b;
  private final String c;
  private final String d;
  private final Uri e;
  private final Uri f;
  private final long g;

  PlayerEntity(int paramInt, String paramString1, String paramString2, Uri paramUri1, Uri paramUri2, long paramLong)
  {
    this.b = paramInt;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramUri1;
    this.f = paramUri2;
    this.g = paramLong;
  }

  public PlayerEntity(Player paramPlayer)
  {
    this.b = i;
    this.c = paramPlayer.b();
    this.d = paramPlayer.c();
    this.e = paramPlayer.d();
    this.f = paramPlayer.e();
    this.g = paramPlayer.f();
    cq.a(this.c);
    cq.a(this.d);
    if (this.g > 0L);
    while (i == 0)
    {
      throw new IllegalStateException();
      i = 0;
    }
  }

  public static int a(Player paramPlayer)
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = paramPlayer.b();
    arrayOfObject[1] = paramPlayer.c();
    arrayOfObject[2] = paramPlayer.d();
    arrayOfObject[3] = paramPlayer.e();
    arrayOfObject[4] = Long.valueOf(paramPlayer.f());
    return Arrays.hashCode(arrayOfObject);
  }

  public static boolean a(Player paramPlayer, Object paramObject)
  {
    if (!(paramObject instanceof Player));
    Player localPlayer;
    do
    {
      return false;
      if (paramPlayer == paramObject)
        return true;
      localPlayer = (Player)paramObject;
    }
    while ((!com.google.android.gms.internal.d.a(localPlayer.b(), paramPlayer.b())) || (!com.google.android.gms.internal.d.a(localPlayer.c(), paramPlayer.c())) || (!com.google.android.gms.internal.d.a(localPlayer.d(), paramPlayer.d())) || (!com.google.android.gms.internal.d.a(localPlayer.e(), paramPlayer.e())) || (!com.google.android.gms.internal.d.a(Long.valueOf(localPlayer.f()), Long.valueOf(paramPlayer.f()))));
    return true;
  }

  public static String b(Player paramPlayer)
  {
    return com.google.android.gms.internal.d.a(paramPlayer).a("PlayerId", paramPlayer.b()).a("DisplayName", paramPlayer.c()).a("IconImageUri", paramPlayer.d()).a("HiResImageUri", paramPlayer.e()).a("RetrievedTimestamp", Long.valueOf(paramPlayer.f())).toString();
  }

  public final String b()
  {
    return this.c;
  }

  public final String c()
  {
    return this.d;
  }

  public final Uri d()
  {
    return this.e;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final Uri e()
  {
    return this.f;
  }

  public final boolean equals(Object paramObject)
  {
    return a(this, paramObject);
  }

  public final long f()
  {
    return this.g;
  }

  public final int g()
  {
    return this.b;
  }

  public final int hashCode()
  {
    return a(this);
  }

  public final String toString()
  {
    return b(this);
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    if (!t())
    {
      d.a(this, paramParcel, paramInt);
      return;
    }
    paramParcel.writeString(this.c);
    paramParcel.writeString(this.d);
    String str1;
    String str2;
    if (this.e == null)
    {
      str1 = null;
      paramParcel.writeString(str1);
      Uri localUri = this.f;
      str2 = null;
      if (localUri != null)
        break label84;
    }
    while (true)
    {
      paramParcel.writeString(str2);
      paramParcel.writeLong(this.g);
      return;
      str1 = this.e.toString();
      break;
      label84: str2 = this.f.toString();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.PlayerEntity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

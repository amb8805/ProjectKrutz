package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.a.a;
import com.google.android.gms.games.multiplayer.e;

public abstract interface Room extends Parcelable, a<Room>, e
{
  public abstract String b();

  public abstract String c();

  public abstract long d();

  public abstract int e();

  public abstract String f();

  public abstract int g();

  public abstract Bundle h();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.realtime.Room
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

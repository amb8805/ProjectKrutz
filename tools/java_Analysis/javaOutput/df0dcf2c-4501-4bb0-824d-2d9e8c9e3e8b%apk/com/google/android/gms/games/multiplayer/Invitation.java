package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.a.a;
import com.google.android.gms.games.Game;

public abstract interface Invitation extends Parcelable, a<Invitation>, e
{
  public abstract Game b();

  public abstract String c();

  public abstract Participant d();

  public abstract long e();

  public abstract int f();

  public abstract int g();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.Invitation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

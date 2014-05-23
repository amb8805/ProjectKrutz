package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.a.a;
import com.google.android.gms.games.Player;

public abstract interface Participant extends Parcelable, a<Participant>
{
  public abstract int b();

  public abstract String c();

  public abstract int d();

  public abstract boolean e();

  public abstract String f();

  public abstract Uri g();

  public abstract Uri h();

  public abstract String i();

  public abstract Player j();
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.multiplayer.Participant
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

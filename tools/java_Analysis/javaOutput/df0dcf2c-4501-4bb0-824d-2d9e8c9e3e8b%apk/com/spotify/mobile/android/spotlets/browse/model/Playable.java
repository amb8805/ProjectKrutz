package com.spotify.mobile.android.spotlets.browse.model;

import android.annotation.SuppressLint;
import android.os.Parcelable;

@SuppressLint({"ParcelCreator"})
public abstract class Playable
  implements Parcelable
{
  private final String a;
  private boolean b;

  public Playable(String paramString)
  {
    this.a = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final String d()
  {
    return this.a;
  }

  public final boolean e()
  {
    return this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.browse.model.Playable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

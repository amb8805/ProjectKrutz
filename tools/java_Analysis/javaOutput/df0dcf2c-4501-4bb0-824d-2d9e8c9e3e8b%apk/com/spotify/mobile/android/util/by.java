package com.spotify.mobile.android.util;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.o;
import android.support.v4.content.c;
import android.support.v4.content.k;
import com.spotify.mobile.android.a.d;
import com.spotify.mobile.android.provider.n;

public final class by
  implements o<Cursor>, d
{
  private bz a;
  private Context b;
  private final String[] c = { "paused", "context_uri", "playing_track_uri" };
  private String d = "";
  private String e = "";
  private boolean f = false;

  public by(Context paramContext, bz parambz)
  {
    this.b = paramContext;
    this.a = parambz;
  }

  public final k<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new c(this.b, n.a, this.c, null, null, null);
  }

  public final String a()
  {
    return this.d;
  }

  public final void a(k<Cursor> paramk)
  {
  }

  public final String b()
  {
    return this.e;
  }

  public final boolean c()
  {
    return this.f;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.by
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

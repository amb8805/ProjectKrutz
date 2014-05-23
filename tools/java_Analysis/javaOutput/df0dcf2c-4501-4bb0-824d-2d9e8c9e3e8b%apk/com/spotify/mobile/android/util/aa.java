package com.spotify.mobile.android.util;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.o;
import android.support.v4.content.c;
import android.support.v4.content.k;
import com.spotify.mobile.android.provider.v;

public final class aa
  implements o<Cursor>
{
  private static final String[] d = { "connected" };
  private Boolean a = null;
  private Context b;
  private ab c;

  public aa(Context paramContext, ab paramab)
  {
    this.b = paramContext;
    this.c = paramab;
  }

  public final k<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new c(this.b, v.a, d, null, null, null);
  }

  public final void a(k<Cursor> paramk)
  {
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.aa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

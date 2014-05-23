package com.spotify.mobile.android.util.tracking;

import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.o;
import android.support.v4.content.k;
import com.spotify.mobile.android.util.ar;

final class d
  implements o<Cursor>
{
  public o<Cursor> a;
  public ar<Integer> b;

  d(o<Cursor> paramo)
  {
    this.a = paramo;
  }

  public final k<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return this.a.a(paramInt, paramBundle);
  }

  public final void a(k<Cursor> paramk)
  {
    this.a.a(paramk);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.tracking.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.util;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.support.v4.content.c;
import android.support.v4.content.k;

final class ee extends ed
  implements o<Cursor>
{
  private Activity a;
  private n b;

  private ee(Activity paramActivity, n paramn)
  {
    super((byte)0);
    this.a = paramActivity;
    this.b = paramn;
  }

  public final k<Cursor> a(int paramInt, Bundle paramBundle)
  {
    return new c((Context)cc.a(this.a), c(), ed.d(), null, null, null);
  }

  public final void a(k<Cursor> paramk)
  {
  }

  public final void a(String paramString, eg parameg)
  {
    super.a(paramString, parameg);
    if (this.a != null)
      this.b.a(2131362177, null, this);
  }

  public final void b()
  {
    super.b();
    this.b.a(2131362177);
    this.a = null;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ee
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.util;

import android.support.v4.app.m;
import android.view.View;
import com.spotify.mobile.android.ui.adapter.c;
import com.spotify.mobile.android.ui.adapter.q;

final class x
  implements c
{
  private final int a = 2;
  private final int b = 2;
  private final q c;
  private final m d;

  public x(q paramq, m paramm)
  {
    this.c = paramq;
    this.d = paramm;
  }

  public final void a(View paramView, long paramLong)
  {
    int i = this.c.e(this.a) + this.b;
    this.d.a(this.d.b(), paramView, i, paramLong);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

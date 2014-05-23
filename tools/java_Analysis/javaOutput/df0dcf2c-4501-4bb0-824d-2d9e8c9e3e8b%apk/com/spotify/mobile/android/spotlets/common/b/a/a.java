package com.spotify.mobile.android.spotlets.common.b.a;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.n;
import android.support.v4.app.o;
import com.google.common.base.i;
import com.google.common.collect.h;
import java.util.HashSet;
import java.util.Set;

public final class a
  implements c
{
  static final String[] a = { "logged_in", "product_type", "country_code", "current_user" };
  final Context b;
  final int c;
  private final o<Cursor> e = new a.1(this);
  private final n f;
  private final Set<e> g = new HashSet();
  private d h = d;

  public a(Context paramContext, n paramn)
  {
    this.b = ((Context)i.a(paramContext));
    this.f = ((n)i.a(paramn));
    this.c = 2131362164;
  }

  public final void a()
  {
    this.f.a(this.c);
    this.g.clear();
  }

  final void a(d paramd)
  {
    this.h = paramd;
    h.a(this.g, new a.2(this, paramd));
  }

  public final void a(e parame)
  {
    i.a(parame);
    this.f.a(this.c, null, this.e);
    if (!parame.a(this.h))
      this.g.add(parame);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.b.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

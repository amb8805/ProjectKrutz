package com.spotify.mobile.android.util;

import android.content.Context;
import com.spotify.mobile.android.provider.Metadata.OfflineSync;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class bt
{
  static final String[] a = { "is_syncing", "done_count", "total_count", "progress" };
  private Set<bu> b = new HashSet();
  private boolean c;
  private int d;
  private int e;
  private int f;
  private cr g = new cr(paramContext, this.h);
  private cs h = new bt.1(this);

  public bt(Context paramContext)
  {
  }

  public final void a()
  {
    this.g.a(Metadata.OfflineSync.a, a, null);
  }

  public final void a(bu parambu)
  {
    this.b.add(parambu);
  }

  public final void b()
  {
    this.g.b();
  }

  public final void b(bu parambu)
  {
    this.b.remove(parambu);
  }

  public final int c()
  {
    return this.d;
  }

  public final int d()
  {
    return this.e;
  }

  public final int e()
  {
    return this.f;
  }

  public final void f()
  {
    Iterator localIterator = this.b.iterator();
    while (localIterator.hasNext())
      ((bu)localIterator.next()).c();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.bt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

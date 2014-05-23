package com.spotify.mobile.android.spotlets.common.adapter;

import java.util.HashSet;
import java.util.Iterator;

public abstract class b<D>
  implements d<D>
{
  private final HashSet<a<D>> a = new HashSet();

  public b()
  {
  }

  public final void a()
  {
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((a)localIterator.next()).notifyDataSetChanged();
  }

  final void a(a<D> parama)
  {
    this.a.add(parama);
  }

  final void b(a<D> parama)
  {
    this.a.remove(parama);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.common.adapter.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.d;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class d
{
  private final Collection<g> a = new LinkedHashSet(8);
  private boolean b = false;
  private final String c;

  public d(String paramString)
  {
    this.c = paramString;
  }

  public void a()
  {
    if (this.b);
    while (true)
    {
      return;
      this.b = true;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
        ((g)localIterator.next()).a();
    }
  }

  public final void a(g paramg)
  {
    this.a.add(paramg);
  }

  public void b()
  {
    if (!this.b);
    while (true)
    {
      return;
      this.b = false;
      Iterator localIterator = this.a.iterator();
      while (localIterator.hasNext())
        ((g)localIterator.next()).b();
    }
  }

  public final boolean c()
  {
    return this.b;
  }

  public final boolean d()
  {
    return !this.b;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.d.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

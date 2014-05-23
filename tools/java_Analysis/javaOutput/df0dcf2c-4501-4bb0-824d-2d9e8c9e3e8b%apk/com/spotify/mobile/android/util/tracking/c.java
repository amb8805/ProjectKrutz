package com.spotify.mobile.android.util.tracking;

import android.database.Cursor;
import android.support.v4.app.o;
import com.spotify.mobile.android.util.ar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
{
  private List<d> a = new LinkedList();

  public c()
  {
  }

  public final o<Cursor> a(o<Cursor> paramo)
  {
    d locald = new d(paramo);
    this.a.add(locald);
    return locald;
  }

  public final ar<Integer> a(h paramh)
  {
    ar localar = new ar(this.a.size(), new c.1(this, paramh));
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
      ((d)localIterator.next()).b = localar;
    return localar;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.tracking.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

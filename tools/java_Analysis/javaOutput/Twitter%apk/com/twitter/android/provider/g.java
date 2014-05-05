package com.twitter.android.provider;

import ap;
import be;
import cr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p;

public final class g
  implements Serializable
{
  public final long a;
  public final long b;
  public final String c;
  public final byte[] d;
  public final ar e;
  public final long f;
  public final boolean g;

  private g(p paramp)
  {
    this.a = paramp.a;
    this.b = paramp.d;
    this.c = paramp.h;
    byte[] arrayOfByte;
    if (paramp.n == null)
    {
      arrayOfByte = null;
      this.d = arrayOfByte;
      this.e = new ar(paramp.m);
      this.f = paramp.g;
      if (((paramp.i == null) || (paramp.j == null)) && ((paramp.p == null) || (paramp.p.a != 1)))
        break label116;
    }
    label116: for (boolean bool = true; ; bool = false)
    {
      this.g = bool;
      return;
      arrayOfByte = paramp.n.a();
      break;
    }
  }

  public static byte[] a(List paramList)
  {
    ArrayList localArrayList = new ArrayList(paramList.size());
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      localArrayList.add(new g(((p)localIterator.next()).a()));
    return cr.a(localArrayList);
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.provider.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

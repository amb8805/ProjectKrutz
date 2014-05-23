package com.spotify.mobile.android.ui.activity.upsell;

import android.content.Context;
import com.spotify.mobile.android.util.bp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class i
  implements c, g, k
{
  private final Context a;
  private final List<o> b = new ArrayList();
  private f c;
  private j d;
  private ArrayList<b> e = new ArrayList();

  public i(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a()
  {
    this.c = new f(this.a);
    this.c.a(this);
    this.c.a();
  }

  public final void a(b paramb)
  {
    paramb.b();
    this.e.remove(paramb);
  }

  public final void a(o paramo, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.remove(paramo);
      if ("inapp".equals(paramo.a))
      {
        localb = new b(this.a, paramo);
        localb.a(this);
        localb.a();
        this.e.add(localb);
      }
    }
    while (this.b.size() <= 1)
    {
      b localb;
      return;
    }
    this.b.remove(paramo);
    this.b.add(paramo);
  }

  public final void a(ArrayList<o> paramArrayList)
  {
    if (paramArrayList.isEmpty())
      return;
    Iterator localIterator1 = paramArrayList.iterator();
    if (localIterator1.hasNext())
    {
      o localo = (o)localIterator1.next();
      Iterator localIterator2 = this.b.iterator();
      do
        if (!localIterator2.hasNext())
          break;
      while (!((o)localIterator2.next()).b.equals(localo.b));
      for (boolean bool = true; ; bool = false)
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = localo.b;
        arrayOfObject[1] = Boolean.valueOf(bool);
        bp.c("Got purchase to register (%s), already scheduled? %s", arrayOfObject);
        if (bool)
          break;
        this.b.add(localo);
        break;
      }
    }
    if (this.d == null)
    {
      this.d = new j(this.a, this);
      this.d.a();
      return;
    }
    this.d.b();
  }

  public final void b()
  {
    if (this.c != null)
    {
      this.c.b();
      this.c = null;
    }
    if (this.d != null)
    {
      this.d.c();
      this.d = null;
    }
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      ((b)localIterator.next()).b();
    this.e.clear();
  }

  public final o c()
  {
    if (this.b.isEmpty())
      return null;
    return (o)this.b.get(0);
  }

  public final void d()
  {
    if (this.d != null)
    {
      this.d.c();
      this.d = null;
    }
  }

  public final void e()
  {
    if (this.c == null)
      return;
    this.c.d();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.activity.upsell.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

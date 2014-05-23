package com.d.a;

import android.view.View;
import com.d.b.c;
import com.d.c.a.a;
import java.util.HashMap;
import java.util.Map;

public final class j extends o
{
  private static final Map<String, c> h;
  private Object i;
  private String j;
  private c k;

  static
  {
    HashMap localHashMap = new HashMap();
    h = localHashMap;
    localHashMap.put("alpha", k.a);
    h.put("pivotX", k.b);
    h.put("pivotY", k.c);
    h.put("translationX", k.d);
    h.put("translationY", k.e);
    h.put("rotation", k.f);
    h.put("rotationX", k.g);
    h.put("rotationY", k.h);
    h.put("scaleX", k.i);
    h.put("scaleY", k.j);
    h.put("scrollX", k.k);
    h.put("scrollY", k.l);
    h.put("x", k.m);
    h.put("y", k.n);
  }

  public j()
  {
  }

  private <T> j(T paramT, c<T, ?> paramc)
  {
    this.i = paramT;
    a(paramc);
  }

  public static <T> j a(T paramT, c<T, Float> paramc, float[] paramArrayOfFloat)
  {
    j localj = new j(paramT, paramc);
    localj.a(paramArrayOfFloat);
    return localj;
  }

  private void a(c paramc)
  {
    if (this.f != null)
    {
      l locall = this.f[0];
      String str = locall.a;
      locall.a(paramc);
      this.g.remove(str);
      this.g.put(this.j, locall);
    }
    if (this.k != null)
      this.j = paramc.a();
    this.k = paramc;
    this.e = false;
  }

  public final void a()
  {
    super.a();
  }

  final void a(float paramFloat)
  {
    super.a(paramFloat);
    int m = this.f.length;
    for (int n = 0; n < m; n++)
      this.f[n].b(this.i);
  }

  public final void a(float[] paramArrayOfFloat)
  {
    if ((this.f == null) || (this.f.length == 0))
    {
      if (this.k != null)
      {
        l[] arrayOfl2 = new l[1];
        arrayOfl2[0] = l.a(this.k, paramArrayOfFloat);
        a(arrayOfl2);
        return;
      }
      l[] arrayOfl1 = new l[1];
      arrayOfl1[0] = l.a(this.j, paramArrayOfFloat);
      a(arrayOfl1);
      return;
    }
    super.a(paramArrayOfFloat);
  }

  final void f()
  {
    if (!this.e)
    {
      if ((this.k == null) && (a.a) && ((this.i instanceof View)) && (h.containsKey(this.j)))
        a((c)h.get(this.j));
      int m = this.f.length;
      for (int n = 0; n < m; n++)
        this.f[n].a(this.i);
      super.f();
    }
  }

  public final String toString()
  {
    String str = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.i;
    if (this.f != null)
      for (int m = 0; m < this.f.length; m++)
        str = str + "\n    " + this.f[m].toString();
    return str;
  }
}

/* Location:
 * Qualified Name:     com.d.a.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

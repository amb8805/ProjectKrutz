package com.d.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class o extends a
{
  private static ThreadLocal<p> h = new ThreadLocal();
  private static final ThreadLocal<ArrayList<o>> i = new o.1();
  private static final ThreadLocal<ArrayList<o>> j = new o.2();
  private static final ThreadLocal<ArrayList<o>> k = new o.3();
  private static final ThreadLocal<ArrayList<o>> l = new o.4();
  private static final ThreadLocal<ArrayList<o>> m = new o.5();
  private static final Interpolator n = new AccelerateDecelerateInterpolator();
  private static final n o = new f();
  private static final n p = new d();
  private static long z = 10L;
  private int A = 0;
  private int B = 1;
  private Interpolator C = n;
  private ArrayList<q> D = null;
  long b;
  long c = -1L;
  int d = 0;
  boolean e = false;
  l[] f;
  HashMap<String, l> g;
  private boolean q = false;
  private int r = 0;
  private float s = 0.0F;
  private boolean t = false;
  private long u;
  private boolean v = false;
  private boolean w = false;
  private long x = 300L;
  private long y = 0L;

  public o()
  {
  }

  public static o b(float[] paramArrayOfFloat)
  {
    o localo = new o();
    localo.a(paramArrayOfFloat);
    return localo;
  }

  private void d(long paramLong)
  {
    f();
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    if (this.d != 1)
    {
      this.c = paramLong;
      this.d = 2;
    }
    this.b = (l1 - paramLong);
    c(l1);
  }

  private void r()
  {
    ((ArrayList)i.get()).remove(this);
    ((ArrayList)j.get()).remove(this);
    ((ArrayList)k.get()).remove(this);
    this.d = 0;
    if ((this.v) && (this.a != null))
    {
      ArrayList localArrayList = (ArrayList)this.a.clone();
      int i1 = localArrayList.size();
      for (int i2 = 0; i2 < i1; i2++)
        ((b)localArrayList.get(i2)).a();
    }
    this.v = false;
    this.w = false;
  }

  private void s()
  {
    f();
    ((ArrayList)i.get()).add(this);
    if ((this.y > 0L) && (this.a != null))
    {
      ArrayList localArrayList = (ArrayList)this.a.clone();
      int i1 = localArrayList.size();
      for (int i2 = 0; i2 < i1; i2++)
        localArrayList.get(i2);
    }
  }

  public void a()
  {
    if (Looper.myLooper() == null)
      throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    this.q = false;
    this.r = 0;
    this.d = 0;
    this.w = true;
    this.t = false;
    ((ArrayList)j.get()).add(this);
    if (this.y == 0L)
    {
      if ((!this.e) || (this.d == 0));
      for (long l1 = 0L; ; l1 = AnimationUtils.currentAnimationTimeMillis() - this.b)
      {
        d(l1);
        this.d = 0;
        this.v = true;
        if (this.a == null)
          break;
        ArrayList localArrayList = (ArrayList)this.a.clone();
        int i1 = localArrayList.size();
        for (int i2 = 0; i2 < i1; i2++)
          localArrayList.get(i2);
      }
    }
    p localp = (p)h.get();
    if (localp == null)
    {
      localp = new p((byte)0);
      h.set(localp);
    }
    localp.sendEmptyMessage(0);
  }

  void a(float paramFloat)
  {
    float f1 = this.C.getInterpolation(paramFloat);
    this.s = f1;
    int i1 = this.f.length;
    for (int i2 = 0; i2 < i1; i2++)
      this.f[i2].a(f1);
    if (this.D != null)
    {
      int i3 = this.D.size();
      for (int i4 = 0; i4 < i3; i4++)
        ((q)this.D.get(i4)).a(this);
    }
  }

  public final void a(int paramInt)
  {
    this.A = paramInt;
  }

  public final void a(q paramq)
  {
    if (this.D == null)
      this.D = new ArrayList();
    this.D.add(paramq);
  }

  public void a(float[] paramArrayOfFloat)
  {
    if ((paramArrayOfFloat == null) || (paramArrayOfFloat.length == 0))
      return;
    if ((this.f == null) || (this.f.length == 0))
    {
      l[] arrayOfl = new l[1];
      arrayOfl[0] = l.a("", paramArrayOfFloat);
      a(arrayOfl);
    }
    while (true)
    {
      this.e = false;
      return;
      this.f[0].a(paramArrayOfFloat);
    }
  }

  public final void a(l[] paramArrayOfl)
  {
    this.f = paramArrayOfl;
    this.g = new HashMap(1);
    for (int i1 = 0; i1 <= 0; i1++)
    {
      l locall = paramArrayOfl[0];
      this.g.put(locall.a, locall);
    }
    this.e = false;
  }

  public o b(long paramLong)
  {
    if (paramLong < 0L)
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    this.x = paramLong;
    return this;
  }

  public final void b()
  {
    if ((this.d != 0) || (((ArrayList)j.get()).contains(this)) || (((ArrayList)k.get()).contains(this)))
    {
      if ((this.v) && (this.a != null))
      {
        Iterator localIterator = ((ArrayList)this.a.clone()).iterator();
        while (localIterator.hasNext())
          ((b)localIterator.next()).b();
      }
      r();
    }
  }

  public final void c()
  {
    if ((!((ArrayList)i.get()).contains(this)) && (!((ArrayList)j.get()).contains(this)))
    {
      this.t = false;
      s();
      if ((this.A <= 0) || ((0x1 & this.A) != 1))
        break label82;
      a(0.0F);
    }
    while (true)
    {
      r();
      return;
      if (this.e)
        break;
      f();
      break;
      label82: a(1.0F);
    }
  }

  final boolean c(long paramLong)
  {
    int i1 = 1;
    boolean bool = false;
    if (this.d == 0)
    {
      this.d = i1;
      if (this.c >= 0L)
        break label58;
      this.b = paramLong;
    }
    while (true)
      switch (this.d)
      {
      default:
        return false;
        label58: this.b = (paramLong - this.c);
        this.c = -1L;
      case 1:
      case 2:
      }
    float f1;
    if (this.x > 0L)
      f1 = (float)(paramLong - this.b) / (float)this.x;
    float f2;
    while (true)
      if (f1 >= 1.0F)
        if ((this.r < this.A) || (this.A == -1))
        {
          if (this.a != null)
          {
            int i2 = this.a.size();
            int i3 = 0;
            while (true)
              if (i3 < i2)
              {
                this.a.get(i3);
                i3++;
                continue;
                f1 = 1.0F;
                break;
              }
          }
          if (this.B == 2)
          {
            if (this.q)
              i1 = 0;
            this.q = i1;
          }
          this.r += (int)f1;
          f2 = f1 % 1.0F;
          this.b += this.x;
        }
    while (true)
    {
      if (this.q)
        f2 = 1.0F - f2;
      a(f2);
      return bool;
      float f3 = Math.min(f1, 1.0F);
      bool = i1;
      f2 = f3;
      continue;
      f2 = f1;
      bool = false;
    }
  }

  void f()
  {
    if (!this.e)
    {
      int i1 = this.f.length;
      for (int i2 = 0; i2 < i1; i2++)
        this.f[i2].b();
      this.e = true;
    }
  }

  public o g()
  {
    int i1 = 0;
    o localo = (o)super.e();
    if (this.D != null)
    {
      ArrayList localArrayList = this.D;
      localo.D = new ArrayList();
      int i3 = localArrayList.size();
      for (int i4 = 0; i4 < i3; i4++)
        localo.D.add(localArrayList.get(i4));
    }
    localo.c = -1L;
    localo.q = false;
    localo.r = 0;
    localo.e = false;
    localo.d = 0;
    localo.t = false;
    l[] arrayOfl = this.f;
    if (arrayOfl != null)
    {
      int i2 = arrayOfl.length;
      localo.f = new l[i2];
      localo.g = new HashMap(i2);
      while (i1 < i2)
      {
        l locall = arrayOfl[i1].a();
        localo.f[i1] = locall;
        localo.g.put(locall.a, locall);
        i1++;
      }
    }
    return localo;
  }

  public final Object h()
  {
    if ((this.f != null) && (this.f.length > 0))
      return this.f[0].c();
    return null;
  }

  public final void i()
  {
    this.B = 1;
  }

  public final void j()
  {
    if (this.D == null)
      return;
    this.D.clear();
    this.D = null;
  }

  public final boolean k()
  {
    return (this.d == 1) || (this.v);
  }

  public String toString()
  {
    String str = "ValueAnimator@" + Integer.toHexString(hashCode());
    if (this.f != null)
      for (int i1 = 0; i1 < this.f.length; i1++)
        str = str + "\n    " + this.f[i1].toString();
    return str;
  }
}

/* Location:
 * Qualified Name:     com.d.a.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

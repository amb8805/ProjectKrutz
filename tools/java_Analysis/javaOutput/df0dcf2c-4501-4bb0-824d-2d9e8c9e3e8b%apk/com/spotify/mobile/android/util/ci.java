package com.spotify.mobile.android.util;

import android.os.Handler;

public final class ci
{
  private final String a;
  private final Handler b;
  private final Runnable c;
  private final ck d;
  private final ck e;
  private final ck f;
  private final int g;
  private final ck h;
  private boolean i;
  private int j;
  private boolean k;
  private boolean l;

  private ci(String paramString, Handler paramHandler, Runnable paramRunnable, ck paramck1, ck paramck2, ck paramck3, int paramInt, ck paramck4)
  {
    this.a = paramString;
    this.b = paramHandler;
    this.d = paramck1;
    this.e = paramck2;
    this.f = paramck3;
    this.g = paramInt;
    this.h = paramck4;
    this.c = new ci.1(this, paramRunnable);
  }

  private long a(ck paramck)
  {
    if (paramck == null)
      return -1L;
    return paramck.a(this.j);
  }

  private boolean a(long paramLong, String paramString)
  {
    this.k = false;
    if (!this.i)
    {
      Object[] arrayOfObject3 = new Object[2];
      arrayOfObject3[0] = this.a;
      arrayOfObject3[1] = paramString;
      bp.c("%s: Not scheduling due to %s since policy is stopped", arrayOfObject3);
      return false;
    }
    this.b.removeCallbacks(this.c);
    if (this.l)
    {
      paramString = "restart-" + paramString;
      this.l = false;
      paramLong = a(this.d);
    }
    if (paramLong < 0L)
    {
      Object[] arrayOfObject2 = new Object[3];
      arrayOfObject2[0] = this.a;
      arrayOfObject2[1] = paramString;
      arrayOfObject2[2] = Integer.valueOf(this.j);
      bp.c("%s: Not scheduling due to %s (failures: %d)", arrayOfObject2);
      return false;
    }
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = this.a;
    arrayOfObject1[1] = Long.valueOf(paramLong);
    arrayOfObject1[2] = paramString;
    arrayOfObject1[3] = Integer.valueOf(this.j);
    bp.c("%s: Schedule try after %d ms, due to %s (failures: %d)", arrayOfObject1);
    this.b.postDelayed(this.c, paramLong);
    return true;
  }

  private boolean a(ck paramck, String paramString)
  {
    return a(a(paramck), paramString);
  }

  public final void a()
  {
    bool = true;
    try
    {
      if (!this.i);
      while (true)
      {
        Assertion.a(bool, "Policy is already running");
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = this.a;
        bp.c("%s: Started", arrayOfObject);
        this.i = true;
        this.j = 0;
        this.k = false;
        this.l = false;
        a(this.d, "start");
        return;
        bool = false;
      }
    }
    finally
    {
    }
  }

  public final void a(long paramLong)
  {
    try
    {
      this.j = 0;
      a(paramLong, "success");
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
      try
      {
        e();
        while (true)
        {
          return;
          f();
        }
      }
      finally
      {
      }
  }

  public final void b()
  {
    while (true)
    {
      try
      {
        Assertion.a(this.i, "Policy is not running");
        if (this.l)
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = this.a;
          bp.c("%s: Already waiting for result to restart", arrayOfObject2);
          return;
        }
        if (this.k)
        {
          Object[] arrayOfObject1 = new Object[1];
          arrayOfObject1[0] = this.a;
          bp.c("%s: Postponing restart until a result", arrayOfObject1);
          this.l = true;
          continue;
        }
      }
      finally
      {
      }
      this.j = 0;
      a(this.d, "restart");
    }
  }

  public final boolean c()
  {
    return this.i;
  }

  public final void d()
  {
    try
    {
      Assertion.a(this.i, "Policy is not running");
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = this.a;
      bp.c("%s: Stopped", arrayOfObject);
      this.i = false;
      this.b.removeCallbacks(this.c);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void e()
  {
    try
    {
      a(a(this.e));
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void f()
  {
    try
    {
      this.j = (1 + this.j);
      if ((this.j > this.g) && (this.g > 0))
        this.j = 1;
      if ((this.j < this.g) || (this.g == 0))
        a(this.f, "failure");
      while (true)
      {
        return;
        a(this.h, "max-failures");
      }
    }
    finally
    {
    }
  }

  public final boolean g()
  {
    return (this.j >= this.g) && (this.g > 0);
  }

  public final long h()
  {
    return a(this.e);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ci
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.facebook.internal;

import com.facebook.aa;
import java.util.concurrent.Executor;

class ag
{
  private final Object b = new Object();
  private ai c;
  private final int d;
  private final Executor e;
  private ai f = null;
  private int g = 0;

  static
  {
    if (!ag.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  ag()
  {
    this(8);
  }

  ag(int paramInt)
  {
    this(paramInt, aa.b());
  }

  private ag(int paramInt, Executor paramExecutor)
  {
    this.d = paramInt;
    this.e = paramExecutor;
  }

  private void a(ai paramai)
  {
    localObject1 = this.b;
    if (paramai != null);
    try
    {
      this.f = paramai.a(this.f);
      this.g = (-1 + this.g);
      int i = this.g;
      int j = this.d;
      ai localai = null;
      if (i < j)
      {
        localai = this.c;
        if (localai != null)
        {
          this.c = localai.a(this.c);
          this.f = localai.a(this.f, false);
          this.g = (1 + this.g);
          localai.d();
        }
      }
      if (localai != null)
        this.e.execute(new ag.1(this, localai));
      return;
    }
    finally
    {
    }
  }

  final ah a(Runnable paramRunnable)
  {
    ai localai = new ai(this, paramRunnable);
    synchronized (this.b)
    {
      this.c = localai.a(this.c, true);
      a(null);
      return localai;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

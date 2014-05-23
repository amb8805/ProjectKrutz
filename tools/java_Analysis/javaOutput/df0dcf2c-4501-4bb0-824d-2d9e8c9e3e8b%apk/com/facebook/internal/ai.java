package com.facebook.internal;

final class ai
  implements ah
{
  private final Runnable c;
  private ai d;
  private ai e;
  private boolean f;

  static
  {
    if (!ag.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  ai(ag paramag, Runnable paramRunnable)
  {
    this.c = paramRunnable;
  }

  final ai a(ai paramai)
  {
    if ((!a) && (this.d == null))
      throw new AssertionError();
    if ((!a) && (this.e == null))
      throw new AssertionError();
    if (paramai == this)
      if (this.d != this)
        break label91;
    label91: for (paramai = null; ; paramai = this.d)
    {
      this.d.e = this.e;
      this.e.d = this.d;
      this.e = null;
      this.d = null;
      return paramai;
    }
  }

  final ai a(ai paramai, boolean paramBoolean)
  {
    if ((!a) && (this.d != null))
      throw new AssertionError();
    if ((!a) && (this.e != null))
      throw new AssertionError();
    if (paramai == null)
    {
      this.e = this;
      this.d = this;
    }
    for (ai localai2 = this; paramBoolean; localai2 = paramai)
    {
      return this;
      this.d = paramai;
      this.e = paramai.e;
      ai localai1 = this.d;
      this.e.d = this;
      localai1.e = this;
    }
    return localai2;
  }

  public final boolean a()
  {
    synchronized (ag.a(this.b))
    {
      if (!this.f)
      {
        ag.b(this.b, a(ag.b(this.b)));
        return true;
      }
      return false;
    }
  }

  public final void b()
  {
    synchronized (ag.a(this.b))
    {
      if (!this.f)
      {
        ag.b(this.b, a(ag.b(this.b)));
        ag.b(this.b, a(ag.b(this.b), true));
      }
      return;
    }
  }

  final Runnable c()
  {
    return this.c;
  }

  final void d()
  {
    this.f = true;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ai
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

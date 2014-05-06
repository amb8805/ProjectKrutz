package com.twitter.android.client;

import ac;
import ad;
import ao;
import cb;
import cr;

public final class j
{
  private e a = e.a;
  private final String b = cr.a(6);
  private boolean c;
  private String d;
  private ac e;
  private ad f;
  private ao g;
  private cb h;

  public j()
  {
  }

  public final void a()
  {
    this.a = e.a;
    this.c = false;
    this.d = null;
    this.e = null;
    this.f = null;
    this.h = null;
  }

  public final void a(ac paramac)
  {
    this.e = paramac;
  }

  public final void a(ad paramad)
  {
    this.f = paramad;
  }

  public final void a(ao paramao)
  {
    if (paramao != null)
      this.g = paramao;
  }

  public final void a(cb paramcb)
  {
    if (paramcb != null)
      this.h = paramcb;
  }

  public final void a(e parame)
  {
    this.a = parame;
  }

  public final void a(String paramString)
  {
    this.d = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  public final e b()
  {
    return this.a;
  }

  public final String c()
  {
    return this.b;
  }

  public final boolean d()
  {
    return this.a.equals(e.c);
  }

  public final String e()
  {
    return this.d;
  }

  public final ad f()
  {
    return this.f;
  }

  public final long g()
  {
    if (this.f == null)
      return 0L;
    return this.f.a;
  }

  public final ac h()
  {
    return this.e;
  }

  public final boolean i()
  {
    return this.c;
  }

  public final cb j()
  {
    return this.h;
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.client.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

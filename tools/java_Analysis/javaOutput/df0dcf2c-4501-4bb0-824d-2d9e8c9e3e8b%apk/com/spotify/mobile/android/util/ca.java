package com.spotify.mobile.android.util;

import java.util.concurrent.TimeUnit;

public final class ca
{
  private final be a;
  private final ci b;
  private cb c;
  private Boolean d;
  private String e;
  private final Runnable f = new ca.1(this);
  private final bh g = new ca.2(this);

  public ca(cb paramcb)
  {
    this.c = paramcb;
    cc.a(paramcb);
    this.a = m.a("https://market.spotify.com/status");
    this.b = new cj("pli-checker", this.f).a(new cn(0L, TimeUnit.MILLISECONDS)).c(new co(5L, 10L, TimeUnit.SECONDS)).a(3).a();
    this.b.a();
  }

  public final void a()
  {
    this.c = null;
    this.b.d();
  }

  public final boolean b()
  {
    return (this.d != null) && (this.d.booleanValue());
  }

  public final String c()
  {
    return this.e;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.ca
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

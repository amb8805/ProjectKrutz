package com.spotify.mobile.android.d;

public final class c extends d
{
  private h a;

  public c(h paramh)
  {
    super("PlaybackNotification");
    this.a = paramh;
    c.1 local1 = new c.1(this, paramh);
    paramh.c().a(local1);
  }

  public final void a()
  {
    if (this.a.i().c())
      this.a.i().b();
    super.a();
  }

  public final void b()
  {
    super.b();
    if (this.a.b().c())
      this.a.i().a();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.d.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

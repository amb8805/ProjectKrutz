package com.spotify.mobile.android.util;

import android.os.Handler;
import com.spotify.mobile.android.c.c;

public class cj
{
  private final Runnable a;
  private final String b;
  private Handler c;
  private ck d;
  private ck e;
  private ck f;
  private int g = 0;
  private ck h;

  static
  {
    c.a(cj.class, cm.class, new cm());
  }

  public cj(String paramString, Runnable paramRunnable)
  {
    this.b = paramString;
    this.a = paramRunnable;
  }

  public final ci a()
  {
    c.a(cj.class, cm.class);
    String str = this.b;
    if (this.c != null);
    for (Handler localHandler = this.c; ; localHandler = new Handler())
      return cm.a(str, localHandler, this.a, this.d, this.e, this.f, this.g, this.h);
  }

  public final cj a(int paramInt)
  {
    this.g = paramInt;
    return this;
  }

  public final cj a(ck paramck)
  {
    this.d = paramck;
    return this;
  }

  public final cj b(ck paramck)
  {
    this.e = paramck;
    return this;
  }

  public final cj c(ck paramck)
  {
    this.f = paramck;
    return this;
  }

  public final cj d(ck paramck)
  {
    this.h = paramck;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.cj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

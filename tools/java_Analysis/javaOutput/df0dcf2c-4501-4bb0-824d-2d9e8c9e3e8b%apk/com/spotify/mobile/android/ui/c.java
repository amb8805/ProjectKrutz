package com.spotify.mobile.android.ui;

import android.support.v4.app.Fragment;
import java.util.Map;

final class c
{
  private final Class<? extends Fragment> a;
  private boolean b;
  private boolean c;

  private c(Class<? extends Fragment> paramClass)
  {
    this.a = paramClass;
  }

  public static c a(Class<? extends Fragment> paramClass)
  {
    return new c(paramClass);
  }

  public final c a()
  {
    this.c = true;
    return this;
  }

  public final void b()
  {
    a.a().put(this.a, new b(this.b, this.c, (byte)0));
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

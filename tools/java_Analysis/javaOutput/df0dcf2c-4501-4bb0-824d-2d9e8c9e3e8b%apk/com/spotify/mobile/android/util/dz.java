package com.spotify.mobile.android.util;

import android.content.Context;
import java.util.HashMap;

public final class dz
{
  private ea a = null;
  private be b;
  private HashMap<String, String> c;
  private boolean d;
  private boolean e;
  private boolean f;

  public dz(Context paramContext)
  {
    this(paramContext, (byte)0);
  }

  private dz(Context paramContext, byte paramByte)
  {
    this.b = m.a(paramContext.getString(2131690408));
    this.c = new HashMap();
    this.c.put("validate", "1");
  }

  public final void a()
  {
    this.d = true;
    this.b.b("", this.c, new dz.1(this));
  }

  public final void a(ea paramea)
  {
    this.a = paramea;
  }

  public final boolean b()
  {
    return this.f;
  }

  public final boolean c()
  {
    return this.d;
  }

  public final boolean d()
  {
    return this.e;
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.dz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

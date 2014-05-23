package com.spotify.mobile.android.ui.fragments.logic;

import android.os.Bundle;
import com.google.common.base.i;
import com.spotify.mobile.android.c.c;
import com.spotify.mobile.android.util.cc;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.HashSet;

public class Flag<T extends Serializable, S extends v>
{
  private static AbstractCollection<String> e = new HashSet();
  protected final String a;
  protected final boolean b;
  protected T c;
  protected T d;
  private final S f;
  private final Class<T> g;

  public Flag(Class<T> paramClass, String paramString, S paramS, boolean paramBoolean)
  {
    if (e.contains(paramString))
      throw new AssertionError("There can be only one feature flag instance with identifier " + paramString);
    e.add(paramString);
    cc.a(paramClass);
    this.g = paramClass;
    this.f = paramS;
    this.a = paramString;
    this.b = paramBoolean;
  }

  private String a()
  {
    return this.a + "-override";
  }

  public final void a(Bundle paramBundle)
  {
    paramBundle.putSerializable(this.a, this.c);
    paramBundle.putSerializable(a(), this.d);
  }

  final void a(T paramT)
  {
    cc.a(paramT);
    this.c = paramT;
  }

  public final Class<T> b()
  {
    return this.g;
  }

  public final void b(Bundle paramBundle)
  {
    this.c = paramBundle.getSerializable(this.a);
    this.d = paramBundle.getSerializable(a());
  }

  public final void b(T paramT)
  {
    i.b(this.b, "Flag " + this.a + " can't be overridden");
    this.d = paramT;
  }

  public final S c()
  {
    return this.f;
  }

  public final String d()
  {
    return this.a;
  }

  public final T e()
  {
    h localh = (h)c.b(h.class);
    if ((localh != null) && (localh.b(this)))
      return localh.a(this);
    if ((this.c != null) || (this.d != null));
    for (int i = 1; i == 0; i = 0)
      throw new Flag.FlagUndefinedException("Using flag \"" + this.a + "\" before it has been set");
    if (this.d != null)
      return this.d;
    return this.c;
  }

  public final void f()
  {
    i.b(this.b, "Flag " + this.a + " can't be overridden");
    this.d = null;
  }

  public final boolean g()
  {
    return this.d != null;
  }

  public final String h()
  {
    String str;
    if (this.c != null)
    {
      str = this.c.toString();
      h localh = (h)c.b(h.class);
      if ((localh == null) || (!localh.b(this)))
        break label77;
      str = localh.a(this) + " (forcibly overridden, provided: " + str + ")";
    }
    label77: 
    while (!g())
    {
      return str;
      str = "undefined";
      break;
    }
    return this.d + " (overridden, provided: " + str + ")";
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.fragments.logic.Flag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

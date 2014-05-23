package com.spotify.mobile.android.util;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.spotify.mobile.android.e.a;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class PlaybackListener
{
  private final cr a;
  private final cs b = new PlaybackListener.1(this);
  private final cr c;
  private final cs d = new PlaybackListener.2(this);
  private final Collection<bx> e = new LinkedHashSet(8);
  private boolean f;
  private String g;
  private String h;
  private String i;
  private String j;
  private Uri k;
  private Uri l;
  private int m;
  private boolean n;
  private a<Boolean> o;
  private a<Boolean> p;
  private a<Boolean> q;
  private a<Boolean> r;
  private a<Integer> s;
  private a<Boolean> t;
  private a<Boolean> u;

  public PlaybackListener(Context paramContext)
  {
    r();
    this.a = new cr(paramContext, this.b);
    this.c = new cr(paramContext, this.d);
  }

  private void a(EnumSet<PlaybackListener.Change> paramEnumSet)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
      ((bx)localIterator.next()).a(this, paramEnumSet);
  }

  private void r()
  {
    this.g = null;
    this.h = null;
    this.i = null;
    this.j = null;
    this.k = null;
    this.l = null;
    this.m = 0;
    this.n = false;
    this.s = a.a();
    this.t = a.a();
    this.p = a.a();
    this.q = a.a();
    this.r = a.a();
    this.u = a.a();
    this.o = a.a();
    this.f = true;
  }

  public final void a()
  {
    this.a.a(cg.a, cg.b, "limit=1");
    this.c.a(ch.a, ch.b, null);
  }

  public final void a(bx parambx)
  {
    this.e.add(parambx);
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, Uri paramUri1, Uri paramUri2, int paramInt, boolean paramBoolean)
  {
    this.f = false;
    String str = this.g;
    this.g = paramString1;
    this.h = paramString2;
    this.i = paramString3;
    this.j = paramString4;
    this.k = paramUri1;
    this.l = paramUri2;
    this.m = paramInt;
    this.n = paramBoolean;
    EnumSet localEnumSet = EnumSet.of(PlaybackListener.Change.a);
    if (!TextUtils.equals(str, paramString1))
      localEnumSet.add(PlaybackListener.Change.c);
    a(localEnumSet);
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, int paramInt, boolean paramBoolean5, boolean paramBoolean6)
  {
    this.f = false;
    a locala1 = this.o;
    a locala2 = this.p;
    a locala3 = this.q;
    a locala4 = this.r;
    a locala5 = this.s;
    a locala6 = this.t;
    a locala7 = this.u;
    this.o = a.a(Boolean.valueOf(paramBoolean1));
    this.p = a.a(Boolean.valueOf(paramBoolean2));
    this.q = a.a(Boolean.valueOf(paramBoolean3));
    this.r = a.a(Boolean.valueOf(paramBoolean4));
    this.s = a.a(Integer.valueOf(paramInt));
    this.t = a.a(Boolean.valueOf(paramBoolean5));
    this.u = a.a(Boolean.valueOf(paramBoolean6));
    EnumSet localEnumSet = EnumSet.noneOf(PlaybackListener.Change.class);
    if (!locala1.equals(this.o))
      localEnumSet.add(PlaybackListener.Change.b);
    if (!locala2.equals(this.p))
      localEnumSet.add(PlaybackListener.Change.c);
    if (!locala3.equals(this.q))
      localEnumSet.add(PlaybackListener.Change.c);
    if (!locala4.equals(this.r))
      localEnumSet.add(PlaybackListener.Change.c);
    if (!locala5.equals(this.s))
      localEnumSet.add(PlaybackListener.Change.b);
    if (!locala6.equals(this.t))
      localEnumSet.add(PlaybackListener.Change.d);
    if (!locala7.equals(this.u))
      localEnumSet.add(PlaybackListener.Change.c);
    if (!localEnumSet.isEmpty())
      a(localEnumSet);
  }

  public final void b()
  {
    this.a.b();
    this.c.b();
  }

  public final void b(bx parambx)
  {
    this.e.remove(parambx);
  }

  public final void c()
  {
    if (this.f)
      return;
    r();
    a(EnumSet.allOf(PlaybackListener.Change.class));
  }

  public final String d()
  {
    return this.g;
  }

  public final String e()
  {
    return this.h;
  }

  public final String f()
  {
    return this.i;
  }

  public final String g()
  {
    return this.j;
  }

  public final Uri h()
  {
    return this.k;
  }

  public final Uri i()
  {
    return this.l;
  }

  public final int j()
  {
    return this.m;
  }

  public final int k()
  {
    return ((Integer)this.s.c(Integer.valueOf(0))).intValue();
  }

  public final boolean l()
  {
    return ((Boolean)this.o.c(Boolean.valueOf(true))).booleanValue();
  }

  public final boolean m()
  {
    return ((Boolean)this.p.c(Boolean.valueOf(false))).booleanValue();
  }

  public final boolean n()
  {
    return ((Boolean)this.q.c(Boolean.valueOf(false))).booleanValue();
  }

  public final boolean o()
  {
    return ((Boolean)this.r.c(Boolean.valueOf(false))).booleanValue();
  }

  public final boolean p()
  {
    return ((Boolean)this.u.c(Boolean.valueOf(false))).booleanValue();
  }

  public final boolean q()
  {
    return ((Boolean)this.t.c(Boolean.valueOf(true))).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.util.PlaybackListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

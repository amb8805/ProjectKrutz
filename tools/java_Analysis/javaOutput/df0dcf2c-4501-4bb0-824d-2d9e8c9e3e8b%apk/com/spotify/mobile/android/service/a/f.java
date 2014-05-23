package com.spotify.mobile.android.service.a;

import com.spotify.mobile.android.e.a;
import com.spotify.mobile.android.util.cc;

public final class f
{
  public final String a;
  public final String b;
  public final a<String> c;
  public final a<String> d;
  public final boolean e;
  private a<d> f = a.a();
  private a<g> g = a.a();
  private a<e> h = a.a();

  public f(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean)
  {
    this.a = ((String)cc.a(paramString1));
    this.b = ((String)cc.a(paramString2));
    this.c = a.b(paramString3);
    this.d = a.b(paramString4);
    this.e = paramBoolean;
  }

  public final d a()
  {
    if (!this.f.c())
      this.f = a.a(new d(this));
    return (d)this.f.b();
  }

  public final g b()
  {
    if (!this.g.c())
      this.g = a.a(new g(this));
    return (g)this.g.b();
  }

  public final e c()
  {
    if (!this.h.c())
      this.h = a.a(new e(this));
    return (e)this.h.b();
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    f localf;
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass()))
        return false;
      localf = (f)paramObject;
      if (!this.c.equals(localf.c))
        return false;
      if (!this.d.equals(localf.d))
        return false;
      if (!this.b.equals(localf.b))
        return false;
      if (!this.a.equals(localf.a))
        return false;
    }
    while (this.e == localf.e);
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (31 * (31 * this.a.hashCode() + this.b.hashCode()) + this.c.hashCode()) + this.d.hashCode());
    if (this.e);
    for (int j = 1; ; j = 0)
      return j + i;
  }

  public final String toString()
  {
    return "TrackInfo{name='" + this.b + '\'' + ", album=" + this.c + ", artist=" + this.d + ", isInCollection=" + this.e + '}';
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.service.a.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.google.common.base;

public final class f
{
  private final String a;
  private g b = new g((byte)0);
  private g c = this.b;
  private boolean d = false;

  private f(String paramString)
  {
    this.a = ((String)i.a(paramString));
  }

  private g a()
  {
    g localg = new g((byte)0);
    this.c.c = localg;
    this.c = localg;
    return localg;
  }

  private f b(String paramString, Object paramObject)
  {
    g localg = a();
    localg.b = paramObject;
    localg.a = ((String)i.a(paramString));
    return this;
  }

  public final f a(Object paramObject)
  {
    a().b = paramObject;
    return this;
  }

  public final f a(String paramString, int paramInt)
  {
    return b(paramString, String.valueOf(paramInt));
  }

  public final f a(String paramString, Object paramObject)
  {
    return b(paramString, paramObject);
  }

  public final String toString()
  {
    boolean bool = this.d;
    StringBuilder localStringBuilder = new StringBuilder(32).append(this.a).append((char)'{');
    g localg1 = this.b.c;
    String str = "";
    for (g localg2 = localg1; localg2 != null; localg2 = localg2.c)
      if ((!bool) || (localg2.b != null))
      {
        localStringBuilder.append(str);
        str = ", ";
        if (localg2.a != null)
          localStringBuilder.append(localg2.a).append((char)'=');
        localStringBuilder.append(localg2.b);
      }
    return '}';
  }
}

/* Location:
 * Qualified Name:     com.google.common.base.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

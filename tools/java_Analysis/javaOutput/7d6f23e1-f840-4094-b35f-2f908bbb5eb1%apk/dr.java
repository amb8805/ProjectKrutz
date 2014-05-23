public final class dr extends cf
{
  private dr c;
  private int d;
  private int e;
  private String f;
  private dr g = null;

  public dr(dr paramdr, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.c = paramdr;
    this.d = paramInt2;
    this.e = paramInt3;
    this.b = -1;
  }

  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = -1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = null;
  }

  public final bd a(Object paramObject)
  {
    return new bd(paramObject, -1L, this.d, this.e);
  }

  public final dr a(int paramInt1, int paramInt2)
  {
    dr localdr1 = this.g;
    if (localdr1 == null)
    {
      dr localdr2 = new dr(this, 1, paramInt1, paramInt2);
      this.g = localdr2;
      return localdr2;
    }
    localdr1.a(1, paramInt1, paramInt2);
    return localdr1;
  }

  public final void a(String paramString)
  {
    this.f = paramString;
  }

  public final dr b(int paramInt1, int paramInt2)
  {
    dr localdr1 = this.g;
    if (localdr1 == null)
    {
      dr localdr2 = new dr(this, 2, paramInt1, paramInt2);
      this.g = localdr2;
      return localdr2;
    }
    localdr1.a(2, paramInt1, paramInt2);
    return localdr1;
  }

  public final String f()
  {
    return this.f;
  }

  public final dr g()
  {
    return this.c;
  }

  public final boolean h()
  {
    int i = 1 + this.b;
    this.b = i;
    return (this.a != 0) && (i > 0);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    switch (this.a)
    {
    default:
    case 0:
    case 1:
      while (true)
      {
        return localStringBuilder.toString();
        localStringBuilder.append("/");
        continue;
        localStringBuilder.append((char)'[');
        localStringBuilder.append(e());
        localStringBuilder.append((char)']');
      }
    case 2:
    }
    localStringBuilder.append((char)'{');
    if (this.f != null)
    {
      localStringBuilder.append((char)'"');
      e.a(localStringBuilder, this.f);
      localStringBuilder.append((char)'"');
    }
    while (true)
    {
      localStringBuilder.append((char)']');
      break;
      localStringBuilder.append((char)'?');
    }
  }
}

/* Location:
 * Qualified Name:     dr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

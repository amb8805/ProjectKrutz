public final class cv
{
  private final long a;
  private final String b;
  private final String c;
  private final String d;
  private final int e;
  private final int f;
  private final int g;
  private final ad h;
  private final int i;
  private volatile int j;

  public cv(long paramLong, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, int paramInt3, ad paramad, int paramInt4)
  {
    this.a = paramLong;
    this.b = paramString1;
    this.c = paramString2;
    this.d = paramString3;
    this.e = paramInt1;
    this.f = paramInt2;
    this.g = paramInt3;
    this.h = paramad;
    this.i = paramInt4;
  }

  public final long a()
  {
    return this.a;
  }

  public final String b()
  {
    return this.b;
  }

  public final String c()
  {
    return this.c;
  }

  public final String d()
  {
    return this.d;
  }

  public final int e()
  {
    return this.e;
  }

  public final int f()
  {
    return this.f;
  }

  public final int g()
  {
    return this.g;
  }

  public final ad h()
  {
    return this.h;
  }

  public final int hashCode()
  {
    if (this.j != 0)
      return this.j;
    int k = 31 * (527 + (int)(this.a ^ this.a >>> 32));
    int m;
    int i1;
    label71: int i2;
    if (this.b != null)
    {
      m = this.b.hashCode();
      int n = 31 * (k + m);
      if (this.c == null)
        break label155;
      i1 = this.c.hashCode();
      i2 = 31 * (n + i1);
      if (this.d == null)
        break label161;
    }
    label155: label161: for (int i3 = this.d.hashCode(); ; i3 = 0)
    {
      this.j = (31 * (31 * (31 * (31 * (31 * (i2 + i3) + this.i) + this.e) + this.f) + this.e) + this.g);
      return this.j;
      m = 0;
      break;
      i1 = 0;
      break label71;
    }
  }

  public final int i()
  {
    return this.i;
  }
}

/* Location:
 * Qualified Name:     cv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

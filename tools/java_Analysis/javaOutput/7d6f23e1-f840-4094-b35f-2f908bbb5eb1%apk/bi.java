public abstract class bi extends u
{
  private boolean a;
  protected final q b;
  protected int c = 0;
  protected int d = 0;
  protected long e = 0L;
  protected int f = 1;
  protected int g = 0;
  protected long h = 0L;
  protected int i = 1;
  protected int j = 0;
  protected dr k;
  protected cp l;
  protected final ci m;
  protected boolean n = false;
  protected byte[] o;
  private char[] r = null;
  private a s = null;

  protected bi(q paramq, int paramInt)
  {
    this.p = paramInt;
    this.b = paramq;
    this.m = paramq.d();
    this.k = new dr(null, 0, this.i, this.j);
  }

  protected final void a(int paramInt, char paramChar)
  {
    String str = "" + this.k.a(this.b.a());
    c("Unexpected close marker '" + (char)paramInt + "': expected '" + paramChar + "' (for " + this.k.d() + " starting at " + str + ")");
  }

  protected abstract boolean a();

  protected abstract void b();

  protected void c()
  {
    this.m.a();
    char[] arrayOfChar = this.r;
    if (arrayOfChar != null)
    {
      this.r = null;
      this.b.c(arrayOfChar);
    }
  }

  public void close()
  {
    if (!this.a)
    {
      this.a = true;
      try
      {
        b();
        return;
      }
      finally
      {
        c();
      }
    }
  }

  protected final void i()
  {
    if (!this.k.b())
      b(": expected close marker for " + this.k.d() + " (from " + this.k.a(this.b.a()) + ")");
  }

  public final String m()
  {
    if ((this.q == cp.a) || (this.q == cp.c))
      return this.k.g().f();
    return this.k.f();
  }

  public final bd n()
  {
    int i1 = 1 + (this.c - this.g);
    return new bd(this.b.a(), this.e + this.c - 1L, this.f, i1);
  }

  protected final void o()
  {
    if (!a())
      k();
  }
}

/* Location:
 * Qualified Name:     bi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

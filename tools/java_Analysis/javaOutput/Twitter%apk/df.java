public abstract class df extends aw
{
  protected boolean b;
  protected cu c;
  private am d;
  private int e;
  private boolean f;

  protected df(int paramInt, am paramam)
  {
    this.e = paramInt;
    this.c = cu.f();
    this.d = paramam;
    this.b = a(cc.d);
  }

  protected static void d(String paramString)
  {
    throw new c(paramString);
  }

  public void a()
  {
    c("start an array");
    this.c = this.c.g();
  }

  public final boolean a(cc paramcc)
  {
    return (this.e & paramcc.b()) != 0;
  }

  public void b()
  {
    if (!this.c.a())
      d("Current context not an ARRAY but " + this.c.d());
    this.c = this.c.i();
  }

  public void c()
  {
    c("start an object");
    this.c = this.c.h();
  }

  protected abstract void c(String paramString);

  public void close()
  {
    this.f = true;
  }

  public void d()
  {
    if (!this.c.c())
      d("Current context not an object but " + this.c.d());
    this.c = this.c.i();
  }

  public final cu f()
  {
    return this.c;
  }
}

/* Location:
 * Qualified Name:     df
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

import java.io.Closeable;

public abstract class bq
  implements Closeable
{
  protected int p;
  protected cp q;

  protected bq()
  {
  }

  public final boolean a(au paramau)
  {
    return (this.p & paramau.b()) != 0;
  }

  public abstract int d();

  protected final aa d(String paramString)
  {
    return new aa(paramString, n());
  }

  public abstract long e();

  public abstract double f();

  public abstract cp g();

  public abstract bq h();

  public abstract String j();

  public abstract String m();

  public abstract bd n();

  public final cp p()
  {
    return this.q;
  }

  public final boolean q()
  {
    if (this.q == cp.j)
      return true;
    if (this.q == cp.k)
      return false;
    throw new aa("Current token (" + this.q + ") not of boolean type", n());
  }
}

/* Location:
 * Qualified Name:     bq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

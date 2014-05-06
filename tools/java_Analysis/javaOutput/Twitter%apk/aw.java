import java.io.Closeable;

public abstract class aw
  implements Closeable
{
  protected bz a;

  protected aw()
  {
  }

  public abstract void a();

  public abstract void a(int paramInt);

  public abstract void a(long paramLong);

  public abstract void a(String paramString);

  public final void a(String paramString, int paramInt)
  {
    a(paramString);
    a(paramInt);
  }

  public final void a(String paramString, long paramLong)
  {
    a(paramString);
    a(paramLong);
  }

  public void a(String paramString1, String paramString2)
  {
    a(paramString1);
    b(paramString2);
  }

  public final void a(String paramString, boolean paramBoolean)
  {
    a(paramString);
    a(paramBoolean);
  }

  public abstract void a(boolean paramBoolean);

  public abstract void b();

  public abstract void b(String paramString);

  public abstract void c();

  public abstract void d();

  public abstract void e();
}

/* Location:
 * Qualified Name:     aw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

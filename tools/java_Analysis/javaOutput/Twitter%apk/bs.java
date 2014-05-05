import java.util.HashMap;

final class bs
  implements Runnable
{
  private final long a;

  bs(bb parambb, long paramLong)
  {
    this.a = paramLong;
  }

  public final void run()
  {
    synchronized (this.b.c)
    {
      if (this.b.b.size() == 0)
        return;
      new bn(this.b, this.a).execute(new Void[0]);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     bs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

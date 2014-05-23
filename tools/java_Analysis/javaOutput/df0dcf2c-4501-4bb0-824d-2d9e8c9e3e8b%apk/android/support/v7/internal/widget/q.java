package android.support.v7.internal.widget;

final class q
  implements Runnable
{
  private q(l paraml)
  {
  }

  public final void run()
  {
    if (this.a.u)
    {
      if (this.a.c() != null)
        this.a.post(this);
      return;
    }
    l.b(this.a);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package it.sephiroth.android.library.widget;

final class v
  implements Runnable
{
  private int b;
  private int c;

  private v(HListView paramHListView)
  {
  }

  public final v a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    return this;
  }

  public final void run()
  {
    this.a.b(this.b, this.c);
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

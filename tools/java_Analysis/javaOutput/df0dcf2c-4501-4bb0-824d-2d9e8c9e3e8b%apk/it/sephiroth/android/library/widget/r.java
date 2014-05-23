package it.sephiroth.android.library.widget;

final class r
  implements Runnable
{
  private r(AdapterView paramAdapterView)
  {
  }

  public final void run()
  {
    if (this.a.ai)
    {
      if (this.a.q() != null)
        this.a.post(this);
      return;
    }
    AdapterView.b(this.a);
    AdapterView.c(this.a);
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

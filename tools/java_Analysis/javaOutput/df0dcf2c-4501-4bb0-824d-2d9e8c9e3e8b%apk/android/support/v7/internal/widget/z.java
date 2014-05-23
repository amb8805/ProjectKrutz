package android.support.v7.internal.widget;

final class z
  implements Runnable
{
  private int b;
  private int c;
  private boolean d;

  z(ProgressBarICS paramProgressBarICS, int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = false;
  }

  public final void a(int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = false;
  }

  public final void run()
  {
    ProgressBarICS localProgressBarICS = this.a;
    int i = this.b;
    int j = this.c;
    ProgressBarICS.a(localProgressBarICS, i, j);
    ProgressBarICS.a(this.a, this);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

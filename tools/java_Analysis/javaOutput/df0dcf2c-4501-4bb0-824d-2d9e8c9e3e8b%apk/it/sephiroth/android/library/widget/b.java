package it.sephiroth.android.library.widget;

import android.view.View;

final class b extends l
  implements Runnable
{
  private b(AbsHListView paramAbsHListView)
  {
    super(paramAbsHListView, (byte)0);
  }

  public final void run()
  {
    View localView;
    if ((this.a.isPressed()) && (this.a.al >= 0))
    {
      int i = this.a.al - this.a.V;
      localView = this.a.getChildAt(i);
      if (this.a.ai)
        break label103;
      if (!b())
        break label121;
    }
    label103: label121: for (boolean bool = this.a.b(localView, this.a.al, this.a.am); ; bool = false)
    {
      if (bool)
      {
        this.a.setPressed(false);
        localView.setPressed(false);
      }
      do
      {
        return;
        this.a.setPressed(false);
      }
      while (localView == null);
      localView.setPressed(false);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     it.sephiroth.android.library.widget.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

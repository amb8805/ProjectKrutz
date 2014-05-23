package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SpinnerAdapter;

final class ae extends ListPopupWindow
  implements af
{
  private CharSequence c;
  private ListAdapter d;

  public ae(ab paramab, Context paramContext, int paramInt)
  {
    super(paramContext, null, paramInt);
    a(paramab);
    b();
    a();
    a(new o(paramab, new ae.1(this, paramab)));
  }

  public final void a(ListAdapter paramListAdapter)
  {
    super.a(paramListAdapter);
    this.d = paramListAdapter;
  }

  public final void a(CharSequence paramCharSequence)
  {
    this.c = paramCharSequence;
  }

  public final void e()
  {
    int i = this.b.getPaddingLeft();
    if (this.b.E == -2)
    {
      int n = this.b.getWidth();
      int i1 = this.b.getPaddingRight();
      c(Math.max(this.b.a((SpinnerAdapter)this.d, c()), n - i - i1));
    }
    while (true)
    {
      Drawable localDrawable = c();
      int j = 0;
      if (localDrawable != null)
      {
        localDrawable.getPadding(ab.a(this.b));
        j = -ab.a(this.b).left;
      }
      a(j + i);
      g();
      super.e();
      k().setChoiceMode(1);
      d(this.b.v);
      return;
      if (this.b.E == -1)
      {
        int k = this.b.getWidth();
        int m = this.b.getPaddingRight();
        c(k - i - m);
      }
      else
      {
        c(this.b.E);
      }
    }
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

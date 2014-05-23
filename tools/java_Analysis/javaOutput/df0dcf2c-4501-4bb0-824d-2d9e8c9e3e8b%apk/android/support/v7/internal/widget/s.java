package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.a.c;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

final class s extends ListView
{
  private boolean a;
  private boolean b;

  public s(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, c.h);
    this.b = paramBoolean;
    setCacheColorHint(0);
  }

  final int a(int paramInt1, int paramInt2)
  {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 = i + j;
      return paramInt2;
    }
    int m = j + i;
    label67: int i1;
    View localView1;
    label85: View localView2;
    label117: int i5;
    if ((k > 0) && (localDrawable != null))
    {
      int n = localListAdapter.getCount();
      i1 = 0;
      int i2 = 0;
      localView1 = null;
      if (i1 >= n)
        break label213;
      int i3 = localListAdapter.getItemViewType(i1);
      if (i3 == i2)
        break label216;
      i2 = i3;
      localView2 = null;
      localView1 = localListAdapter.getView(i1, localView2, this);
      int i4 = localView1.getLayoutParams().height;
      if (i4 <= 0)
        break label203;
      i5 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
      label155: localView1.measure(paramInt1, i5);
      if (i1 <= 0)
        break label223;
    }
    label203: label213: label216: label223: for (int i6 = m + k; ; i6 = m)
    {
      m = i6 + localView1.getMeasuredHeight();
      if (m >= paramInt2)
        break;
      i1++;
      break label85;
      k = 0;
      break label67;
      i5 = View.MeasureSpec.makeMeasureSpec(0, 0);
      break label155;
      return m;
      localView2 = localView1;
      break label117;
    }
  }

  public final boolean hasFocus()
  {
    return (this.b) || (super.hasFocus());
  }

  public final boolean hasWindowFocus()
  {
    return (this.b) || (super.hasWindowFocus());
  }

  public final boolean isFocused()
  {
    return (this.b) || (super.isFocused());
  }

  public final boolean isInTouchMode()
  {
    return ((this.b) && (this.a)) || (super.isInTouchMode());
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.ui.prettylist;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HidingHeaderListView extends ListView
{
  private View a;
  private AbsListView.LayoutParams b = new AbsListView.LayoutParams(-1, 0);
  private boolean c;
  private DataSetObserver d = new HidingHeaderListView.1(this);

  public HidingHeaderListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }

  public HidingHeaderListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = new View(paramContext);
    this.a.setLayoutParams(this.b);
  }

  private boolean b()
  {
    if (getAdapter().getCount() <= 2);
    while ((getFirstVisiblePosition() > 1) || (1 > getLastVisiblePosition()))
      return false;
    return true;
  }

  private boolean c()
  {
    int i = -2 + getAdapter().getCount();
    if (i <= 0);
    while ((getFirstVisiblePosition() > i) || (i > getLastVisiblePosition()))
      return false;
    return true;
  }

  private boolean d()
  {
    return getAdapter().getCount() == 2;
  }

  private boolean e()
  {
    return getLastVisiblePosition() == -1 + getAdapter().getCount();
  }

  private int f()
  {
    int i = super.getChildCount();
    if (getChildAt(i - 1) == this.a)
      i--;
    return i;
  }

  private View g()
  {
    return getChildAt(-1 + f());
  }

  public final void a()
  {
    this.c = true;
  }

  protected void layoutChildren()
  {
    int i = 1;
    if ((!this.c) || (getAdapter() == null) || (getAdapter().getCount() < 2))
    {
      this.b.height = 0;
      super.layoutChildren();
      return;
    }
    int j;
    int k;
    if ((getFirstVisiblePosition() > 0) && (d()))
    {
      j = i;
      this.b.height = getHeight();
      super.layoutChildren();
      if ((b()) || ((!c()) && (!e())) || (d()))
        break label239;
      k = i;
      label103: if (k != 0)
      {
        setSelectionFromTop(i, 0);
        super.layoutChildren();
      }
      if (f() <= 0)
        break label343;
    }
    label280: label317: label343: for (int m = g().getBottom(); ; m = 0)
    {
      boolean bool1 = b();
      boolean bool2 = c();
      if (((!bool1) || (!bool2)) && (!d()));
      label239: int n;
      int i1;
      for (int i2 = 0; ; i2 = n - i1)
      {
        this.b.height = i2;
        if ((e()) && (j == 0) && (k == 0))
          this.a.layout(getLeft(), m, getRight(), i2 + m);
        if (j == 0)
          break label317;
        setSelectionFromTop(0, -getChildAt(0).getHeight());
        super.layoutChildren();
        return;
        j = 0;
        break;
        k = 0;
        break label103;
        n = getHeight() - getPaddingTop() - getPaddingBottom();
        if (!d())
          break label280;
        i1 = 0;
      }
      if (getFirstVisiblePosition() == 0);
      while (true)
      {
        View localView = getChildAt(i);
        i1 = g().getBottom() - localView.getTop();
        break;
        i = 0;
      }
      if (k == 0)
        break;
      setSelectionFromTop(-2 + getAdapter().getCount(), 0);
      super.layoutChildren();
      return;
    }
  }

  public void setAdapter(ListAdapter paramListAdapter)
  {
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
      addFooterView(this.a, null, false);
    while (true)
    {
      if (paramListAdapter != null)
        paramListAdapter.registerDataSetObserver(this.d);
      super.setAdapter(paramListAdapter);
      return;
      localListAdapter.unregisterDataSetObserver(this.d);
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.HidingHeaderListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

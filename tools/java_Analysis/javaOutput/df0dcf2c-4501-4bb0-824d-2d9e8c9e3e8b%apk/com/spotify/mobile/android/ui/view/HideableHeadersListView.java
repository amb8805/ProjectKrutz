package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;

public class HideableHeadersListView extends ListView
{
  private LinearLayout a;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  private boolean e = false;
  private boolean f = false;
  private boolean g = false;

  public HideableHeadersListView(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public HideableHeadersListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    this.a = new LinearLayout(paramContext);
    this.a.setOrientation(1);
    this.a.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
  }

  public final void a()
  {
    this.e = true;
    this.d = true;
    requestLayout();
  }

  public final void a(View paramView)
  {
    if (!this.b)
    {
      addHeaderView(this.a, null, true);
      this.b = true;
    }
    this.a.addView(paramView);
    paramView.setVisibility(8);
    this.c = true;
  }

  protected void layoutChildren()
  {
    super.layoutChildren();
    if (this.c)
    {
      int i = getCount();
      int j = getFirstVisiblePosition();
      int k = 1 + (getLastVisiblePosition() - j);
      if ((i - 1 > k) || (this.e))
      {
        int m = this.a.getChildCount();
        for (int n = 0; n < m; n++)
          this.a.getChildAt(n).setVisibility(0);
        if ((!this.d) && (!this.g) && ((!this.f) || (j <= 0)))
          setSelectionFromTop(1, 0);
        super.layoutChildren();
        this.c = false;
      }
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    this.f = true;
    super.onRestoreInstanceState(paramParcelable);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.g = true;
    return super.onTouchEvent(paramMotionEvent);
  }

  public void setSelection(int paramInt)
  {
    if (paramInt != 0)
      this.d = true;
    super.setSelection(paramInt);
  }

  public void setSelectionAfterHeaderView()
  {
    this.d = true;
    super.setSelectionAfterHeaderView();
  }

  public void setSelectionFromTop(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 0)
      this.d = true;
    super.setSelectionFromTop(paramInt1, paramInt2);
  }

  public void smoothScrollBy(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 0)
      this.d = true;
    super.smoothScrollBy(paramInt1, paramInt2);
  }

  public void smoothScrollToPosition(int paramInt)
  {
    if (paramInt != 0)
      this.d = true;
    super.smoothScrollToPosition(paramInt);
  }

  public void smoothScrollToPosition(int paramInt1, int paramInt2)
  {
    if (paramInt1 != 0)
      this.d = true;
    super.smoothScrollToPosition(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.view.HideableHeadersListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

package com.spotify.mobile.android.ui.prettylist;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.Iterator;
import java.util.LinkedList;

public class StickyListView extends ViewGroup
{
  private boolean a = true;
  private final FrameLayout b;
  private g c;
  private final AbsListView.LayoutParams d = new AbsListView.LayoutParams(0, 0);
  private i e = new i(this, (byte)0);
  private View f;
  private Rect g = new Rect();
  private boolean h;
  private boolean i;
  private int j;
  private View k;
  private int l;
  private int[] m = new int[2];
  private int[] n = new int[2];
  private boolean o;
  private LinkedList<h> p = new LinkedList();

  public StickyListView(Context paramContext)
  {
    this(paramContext, null);
  }

  public StickyListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842868);
  }

  public StickyListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = new FrameLayout(paramContext);
    this.b.setLayoutParams(this.d);
    this.c = new g(this, paramContext, paramAttributeSet, paramInt);
    this.c.setId(16908298);
    this.c.a();
    addView(this.c);
    this.c.addHeaderView(this.b, null, false);
    this.a = false;
    a(d());
  }

  private View d()
  {
    View localView = new View(getContext());
    localView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    return localView;
  }

  private void e()
  {
    int i1 = this.j;
    if (this.c.getFirstVisiblePosition() == 0);
    for (int i2 = Math.min(-this.b.getTop(), i1); ; i2 = i1)
    {
      if (i1 != 0);
      for (float f1 = i2 / i1; ; f1 = 0.0F)
      {
        Iterator localIterator = this.p.iterator();
        while (localIterator.hasNext())
          ((h)localIterator.next()).a(i2, f1);
      }
      return;
    }
  }

  private boolean f()
  {
    return (this.h) && ((this.c.getFirstVisiblePosition() > 0) || (this.b.getTop() <= -this.j));
  }

  public final ListView a()
  {
    return this.c;
  }

  public final void a(int paramInt)
  {
    this.b.setBackgroundColor(paramInt);
  }

  public final void a(View paramView)
  {
    if (this.f != null)
    {
      removeView(this.f);
      this.b.removeView(this.f);
    }
    if (paramView == null)
      paramView = d();
    this.f = paramView;
    addView(this.f);
    requestLayout();
  }

  public final void a(h paramh)
  {
    this.p.add(paramh);
  }

  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
    requestLayout();
  }

  public final int b()
  {
    return this.j;
  }

  public final void b(int paramInt)
  {
    this.l = paramInt;
    requestLayout();
  }

  public final void b(View paramView)
  {
    this.k = paramView;
    requestLayout();
  }

  public final boolean c()
  {
    return this.i;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.f == null);
    do
    {
      do
        return false;
      while (!this.i);
      this.f.getHitRect(this.g);
    }
    while ((!this.g.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) || (!this.c.onInterceptTouchEvent(paramMotionEvent)));
    this.o = true;
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    this.c.layout(0, 0, i1, i2);
    int i3;
    int i4;
    label59: int i5;
    label155: boolean bool1;
    if (this.f.getParent() == this.b)
    {
      i3 = 1;
      if (this.b.getParent() != this.c)
        break label279;
      i4 = 1;
      if ((i3 != 0) && (i4 == 0))
      {
        this.b.removeViewInLayout(this.f);
        addViewInLayout(this.f, -1, this.d);
        i3 = 0;
      }
      if ((i3 == 0) && (this.h))
        this.f.layout(0, 0, i1, this.f.getMeasuredHeight());
      View localView = this.f;
      i5 = 0;
      if (localView != null)
      {
        boolean bool3 = this.h;
        i5 = 0;
        if (bool3)
          break label285;
      }
      this.j = i5;
      bool1 = f();
      if (i4 != 0)
      {
        if ((!bool1) || (i3 == 0))
          break label358;
        boolean bool2 = this.f.hasFocus();
        this.b.removeViewInLayout(this.f);
        addViewInLayout(this.f, -1, this.d);
        if ((bool2) && (!this.f.hasFocus()))
          this.f.requestFocus();
      }
      label239: if ((this.f != null) && (bool1 != this.i))
        break label390;
    }
    while (true)
    {
      if (bool1)
        this.f.offsetTopAndBottom(-this.j);
      return;
      i3 = 0;
      break;
      label279: i4 = 0;
      break label59;
      label285: if (this.k == null)
      {
        i5 = this.f.getMeasuredHeight() - this.l;
        break label155;
      }
      this.f.getLocationInWindow(this.m);
      this.k.getLocationInWindow(this.n);
      i5 = Math.max(0, this.n[1] - this.m[1] - this.l);
      break label155;
      label358: if ((bool1) || (i3 != 0))
        break label239;
      removeViewInLayout(this.f);
      this.b.addView(this.f);
      break label239;
      label390: this.i = bool1;
      Iterator localIterator = this.p.iterator();
      while (localIterator.hasNext())
        localIterator.next();
      e();
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    this.f.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
    this.c.measure(paramInt1, paramInt2);
    setMeasuredDimension(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
    this.d.width = this.f.getMeasuredWidth();
    this.d.height = this.f.getMeasuredHeight();
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.o);
    for (boolean bool = this.c.onTouchEvent(paramMotionEvent); ; bool = super.onTouchEvent(paramMotionEvent))
    {
      if ((paramMotionEvent.getAction() == 1) || (paramMotionEvent.getAction() == 3))
        this.o = false;
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.ui.prettylist.StickyListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

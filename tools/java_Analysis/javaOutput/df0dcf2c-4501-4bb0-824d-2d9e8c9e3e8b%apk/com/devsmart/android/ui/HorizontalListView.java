package com.devsmart.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ListView.FixedViewInfo;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HorizontalListView extends AdapterView<ListAdapter>
{
  public boolean a = true;
  protected ListAdapter b;
  protected int c;
  protected int d;
  protected Scroller e;
  boolean f;
  private int g = -1;
  private int h = 0;
  private int i = 2147483647;
  private int j = 0;
  private GestureDetector k;
  private Queue<View> l = new LinkedList();
  private boolean m = false;
  private int n = 0;
  private float o;
  private float p;
  private float q;
  private int r;
  private ArrayList<ListView.FixedViewInfo> s = new ArrayList();
  private ArrayList<ListView.FixedViewInfo> t = new ArrayList();
  private ListView u;
  private boolean v;
  private DataSetObserver w = new HorizontalListView.1(this);
  private Runnable x = new HorizontalListView.2(this);
  private GestureDetector.OnGestureListener y = new HorizontalListView.3(this);

  public HorizontalListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
    this.q = (10.0F * paramContext.getResources().getDisplayMetrics().density);
  }

  private void a(View paramView, int paramInt)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (localLayoutParams == null)
      localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    addViewInLayout(paramView, paramInt, localLayoutParams, true);
    paramView.measure(View.MeasureSpec.makeMeasureSpec(getWidth(), -2147483648), View.MeasureSpec.makeMeasureSpec(getHeight(), -2147483648));
  }

  private View b(View paramView, int paramInt)
  {
    int i1 = this.r / 2;
    int i2 = this.r / 2;
    if (paramInt == 0)
      i1 = 0;
    int i3 = paramInt + 1;
    int i4 = this.b.getCount();
    int i5 = 0;
    if (i3 >= i4);
    while (true)
    {
      paramView.setPadding(i1, paramView.getPaddingTop(), i5, paramView.getPaddingBottom());
      return paramView;
      i5 = i2;
    }
  }

  private void c()
  {
    try
    {
      this.g = -1;
      this.h = 0;
      this.j = 0;
      this.c = 0;
      this.d = 0;
      this.i = 2147483647;
      this.e = new Scroller(getContext());
      this.k = new GestureDetector(getContext(), this.y);
      this.u = new ListView(getContext());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void d()
  {
    try
    {
      c();
      removeAllViewsInLayout();
      requestLayout();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final ListAdapter a()
  {
    return this.b;
  }

  public final void a(ListAdapter paramListAdapter)
  {
    if (this.b != null)
      this.b.unregisterDataSetObserver(this.w);
    this.b = paramListAdapter;
    this.b.registerDataSetObserver(this.w);
    d();
  }

  protected final boolean a(float paramFloat)
  {
    try
    {
      this.e.fling(this.d, 0, (int)(-paramFloat), 0, 0, this.i, 0, 0);
      requestLayout();
      return true;
    }
    finally
    {
    }
  }

  protected final boolean b()
  {
    this.f = this.e.isFinished();
    this.e.forceFinished(true);
    return true;
  }

  public View getSelectedView()
  {
    return null;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    ViewParent localViewParent = getParent();
    if (localViewParent == null)
      return false;
    switch (i1)
    {
    default:
      return false;
    case 0:
    }
    localViewParent.requestDisallowInterceptTouchEvent(true);
    this.o = paramMotionEvent.getX();
    this.p = paramMotionEvent.getY();
    this.n = 0;
    return true;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = 0;
    try
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      ListAdapter localListAdapter = this.b;
      if (localListAdapter == null)
        return;
      if (this.m)
      {
        int i11 = this.c;
        c();
        removeAllViewsInLayout();
        this.d = i11;
        this.m = false;
      }
      if (this.e.computeScrollOffset())
        this.d = this.e.getCurrX();
      if (this.d <= 0)
      {
        this.d = 0;
        this.e.forceFinished(true);
      }
      if (this.d >= this.i)
      {
        this.d = this.i;
        this.e.forceFinished(true);
      }
      i2 = this.c - this.d;
      for (View localView1 = getChildAt(0); (localView1 != null) && (i2 + localView1.getRight() <= 0); localView1 = getChildAt(0))
      {
        this.j += localView1.getMeasuredWidth();
        if (this.b.getItemViewType(1 + this.g) != -2)
          this.l.offer(localView1);
        removeViewInLayout(localView1);
        this.g = (1 + this.g);
      }
      while (true)
      {
        View localView2 = getChildAt(-1 + getChildCount());
        if ((localView2 == null) || (i2 + localView2.getLeft() < getWidth()))
          break;
        if (this.b.getItemViewType(-1 + this.h) != -2)
          this.l.offer(localView2);
        removeViewInLayout(localView2);
        this.h = (-1 + this.h);
      }
    }
    finally
    {
    }
    int i2;
    View localView3 = getChildAt(-1 + getChildCount());
    int i3;
    label353: int i4;
    int i5;
    if (localView3 != null)
    {
      i3 = localView3.getRight();
      break label736;
      while ((i4 + i2 < getWidth()) && (this.h < this.b.getCount()))
      {
        View localView7 = b(this.b.getView(this.h, (View)this.l.poll(), this), this.h);
        a(localView7, -1);
        int i10 = i4 + localView7.getMeasuredWidth();
        if (this.h == -1 + this.b.getCount())
          this.i = (i10 + this.c - getWidth());
        if (this.i < 0)
          this.i = 0;
        this.h = (1 + this.h);
        i4 = i10;
      }
      View localView4 = getChildAt(0);
      if (localView4 != null)
      {
        i5 = localView4.getLeft();
        break label743;
      }
    }
    while (true)
    {
      int i6;
      if ((i6 + i2 > 0) && (this.g >= 0))
      {
        View localView6 = b(this.b.getView(this.g, (View)this.l.poll(), this), this.g);
        a(localView6, 0);
        int i9 = i6 - localView6.getMeasuredWidth();
        this.g = (-1 + this.g);
        this.j -= localView6.getMeasuredWidth();
        i6 = i9;
      }
      else
      {
        if (getChildCount() > 0)
        {
          this.j = (i2 + this.j);
          int i7 = this.j;
          while (i1 < getChildCount())
          {
            View localView5 = getChildAt(i1);
            int i8 = localView5.getMeasuredWidth();
            localView5.layout(i7, 0, i7 + i8, localView5.getMeasuredHeight());
            i7 += i8;
            i1++;
          }
        }
        this.c = this.d;
        if (this.e.isFinished())
          break;
        post(this.x);
        break;
        i5 = 0;
        break label743;
        i3 = 0;
        label736: i4 = i3;
        break label353;
        label743: i6 = i5;
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    ViewParent localViewParent = getParent();
    if (localViewParent == null)
      return false;
    switch (paramMotionEvent.getAction())
    {
    default:
      label48: i1 = 0;
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (i1 != 0)
    {
      return super.onTouchEvent(paramMotionEvent) | this.k.onTouchEvent(paramMotionEvent);
      if ((this.v) && (Math.abs(paramMotionEvent.getY() - this.p) > getHeight() / 4))
      {
        localViewParent.requestDisallowInterceptTouchEvent(false);
        this.n = 0;
        i1 = 0;
      }
      else if (this.n == 2)
      {
        i1 = 0;
      }
      else if (this.n != i1)
      {
        if (Math.abs(paramMotionEvent.getX() - this.o) > this.q)
        {
          this.n = i1;
        }
        else
        {
          if (Math.abs(paramMotionEvent.getY() - this.p) <= this.q)
            break label48;
          localViewParent.requestDisallowInterceptTouchEvent(false);
          this.n = 2;
          i1 = 0;
          continue;
          localViewParent.requestDisallowInterceptTouchEvent(false);
        }
      }
    }
  }

  public void setSelection(int paramInt)
  {
  }
}

/* Location:
 * Qualified Name:     com.devsmart.android.ui.HorizontalListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

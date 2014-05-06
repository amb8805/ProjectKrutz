package com.twitter.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView.LayoutParams;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ListView.FixedViewInfo;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.twitter.android.fq;
import java.util.ArrayList;
import java.util.Iterator;

public final class RefreshableListView extends ListView
{
  final Scroller a;
  RelativeLayout b;
  private g c;
  private Animation d;
  private Animation e;
  private ProgressBar f;
  private ImageView g;
  private TextView h;
  private View i;
  private TextView j;
  private int k;
  private k l;
  private p m;
  private final int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private String t;
  private String u;
  private String v;
  private int w;
  private ArrayList x = new ArrayList();
  private ArrayList y = new ArrayList();

  public RefreshableListView(Context paramContext)
  {
    this(paramContext, null);
  }

  public RefreshableListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 2130771968);
  }

  public RefreshableListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, fq.RefreshableListView, paramInt, 0);
    this.n = localTypedArray.getColor(5, -1);
    Drawable localDrawable = localTypedArray.getDrawable(6);
    this.a = new Scroller(paramContext);
    this.c = new g(this, null);
    this.d = AnimationUtils.loadAnimation(paramContext, localTypedArray.getResourceId(7, 0));
    this.e = AnimationUtils.loadAnimation(paramContext, localTypedArray.getResourceId(8, 0));
    RelativeLayout localRelativeLayout = (RelativeLayout)LayoutInflater.from(paramContext).inflate(localTypedArray.getResourceId(0, 0), this, false);
    if (localDrawable != null)
    {
      View localView = localRelativeLayout.findViewById(2131165184);
      localView.setBackgroundDrawable(localDrawable);
      localView.setVisibility(0);
    }
    this.f = ((ProgressBar)localRelativeLayout.findViewById(2131165185));
    this.g = ((ImageView)localRelativeLayout.findViewById(2131165186));
    this.h = ((TextView)localRelativeLayout.findViewById(2131165187));
    this.b = localRelativeLayout;
    this.q = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    ViewGroup.LayoutParams localLayoutParams = localRelativeLayout.getLayoutParams();
    localRelativeLayout.setLayoutParams(new AbsListView.LayoutParams(localLayoutParams.width, localLayoutParams.height, -1));
    this.k = localTypedArray.getResourceId(1, 0);
    this.t = localTypedArray.getString(3);
    this.u = localTypedArray.getString(2);
    this.v = localTypedArray.getString(4);
    localTypedArray.recycle();
  }

  private static void a(ArrayList paramArrayList)
  {
    if (paramArrayList != null)
    {
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        ListView.FixedViewInfo localFixedViewInfo = (ListView.FixedViewInfo)localIterator.next();
        AbsListView.LayoutParams localLayoutParams = (AbsListView.LayoutParams)localFixedViewInfo.view.getLayoutParams();
        if (localLayoutParams != null)
          localFixedViewInfo.view.setLayoutParams(new AbsListView.LayoutParams(localLayoutParams.width, localLayoutParams.height, -2));
      }
    }
  }

  private void e(int paramInt)
  {
    if (paramInt > 0)
      this.c.a(paramInt);
  }

  public final void a()
  {
    if (this.m == null)
      return;
    this.g.clearAnimation();
    this.g.setVisibility(4);
    this.f.setVisibility(0);
    this.h.setText(this.t);
    b(32);
  }

  final void a(int paramInt)
  {
    int i1 = getChildCount();
    for (int i2 = 0; i2 < i1; i2++)
      getChildAt(i2).offsetTopAndBottom(paramInt);
  }

  public final void a(p paramp)
  {
    if ((this.m == null) && (getHeaderViewsCount() > 0))
      throw new IllegalStateException("setRefreshListener must be called before addHeaderView.");
    if (paramp != this.m)
      this.m = paramp;
  }

  public final void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.i.setVisibility(0);
      this.j.setVisibility(8);
      return;
    }
    this.i.setVisibility(8);
    this.j.setVisibility(0);
  }

  public final void addFooterView(View paramView, Object paramObject, boolean paramBoolean)
  {
    if (this.m != null)
    {
      ListView.FixedViewInfo localFixedViewInfo = new ListView.FixedViewInfo(this);
      localFixedViewInfo.view = paramView;
      localFixedViewInfo.data = paramObject;
      localFixedViewInfo.isSelectable = paramBoolean;
      this.y.add(localFixedViewInfo);
      return;
    }
    super.addFooterView(paramView, paramObject, paramBoolean);
  }

  public final void addHeaderView(View paramView, Object paramObject, boolean paramBoolean)
  {
    if (this.m != null)
    {
      ListView.FixedViewInfo localFixedViewInfo = new ListView.FixedViewInfo(this);
      localFixedViewInfo.view = paramView;
      localFixedViewInfo.data = paramObject;
      localFixedViewInfo.isSelectable = paramBoolean;
      this.x.add(localFixedViewInfo);
      return;
    }
    super.addHeaderView(paramView, paramObject, paramBoolean);
  }

  public final void b()
  {
    p localp = this.m;
    boolean bool;
    int i2;
    int i3;
    int i4;
    View localView;
    if ((localp != null) && (d(32)))
    {
      this.g.setVisibility(0);
      this.f.setVisibility(4);
      this.h.setText(this.u);
      int i1 = getFirstVisiblePosition();
      bool = d(2);
      r localr = localp.g();
      i2 = localr.c;
      i3 = localr.a;
      localp.c();
      i4 = localp.b(localr.b);
      c(32);
      if (i4 != i3)
        break label176;
      if ((i1 != 0) || (!isInTouchMode()))
        break label157;
      localView = getChildAt(1);
      if (localView == null)
        break label151;
    }
    label151: for (int i5 = localView.getTop(); ; i5 = 0)
    {
      if (bool)
        e(i5);
      return;
    }
    label157: if (bool)
      c();
    setSelectionFromTop(i3 - 1, i2);
    return;
    label176: if (bool)
      c();
    setSelectionFromTop(i4 - 1, i2);
  }

  final void b(int paramInt)
  {
    this.w = (paramInt | this.w);
  }

  final void c()
  {
    if (d(2))
    {
      if (equals(this.b.getParent()))
        detachViewFromParent(this.b);
      c(30);
      this.l.a();
    }
  }

  final void c(int paramInt)
  {
    this.w &= (paramInt ^ 0xFFFFFFFF);
  }

  protected final int computeVerticalScrollOffset()
  {
    if ((isSmoothScrollbarEnabled()) && (d(2)))
    {
      int i1 = getFirstVisiblePosition();
      int i2 = getChildCount();
      int i3 = getCount() - 1;
      if ((i3 > 0) && (i1 > 0) && (i2 > 0))
      {
        View localView = getChildAt(0);
        int i4 = localView.getTop();
        int i5 = localView.getHeight();
        if (i5 > 0)
          return Math.max(100 * (i1 - 1) - i4 * 100 / i5 + (int)(100.0F * (getScrollY() / getHeight() * i3)), 0);
      }
      return 0;
    }
    return super.computeVerticalScrollOffset();
  }

  protected final int computeVerticalScrollRange()
  {
    int i3;
    if ((isSmoothScrollbarEnabled()) && (d(2)))
    {
      int i1 = getCount() - 1;
      int i2 = getScrollY();
      i3 = Math.max(i1 * 100, 0);
      if (i2 != 0)
        return i3 + Math.abs((int)(100.0F * (i2 / getHeight() * i1)));
    }
    else
    {
      return super.computeVerticalScrollRange();
    }
    return i3;
  }

  final void d()
  {
    View localView1 = getChildAt(getChildCount() - 1);
    if ((localView1 != null) && (localView1.getBottom() < getBottom() - getBottomPaddingOffset() - getDividerHeight()))
    {
      View localView2 = getChildAt(0);
      if (localView2 != null)
      {
        int i1 = localView2.getTop();
        super.layoutChildren();
        a(i1 - localView2.getTop());
      }
    }
  }

  final boolean d(int paramInt)
  {
    return (paramInt & this.w) != 0;
  }

  protected final void detachViewsFromParent(int paramInt1, int paramInt2)
  {
    if (d(4))
      return;
    super.detachViewsFromParent(paramInt1, paramInt2);
  }

  public final boolean e()
  {
    int i1 = this.s;
    if (d(32))
      i1++;
    if (Build.VERSION.SDK_INT >= 8)
    {
      int i2 = getFirstVisiblePosition();
      View localView = getChildAt(0);
      if ((i2 > i1) || ((i2 == i1) && (localView != null) && (localView.getTop() < 0)))
      {
        if (i2 > 15)
          setSelection(i1);
        smoothScrollToPosition(i1);
        return true;
      }
      return false;
    }
    setSelection(i1);
    return true;
  }

  public final int getFooterViewsCount()
  {
    if (this.m != null)
      return this.y.size();
    return super.getFooterViewsCount();
  }

  public final int getHeaderViewsCount()
  {
    if (this.m != null)
      return this.x.size();
    return super.getHeaderViewsCount();
  }

  protected final void layoutChildren()
  {
    if (d(12))
      return;
    if (getCount() == 0)
    {
      a(this.x);
      a(this.y);
    }
    super.layoutChildren();
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.equals(this.b)))
    {
      int i1 = getScrollX();
      paramCanvas.save();
      paramCanvas.clipRect(i1, getScrollY(), i1 + getWidth(), localView.getBottom());
      paramCanvas.drawColor(this.n);
      paramCanvas.restore();
    }
    super.onDraw(paramCanvas);
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.m == null)
      return super.onInterceptTouchEvent(paramMotionEvent);
    int i1 = (int)paramMotionEvent.getY();
    int i2 = i1 - this.o;
    switch (paramMotionEvent.getAction())
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    while (true)
    {
      return super.onInterceptTouchEvent(paramMotionEvent);
      this.o = i1;
      this.p = -2147483648;
      continue;
      if (!d(32))
        break;
      this.p = i1;
    }
    View localView;
    if (d(2))
    {
      localView = getChildAt(1);
      label109: if (localView == null)
        break label162;
    }
    label162: for (int i3 = localView.getTop(); ; i3 = 0)
    {
      this.p = i1;
      if ((getFirstVisiblePosition() != 0) || (i3 < getListPaddingTop()) || (i2 <= this.q))
        break;
      return true;
      localView = getChildAt(0);
      break label109;
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    this.r = paramInt1;
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.m == null)
      return super.onTouchEvent(paramMotionEvent);
    int i1 = paramMotionEvent.getAction();
    int i2 = (int)paramMotionEvent.getY();
    int i3 = i2 - this.o;
    switch (i1 & 0xFF)
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.o = i2;
      this.p = -2147483648;
      b(64);
      continue;
      c(20);
      if ((!d(32)) && (d(2)))
      {
        View localView2 = getChildAt(0);
        if ((getFirstVisiblePosition() == 0) && (localView2 != null))
        {
          int i16 = localView2.getTop();
          int i17 = localView2.getBottom();
          if (i16 > 0)
          {
            this.m.a_(true);
            e(i16);
          }
          else if (localView2.getBottom() > 0)
          {
            this.m.a_(false);
            e(i17 + getDividerHeight());
            continue;
            if (d(32))
            {
              this.p = i2;
            }
            else
            {
              int i4;
              View localView1;
              label257: int i5;
              label269: int i6;
              if (this.p != -2147483648)
              {
                i4 = i2 - this.p;
                boolean bool1 = d(2);
                if (!bool1)
                  break label443;
                localView1 = getChildAt(1);
                if (localView1 == null)
                  break label453;
                i5 = localView1.getTop();
                if (i2 < this.p)
                  break label459;
                i6 = 1;
                label280: this.p = i2;
                if ((getFirstVisiblePosition() != 0) || (i5 < getListPaddingTop()) || (i3 <= this.q))
                  break label776;
                requestDisallowInterceptTouchEvent(true);
                if (d(64))
                {
                  super.onTouchEvent(paramMotionEvent);
                  c(64);
                }
                setChildrenDrawingCacheEnabled(false);
                setChildrenDrawnWithCacheEnabled(false);
                if (!bool1)
                  break label519;
                a((int)(0.5F * i4));
                invalidate();
                if (getChildAt(0).getTop() < 0)
                  break label465;
                if ((i6 != 0) && (!d(16)))
                {
                  b(16);
                  this.h.setText(this.v);
                  this.g.startAnimation(this.d);
                  this.m.a();
                }
              }
              while (true)
              {
                b(4);
                return true;
                i4 = i3;
                break;
                label443: localView1 = getChildAt(0);
                break label257;
                label453: i5 = 0;
                break label269;
                label459: i6 = 0;
                break label280;
                label465: if ((i6 == 0) && (d(16)))
                {
                  c(16);
                  this.h.setText(this.u);
                  this.g.startAnimation(this.e);
                  this.m.b();
                }
              }
              label519: int i7 = i5 - getDividerHeight();
              RelativeLayout localRelativeLayout = this.b;
              ViewGroup.LayoutParams localLayoutParams = localRelativeLayout.getLayoutParams();
              boolean bool2 = d(1);
              label562: int i8;
              label583: int i15;
              label633: int i11;
              label642: int i12;
              if (bool2)
              {
                attachViewToParent(localRelativeLayout, 0, localLayoutParams);
                b(2);
                if ((bool2) && (!localRelativeLayout.isLayoutRequested()))
                  break label722;
                i8 = 1;
                if (i8 == 0)
                  break label738;
                int i13 = ViewGroup.getChildMeasureSpec(this.r, getListPaddingLeft() + getListPaddingRight(), localLayoutParams.width);
                int i14 = localLayoutParams.height;
                if (i14 <= 0)
                  break label728;
                i15 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                localRelativeLayout.measure(i13, i15);
                int i9 = localRelativeLayout.getMeasuredWidth();
                int i10 = localRelativeLayout.getMeasuredHeight();
                i11 = i7 - i10;
                i12 = getListPaddingLeft();
                if (i8 == 0)
                  break label747;
                localRelativeLayout.layout(i12, i11, i9 + i12, i11 + i10);
              }
              while (true)
              {
                this.l.a();
                break;
                addViewInLayout(localRelativeLayout, 0, localLayoutParams, true);
                b(1);
                break label562;
                label722: i8 = 0;
                break label583;
                label728: i15 = View.MeasureSpec.makeMeasureSpec(0, 0);
                break label633;
                label738: cleanupLayoutState(localRelativeLayout);
                break label642;
                label747: localRelativeLayout.offsetLeftAndRight(i12 - localRelativeLayout.getLeft());
                localRelativeLayout.offsetTopAndBottom(i11 - localRelativeLayout.getTop());
              }
              label776: c();
            }
          }
        }
      }
    }
  }

  public final void setAdapter(ListAdapter paramListAdapter)
  {
    if (paramListAdapter != null)
      if ((this.l == null) || (!this.l.getWrappedAdapter().equals(paramListAdapter)))
      {
        this.l = new k(this, this.x, this.y, paramListAdapter);
        if ((this.m != null) && (this.i == null))
        {
          View localView = LayoutInflater.from(getContext()).inflate(this.k, null);
          addFooterView(localView, null, false);
          this.i = localView.findViewById(2131165188);
          this.j = ((TextView)localView.findViewById(2131165189));
        }
      }
    while (true)
    {
      super.setAdapter(this.l);
      return;
      this.l = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.twitter.android.widget.RefreshableListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

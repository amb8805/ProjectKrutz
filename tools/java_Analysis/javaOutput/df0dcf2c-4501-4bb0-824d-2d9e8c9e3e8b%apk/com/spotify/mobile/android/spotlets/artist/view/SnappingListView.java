package com.spotify.mobile.android.spotlets.artist.view;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.spotify.mobile.android.ui.m;
import com.spotify.mobile.android.util.TouchLifecycle;
import com.spotify.mobile.android.util.dn;

public class SnappingListView extends ListView
{
  private int a;
  private boolean b = false;
  private boolean c = true;
  private boolean d = false;
  private Handler e;
  private int f = -1;
  private boolean g;
  private int h = -1;
  private int i = -1;
  private int j;
  private TouchLifecycle k;
  private final dn l = new SnappingListView.1(this);
  private g m;
  private Runnable n = new SnappingListView.2(this);

  public SnappingListView(Context paramContext)
  {
    super(paramContext);
    a(null);
  }

  public SnappingListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }

  private void a(int paramInt)
  {
    smoothScrollBy(paramInt + b(), 500);
  }

  private void a(AttributeSet paramAttributeSet)
  {
    this.j = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.k = new TouchLifecycle(this.l);
    this.e = new Handler();
    if (paramAttributeSet != null)
    {
      localTypedArray = getContext().getTheme().obtainStyledAttributes(paramAttributeSet, m.F, 0, 0);
      try
      {
        this.a = localTypedArray.getDimensionPixelSize(0, 0);
        return;
      }
      finally
      {
        localTypedArray.recycle();
      }
    }
  }

  private int b()
  {
    return getChildAt(0).getTop();
  }

  private boolean c()
  {
    return getLastVisiblePosition() == -1 + getAdapter().getCount();
  }

  public final void a()
  {
    if ((getFirstVisiblePosition() == 0) && (getChildAt(0) != null) && (b() == 0));
    for (int i1 = 1; i1 != 0; i1 = 0)
    {
      a(this.a);
      return;
    }
    a(0);
  }

  public final void a(g paramg)
  {
    this.m = paramg;
  }

  public final void a(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      this.e.removeCallbacks(this.n);
      this.e.postDelayed(this.n, 20L);
    }
    this.d = paramBoolean;
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.h != getFirstVisiblePosition()) || (this.i != b()))
    {
      this.h = getFirstVisiblePosition();
      this.i = b();
    }
    int i1;
    for (this.g = true; ; this.g = false)
    {
      if (-b() != this.f)
      {
        if (this.m != null)
        {
          g localg = this.m;
          b();
          localg.a(this);
        }
        if (getFirstVisiblePosition() != 0)
          break label308;
        if (getChildAt(0) != null)
        {
          i1 = -b();
          if (this.f > 0)
            break;
          this.f = i1;
        }
      }
      if (!this.b)
      {
        if ((getFirstVisiblePosition() == 0) && (c()) && (-b() > 0) && (-b() < this.a))
        {
          this.a = (-b());
          this.b = true;
        }
        if (getFirstVisiblePosition() != 0)
          this.b = true;
      }
      return;
    }
    int i2;
    label217: int i3;
    if ((this.f > this.a) && (i1 < this.a))
    {
      i2 = 1;
      if ((this.f >= this.a) || (i1 <= this.a))
        break label302;
      i3 = 1;
      label239: if (((i2 != 0) || (i3 != 0)) && (!this.d))
        smoothScrollBy(0, 0);
    }
    label302: label308: for (this.f = i1; ; this.f = -1)
    {
      this.e.removeCallbacks(this.n);
      this.e.postDelayed(this.n, 20L);
      break;
      i2 = 0;
      break label217;
      i3 = 0;
      break label239;
    }
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return this.k.a(paramMotionEvent);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.c)
    {
      smoothScrollBy(this.a + b(), 0);
      this.c = false;
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getActionMasked() == 0)
      a(true);
    while (true)
    {
      return super.onTouchEvent(paramMotionEvent);
      if ((paramMotionEvent.getActionMasked() == 1) || (paramMotionEvent.getActionMasked() == 3))
        a(false);
    }
  }

  protected boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    return super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, 0, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     com.spotify.mobile.android.spotlets.artist.view.SnappingListView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

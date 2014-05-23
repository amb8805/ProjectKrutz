package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ah;
import android.support.v4.view.br;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View;;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import android.widget.TextView;;
import com.spotify.android.paste.b;
import com.spotify.android.paste.e;

public class SlidingTabLayout extends HorizontalScrollView
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private ViewPager g;
  private br h;
  private final l i;

  public SlidingTabLayout(Context paramContext)
  {
    this(paramContext, null);
  }

  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.s);
  }

  public SlidingTabLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f.a(SlidingTabLayout.class, this);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, e.s, paramInt, 0);
    this.a = localTypedArray.getResourceId(6, 0);
    this.b = localTypedArray.getDimensionPixelSize(7, 24);
    this.c = localTypedArray.getDimensionPixelSize(8, 16);
    this.d = localTypedArray.getDimensionPixelSize(9, 24);
    localTypedArray.recycle();
    setHorizontalScrollBarEnabled(false);
    setFillViewport(true);
    this.i = new l(paramContext, paramAttributeSet, paramInt);
    addView(this.i, -1, -2);
  }

  private void a(int paramInt1, int paramInt2)
  {
    int j = this.i.getChildCount();
    if ((j == 0) || (paramInt1 < 0) || (paramInt1 >= j));
    View localView;
    do
    {
      return;
      localView = this.i.getChildAt(paramInt1);
    }
    while (localView == null);
    int k = paramInt2 + localView.getLeft();
    if ((paramInt1 > 0) || (paramInt2 > 0))
      k -= this.d;
    scrollTo(k, 0);
  }

  public final void a(ViewPager paramViewPager)
  {
    this.i.removeAllViews();
    this.g = paramViewPager;
    ah localah;
    j localj;
    int j;
    Object localObject;
    TextView localTextView;
    if (paramViewPager != null)
    {
      paramViewPager.a(new i(this, (byte)0));
      localah = this.g.a();
      localj = new j(this, (byte)0);
      j = 0;
      if (j < localah.b())
      {
        if (this.e == 0)
          break label292;
        localObject = LayoutInflater.from(getContext()).inflate(this.e, this.i, false);
        localTextView = (TextView)((View)localObject).findViewById(this.f);
      }
    }
    while (true)
    {
      if (localObject == null)
      {
        Context localContext = getContext();
        localObject = new TextView(localContext);
        ((TextView)localObject).setGravity(17);
        if (this.a == 0)
          break label280;
        g.a(localContext, (TextView)localObject, this.a);
      }
      while (true)
      {
        if (Build.VERSION.SDK_INT >= 11)
        {
          TypedValue localTypedValue = new TypedValue();
          getContext().getTheme().resolveAttribute(16843534, localTypedValue, true);
          ((TextView)localObject).setBackgroundResource(localTypedValue.resourceId);
        }
        if (Build.VERSION.SDK_INT >= 14)
          ((TextView)localObject).setAllCaps(true);
        ((TextView)localObject).setPadding(this.b, this.c, this.b, this.c);
        if ((localTextView == null) && (TextView.class.isInstance(localObject)))
          localTextView = (TextView)localObject;
        localTextView.setText(localah.b(j));
        ((View)localObject).setOnClickListener(localj);
        this.i.addView((View)localObject);
        j++;
        break;
        label280: ((TextView)localObject).setTextSize(2, 12.0F);
      }
      return;
      label292: localTextView = null;
      localObject = null;
    }
  }

  public final void a(br parambr)
  {
    this.h = parambr;
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.g != null)
      a(this.g.b(), 0);
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.SlidingTabLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

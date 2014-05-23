package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.spotify.mobile.android.ui.m;
import java.util.LinkedList;
import java.util.Queue;

public class ActionBarTabStrip extends LinearLayout
  implements bn
{
  private ViewPager a;
  private ah b;
  private Queue<k> c = new LinkedList();
  private Queue<View> d = new LinkedList();
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private Drawable k;
  private int l;
  private int m;
  private int n = -1;
  private final j o = new j(this, (byte)0);

  public ActionBarTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setOrientation(0);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, m.d, 0, 2131755011);
    this.e = localTypedArray.getColor(4, 0);
    this.f = localTypedArray.getColor(5, 0);
    if (localTypedArray.hasValue(2))
      this.j = localTypedArray.getDimensionPixelSize(3, 0);
    if (localTypedArray.hasValue(3))
      this.g = localTypedArray.getDimensionPixelSize(0, 0);
    if (localTypedArray.hasValue(4))
      this.h = localTypedArray.getInt(1, 0);
    if (localTypedArray.hasValue(5))
      this.i = localTypedArray.getColor(2, 0);
    if (localTypedArray.hasValue(6))
      this.k = localTypedArray.getDrawable(6);
    localTypedArray.recycle();
    float f1 = paramContext.getResources().getDisplayMetrics().density;
    this.l = (int)(1.0F * f1);
    this.m = (int)(f1 * 8.0F);
    setBackgroundColor(this.e);
  }

  private void a()
  {
    this.c.clear();
    this.d.clear();
    int i1 = 0;
    if (i1 < getChildCount())
    {
      View localView2 = getChildAt(i1);
      if ((localView2 instanceof k))
        this.c.add((k)localView2);
      while (true)
      {
        i1++;
        break;
        this.d.add(localView2);
      }
    }
    removeAllViews();
    if (this.b == null)
      return;
    int i2 = 0;
    label93: View localView1;
    if (i2 < this.b.b())
      if (i2 != 0)
      {
        localView1 = (View)this.d.poll();
        if (localView1 == null)
          break label303;
      }
    while (true)
    {
      addView(localView1);
      k localk = (k)this.c.poll();
      if (localk == null)
      {
        localk = new k(this);
        LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(0, -2);
        localLayoutParams1.weight = 1.0F;
        localk.setLayoutParams(localLayoutParams1);
        localk.setSingleLine(true);
        localk.setEllipsize(TextUtils.TruncateAt.END);
        if (this.g != 0)
          localk.setTextSize(0, this.g);
        if (this.h != 0)
          localk.setTypeface(null, this.h);
        if (this.i != 0)
          localk.setTextColor(this.i);
        if (this.k != null)
          localk.setBackgroundDrawable(this.k.getConstantState().newDrawable(getResources()));
        if (this.j != 0)
          localk.setMinHeight(this.j);
      }
      localk.a(i2);
      addView(localk);
      localk.refreshDrawableState();
      i2++;
      break label93;
      break;
      label303: localView1 = new View(getContext());
      LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(this.l, -1);
      localLayoutParams2.topMargin = this.m;
      localLayoutParams2.bottomMargin = this.m;
      localView1.setLayoutParams(localLayoutParams2);
      localView1.setBackgroundColor(this.f);
    }
  }

  final void a(ah paramah1, ah paramah2)
  {
    if (paramah1 != null)
      paramah1.b(this.o);
    if (paramah2 != null)
      paramah2.a(this.o);
    if (this.a != null)
    {
      this.b = paramah2;
      a();
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    ViewParent localViewParent = getParent();
    if (!(localViewParent instanceof ViewPager))
      throw new IllegalStateException("ActionBarTabStrip must be a direct child of a ViewPager.");
    ViewPager localViewPager = (ViewPager)localViewParent;
    ah localah = localViewPager.a();
    localViewPager.b(this.o);
    localViewPager.a(this.o);
    this.a = localViewPager;
    this.n = localViewPager.b();
    a(null, localah);
  }

  protected void onDetachedFromWindow()
  {
    a(this.a.a(), null);
    this.a.b(null);
    this.a.a(null);
    this.a = null;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.view.ActionBarTabStrip
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

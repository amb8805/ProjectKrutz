package com.mixpanel.android.surveys;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Animation;;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import com.mixpanel.android.mpmetrics.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CardCarouselLayout extends ViewGroup
{
  private static int a = 45;
  private static float b = 0.8F;
  private static float c = 0.5F;
  private static float d = 0.5F;
  private final List<View> e = new ArrayList(1);
  private c f;
  private c g;
  private b h = null;

  public CardCarouselLayout(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }

  public CardCarouselLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }

  public CardCarouselLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }

  private void a(Context paramContext)
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(paramContext);
    View localView1 = localLayoutInflater.inflate(com.mixpanel.android.c.e, this, false);
    this.f = new c(this, localView1);
    View localView2 = localLayoutInflater.inflate(com.mixpanel.android.c.e, this, false);
    this.g = new c(this, localView2);
    addView(localView1);
    addView(localView2);
  }

  public final void a(w paramw, String paramString)
  {
    this.f.a(paramw, paramString);
    removeAllViews();
    addView(this.f.a());
    addView(this.g.a());
    invalidate();
  }

  public final void a(w paramw, String paramString, CardCarouselLayout.Direction paramDirection)
  {
    c localc = this.g;
    this.g = this.f;
    this.f = localc;
    this.f.a(paramw, paramString);
    View localView1 = this.g.a();
    View localView2 = this.f.a();
    localView1.setVisibility(0);
    localView2.setVisibility(0);
    int i = CardCarouselLayout.2.a[paramDirection.ordinal()];
    Object localObject1 = null;
    Object localObject2 = null;
    switch (i)
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      ((Animation)localObject2).setAnimationListener(new CardCarouselLayout.1(this, localView1));
      localView1.startAnimation((Animation)localObject2);
      localView2.startAnimation((Animation)localObject1);
      invalidate();
      return;
      AnimationSet localAnimationSet3 = new AnimationSet(false);
      RotateAnimation localRotateAnimation3 = new RotateAnimation(0.0F, -a, 1, c, 1, d);
      localRotateAnimation3.setDuration(330L);
      localRotateAnimation3.setStartOffset(132L);
      localAnimationSet3.addAnimation(localRotateAnimation3);
      ScaleAnimation localScaleAnimation3 = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
      localScaleAnimation3.setDuration(330L);
      localScaleAnimation3.setStartOffset(132L);
      localAnimationSet3.addAnimation(localScaleAnimation3);
      TranslateAnimation localTranslateAnimation3 = new TranslateAnimation(2, -1.0F, 2, -2.3F, 2, 0.0F, 2, 0.0F);
      localTranslateAnimation3.setInterpolator(new AccelerateInterpolator());
      localTranslateAnimation3.setDuration(330L);
      localAnimationSet3.addAnimation(localTranslateAnimation3);
      AnimationSet localAnimationSet4 = new AnimationSet(false);
      RotateAnimation localRotateAnimation4 = new RotateAnimation(a, 0.0F, 1, c, 1, d);
      localRotateAnimation4.setDuration(198L);
      localAnimationSet4.addAnimation(localRotateAnimation4);
      ScaleAnimation localScaleAnimation4 = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
      localScaleAnimation4.setDuration(198L);
      localAnimationSet4.addAnimation(localScaleAnimation4);
      TranslateAnimation localTranslateAnimation4 = new TranslateAnimation(2, 1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
      localTranslateAnimation4.setDuration(330L);
      localAnimationSet4.addAnimation(localTranslateAnimation4);
      localObject1 = localAnimationSet4;
      localObject2 = localAnimationSet3;
      continue;
      AnimationSet localAnimationSet1 = new AnimationSet(false);
      RotateAnimation localRotateAnimation1 = new RotateAnimation(0.0F, a, 1, c, 1, d);
      localRotateAnimation1.setDuration(198L);
      localRotateAnimation1.setStartOffset(132L);
      localAnimationSet1.addAnimation(localRotateAnimation1);
      ScaleAnimation localScaleAnimation1 = new ScaleAnimation(1.0F, b, 1.0F, b, 1, c, 1, d);
      localScaleAnimation1.setDuration(198L);
      localScaleAnimation1.setStartOffset(132L);
      localAnimationSet1.addAnimation(localScaleAnimation1);
      TranslateAnimation localTranslateAnimation1 = new TranslateAnimation(2, -1.0F, 2, 0.3F, 2, 0.0F, 2, 0.0F);
      localTranslateAnimation1.setInterpolator(new AccelerateInterpolator());
      localTranslateAnimation1.setDuration(330L);
      localAnimationSet1.addAnimation(localTranslateAnimation1);
      AnimationSet localAnimationSet2 = new AnimationSet(false);
      RotateAnimation localRotateAnimation2 = new RotateAnimation(-a, 0.0F, 1, c, 1, d);
      localRotateAnimation2.setDuration(198L);
      localAnimationSet2.addAnimation(localRotateAnimation2);
      ScaleAnimation localScaleAnimation2 = new ScaleAnimation(b, 1.0F, b, 1.0F, 1, c, 1, d);
      localScaleAnimation2.setDuration(198L);
      localAnimationSet2.addAnimation(localScaleAnimation2);
      TranslateAnimation localTranslateAnimation2 = new TranslateAnimation(2, -1.3F, 2, 0.0F, 2, 0.0F, 2, 0.0F);
      localTranslateAnimation2.setDuration(330L);
      localAnimationSet2.addAnimation(localTranslateAnimation2);
      localObject1 = localAnimationSet2;
      localObject2 = localAnimationSet1;
    }
  }

  public final void a(b paramb)
  {
    this.h = paramb;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView1 = this.f.a();
    int i;
    if (localView1.getVisibility() != 8)
    {
      i = localView1.getMeasuredWidth();
      localView1.layout(0, 0, i, localView1.getMeasuredHeight());
    }
    while (true)
    {
      View localView2 = this.g.a();
      if (localView2.getVisibility() != 8)
      {
        int j = localView2.getMeasuredWidth();
        int k = localView2.getMeasuredHeight();
        localView2.layout(i, 0, j + i, k);
      }
      return;
      i = 0;
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getChildCount();
    if ((View.MeasureSpec.getMode(paramInt1) != 1073741824) || (View.MeasureSpec.getMode(paramInt2) != 1073741824));
    int m;
    int n;
    for (int j = 1; ; j = 0)
    {
      this.e.clear();
      int k = 0;
      m = 0;
      n = 0;
      while (k < i)
      {
        View localView2 = getChildAt(k);
        if (localView2.getVisibility() != 8)
        {
          ViewGroup.LayoutParams localLayoutParams2 = localView2.getLayoutParams();
          localView2.measure(getChildMeasureSpec(paramInt1, 0, localLayoutParams2.width), getChildMeasureSpec(paramInt2, 0, localLayoutParams2.height));
          m = Math.max(m, localView2.getMeasuredWidth());
          n = Math.max(n, localView2.getMeasuredHeight());
          if ((j != 0) && ((localLayoutParams2.width == -1) || (localLayoutParams2.height == -1)))
            this.e.add(localView2);
        }
        k++;
      }
    }
    int i1 = Math.max(n, getSuggestedMinimumHeight());
    setMeasuredDimension(resolveSize(Math.max(m, getSuggestedMinimumWidth()), paramInt1), resolveSize(i1, paramInt2));
    Iterator localIterator = this.e.iterator();
    if (localIterator.hasNext())
    {
      View localView1 = (View)localIterator.next();
      ViewGroup.LayoutParams localLayoutParams1 = localView1.getLayoutParams();
      int i2;
      if (localLayoutParams1.width == -1)
      {
        i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        label265: if (localLayoutParams1.height != -1)
          break label312;
      }
      label312: for (int i3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824); ; i3 = getChildMeasureSpec(paramInt2, 0, localLayoutParams1.height))
      {
        localView1.measure(i2, i3);
        break;
        i2 = getChildMeasureSpec(paramInt1, 0, localLayoutParams1.width);
        break label265;
      }
    }
  }

  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}

/* Location:
 * Qualified Name:     com.mixpanel.android.surveys.CardCarouselLayout
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

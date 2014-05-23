package com.spotify.android.paste.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.at;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import android.widget.CompoundButton;
import com.spotify.android.paste.b;
import com.spotify.android.paste.graphics.d;

public class SwitchView extends CompoundButton
{
  private static final int[] h = { 16843074 };
  private Drawable a;
  private int b;
  private n c = new n((byte)0);
  private Transformation d = new Transformation();
  private AlphaAnimation e;
  private boolean f;
  private final Rect g = new Rect();

  public SwitchView(Context paramContext)
  {
    this(paramContext, null);
  }

  public SwitchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, b.t);
  }

  public SwitchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    f.a(SwitchView.class, this);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, h, paramInt, 0);
    Drawable localDrawable = localTypedArray.getDrawable(0);
    if (this.a != null)
      this.a.setCallback(null);
    this.a = localDrawable;
    if (this.a != null)
    {
      this.a.setCallback(this);
      this.a.setBounds(0, 0, this.a.getIntrinsicWidth(), this.a.getIntrinsicHeight());
    }
    localTypedArray.recycle();
    setClickable(true);
    this.b = d.b(24.0F, getResources());
    this.e = new AlphaAnimation(0.0F, 1.0F);
    this.e.setDuration(200L);
    this.e.setInterpolator(this.c);
    this.e.setStartTime(-1L);
    this.e.setFillEnabled(true);
    this.e.setFillBefore(true);
    this.e.setFillAfter(true);
  }

  private float a()
  {
    Drawable localDrawable = getBackground();
    if ((localDrawable == null) || (localDrawable.getIntrinsicHeight() <= 0))
      return 1.7F;
    return localDrawable.getIntrinsicWidth() / localDrawable.getIntrinsicHeight();
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable1 = this.a;
    int i = 0;
    if (localDrawable1 != null)
    {
      boolean bool = this.a.isStateful();
      i = 0;
      if (bool)
      {
        int[] arrayOfInt = getDrawableState();
        this.a.setState(arrayOfInt);
        i = 1;
      }
    }
    Drawable localDrawable2 = getBackground();
    if ((localDrawable2 != null) && (localDrawable2.isStateful()))
    {
      localDrawable2.setState(getDrawableState());
      i = 1;
    }
    if (i != 0)
      at.b(this);
  }

  protected int getSuggestedMinimumHeight()
  {
    Drawable localDrawable = getBackground();
    if (localDrawable != null);
    for (int i = localDrawable.getIntrinsicHeight(); ; i = 0)
    {
      if (i <= 0)
        i = this.b;
      return i;
    }
  }

  protected int getSuggestedMinimumWidth()
  {
    return (int)(a() * getSuggestedMinimumHeight());
  }

  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    if (isChecked());
    for (float f1 = 1.0F; ; f1 = 0.0F)
    {
      if ((this.f) || ((this.e.hasStarted()) && (!this.e.hasEnded())))
      {
        this.f = false;
        this.e.getTransformation(AnimationUtils.currentAnimationTimeMillis(), this.d);
        f1 = this.d.getAlpha();
      }
      Drawable localDrawable = getBackground();
      if ((localDrawable != null) && (localDrawable.setLevel((int)(10000.0F * f1))))
        at.b(this);
      if (this.a != null)
      {
        int i = 0;
        if (localDrawable != null)
          i = localDrawable.getBounds().width() - this.a.getBounds().width();
        paramCanvas.translate(f1 * i, 0.0F);
        this.a.draw(paramCanvas);
      }
      paramCanvas.restore();
      return;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a != null)
    {
      this.a.copyBounds(this.g);
      this.a.setBounds(0, 0, paramInt4 - paramInt2, Math.round(this.g.bottom * ((paramInt4 - paramInt2) / this.g.height())));
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = getSuggestedMinimumHeight();
    int j;
    switch (View.MeasureSpec.getMode(paramInt2))
    {
    default:
      j = (int)(a() * i);
      switch (View.MeasureSpec.getMode(paramInt1))
      {
      default:
      case 1073741824:
      case -2147483648:
      }
      break;
    case 1073741824:
    case -2147483648:
    }
    while (true)
    {
      setMeasuredDimension(j, i);
      return;
      i = View.MeasureSpec.getSize(paramInt2);
      break;
      i = Math.min(View.MeasureSpec.getSize(paramInt2), i);
      break;
      j = View.MeasureSpec.getSize(paramInt1);
      continue;
      j = Math.min(View.MeasureSpec.getSize(paramInt1), j);
    }
  }

  public void toggle()
  {
    super.toggle();
    n localn = this.c;
    if (!isChecked());
    for (boolean bool = true; ; bool = false)
    {
      localn.a(bool);
      this.e.reset();
      this.e.startNow();
      this.f = true;
      at.b(this);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.spotify.android.paste.widget.SwitchView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

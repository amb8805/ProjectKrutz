package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public final class ProgressBarICS extends View
{
  private static final int[] f = { 16843062, 16843063, 16843064, 16843065, 16843066, 16843067, 16843068, 16843069, 16843070, 16843071, 16843039, 16843072, 16843040, 16843073 };
  int a = 24;
  int b = 48;
  int c = 24;
  int d = 48;
  Bitmap e;
  private int g = 0;
  private int h = 0;
  private int i = 100;
  private int j = 1;
  private int k = 4000;
  private boolean l = false;
  private boolean m = false;
  private Transformation n;
  private AlphaAnimation o;
  private Drawable p;
  private Drawable q;
  private Drawable r;
  private boolean s;
  private Interpolator t;
  private z u;
  private long v = Thread.currentThread().getId();
  private boolean w;
  private long x;
  private boolean y;

  public ProgressBarICS(Context paramContext, int paramInt)
  {
    super(paramContext, null, 0);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, f, 0, paramInt);
    this.s = true;
    a(localTypedArray.getInt(0, this.i));
    b(localTypedArray.getInt(1, this.g));
    d(localTypedArray.getInt(2, this.h));
    boolean bool1 = localTypedArray.getBoolean(3, this.l);
    this.m = localTypedArray.getBoolean(4, this.m);
    Drawable localDrawable1 = localTypedArray.getDrawable(5);
    if (localDrawable1 != null)
    {
      Drawable localDrawable4 = a(localDrawable1);
      if (localDrawable4 != null)
        localDrawable4.setCallback(this);
      this.p = localDrawable4;
      if (this.l)
      {
        this.r = localDrawable4;
        postInvalidate();
      }
    }
    Drawable localDrawable2 = localTypedArray.getDrawable(6);
    Drawable localDrawable3;
    if (localDrawable2 != null)
    {
      localDrawable3 = a(localDrawable2, false);
      if ((this.q == null) || (localDrawable3 == this.q))
        break label505;
      this.q.setCallback(null);
    }
    label505: for (int i2 = 1; ; i2 = 0)
    {
      if (localDrawable3 != null)
      {
        localDrawable3.setCallback(this);
        int i3 = localDrawable3.getMinimumHeight();
        if (this.d < i3)
        {
          this.d = i3;
          requestLayout();
        }
      }
      this.q = localDrawable3;
      if (!this.l)
      {
        this.r = localDrawable3;
        postInvalidate();
      }
      if (i2 != 0)
      {
        c(getWidth(), getHeight());
        c();
        a(16908301, this.g);
        a(16908303, this.h);
      }
      this.k = localTypedArray.getInt(7, this.k);
      this.j = localTypedArray.getInt(8, this.j);
      this.a = localTypedArray.getDimensionPixelSize(9, this.a);
      this.b = localTypedArray.getDimensionPixelSize(10, this.b);
      this.c = localTypedArray.getDimensionPixelSize(11, this.c);
      this.d = localTypedArray.getDimensionPixelSize(12, this.d);
      int i1 = localTypedArray.getResourceId(13, 17432587);
      if (i1 > 0)
        this.t = AnimationUtils.loadInterpolator(paramContext, i1);
      localTypedArray.recycle();
      this.s = false;
      boolean bool2;
      if (!this.m)
      {
        bool2 = false;
        if (!bool1);
      }
      else
      {
        bool2 = true;
      }
      a(bool2);
      return;
    }
  }

  private Drawable a(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof AnimationDrawable))
    {
      AnimationDrawable localAnimationDrawable1 = (AnimationDrawable)paramDrawable;
      int i1 = localAnimationDrawable1.getNumberOfFrames();
      AnimationDrawable localAnimationDrawable2 = new AnimationDrawable();
      localAnimationDrawable2.setOneShot(localAnimationDrawable1.isOneShot());
      for (int i2 = 0; i2 < i1; i2++)
      {
        Drawable localDrawable = a(localAnimationDrawable1.getFrame(i2), true);
        localDrawable.setLevel(10000);
        localAnimationDrawable2.addFrame(localDrawable, localAnimationDrawable1.getDuration(i2));
      }
      localAnimationDrawable2.setLevel(10000);
      paramDrawable = localAnimationDrawable2;
    }
    return paramDrawable;
  }

  private Drawable a(Drawable paramDrawable, boolean paramBoolean)
  {
    int i1 = 0;
    if ((paramDrawable instanceof LayerDrawable))
    {
      localLayerDrawable1 = (LayerDrawable)paramDrawable;
      i2 = localLayerDrawable1.getNumberOfLayers();
      arrayOfDrawable = new Drawable[i2];
      i3 = 0;
      if (i3 < i2)
      {
        i4 = localLayerDrawable1.getId(i3);
        localDrawable = localLayerDrawable1.getDrawable(i3);
        if ((i4 == 16908301) || (i4 == 16908303));
        for (bool = true; ; bool = false)
        {
          arrayOfDrawable[i3] = a(localDrawable, bool);
          i3++;
          break;
        }
      }
      localLayerDrawable2 = new LayerDrawable(arrayOfDrawable);
      while (i1 < i2)
      {
        localLayerDrawable2.setId(i1, localLayerDrawable1.getId(i1));
        i1++;
      }
      paramDrawable = localLayerDrawable2;
    }
    while (!(paramDrawable instanceof BitmapDrawable))
    {
      LayerDrawable localLayerDrawable1;
      int i2;
      Drawable[] arrayOfDrawable;
      int i3;
      int i4;
      Drawable localDrawable;
      boolean bool;
      LayerDrawable localLayerDrawable2;
      return paramDrawable;
    }
    Bitmap localBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
    if (this.e == null)
      this.e = localBitmap;
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
    BitmapShader localBitmapShader = new BitmapShader(localBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
    localShapeDrawable.getPaint().setShader(localBitmapShader);
    if (paramBoolean)
      return new ClipDrawable(localShapeDrawable, 3, 1);
    return localShapeDrawable;
  }

  private void a()
  {
    if (getVisibility() != 0)
      return;
    if ((this.p instanceof Animatable))
    {
      this.w = true;
      this.o = null;
    }
    while (true)
    {
      postInvalidate();
      return;
      if (this.t == null)
        this.t = new LinearInterpolator();
      this.n = new Transformation();
      this.o = new AlphaAnimation(0.0F, 1.0F);
      this.o.setRepeatMode(this.j);
      this.o.setRepeatCount(-1);
      this.o.setDuration(this.k);
      this.o.setInterpolator(this.t);
      this.o.setStartTime(-1L);
    }
  }

  private void a(int paramInt1, int paramInt2)
  {
    float f1;
    try
    {
      if (this.i > 0)
      {
        f1 = paramInt2 / this.i;
        localObject2 = this.r;
        if (localObject2 == null)
          break label76;
        bool = localObject2 instanceof LayerDrawable;
        localDrawable = null;
        if (!bool)
          break label88;
        localDrawable = ((LayerDrawable)localObject2).findDrawableByLayerId(paramInt1);
        break label88;
        ((Drawable)localObject2).setLevel(i1);
      }
      while (true)
      {
        return;
        f1 = 0.0F;
        break;
        invalidate();
      }
    }
    finally
    {
    }
    while (true)
    {
      Object localObject2;
      boolean bool;
      Drawable localDrawable;
      label76: label88: int i1 = (int)(f1 * 10000.0F);
      if (localDrawable != null)
        localObject2 = localDrawable;
    }
  }

  private void a(boolean paramBoolean)
  {
    try
    {
      if (((!this.m) || (!this.l)) && (paramBoolean != this.l))
      {
        this.l = paramBoolean;
        if (!paramBoolean)
          break label48;
        this.r = this.p;
        a();
      }
      while (true)
      {
        return;
        this.r = this.q;
        b();
      }
    }
    finally
    {
    }
  }

  private void b()
  {
    this.o = null;
    this.n = null;
    if ((this.p instanceof Animatable))
    {
      ((Animatable)this.p).stop();
      this.w = false;
    }
    postInvalidate();
  }

  private void b(int paramInt)
  {
    try
    {
      c(paramInt);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void b(int paramInt1, int paramInt2)
  {
    try
    {
      if (this.v == Thread.currentThread().getId())
        a(paramInt1, paramInt2);
      while (true)
      {
        return;
        if (this.u == null)
          break;
        localz = this.u;
        this.u = null;
        localz.a(paramInt1, paramInt2);
        post(localz);
      }
    }
    finally
    {
    }
    while (true)
      z localz = new z(this, paramInt1, paramInt2);
  }

  private void c()
  {
    int[] arrayOfInt = getDrawableState();
    if ((this.q != null) && (this.q.isStateful()))
      this.q.setState(arrayOfInt);
    if ((this.p != null) && (this.p.isStateful()))
      this.p.setState(arrayOfInt);
  }

  private void c(int paramInt)
  {
    try
    {
      boolean bool = this.l;
      if (bool);
      while (true)
      {
        return;
        if (paramInt >= 0)
          break;
        i1 = 0;
        if (i1 > this.i)
          i1 = this.i;
        if (i1 != this.g)
        {
          this.g = i1;
          b(16908301, this.g);
        }
      }
    }
    finally
    {
    }
    while (true)
      int i1 = paramInt;
  }

  private void c(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 - getPaddingRight() - getPaddingLeft();
    int i2 = paramInt2 - getPaddingBottom() - getPaddingTop();
    float f1;
    int i5;
    int i3;
    int i4;
    int i6;
    if (this.p != null)
      if ((this.m) && (!(this.p instanceof AnimationDrawable)))
      {
        int i7 = this.p.getIntrinsicWidth();
        int i8 = this.p.getIntrinsicHeight();
        f1 = i7 / i8;
        float f2 = paramInt1 / paramInt2;
        if (f1 != f2)
          if (f2 > f1)
          {
            int i12 = (int)(f1 * paramInt2);
            i5 = (paramInt1 - i12) / 2;
            i3 = i12 + i5;
            i4 = i2;
            i6 = 0;
            this.p.setBounds(i5, i6, i3, i4);
          }
      }
    while (true)
    {
      if (this.q != null)
        this.q.setBounds(0, 0, i3, i4);
      return;
      int i9 = (int)(paramInt1 * (1.0F / f1));
      int i10 = (paramInt2 - i9) / 2;
      int i11 = i9 + i10;
      i3 = i1;
      i4 = i11;
      i6 = i10;
      i5 = 0;
      break;
      i3 = i1;
      i4 = i2;
      i5 = 0;
      i6 = 0;
      break;
      i3 = i1;
      i4 = i2;
    }
  }

  private void d(int paramInt)
  {
    try
    {
      boolean bool = this.l;
      if (bool);
      while (true)
      {
        return;
        if (paramInt >= 0)
          break;
        i1 = 0;
        if (i1 > this.i)
          i1 = this.i;
        if (i1 != this.h)
        {
          this.h = i1;
          b(16908303, this.h);
        }
      }
    }
    finally
    {
    }
    while (true)
      int i1 = paramInt;
  }

  public final void a(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    try
    {
      if (paramInt != this.i)
      {
        this.i = paramInt;
        postInvalidate();
        if (this.g > paramInt)
          this.g = paramInt;
        b(16908301, this.g);
      }
      return;
    }
    finally
    {
    }
  }

  protected final void drawableStateChanged()
  {
    super.drawableStateChanged();
    c();
  }

  public final void invalidateDrawable(Drawable paramDrawable)
  {
    if (!this.y)
    {
      if (verifyDrawable(paramDrawable))
      {
        Rect localRect = paramDrawable.getBounds();
        int i1 = getScrollX() + getPaddingLeft();
        int i2 = getScrollY() + getPaddingTop();
        invalidate(i1 + localRect.left, i2 + localRect.top, i1 + localRect.right, i2 + localRect.bottom);
      }
    }
    else
      return;
    super.invalidateDrawable(paramDrawable);
  }

  protected final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.l)
      a();
  }

  protected final void onDetachedFromWindow()
  {
    if (this.l)
      b();
    if (this.u != null)
      removeCallbacks(this.u);
    super.onDetachedFromWindow();
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      localDrawable = this.r;
      if (localDrawable != null)
      {
        paramCanvas.save();
        paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        long l1 = getDrawingTime();
        if (this.o != null)
        {
          this.o.getTransformation(l1, this.n);
          float f1 = this.n.getAlpha();
          try
          {
            this.y = true;
            localDrawable.setLevel((int)(f1 * 10000.0F));
            this.y = false;
            if (SystemClock.uptimeMillis() - this.x >= 200L)
            {
              this.x = SystemClock.uptimeMillis();
              postInvalidateDelayed(200L);
            }
            localDrawable.draw(paramCanvas);
            paramCanvas.restore();
            if ((this.w) && ((localDrawable instanceof Animatable)))
            {
              ((Animatable)localDrawable).start();
              this.w = false;
            }
            return;
          }
          finally
          {
            localObject2 = finally;
            this.y = false;
            throw localObject2;
          }
        }
      }
    }
    finally
    {
    }
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      Drawable localDrawable = this.r;
      if (localDrawable != null)
      {
        i1 = Math.max(this.a, Math.min(this.b, localDrawable.getIntrinsicWidth()));
        i2 = Math.max(this.c, Math.min(this.d, localDrawable.getIntrinsicHeight()));
        c();
        i3 = i1 + (getPaddingLeft() + getPaddingRight());
        i4 = i2 + (getPaddingTop() + getPaddingBottom());
        setMeasuredDimension(resolveSize(i3, paramInt1), resolveSize(i4, paramInt2));
        return;
      }
    }
    finally
    {
    }
    while (true)
    {
      int i3;
      int i4;
      int i2 = 0;
      int i1 = 0;
    }
  }

  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ProgressBarICS.SavedState localSavedState = (ProgressBarICS.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    b(localSavedState.a);
    d(localSavedState.b);
  }

  public final Parcelable onSaveInstanceState()
  {
    ProgressBarICS.SavedState localSavedState = new ProgressBarICS.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.g;
    localSavedState.b = this.h;
    return localSavedState;
  }

  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    c(paramInt1, paramInt2);
  }

  protected final void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.l)
    {
      if ((paramInt == 8) || (paramInt == 4))
        b();
    }
    else
      return;
    a();
  }

  public final void postInvalidate()
  {
    if (!this.s)
      super.postInvalidate();
  }

  public final void setVisibility(int paramInt)
  {
    if (getVisibility() != paramInt)
    {
      super.setVisibility(paramInt);
      if (this.l)
      {
        if ((paramInt != 8) && (paramInt != 4))
          break label36;
        b();
      }
    }
    return;
    label36: a();
  }

  protected final boolean verifyDrawable(Drawable paramDrawable)
  {
    return (paramDrawable == this.q) || (paramDrawable == this.p) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ProgressBarICS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

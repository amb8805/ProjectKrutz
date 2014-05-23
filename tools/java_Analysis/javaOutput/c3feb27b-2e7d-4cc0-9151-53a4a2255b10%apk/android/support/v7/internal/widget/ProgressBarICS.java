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
import android.graphics.drawable.Drawable;;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

public class ProgressBarICS extends View
{
  private static final int ANIMATION_RESOLUTION = 200;
  private static final int MAX_LEVEL = 10000;
  private static final int[] android_R_styleable_ProgressBar = { 16843062, 16843063, 16843064, 16843065, 16843066, 16843067, 16843068, 16843069, 16843070, 16843071, 16843039, 16843072, 16843040, 16843073 };
  private AlphaAnimation mAnimation;
  private int mBehavior;
  private Drawable mCurrentDrawable;
  private int mDuration;
  private boolean mInDrawing;
  private boolean mIndeterminate;
  private Drawable mIndeterminateDrawable;
  private Interpolator mInterpolator;
  private long mLastDrawTime;
  private int mMax;
  int mMaxHeight;
  int mMaxWidth;
  int mMinHeight;
  int mMinWidth;
  private boolean mNoInvalidate;
  private boolean mOnlyIndeterminate;
  private int mProgress;
  private Drawable mProgressDrawable;
  private ProgressBarICS.RefreshProgressRunnable mRefreshProgressRunnable;
  Bitmap mSampleTile;
  private int mSecondaryProgress;
  private boolean mShouldStartAnimationDrawable;
  private Transformation mTransformation;
  private long mUiThreadId = Thread.currentThread().getId();

  public ProgressBarICS(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super(paramContext, paramAttributeSet, paramInt1);
    initProgressBar();
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, android_R_styleable_ProgressBar, paramInt1, paramInt2);
    this.mNoInvalidate = true;
    setMax(localTypedArray.getInt(0, this.mMax));
    setProgress(localTypedArray.getInt(1, this.mProgress));
    setSecondaryProgress(localTypedArray.getInt(2, this.mSecondaryProgress));
    boolean bool1 = localTypedArray.getBoolean(3, this.mIndeterminate);
    this.mOnlyIndeterminate = localTypedArray.getBoolean(4, this.mOnlyIndeterminate);
    Drawable localDrawable1 = localTypedArray.getDrawable(5);
    if (localDrawable1 != null)
      setIndeterminateDrawable(tileifyIndeterminate(localDrawable1));
    Drawable localDrawable2 = localTypedArray.getDrawable(6);
    if (localDrawable2 != null)
      setProgressDrawable(tileify(localDrawable2, false));
    this.mDuration = localTypedArray.getInt(7, this.mDuration);
    this.mBehavior = localTypedArray.getInt(8, this.mBehavior);
    this.mMinWidth = localTypedArray.getDimensionPixelSize(9, this.mMinWidth);
    this.mMaxWidth = localTypedArray.getDimensionPixelSize(10, this.mMaxWidth);
    this.mMinHeight = localTypedArray.getDimensionPixelSize(11, this.mMinHeight);
    this.mMaxHeight = localTypedArray.getDimensionPixelSize(12, this.mMaxHeight);
    int i = localTypedArray.getResourceId(13, 17432587);
    if (i > 0)
      setInterpolator(paramContext, i);
    localTypedArray.recycle();
    this.mNoInvalidate = false;
    boolean bool2;
    if (!this.mOnlyIndeterminate)
    {
      bool2 = false;
      if (!bool1);
    }
    else
    {
      bool2 = true;
    }
    setIndeterminate(bool2);
  }

  private void doRefreshProgress(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    float f;
    try
    {
      if (this.mMax > 0)
      {
        f = paramInt2 / this.mMax;
        localDrawable1 = this.mCurrentDrawable;
        if (localDrawable1 == null)
          break label83;
        bool = localDrawable1 instanceof LayerDrawable;
        localDrawable2 = null;
        if (!bool)
          break label97;
        localDrawable2 = ((LayerDrawable)localDrawable1).findDrawableByLayerId(paramInt1);
        break label97;
        localDrawable2.setLevel(i);
      }
      while (true)
      {
        return;
        f = 0.0F;
        break;
        localDrawable2 = localDrawable1;
        break label59;
        invalidate();
      }
    }
    finally
    {
    }
    while (true)
    {
      Drawable localDrawable1;
      boolean bool;
      Drawable localDrawable2;
      label59: label83: label97: int i = (int)(10000.0F * f);
      if (localDrawable2 == null);
    }
  }

  private void initProgressBar()
  {
    this.mMax = 100;
    this.mProgress = 0;
    this.mSecondaryProgress = 0;
    this.mIndeterminate = false;
    this.mOnlyIndeterminate = false;
    this.mDuration = 4000;
    this.mBehavior = 1;
    this.mMinWidth = 24;
    this.mMaxWidth = 48;
    this.mMinHeight = 24;
    this.mMaxHeight = 48;
  }

  private void refreshProgress(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      if (this.mUiThreadId == Thread.currentThread().getId())
        doRefreshProgress(paramInt1, paramInt2, paramBoolean, true);
      while (true)
      {
        return;
        if (this.mRefreshProgressRunnable == null)
          break;
        localRefreshProgressRunnable = this.mRefreshProgressRunnable;
        this.mRefreshProgressRunnable = null;
        localRefreshProgressRunnable.setup(paramInt1, paramInt2, paramBoolean);
        post(localRefreshProgressRunnable);
      }
    }
    finally
    {
    }
    while (true)
      ProgressBarICS.RefreshProgressRunnable localRefreshProgressRunnable = new ProgressBarICS.RefreshProgressRunnable(this, paramInt1, paramInt2, paramBoolean);
  }

  private Drawable tileify(Drawable paramDrawable, boolean paramBoolean)
  {
    Object localObject2;
    if ((paramDrawable instanceof LayerDrawable))
    {
      LayerDrawable localLayerDrawable = (LayerDrawable)paramDrawable;
      int i = localLayerDrawable.getNumberOfLayers();
      Drawable[] arrayOfDrawable = new Drawable[i];
      int j = 0;
      if (j < i)
      {
        int m = localLayerDrawable.getId(j);
        Drawable localDrawable = localLayerDrawable.getDrawable(j);
        if ((m == 16908301) || (m == 16908303));
        for (boolean bool = true; ; bool = false)
        {
          arrayOfDrawable[j] = tileify(localDrawable, bool);
          j++;
          break;
        }
      }
      localObject2 = new LayerDrawable(arrayOfDrawable);
      for (int k = 0; k < i; k++)
        ((LayerDrawable)localObject2).setId(k, localLayerDrawable.getId(k));
    }
    if ((paramDrawable instanceof BitmapDrawable))
    {
      Bitmap localBitmap = ((BitmapDrawable)paramDrawable).getBitmap();
      if (this.mSampleTile == null)
        this.mSampleTile = localBitmap;
      Object localObject1 = new ShapeDrawable(getDrawableShape());
      BitmapShader localBitmapShader = new BitmapShader(localBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
      ((ShapeDrawable)localObject1).getPaint().setShader(localBitmapShader);
      if (paramBoolean)
        localObject1 = new ClipDrawable((Drawable)localObject1, 3, 1);
      localObject2 = localObject1;
      return localObject2;
    }
    return paramDrawable;
  }

  private Drawable tileifyIndeterminate(Drawable paramDrawable)
  {
    if ((paramDrawable instanceof AnimationDrawable))
    {
      AnimationDrawable localAnimationDrawable1 = (AnimationDrawable)paramDrawable;
      int i = localAnimationDrawable1.getNumberOfFrames();
      AnimationDrawable localAnimationDrawable2 = new AnimationDrawable();
      localAnimationDrawable2.setOneShot(localAnimationDrawable1.isOneShot());
      for (int j = 0; j < i; j++)
      {
        Drawable localDrawable = tileify(localAnimationDrawable1.getFrame(j), true);
        localDrawable.setLevel(10000);
        localAnimationDrawable2.addFrame(localDrawable, localAnimationDrawable1.getDuration(j));
      }
      localAnimationDrawable2.setLevel(10000);
      paramDrawable = localAnimationDrawable2;
    }
    return paramDrawable;
  }

  private void updateDrawableBounds(int paramInt1, int paramInt2)
  {
    int i = paramInt1 - getPaddingRight() - getPaddingLeft();
    int j = paramInt2 - getPaddingBottom() - getPaddingTop();
    int k;
    int m;
    float f1;
    if (this.mIndeterminateDrawable != null)
    {
      boolean bool1 = this.mOnlyIndeterminate;
      k = 0;
      m = 0;
      if (bool1)
      {
        boolean bool2 = this.mIndeterminateDrawable instanceof AnimationDrawable;
        k = 0;
        m = 0;
        if (!bool2)
        {
          int n = this.mIndeterminateDrawable.getIntrinsicWidth();
          int i1 = this.mIndeterminateDrawable.getIntrinsicHeight();
          f1 = n / i1;
          float f2 = paramInt1 / paramInt2;
          boolean bool3 = f1 < f2;
          k = 0;
          m = 0;
          if (bool3)
          {
            if (f2 <= f1)
              break label185;
            int i3 = (int)(f1 * paramInt2);
            k = (paramInt1 - i3) / 2;
            i = k + i3;
          }
        }
      }
    }
    while (true)
    {
      this.mIndeterminateDrawable.setBounds(k, m, i, j);
      if (this.mProgressDrawable != null)
        this.mProgressDrawable.setBounds(0, 0, i, j);
      return;
      label185: int i2 = (int)(paramInt1 * (1.0F / f1));
      m = (paramInt2 - i2) / 2;
      j = m + i2;
      k = 0;
    }
  }

  private void updateDrawableState()
  {
    int[] arrayOfInt = getDrawableState();
    if ((this.mProgressDrawable != null) && (this.mProgressDrawable.isStateful()))
      this.mProgressDrawable.setState(arrayOfInt);
    if ((this.mIndeterminateDrawable != null) && (this.mIndeterminateDrawable.isStateful()))
      this.mIndeterminateDrawable.setState(arrayOfInt);
  }

  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    updateDrawableState();
  }

  Shape getDrawableShape()
  {
    return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }

  public Drawable getIndeterminateDrawable()
  {
    return this.mIndeterminateDrawable;
  }

  public Interpolator getInterpolator()
  {
    return this.mInterpolator;
  }

  public int getMax()
  {
    try
    {
      int i = this.mMax;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int getProgress()
  {
    try
    {
      boolean bool = this.mIndeterminate;
      if (bool);
      for (int i = 0; ; i = this.mProgress)
        return i;
    }
    finally
    {
    }
  }

  public Drawable getProgressDrawable()
  {
    return this.mProgressDrawable;
  }

  public int getSecondaryProgress()
  {
    try
    {
      boolean bool = this.mIndeterminate;
      if (bool);
      for (int i = 0; ; i = this.mSecondaryProgress)
        return i;
    }
    finally
    {
    }
  }

  public final void incrementProgressBy(int paramInt)
  {
    try
    {
      setProgress(paramInt + this.mProgress);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void incrementSecondaryProgressBy(int paramInt)
  {
    try
    {
      setSecondaryProgress(paramInt + this.mSecondaryProgress);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void invalidateDrawable(Drawable paramDrawable)
  {
    if (!this.mInDrawing)
    {
      if (verifyDrawable(paramDrawable))
      {
        Rect localRect = paramDrawable.getBounds();
        int i = getScrollX() + getPaddingLeft();
        int j = getScrollY() + getPaddingTop();
        invalidate(i + localRect.left, j + localRect.top, i + localRect.right, j + localRect.bottom);
      }
    }
    else
      return;
    super.invalidateDrawable(paramDrawable);
  }

  public boolean isIndeterminate()
  {
    try
    {
      boolean bool = this.mIndeterminate;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.mIndeterminate)
      startAnimation();
  }

  protected void onDetachedFromWindow()
  {
    if (this.mIndeterminate)
      stopAnimation();
    if (this.mRefreshProgressRunnable != null)
      removeCallbacks(this.mRefreshProgressRunnable);
    super.onDetachedFromWindow();
  }

  protected void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      localDrawable = this.mCurrentDrawable;
      if (localDrawable != null)
      {
        paramCanvas.save();
        paramCanvas.translate(getPaddingLeft(), getPaddingTop());
        long l = getDrawingTime();
        if (this.mAnimation != null)
        {
          this.mAnimation.getTransformation(l, this.mTransformation);
          float f = this.mTransformation.getAlpha();
          try
          {
            this.mInDrawing = true;
            localDrawable.setLevel((int)(10000.0F * f));
            this.mInDrawing = false;
            if (SystemClock.uptimeMillis() - this.mLastDrawTime >= 200L)
            {
              this.mLastDrawTime = SystemClock.uptimeMillis();
              postInvalidateDelayed(200L);
            }
            localDrawable.draw(paramCanvas);
            paramCanvas.restore();
            if ((this.mShouldStartAnimationDrawable) && ((localDrawable instanceof Animatable)))
            {
              ((Animatable)localDrawable).start();
              this.mShouldStartAnimationDrawable = false;
            }
            return;
          }
          finally
          {
            localObject2 = finally;
            this.mInDrawing = false;
            throw localObject2;
          }
        }
      }
    }
    finally
    {
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      Drawable localDrawable = this.mCurrentDrawable;
      int i = 0;
      int j = 0;
      if (localDrawable != null)
      {
        j = Math.max(this.mMinWidth, Math.min(this.mMaxWidth, localDrawable.getIntrinsicWidth()));
        i = Math.max(this.mMinHeight, Math.min(this.mMaxHeight, localDrawable.getIntrinsicHeight()));
      }
      updateDrawableState();
      int k = j + (getPaddingLeft() + getPaddingRight());
      int m = i + (getPaddingTop() + getPaddingBottom());
      setMeasuredDimension(resolveSize(k, paramInt1), resolveSize(m, paramInt2));
      return;
    }
    finally
    {
    }
  }

  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    ProgressBarICS.SavedState localSavedState = (ProgressBarICS.SavedState)paramParcelable;
    super.onRestoreInstanceState(localSavedState.getSuperState());
    setProgress(localSavedState.progress);
    setSecondaryProgress(localSavedState.secondaryProgress);
  }

  public Parcelable onSaveInstanceState()
  {
    ProgressBarICS.SavedState localSavedState = new ProgressBarICS.SavedState(super.onSaveInstanceState());
    localSavedState.progress = this.mProgress;
    localSavedState.secondaryProgress = this.mSecondaryProgress;
    return localSavedState;
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    updateDrawableBounds(paramInt1, paramInt2);
  }

  protected void onVisibilityChanged(View paramView, int paramInt)
  {
    super.onVisibilityChanged(paramView, paramInt);
    if (this.mIndeterminate)
    {
      if ((paramInt == 8) || (paramInt == 4))
        stopAnimation();
    }
    else
      return;
    startAnimation();
  }

  public void postInvalidate()
  {
    if (!this.mNoInvalidate)
      super.postInvalidate();
  }

  public void setIndeterminate(boolean paramBoolean)
  {
    try
    {
      if (((!this.mOnlyIndeterminate) || (!this.mIndeterminate)) && (paramBoolean != this.mIndeterminate))
      {
        this.mIndeterminate = paramBoolean;
        if (!paramBoolean)
          break label48;
        this.mCurrentDrawable = this.mIndeterminateDrawable;
        startAnimation();
      }
      while (true)
      {
        return;
        this.mCurrentDrawable = this.mProgressDrawable;
        stopAnimation();
      }
    }
    finally
    {
    }
  }

  public void setIndeterminateDrawable(Drawable paramDrawable)
  {
    if (paramDrawable != null)
      paramDrawable.setCallback(this);
    this.mIndeterminateDrawable = paramDrawable;
    if (this.mIndeterminate)
    {
      this.mCurrentDrawable = paramDrawable;
      postInvalidate();
    }
  }

  public void setInterpolator(Context paramContext, int paramInt)
  {
    setInterpolator(AnimationUtils.loadInterpolator(paramContext, paramInt));
  }

  public void setInterpolator(Interpolator paramInterpolator)
  {
    this.mInterpolator = paramInterpolator;
  }

  public void setMax(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    try
    {
      if (paramInt != this.mMax)
      {
        this.mMax = paramInt;
        postInvalidate();
        if (this.mProgress > paramInt)
          this.mProgress = paramInt;
        refreshProgress(16908301, this.mProgress, false);
      }
      return;
    }
    finally
    {
    }
  }

  public void setProgress(int paramInt)
  {
    try
    {
      setProgress(paramInt, false);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  void setProgress(int paramInt, boolean paramBoolean)
  {
    try
    {
      boolean bool = this.mIndeterminate;
      if (bool);
      while (true)
      {
        return;
        if (paramInt < 0)
          paramInt = 0;
        if (paramInt > this.mMax)
          paramInt = this.mMax;
        if (paramInt != this.mProgress)
        {
          this.mProgress = paramInt;
          refreshProgress(16908301, this.mProgress, paramBoolean);
        }
      }
    }
    finally
    {
    }
  }

  public void setProgressDrawable(Drawable paramDrawable)
  {
    if ((this.mProgressDrawable != null) && (paramDrawable != this.mProgressDrawable))
      this.mProgressDrawable.setCallback(null);
    for (int i = 1; ; i = 0)
    {
      if (paramDrawable != null)
      {
        paramDrawable.setCallback(this);
        int j = paramDrawable.getMinimumHeight();
        if (this.mMaxHeight < j)
        {
          this.mMaxHeight = j;
          requestLayout();
        }
      }
      this.mProgressDrawable = paramDrawable;
      if (!this.mIndeterminate)
      {
        this.mCurrentDrawable = paramDrawable;
        postInvalidate();
      }
      if (i != 0)
      {
        updateDrawableBounds(getWidth(), getHeight());
        updateDrawableState();
        doRefreshProgress(16908301, this.mProgress, false, false);
        doRefreshProgress(16908303, this.mSecondaryProgress, false, false);
      }
      return;
    }
  }

  public void setSecondaryProgress(int paramInt)
  {
    try
    {
      boolean bool = this.mIndeterminate;
      if (bool);
      while (true)
      {
        return;
        if (paramInt < 0)
          paramInt = 0;
        if (paramInt > this.mMax)
          paramInt = this.mMax;
        if (paramInt != this.mSecondaryProgress)
        {
          this.mSecondaryProgress = paramInt;
          refreshProgress(16908303, this.mSecondaryProgress, false);
        }
      }
    }
    finally
    {
    }
  }

  public void setVisibility(int paramInt)
  {
    if (getVisibility() != paramInt)
    {
      super.setVisibility(paramInt);
      if (this.mIndeterminate)
      {
        if ((paramInt != 8) && (paramInt != 4))
          break label36;
        stopAnimation();
      }
    }
    return;
    label36: startAnimation();
  }

  void startAnimation()
  {
    if (getVisibility() != 0)
      return;
    if ((this.mIndeterminateDrawable instanceof Animatable))
    {
      this.mShouldStartAnimationDrawable = true;
      this.mAnimation = null;
    }
    while (true)
    {
      postInvalidate();
      return;
      if (this.mInterpolator == null)
        this.mInterpolator = new LinearInterpolator();
      this.mTransformation = new Transformation();
      this.mAnimation = new AlphaAnimation(0.0F, 1.0F);
      this.mAnimation.setRepeatMode(this.mBehavior);
      this.mAnimation.setRepeatCount(-1);
      this.mAnimation.setDuration(this.mDuration);
      this.mAnimation.setInterpolator(this.mInterpolator);
      this.mAnimation.setStartTime(-1L);
    }
  }

  void stopAnimation()
  {
    this.mAnimation = null;
    this.mTransformation = null;
    if ((this.mIndeterminateDrawable instanceof Animatable))
    {
      ((Animatable)this.mIndeterminateDrawable).stop();
      this.mShouldStartAnimationDrawable = false;
    }
    postInvalidate();
  }

  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (paramDrawable == this.mProgressDrawable) || (paramDrawable == this.mIndeterminateDrawable) || (super.verifyDrawable(paramDrawable));
  }
}

/* Location:
 * Qualified Name:     android.support.v7.internal.widget.ProgressBarICS
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */

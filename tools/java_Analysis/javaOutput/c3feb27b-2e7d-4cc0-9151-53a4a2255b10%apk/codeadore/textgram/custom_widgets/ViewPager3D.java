package codeadore.textgram.custom_widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.Transformation;
import codeadore.textgram.R.styleable;

public class ViewPager3D extends ViewPager
{
  private static final String DEBUG_TAG = ViewPager.class.getSimpleName();
  private static final boolean DEFAULT_ANIMATE_ALPHA = true;
  private static final int DEFAULT_OVERSCROLL_ANIMATION_DURATION = 400;
  static final float DEFAULT_OVERSCROLL_ROTATION = 2.0F;
  static final int DEFAULT_OVERSCROLL_TRANSLATION = 150;
  static final float DEFAULT_SWIPE_ROTATION = 3.0F;
  static final int DEFAULT_SWIPE_TRANSLATION = 100;
  private static final int INVALID_POINTER_ID = -1;
  private static final double RADIANS = 57.295779513082323D;
  boolean enable3D = false;
  private int mActivePointerId;
  private boolean mAnimateAlpha;
  private final Camera mCamera = new Camera();
  private float mLastMotionX;
  private int mLastPosition = 0;
  private int mOverscrollAnimationDuration;
  private final ViewPager3D.OverscrollEffect mOverscrollEffect = new ViewPager3D.OverscrollEffect(this, null);
  private float mOverscrollRotation;
  private int mOverscrollTranslation;
  private ViewPager.OnPageChangeListener mScrollListener;
  private int mScrollPosition;
  private float mScrollPositionOffset;
  private float mSwipeRotation;
  private int mSwipeTranslation;
  private final int mTouchSlop;

  public ViewPager3D(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setStaticTransformationsEnabled(true);
    this.mTouchSlop = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(paramContext));
    super.setOnPageChangeListener(new ViewPager3D.MyOnPageChangeListener(this, null));
    init(paramAttributeSet);
  }

  private void init(AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.ViewPager3D);
    this.mOverscrollRotation = localTypedArray.getFloat(0, 2.0F);
    this.mSwipeRotation = localTypedArray.getFloat(2, 3.0F);
    this.mSwipeTranslation = localTypedArray.getInt(3, 100);
    this.mOverscrollTranslation = localTypedArray.getInt(1, 150);
    this.mOverscrollAnimationDuration = localTypedArray.getInt(4, 400);
    this.mAnimateAlpha = localTypedArray.getBoolean(5, true);
    localTypedArray.recycle();
  }

  private void invalidateVisibleChilds(int paramInt)
  {
    for (int i = 0; ; i++)
    {
      if (i >= getChildCount())
      {
        invalidate();
        View localView1 = getChildAt(paramInt);
        View localView2 = getChildAt(paramInt - 1);
        View localView3 = getChildAt(paramInt + 1);
        if (localView1 != null)
          localView1.invalidate();
        if (localView2 != null)
          localView2.invalidate();
        if (localView3 != null)
          localView3.invalidate();
        return;
      }
      getChildAt(i).invalidate();
    }
  }

  protected boolean getChildStaticTransformation(View paramView, Transformation paramTransformation)
  {
    if (this.enable3D)
    {
      if (paramView.getWidth() == 0)
        return false;
      int i = paramView.getLeft() / paramView.getWidth();
      int j;
      if ((i != 0) && (i != -1 + getAdapter().getCount()))
      {
        j = 0;
        if ((!ViewPager3D.OverscrollEffect.access$3(this.mOverscrollEffect)) || (j == 0))
          break label290;
        float f4 = getWidth() / 2;
        int k = getHeight() / 2;
        paramTransformation.getMatrix().reset();
        float f5 = (float)(this.mOverscrollTranslation * Math.sin(3.141592653589793D * Math.abs(ViewPager3D.OverscrollEffect.access$4(this.mOverscrollEffect))));
        float f6 = 90.0F / this.mOverscrollRotation - (float)(57.295779513082323D * Math.acos(ViewPager3D.OverscrollEffect.access$4(this.mOverscrollEffect)) / this.mOverscrollRotation);
        this.mCamera.save();
        this.mCamera.rotateY(f6);
        this.mCamera.translate(0.0F, 0.0F, f5);
        this.mCamera.getMatrix(paramTransformation.getMatrix());
        this.mCamera.restore();
        paramTransformation.getMatrix().preTranslate(-f4, -k);
        paramTransformation.getMatrix().postTranslate(f4, k);
        if (this.mAnimateAlpha)
        {
          paramTransformation.setTransformationType(Transformation.TYPE_BOTH);
          paramTransformation.setAlpha(FloatMath.sin((float)(3.141592653589793D * 1.0F - Math.abs(ViewPager3D.OverscrollEffect.access$4(this.mOverscrollEffect)) / 2.0D)));
        }
        if (getChildCount() != 1)
          break label283;
        invalidate();
      }
      while (true)
      {
        return true;
        j = 1;
        break;
        label283: paramView.invalidate();
      }
      label290: if (this.mScrollPositionOffset > 0.0F)
      {
        float f1 = getWidth() / 2;
        float f2 = getHeight() / 2;
        double d;
        if (i > this.mScrollPosition)
        {
          if (this.mAnimateAlpha)
          {
            paramTransformation.setTransformationType(Transformation.TYPE_BOTH);
            paramTransformation.setAlpha(FloatMath.sin((float)(3.141592653589793D * this.mScrollPositionOffset / 2.0D)));
          }
          d = -(90.0F / this.mSwipeRotation) + 57.295779513082323D * Math.acos(1.0F - this.mScrollPositionOffset) / this.mSwipeRotation;
          float f3 = this.mSwipeTranslation * FloatMath.sin((float)(3.141592653589793D * this.mScrollPositionOffset));
          paramTransformation.getMatrix().reset();
          this.mCamera.save();
          this.mCamera.rotateY((float)d);
          this.mCamera.translate(0.0F, 0.0F, f3);
          this.mCamera.getMatrix(paramTransformation.getMatrix());
          this.mCamera.restore();
          paramTransformation.getMatrix().preTranslate(-f1, -f2);
          paramTransformation.getMatrix().postTranslate(f1, f2);
          if (getChildCount() != 1)
            break label578;
          invalidate();
        }
        while (true)
        {
          return true;
          if (this.mAnimateAlpha)
          {
            paramTransformation.setTransformationType(Transformation.TYPE_BOTH);
            paramTransformation.setAlpha(FloatMath.sin((float)(1.570796326794897D + 3.141592653589793D * this.mScrollPositionOffset / 2.0D)));
          }
          d = 90.0F / this.mSwipeRotation - 57.295779513082323D * Math.acos(this.mScrollPositionOffset) / this.mSwipeRotation;
          break;
          label578: paramView.invalidate();
        }
      }
      return false;
    }
    super.getChildStaticTransformation(paramView, paramTransformation);
    return false;
  }

  public int getOverscrollAnimationDuration()
  {
    return this.mOverscrollAnimationDuration;
  }

  public float getOverscrollRotation()
  {
    return this.mOverscrollRotation;
  }

  public int getOverscrollTranslation()
  {
    return this.mOverscrollTranslation;
  }

  public float getSwipeRotation()
  {
    return this.mSwipeRotation;
  }

  public int getSwipeTranslation()
  {
    return this.mSwipeTranslation;
  }

  public boolean isAnimateAlpha()
  {
    return this.mAnimateAlpha;
  }

  public boolean isEnable3D()
  {
    return this.enable3D;
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (0xFF & paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 5:
    }
    while (true)
    {
      return super.onInterceptTouchEvent(paramMotionEvent);
      this.mLastMotionX = paramMotionEvent.getX();
      this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, 0);
      continue;
      int i = MotionEventCompat.getActionIndex(paramMotionEvent);
      this.mLastMotionX = MotionEventCompat.getX(paramMotionEvent, i);
      this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, i);
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.enable3D)
    {
      int i = paramMotionEvent.getAction();
      int j = 0;
      switch (i)
      {
      case 4:
      default:
      case 0:
      case 5:
      case 2:
      case 1:
      case 3:
      case 6:
      }
      while ((ViewPager3D.OverscrollEffect.access$3(this.mOverscrollEffect)) && (j == 0))
      {
        return true;
        j = 1;
        this.mLastMotionX = paramMotionEvent.getX();
        this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, 0);
        continue;
        j = 1;
        int i6 = MotionEventCompat.getActionIndex(paramMotionEvent);
        this.mLastMotionX = MotionEventCompat.getX(paramMotionEvent, i6);
        this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, i6);
        continue;
        if (this.mActivePointerId != -1)
        {
          float f1 = MotionEventCompat.getX(paramMotionEvent, MotionEventCompat.findPointerIndex(paramMotionEvent, this.mActivePointerId));
          float f2 = this.mLastMotionX - f1;
          float f3 = getScrollX();
          int i2 = getWidth();
          int i3 = i2 + getPageMargin();
          int i4 = -1 + getAdapter().getCount();
          int i5 = getCurrentItem();
          float f4 = Math.max(0, i3 * (i5 - 1));
          float f5 = i3 * Math.min(i5 + 1, i4);
          float f6 = f3 + f2;
          if (this.mScrollPositionOffset == 0.0F)
          {
            if (f6 < f4)
            {
              boolean bool3 = f4 < 0.0F;
              j = 0;
              if (!bool3)
              {
                float f8 = f2 + this.mTouchSlop;
                this.mOverscrollEffect.setPull(f8 / i2);
                j = 0;
              }
            }
            else
            {
              boolean bool1 = f6 < f5;
              j = 0;
              if (bool1)
              {
                boolean bool2 = f5 < i4 * i3;
                j = 0;
                if (!bool2)
                {
                  float f7 = f6 - f5 - this.mTouchSlop;
                  this.mOverscrollEffect.setPull(f7 / i2);
                  j = 0;
                }
              }
            }
          }
          else
          {
            this.mLastMotionX = f1;
            j = 0;
          }
        }
        else
        {
          ViewPager3D.OverscrollEffect.access$2(this.mOverscrollEffect);
          j = 0;
          continue;
          j = 1;
          this.mActivePointerId = -1;
          ViewPager3D.OverscrollEffect.access$2(this.mOverscrollEffect);
          continue;
          int k = (0xFF00 & paramMotionEvent.getAction()) >> 8;
          int m = MotionEventCompat.getPointerId(paramMotionEvent, k);
          int n = this.mActivePointerId;
          j = 0;
          if (m == n)
          {
            if (k == 0);
            for (int i1 = 1; ; i1 = 0)
            {
              this.mLastMotionX = paramMotionEvent.getX(i1);
              this.mActivePointerId = MotionEventCompat.getPointerId(paramMotionEvent, i1);
              j = 1;
              break;
            }
          }
        }
      }
      return super.onTouchEvent(paramMotionEvent);
    }
    super.onTouchEvent(paramMotionEvent);
    return true;
  }

  public void setAnimateAlpha(boolean paramBoolean)
  {
    this.mAnimateAlpha = paramBoolean;
  }

  public void setEnable3D(boolean paramBoolean)
  {
    this.enable3D = paramBoolean;
  }

  public void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener)
  {
    this.mScrollListener = paramOnPageChangeListener;
  }

  public void setOverscrollAnimationDuration(int paramInt)
  {
    this.mOverscrollAnimationDuration = paramInt;
  }

  public void setOverscrollRotation(float paramFloat)
  {
    this.mOverscrollRotation = paramFloat;
  }

  public void setOverscrollTranslation(int paramInt)
  {
    this.mOverscrollTranslation = paramInt;
  }

  public void setSwipeRotation(float paramFloat)
  {
    this.mSwipeRotation = paramFloat;
  }

  public void setSwipeTranslation(int paramInt)
  {
    this.mSwipeTranslation = paramInt;
  }
}

/* Location:
 * Qualified Name:     codeadore.textgram.custom_widgets.ViewPager3D
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.6.1-SNAPSHOT
 */
